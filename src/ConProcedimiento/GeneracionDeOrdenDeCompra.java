package ConProcedimiento;

public class GeneracionDeOrdenDeCompra {

    public static OrdenDeCompra GenereOrdenDeCompra(TipoDeHamburguesa elTipoDeHamburguesa, TipoDePapas elTipoDePapas, TipoDeBebidas elTipoDeBebidas, TipoDePostres elTipoDePostres) {
        OrdenDeCompra laOrden = new OrdenDeCompra();
        String laHamburguesaOrdenada = null;
        if (elTipoDeHamburguesa == TipoDeHamburguesa.BigMac) {
            laHamburguesaOrdenada = "BigMac";
        } else if (elTipoDeHamburguesa == TipoDeHamburguesa.McNifica) {
            laHamburguesaOrdenada = "McNífica";
        } else if (elTipoDeHamburguesa == TipoDeHamburguesa.CuartoDeLibra) {
            laHamburguesaOrdenada = "Cuarto de libra";
        }
        String laHamburguesa = "HAMBURGUESA: " + laHamburguesaOrdenada;
        laOrden.laHamburguesa = laHamburguesa;

        int elPrecioDeLaHamburguesaOrdenada = 0;
        if (elTipoDeHamburguesa == TipoDeHamburguesa.BigMac) {
            elPrecioDeLaHamburguesaOrdenada = 3500;
        } else if (elTipoDeHamburguesa == TipoDeHamburguesa.McNifica) {
            elPrecioDeLaHamburguesaOrdenada = 3450;
        } else if (elTipoDeHamburguesa == TipoDeHamburguesa.CuartoDeLibra) {
            elPrecioDeLaHamburguesaOrdenada = 3300;
        }
        double elPrecioDeLaHamburguesaConvertida = elPrecioDeLaHamburguesaOrdenada;
        laOrden.elPrecioDeLaHamburguesa = "PRECIO: " + elPrecioDeLaHamburguesaConvertida;

        String elPedidoDeHamburguesa = laHamburguesa + "\t" + elPrecioDeLaHamburguesaConvertida;
        laOrden.elPedidoDeHamburguesa = elPedidoDeHamburguesa;

        String lasPapasOrdenadas = null;
        if (elTipoDePapas == TipoDePapas.Pequeña) {
            lasPapasOrdenadas = "Papas Pequeñas";
        } else if (elTipoDePapas == TipoDePapas.Mediana) {
            lasPapasOrdenadas = "Papas Medianas";
        } else if (elTipoDePapas == TipoDePapas.Grande) {
            lasPapasOrdenadas = "Papas Grandes";
        }
        String lasPapas = "PAPAS: " + lasPapasOrdenadas;
        laOrden.lasPapas = lasPapas;

        int elPrecioDeLasPapasOrdenadas = 0;
        if (elTipoDePapas == TipoDePapas.Pequeña) {
            elPrecioDeLasPapasOrdenadas = 800;
        } else if (elTipoDePapas == TipoDePapas.Mediana) {
            elPrecioDeLasPapasOrdenadas = 900;
        } else if (elTipoDePapas == TipoDePapas.Grande) {
            elPrecioDeLasPapasOrdenadas = 1000;
        }
        double elPrecioDeLasPapasConvertidas = elPrecioDeLasPapasOrdenadas;
        laOrden.elPrecioDeLasPapas = "PRECIO: " + elPrecioDeLasPapasConvertidas;

        String elPedidoDePapas = lasPapas + "\t" + elPrecioDeLasPapasConvertidas;
        laOrden.lasPapasOrdenadas = elPedidoDePapas;

        String laBebidaOrdenada = null;
        if (elTipoDeBebidas == TipoDeBebidas.Pepsi) {
            laBebidaOrdenada = "Pepsi";
        } else if (elTipoDeBebidas == TipoDeBebidas.CocaCola) {
            laBebidaOrdenada = "CocaCola";
        }
        String laBebida = "BEBIDA: " + laBebidaOrdenada;
        laOrden.laBebida = laBebida;

        int elPrecioDeLaBebidaOrdenada = 0;
        if (elTipoDeBebidas == TipoDeBebidas.Pepsi) {
            elPrecioDeLaBebidaOrdenada = 600;
        } else if (elTipoDeBebidas == TipoDeBebidas.CocaCola) {
            elPrecioDeLaBebidaOrdenada = 650;
        }
        double elPrecioDeLaBebidaConvertida = elPrecioDeLaBebidaOrdenada;
        laOrden.elPrecioDeLaBebida = "PRECIO: " + elPrecioDeLaBebidaConvertida;

        String elPedidoDeBebida = laBebida + "\t" + elPrecioDeLaBebidaConvertida;
        laOrden.laBebidaOrdenada = elPedidoDeBebida;

        String elPostreOrdenado = "";
        if (elTipoDePostres == TipoDePostres.McFlurry) {
            elPostreOrdenado = "McFlurry";
        } else if (elTipoDePostres == TipoDePostres.Cono) {
            elPostreOrdenado = "Cono";
        } else if (elTipoDePostres == TipoDePostres.Sundae) {
            elPostreOrdenado = "Sundae";
        }
        String elPostre = "POSTRE: " + elPostreOrdenado;
        laOrden.elPostre = elPostre;

        int elPrecioDelPostreOrdenado = 0;
        if (elTipoDePostres == TipoDePostres.Cono) {
            elPrecioDelPostreOrdenado = 350;
        } else if (elTipoDePostres == TipoDePostres.Sundae) {
            elPrecioDelPostreOrdenado = 690;
        } else if (elTipoDePostres == TipoDePostres.McFlurry) {
            elPrecioDelPostreOrdenado = 1250;
        }
        double elPrecioDelPostreConvertido = elPrecioDelPostreOrdenado;
        laOrden.elPrecioDelPostre = "PRECIO: " + elPrecioDelPostreConvertido;

        String elPedidoDePostre = elPostre + "\t" + elPrecioDelPostreConvertido;
        laOrden.elPostreOrdenado = elPedidoDePostre;

        laOrden.elTotalDelPedido = elPrecioDeLaHamburguesaConvertida + elPrecioDeLasPapasConvertidas + elPrecioDeLaBebidaConvertida + elPrecioDelPostreConvertido + "₡";
        laOrden.elPedidoCompleto = elPedidoDeHamburguesa + "\n" + elPedidoDePapas + "\n" + elPedidoDeBebida + "\n" + elPedidoDePostre;

        return laOrden;
    }
}
