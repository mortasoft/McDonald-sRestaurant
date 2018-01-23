package ConFunciones;

import ConProcedimiento.*;

public class GeneracionDeOrdenDeCompra {

    public static OrdenDeCompra GenereOrdenDeCompra(TipoDeHamburguesa elTipoDeHamburguesa, TipoDePapas elTipoDePapas, TipoDeBebidas elTipoDeBebidas, TipoDePostres elTipoDePostres) {
        
        OrdenDeCompra laOrden = new OrdenDeCompra();
        
        String laHamburguesa = ObtengaLaHamburguesa(elTipoDeHamburguesa);
        laOrden.laHamburguesa = laHamburguesa;

        double elPrecioDeLaHamburguesaConvertida = ObtengaElPrecioDeLaHamburguesa(elTipoDeHamburguesa);
        laOrden.elPrecioDeLaHamburguesa = "PRECIO: " + elPrecioDeLaHamburguesaConvertida;

        String elPedidoDeHamburguesa = FormateeElPedidoDeHamburguesa(laHamburguesa, elPrecioDeLaHamburguesaConvertida);
        laOrden.elPedidoDeHamburguesa = elPedidoDeHamburguesa;

        String lasPapas = ObtengaLasPapas(elTipoDePapas);
        laOrden.lasPapas = lasPapas;

        double elPrecioDeLasPapasConvertidas = ObtengaElPrecioDeLasPapas(elTipoDePapas);
        laOrden.elPrecioDeLasPapas = "PRECIO: " + elPrecioDeLasPapasConvertidas;

        String elPedidoDePapas = FormateeElPedidoDePapas(lasPapas, elPrecioDeLasPapasConvertidas);
        laOrden.lasPapasOrdenadas = elPedidoDePapas;

        String laBebida = ObtengaLaBebida(elTipoDeBebidas);
        laOrden.laBebida = laBebida;

        double elPrecioDeLaBebidaConvertida = ObtengaElPrecioDeLaBebida(elTipoDeBebidas);
        laOrden.elPrecioDeLaBebida = "PRECIO: " + elPrecioDeLaBebidaConvertida;

        String elPedidoDeBebida = FormateeElPedidoDeLaBebida(laBebida, elPrecioDeLaBebidaConvertida);
        laOrden.laBebidaOrdenada = elPedidoDeBebida;

        String elPostre = ObtengaElPostre(elTipoDePostres);
        laOrden.elPostre = elPostre;

        double elPrecioDelPostreConvertido = ObtengaElPrecioDelPostre(elTipoDePostres);
        laOrden.elPrecioDelPostre = "PRECIO: " + elPrecioDelPostreConvertido;

        String elPedidoDePostre = FormateeElPedidoDelPostre(elPostre, elPrecioDelPostreConvertido);
        laOrden.elPostreOrdenado = elPedidoDePostre;

        laOrden.elTotalDelPedido = CalculeElTotalDelPedido(elPrecioDeLaHamburguesaConvertida, elPrecioDeLasPapasConvertidas, elPrecioDeLaBebidaConvertida, elPrecioDelPostreConvertido);
        laOrden.elPedidoCompleto = FormateeElPedidoCompleto(elPedidoDeHamburguesa, elPedidoDePapas, elPedidoDeBebida, elPedidoDePostre);

        return laOrden;
    }

    private static String ObtengaLaHamburguesa(ConFunciones.TipoDeHamburguesa elTipoDeHamburguesa) {
        String laHamburguesaOrdenada = DetermineLaHamburguesa(elTipoDeHamburguesa);
        return FormateeLaHamburguesa(laHamburguesaOrdenada);
    }

    private static String DetermineLaHamburguesa(ConFunciones.TipoDeHamburguesa elTipoDeHamburguesa) {
        String laHamburguesaOrdenada = null;
        if (elTipoDeHamburguesa == TipoDeHamburguesa.BigMac) {
            laHamburguesaOrdenada = "BigMac";
        } else if (elTipoDeHamburguesa == TipoDeHamburguesa.McNifica) {
            laHamburguesaOrdenada = "McNífica";
        } else if (elTipoDeHamburguesa == TipoDeHamburguesa.CuartoDeLibra) {
            laHamburguesaOrdenada = "Cuarto de libra";
        }
        return laHamburguesaOrdenada;
    }

    private static String FormateeLaHamburguesa(String laHamburguesaOrdenada) {
        String laHamburguesa = "HAMBURGUESA: " + laHamburguesaOrdenada;
        return laHamburguesa;
    }

    private static double ObtengaElPrecioDeLaHamburguesa(ConFunciones.TipoDeHamburguesa elTipoDeHamburguesa) {
        int elPrecioDeLaHamburguesaOrdenada = DetermineElPrecioDeLaHamburguesa(elTipoDeHamburguesa);
        return FormateeElPrecioDeLaHamburguesa(elPrecioDeLaHamburguesaOrdenada);
    }

