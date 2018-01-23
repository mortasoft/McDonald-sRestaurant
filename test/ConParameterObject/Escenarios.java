package ConParameterObject;

import ConParameterObject.*;

public class Escenarios {

    private TipoDeHamburguesa laHamburguesa;
    private TipoDePapas lasPapas;
    private TipoDeBebidas laBebida;
    private TipoDePostres elPostre;
    private DatosDeLaOrdenDeCompra losDatos;

    public OrdenDeCompra UnPedidoCompleto_Hambrugesa_BigMac() {
        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDeHamburguesa = TipoDeHamburguesa.BigMac;
        losDatos.elTipoDePapas = TipoDePapas.Pequeña;
        losDatos.elTipoDeBebidas = TipoDeBebidas.Pepsi;
        losDatos.elTipoDePostres = TipoDePostres.McFlurry;

        return new OrdenDeCompra(losDatos);
    }

    public OrdenDeCompra UnPedidoCompleto_Hamburguesa_McNifica() {
        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDeHamburguesa = TipoDeHamburguesa.McNifica;
        losDatos.elTipoDePapas = TipoDePapas.Pequeña;
        losDatos.elTipoDeBebidas = TipoDeBebidas.Pepsi;
        losDatos.elTipoDePostres = TipoDePostres.McFlurry;

        return new OrdenDeCompra(losDatos);
    }

    public OrdenDeCompra UnPedidoCompleto_Hamburguesa_CuartoDeLibra() {
        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDeHamburguesa = TipoDeHamburguesa.CuartoDeLibra;
        losDatos.elTipoDePapas = TipoDePapas.Pequeña;
        losDatos.elTipoDeBebidas = TipoDeBebidas.Pepsi;
        losDatos.elTipoDePostres = TipoDePostres.McFlurry;

        return new OrdenDeCompra(losDatos);
    }

    public OrdenDeCompra UnPedidoCompleto_Papas_PapasPequeñas() {
        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDeHamburguesa = TipoDeHamburguesa.CuartoDeLibra;
        losDatos.elTipoDePapas = TipoDePapas.Pequeña;
        losDatos.elTipoDeBebidas = TipoDeBebidas.Pepsi;
        losDatos.elTipoDePostres = TipoDePostres.McFlurry;

        return new OrdenDeCompra(losDatos);
    }

    public OrdenDeCompra UnPedidoCompleto_Papas_PapasMedianas() {
        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDeHamburguesa = TipoDeHamburguesa.CuartoDeLibra;
        losDatos.elTipoDePapas = TipoDePapas.Mediana;
        losDatos.elTipoDeBebidas = TipoDeBebidas.Pepsi;
        losDatos.elTipoDePostres = TipoDePostres.McFlurry;

        return new OrdenDeCompra(losDatos);
    }

    public OrdenDeCompra UnPedidoCompleto_Papas_PapasGrandes() {
        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDeHamburguesa = TipoDeHamburguesa.CuartoDeLibra;
        losDatos.elTipoDePapas = TipoDePapas.Grande;
        losDatos.elTipoDeBebidas = TipoDeBebidas.Pepsi;
        losDatos.elTipoDePostres = TipoDePostres.McFlurry;

        return new OrdenDeCompra(losDatos);
    }

    public OrdenDeCompra UnPedidoCompleto_Bebida_Pepsi() {
        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDeHamburguesa = TipoDeHamburguesa.CuartoDeLibra;
        losDatos.elTipoDePapas = TipoDePapas.Grande;
        losDatos.elTipoDeBebidas = TipoDeBebidas.Pepsi;
        losDatos.elTipoDePostres = TipoDePostres.McFlurry;

        return new OrdenDeCompra(losDatos);
    }

    public OrdenDeCompra UnPedidoCompleto_Bebida_CocaCola() {
        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDeHamburguesa = TipoDeHamburguesa.CuartoDeLibra;
        losDatos.elTipoDePapas = TipoDePapas.Grande;
        losDatos.elTipoDeBebidas = TipoDeBebidas.CocaCola;
        losDatos.elTipoDePostres = TipoDePostres.McFlurry;

        return new OrdenDeCompra(losDatos);
    }

    public OrdenDeCompra UnPedidoCompleto_Postre_Cono() {
        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDeHamburguesa = TipoDeHamburguesa.CuartoDeLibra;
        losDatos.elTipoDePapas = TipoDePapas.Grande;
        losDatos.elTipoDeBebidas = TipoDeBebidas.CocaCola;
        losDatos.elTipoDePostres = TipoDePostres.Cono;

        return new OrdenDeCompra(losDatos);
    }

    public OrdenDeCompra UnPedidoCompleto_Postre_Sundae() {
        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDeHamburguesa = TipoDeHamburguesa.CuartoDeLibra;
        losDatos.elTipoDePapas = TipoDePapas.Grande;
        losDatos.elTipoDeBebidas = TipoDeBebidas.CocaCola;
        losDatos.elTipoDePostres = TipoDePostres.Sundae;

        return new OrdenDeCompra(losDatos);
    }

    public OrdenDeCompra UnPedidoCompleto_Postre_McFlurry() {
        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDeHamburguesa = TipoDeHamburguesa.CuartoDeLibra;
        losDatos.elTipoDePapas = TipoDePapas.Grande;
        losDatos.elTipoDeBebidas = TipoDeBebidas.CocaCola;
        losDatos.elTipoDePostres = TipoDePostres.McFlurry;

        return new OrdenDeCompra(losDatos);
    }
}
