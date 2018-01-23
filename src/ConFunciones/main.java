package ConFunciones;

import ConProcedimiento.*;

/**
 *
 * @author Pérez Meneses
 */
public class main {

    private static OrdenDeCompra miOrden;

    public static void main(String[] args) {
        miOrden = GeneracionDeOrdenDeCompra.GenereOrdenDeCompra(TipoDeHamburguesa.BigMac,
                TipoDePapas.Pequeña, TipoDeBebidas.Pepsi, TipoDePostres.McFlurry);

//        System.out.println(miOrden.laHamburguesa);
//        System.out.println(miOrden.lasPapas);
//        System.out.println(miOrden.laBebida);
//        System.out.println(miOrden.elPostre);
        System.out.println(miOrden.elPedidoCompleto);
        System.out.println("\n");
        System.out.println(miOrden.elTotalDelPedido);
    }

}
