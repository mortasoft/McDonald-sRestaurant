package ConProcedimiento;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Papas_Tests extends Escenarios {

    private String elResultadoEsperado;
    private OrdenDeCompra laOrden;
    private String elResultadoObtenido;

    @Test
    public void Papas_PapasPequeñas_NombreEstablecido() {
        elResultadoEsperado = "PAPAS: Papas Pequeñas";

        laOrden = UnPedidoCompleto_Papas_PapasPequeñas();
        elResultadoObtenido = laOrden.lasPapas;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Papas_PapasMedianas_NombreEstablecido() {
        elResultadoEsperado = "PAPAS: Papas Medianas";

        laOrden = UnPedidoCompleto_Papas_PapasMedianas();
        elResultadoObtenido = laOrden.lasPapas;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Papas_PapasGrandes_NombreEstablecido() {
        elResultadoEsperado = "PAPAS: Papas Grandes";

        laOrden = UnPedidoCompleto_Papas_PapasGrandes();
        elResultadoObtenido = laOrden.lasPapas;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Papas_PapasPequeñas_PrecioEstablecido() {
        elResultadoEsperado = "PRECIO: 800.0";

        laOrden = UnPedidoCompleto_Papas_PapasPequeñas();
        elResultadoObtenido = laOrden.elPrecioDeLasPapas;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Papas_PapasMedianas_PrecioEstablecido() {
        elResultadoEsperado = "PRECIO: 900.0";

        laOrden = UnPedidoCompleto_Papas_PapasMedianas();
        elResultadoObtenido = laOrden.elPrecioDeLasPapas;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Papas_PapasGrandes_PrecioEstablecido() {
        elResultadoEsperado = "PRECIO: 1000.0";

        laOrden = UnPedidoCompleto_Papas_PapasGrandes();
        elResultadoObtenido = laOrden.elPrecioDeLasPapas;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

}
