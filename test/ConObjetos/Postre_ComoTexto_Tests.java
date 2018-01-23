package ConObjetos;

import ConObjetos.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Postre_ComoTexto_Tests {

    private String elResultadoEsperado;
    private String elResultadoObtenido;
    private TipoDePostres elTipoDePostres;

    @Test
    public void Postre_Cono_NombreEstablecido() {
        elResultadoEsperado = "POSTRE: Cono";

        elTipoDePostres = TipoDePostres.Cono;
        elResultadoObtenido = new Postre(elTipoDePostres).ComoTexto();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Postre_Sundae_NombreEstablecido() {
        elResultadoEsperado = "POSTRE: Sundae";

        elTipoDePostres = TipoDePostres.Sundae;
        elResultadoObtenido = new Postre(elTipoDePostres).ComoTexto();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Postre_McFlurry_NombreEstablecido() {
        elResultadoEsperado = "POSTRE: McFlurry";

        elTipoDePostres = TipoDePostres.McFlurry;
        elResultadoObtenido = new Postre(elTipoDePostres).ComoTexto();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }
}
