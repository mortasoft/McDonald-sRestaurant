package ConParameterObject;

import ConParameterObject.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Postre_ComoTexto_Tests {

    private String elResultadoEsperado;
    private String elResultadoObtenido;
    private DatosDeLaOrdenDeCompra losDatos;

    @Test
    public void Postre_Cono_NombreEstablecido() {
        elResultadoEsperado = "POSTRE: Cono";

        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDePostres = TipoDePostres.Cono;
        elResultadoObtenido = new Postre(losDatos).ComoTexto();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Postre_Sundae_NombreEstablecido() {
        elResultadoEsperado = "POSTRE: Sundae";

        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDePostres = TipoDePostres.Sundae;
        elResultadoObtenido = new Postre(losDatos).ComoTexto();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Postre_McFlurry_NombreEstablecido() {
        elResultadoEsperado = "POSTRE: McFlurry";

        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDePostres = TipoDePostres.McFlurry;
        elResultadoObtenido = new Postre(losDatos).ComoTexto();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }
}