    private static int DetermineElPrecioDeLaHamburguesa(ConFunciones.TipoDeHamburguesa elTipoDeHamburguesa) {
        int elPrecioDeLaHamburguesaOrdenada = 0;
        if (elTipoDeHamburguesa == TipoDeHamburguesa.BigMac) {
            elPrecioDeLaHamburguesaOrdenada = 3500;
        } else if (elTipoDeHamburguesa == TipoDeHamburguesa.McNifica) {
            elPrecioDeLaHamburguesaOrdenada = 3450;
        } else if (elTipoDeHamburguesa == TipoDeHamburguesa.CuartoDeLibra) {
            elPrecioDeLaHamburguesaOrdenada = 3300;
        }
        return elPrecioDeLaHamburguesaOrdenada;
    }

    private static double FormateeElPrecioDeLaHamburguesa(int elPrecioDeLaHamburguesaOrdenada) {
        double elPrecioDeLaHamburguesaConvertida = elPrecioDeLaHamburguesaOrdenada;
        return elPrecioDeLaHamburguesaConvertida;
    }

    private static String FormateeElPedidoDeHamburguesa(String laHamburguesa, double elPrecioDeLaHamburguesaConvertida) {
        String elPedidoDeHamburguesa = laHamburguesa + "\t" + elPrecioDeLaHamburguesaConvertida;
        return elPedidoDeHamburguesa;
    }

    private static String ObtengaLasPapas(ConFunciones.TipoDePapas elTipoDePapas) {
        String lasPapasOrdenadas = DetermineLasPapas(elTipoDePapas);
        return FormateeLasPapas(lasPapasOrdenadas);
    }

    private static String DetermineLasPapas(ConFunciones.TipoDePapas elTipoDePapas) {
        String lasPapasOrdenadas = null;
        if (elTipoDePapas == TipoDePapas.Pequeña) {
            lasPapasOrdenadas = "Papas Pequeñas";
        } else if (elTipoDePapas == TipoDePapas.Mediana) {
            lasPapasOrdenadas = "Papas Medianas";
        } else if (elTipoDePapas == TipoDePapas.Grande) {
            lasPapasOrdenadas = "Papas Grandes";
        }
        return lasPapasOrdenadas;
    }

    private static String FormateeLasPapas(String lasPapasOrdenadas) {
        String lasPapas = "PAPAS: " + lasPapasOrdenadas;
        return lasPapas;
    }

    private static double ObtengaElPrecioDeLasPapas(ConFunciones.TipoDePapas elTipoDePapas) {
        int elPrecioDeLasPapasOrdenadas = DetermineElPrecioDeLasPapas(elTipoDePapas);
        return FormateeElPrecioDeLasPapas(elPrecioDeLasPapasOrdenadas);
    }

    private static int DetermineElPrecioDeLasPapas(ConFunciones.TipoDePapas elTipoDePapas) {
        int elPrecioDeLasPapasOrdenadas = 0;
        if (elTipoDePapas == TipoDePapas.Pequeña) {
            elPrecioDeLasPapasOrdenadas = 800;
        } else if (elTipoDePapas == TipoDePapas.Mediana) {
            elPrecioDeLasPapasOrdenadas = 900;
        } else if (elTipoDePapas == TipoDePapas.Grande) {
            elPrecioDeLasPapasOrdenadas = 1000;
        }
        return elPrecioDeLasPapasOrdenadas;
    }

    private static double FormateeElPrecioDeLasPapas(int elPrecioDeLasPapasOrdenadas) {
        double elPrecioDeLasPapasConvertidas = elPrecioDeLasPapasOrdenadas;
        return elPrecioDeLasPapasConvertidas;
    }

    private static String FormateeElPedidoDePapas(String lasPapas, double elPrecioDeLasPapasConvertidas) {
        String elPedidoDePapas = lasPapas + "\t" + elPrecioDeLasPapasConvertidas;
        return elPedidoDePapas;
    }

    private static String ObtengaLaBebida(TipoDeBebidas elTipoDeBebidas) {
        String laBebidaOrdenada = DetermineLaBebida(elTipoDeBebidas);
        return FormateeLaBebida(laBebidaOrdenada);
    }

    private static String DetermineLaBebida(TipoDeBebidas elTipoDeBebidas) {
        String laBebidaOrdenada = null;
        if (elTipoDeBebidas == TipoDeBebidas.Pepsi) {
            laBebidaOrdenada = "Pepsi";
        } else if (elTipoDeBebidas == TipoDeBebidas.CocaCola) {
            laBebidaOrdenada = "CocaCola";
        }
        return laBebidaOrdenada;
    }

