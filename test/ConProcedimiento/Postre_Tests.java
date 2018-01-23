package ConProcedimiento;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Postre_Tests extends Escenarios {

    private String elResultadoEsperado;
    private OrdenDeCompra laOrden;
    private String elResultadoObtenido;

    @Test
    public void Postre_Cono_NombreEstablecido() {
        elResultadoEsperado = "POSTRE: Cono";

        laOrden = UnPedidoCompleto_Postre_Cono();
        elResultadoObtenido = laOrden.elPostre;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Postre_Sundae_NombreEstablecido() {
        elResultadoEsperado = "POSTRE: Sundae";

        laOrden = UnPedidoCompleto_Postre_Sundae();
        elResultadoObtenido = laOrden.elPostre;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Postre_McFlurry_NombreEstablecido() {
        elResultadoEsperado = "POSTRE: McFlurry";

        laOrden = UnPedidoCompleto_Postre_McFlurry();
        elResultadoObtenido = laOrden.elPostre;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Postre_Cono_PrecioEstablecido() {
        elResultadoEsperado = "PRECIO: 350.0";

        laOrden = UnPedidoCompleto_Postre_Cono();
        elResultadoObtenido = laOrden.elPrecioDelPostre;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Postre_Sundae_PrecioEstablecido() {
        elResultadoEsperado = "PRECIO: 690.0";

        laOrden = UnPedidoCompleto_Postre_Sundae();
        elResultadoObtenido = laOrden.elPrecioDelPostre;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Postre_McFlurry_PrecioEstablecido() {
        elResultadoEsperado = "PRECIO: 1250.0";

        laOrden = UnPedidoCompleto_Postre_McFlurry();
        elResultadoObtenido = laOrden.elPrecioDelPostre;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }
}
