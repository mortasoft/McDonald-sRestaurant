package ConTellDontAsk;

import ConTellDontAsk.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Papas_ComoTexto_Tests {

    private String elResultadoEsperado;
    private String elResultadoObtenido;
    private TipoDePapas elTipoDePapas;
    private DatosDeLaOrdenDeCompra losDatos;

    @Test
    public void Papas_PapasPequeñas_NombreEstablecido() {
        elResultadoEsperado = "PAPAS: Papas Pequeñas";
        
        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDePapas = TipoDePapas.Pequeña;
        elResultadoObtenido = new Papas(losDatos).ComoTexto();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Papas_PapasMedianas_NombreEstablecido() {
        elResultadoEsperado = "PAPAS: Papas Medianas";

        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDePapas = TipoDePapas.Mediana;
        elResultadoObtenido = new Papas(losDatos).ComoTexto();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }
    @Test
        public void Papas_PapasGrandes_NombreEstablecido() {
        elResultadoEsperado = "PAPAS: Papas Grandes";

        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDePapas = TipoDePapas.Grande;
        elResultadoObtenido = new Papas(losDatos).ComoTexto();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

}
