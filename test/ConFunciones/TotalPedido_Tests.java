package ConFunciones;

import ConFunciones.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TotalPedido_Tests extends Escenarios {

    private String elResultadoEsperado;
    private OrdenDeCompra laOrden;
    private String elResuladoObtenido;

    @Test
    public void TotalPedido_Combo1_PreciosEstablecidos() {
        elResultadoEsperado = "6150₡";

        laOrden = UnPedidoCompleto_Hambrugesa_BigMac();
        elResuladoObtenido = laOrden.elTotalDelPedido;

        assertEquals(elResultadoEsperado, elResultadoEsperado);
    }
}
