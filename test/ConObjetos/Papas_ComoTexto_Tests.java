package ConObjetos;

import ConObjetos.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Papas_ComoTexto_Tests {

    private String elResultadoEsperado;
    private String elResultadoObtenido;
    private TipoDePapas elTipoDePapas;

    @Test
    public void Papas_PapasPequeñas_NombreEstablecido() {
        elResultadoEsperado = "PAPAS: Papas Pequeñas";

        elTipoDePapas = TipoDePapas.Pequeña;
        elResultadoObtenido = new Papas(elTipoDePapas).ComoTexto();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Papas_PapasMedianas_NombreEstablecido() {
        elResultadoEsperado = "PAPAS: Papas Medianas";

        elTipoDePapas = TipoDePapas.Mediana;
        elResultadoObtenido = new Papas(elTipoDePapas).ComoTexto();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }
    @Test
        public void Papas_PapasGrandes_NombreEstablecido() {
        elResultadoEsperado = "PAPAS: Papas Grandes";

        elTipoDePapas = TipoDePapas.Grande;
        elResultadoObtenido = new Papas(elTipoDePapas).ComoTexto();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

}
