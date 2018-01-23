package ConParameterObject;

import ConParameterObject.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrecioDeLaHamburguesa_ComoNumero_Tests {

    private double elResultadoEsperado;
    private double elResultadoObtenido;
    private TipoDeHamburguesa elTipoDeHamburguesa;
    private DatosDeLaOrdenDeCompra losDatos;

    @Test
    public void Hamburguesa_BigMac_PrecioEstablecido() {
        elResultadoEsperado = 3500;

        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDeHamburguesa = TipoDeHamburguesa.BigMac;
        elResultadoObtenido = new PrecioDeLaHamburguesa(losDatos).ComoNumero();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Hamburguesa_McNífica_PrecioEstablecido() {
        elResultadoEsperado = 3450;

        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDeHamburguesa = TipoDeHamburguesa.McNifica;
        elResultadoObtenido = new PrecioDeLaHamburguesa(losDatos).ComoNumero();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Hamburguesa_CuartoDeLibra_PrecioEstablecido() {
        elResultadoEsperado = 3300;

        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDeHamburguesa = TipoDeHamburguesa.CuartoDeLibra;
        elResultadoObtenido = new PrecioDeLaHamburguesa(losDatos).ComoNumero();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }
}
