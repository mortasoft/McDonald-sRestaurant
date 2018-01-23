package ConObjetos;

import ConObjetos.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrecioDeLaHamburguesa_ComoNumero_Tests {

    private double elResultadoEsperado;
    private double elResultadoObtenido;
    private TipoDeHamburguesa elTipoDeHamburguesa;

    @Test
    public void Hamburguesa_BigMac_PrecioEstablecido() {
        elResultadoEsperado = 3500;

        elTipoDeHamburguesa = TipoDeHamburguesa.BigMac;
        elResultadoObtenido = new PrecioDeLaHamburguesa(elTipoDeHamburguesa).ComoNumero();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Hamburguesa_McNífica_PrecioEstablecido() {
        elResultadoEsperado = 3450;

        elTipoDeHamburguesa = TipoDeHamburguesa.McNifica;
        elResultadoObtenido = new PrecioDeLaHamburguesa(elTipoDeHamburguesa).ComoNumero();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Hamburguesa_CuartoDeLibra_PrecioEstablecido() {
        elResultadoEsperado = 3300;

        elTipoDeHamburguesa = TipoDeHamburguesa.CuartoDeLibra;
        elResultadoObtenido = new PrecioDeLaHamburguesa(elTipoDeHamburguesa).ComoNumero();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }
}