    private static String FormateeLaBebida(String laBebidaOrdenada) {
        String laBebida = "BEBIDA: " + laBebidaOrdenada;
        return laBebida;
    }

    private static double ObtengaElPrecioDeLaBebida(ConFunciones.TipoDeBebidas elTipoDeBebidas) {
        int elPrecioDeLaBebidaOrdenada = DeterminelPrecioDeLaBebida(elTipoDeBebidas);
        return FormateeElPrecioDeLaBebida(elPrecioDeLaBebidaOrdenada);
    }

    private static int DeterminelPrecioDeLaBebida(ConFunciones.TipoDeBebidas elTipoDeBebidas) {
        int elPrecioDeLaBebidaOrdenada = 0;
        if (elTipoDeBebidas == TipoDeBebidas.Pepsi) {
            elPrecioDeLaBebidaOrdenada = 600;
        } else if (elTipoDeBebidas == TipoDeBebidas.CocaCola) {
            elPrecioDeLaBebidaOrdenada = 650;
        }
        return elPrecioDeLaBebidaOrdenada;
    }

    private static double FormateeElPrecioDeLaBebida(int elPrecioDeLaBebidaOrdenada) {
        double elPrecioDeLaBebidaConvertida = elPrecioDeLaBebidaOrdenada;
        return elPrecioDeLaBebidaConvertida;
    }

    private static String FormateeElPedidoDeLaBebida(String laBebida, double elPrecioDeLaBebidaConvertida) {
        String elPedidoDeBebida = laBebida + "\t" + elPrecioDeLaBebidaConvertida;
        return elPedidoDeBebida;
    }

    private static String ObtengaElPostre(ConFunciones.TipoDePostres elTipoDePostres) {
        String elPostreOrdenado = DetermineElPostre(elTipoDePostres);
        return FormateeElPostre(elPostreOrdenado);
    }

    private static String DetermineElPostre(ConFunciones.TipoDePostres elTipoDePostres) {
        String elPostreOrdenado = "";
        if (elTipoDePostres == TipoDePostres.McFlurry) {
            elPostreOrdenado = "McFlurry";
        } else if (elTipoDePostres == TipoDePostres.Cono) {
            elPostreOrdenado = "Cono";
        } else if (elTipoDePostres == TipoDePostres.Sundae) {
            elPostreOrdenado = "Sundae";
        }
        return elPostreOrdenado;
    }

    private static String FormateeElPostre(String elPostreOrdenado) {
        return "POSTRE: " + elPostreOrdenado;
    }

    private static double ObtengaElPrecioDelPostre(ConFunciones.TipoDePostres elTipoDePostres) {
        int elPrecioDelPostreOrdenado = DetermineElPrecioDelPostreOrdenado(elTipoDePostres);
        return FormateeElPrecioDelPostre(elPrecioDelPostreOrdenado);
    }

    private static int DetermineElPrecioDelPostreOrdenado(ConFunciones.TipoDePostres elTipoDePostres) {
        int elPrecioDelPostreOrdenado = 0;
        if (elTipoDePostres == TipoDePostres.Cono) {
            elPrecioDelPostreOrdenado = 350;
        } else if (elTipoDePostres == TipoDePostres.Sundae) {
            elPrecioDelPostreOrdenado = 690;
        } else if (elTipoDePostres == TipoDePostres.McFlurry) {
            elPrecioDelPostreOrdenado = 1250;
        }
        return elPrecioDelPostreOrdenado;
    }

    private static double FormateeElPrecioDelPostre(int elPrecioDelPostreOrdenado) {
        double elPrecioDelPostreConvertido = elPrecioDelPostreOrdenado;
        return elPrecioDelPostreConvertido;
    }

    private static String FormateeElPedidoDelPostre(String elPostre, double elPrecioDelPostreConvertido) {
        String elPedidoDePostre = elPostre + "\t" + elPrecioDelPostreConvertido;
        return elPedidoDePostre;
    }

    private static String CalculeElTotalDelPedido(double elPrecioDeLaHamburguesaConvertida, double elPrecioDeLasPapasConvertidas, double elPrecioDeLaBebidaConvertida, double elPrecioDelPostreConvertido) {
        return elPrecioDeLaHamburguesaConvertida + elPrecioDeLasPapasConvertidas + elPrecioDeLaBebidaConvertida + elPrecioDelPostreConvertido + "₡";
    }

    private static String FormateeElPedidoCompleto(String elPedidoDeHamburguesa, String elPedidoDePapas, String elPedidoDeBebida, String elPedidoDePostre) {
        return elPedidoDeHamburguesa + "\n" + elPedidoDePapas + "\n" + elPedidoDeBebida + "\n" + elPedidoDePostre;
    }
}
