package ConFunciones;

import ConFunciones.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Bebida_Tests extends Escenarios {

    private String elResultadoEsperado;
    private OrdenDeCompra laOrden;
    private String elResultadoObtenido;

    @Test
    public void Bebidas_Pepsi_NombreEstablecido() {
        elResultadoEsperado = "BEBIDA: Pepsi";

        laOrden = UnPedidoCompleto_Bebida_Pepsi();
        elResultadoObtenido = laOrden.laBebida;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Bebidas_CocaCola_NombreEstablecido() {
        elResultadoEsperado = "BEBIDA: CocaCola";

        laOrden = UnPedidoCompleto_Bebida_CocaCola();
        elResultadoObtenido = laOrden.laBebida;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Bebidas_Pepsi_PrecioEstablecido() {
        elResultadoEsperado = "PRECIO: 600.0";

        laOrden = UnPedidoCompleto_Bebida_Pepsi();
        elResultadoObtenido = laOrden.elPrecioDeLaBebida;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Bebidas_CocaCola_PrecioEstablecido() {
        elResultadoEsperado = "PRECIO: 650.0";

        laOrden = UnPedidoCompleto_Bebida_CocaCola();
        elResultadoObtenido = laOrden.elPrecioDeLaBebida;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }
}
