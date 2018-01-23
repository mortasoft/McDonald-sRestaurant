package ConParameterObject;

import ConParameterObject.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrecioDeLasPapas_ComoNumero_Tests {

    private double elResultadoEsperado;
    private double elResultadoObtenido;
    private TipoDePapas elTipoDePapas;
    private DatosDeLaOrdenDeCompra losDatos;

    @Test
    public void Papas_PapasPequeñas_PrecioEstablecido() {
        elResultadoEsperado = 800;

        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDePapas = TipoDePapas.Pequeña;
        elResultadoObtenido = new PrecioDeLasPapas(losDatos).ComoNumero();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Papas_PapasMedianas_PrecioEstablecido() {
        elResultadoEsperado = 900;

        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDePapas = TipoDePapas.Mediana;
        elResultadoObtenido = new PrecioDeLasPapas(losDatos).ComoNumero();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Papas_PapasGrandes_PrecioEstablecido() {
        elResultadoEsperado = 1000;

        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDePapas = TipoDePapas.Grande;
        elResultadoObtenido = new PrecioDeLasPapas(losDatos).ComoNumero();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }
}
