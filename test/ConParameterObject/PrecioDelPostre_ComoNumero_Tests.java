package ConParameterObject;

import ConParameterObject.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrecioDelPostre_ComoNumero_Tests {

    private double elResultadoEsperado;
    private double elResultadoObtenido;
    private TipoDePostres elTipoDePostres;
    private DatosDeLaOrdenDeCompra losDatos;

    @Test
    public void Postre_Cono_PrecioEstablecido() {
        elResultadoEsperado = 350;

        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDePostres = TipoDePostres.Cono;
        elResultadoObtenido = new PrecioDelPostre(losDatos).ComoNumero();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Postre_Sundae_PrecioEstablecido() {
        elResultadoEsperado = 690;

        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDePostres = TipoDePostres.Sundae;
        elResultadoObtenido = new PrecioDelPostre(losDatos).ComoNumero();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Postre_McFlurry_PrecioEstablecido() {
        elResultadoEsperado = 1250;

        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDePostres = TipoDePostres.McFlurry;
        elResultadoObtenido = new PrecioDelPostre(losDatos).ComoNumero();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }
}
