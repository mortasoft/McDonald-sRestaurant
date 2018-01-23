package ConObjetos;

import ConObjetos.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Hamburguesa_ComoTexto_Tests {

    private String elResultadoEsperado;
    private String elResultadoObtenido;
    private TipoDeHamburguesa elTipoDeHamburguesa;

    @Test
    public void Hamburguesa_BigMac_NombreEstablecido() {
        elResultadoEsperado = "HAMBURGUESA: BigMac";

        elTipoDeHamburguesa = TipoDeHamburguesa.BigMac;
        elResultadoObtenido = new Hamburguesa(elTipoDeHamburguesa).ComoTexto();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Hamburguesa_McNífica_NombreEstablecido() {
        elResultadoEsperado = "HAMBURGUESA: McNífica";

        elTipoDeHamburguesa = TipoDeHamburguesa.McNifica;
        elResultadoObtenido = new Hamburguesa(elTipoDeHamburguesa).ComoTexto();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Hamburguesa_CuartoDeLibra_NombreEstablecido() {
        elResultadoEsperado = "HAMBURGUESA: Cuarto de libra";

        elTipoDeHamburguesa = TipoDeHamburguesa.CuartoDeLibra;
        elResultadoObtenido = new Hamburguesa(elTipoDeHamburguesa).ComoTexto();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }
}
