package ConParameterObject;

import ConParameterObject.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Hamburguesa_ComoTexto_Tests {

    private String elResultadoEsperado;
    private String elResultadoObtenido;
    private TipoDeHamburguesa elTipoDeHamburguesa;
    private DatosDeLaOrdenDeCompra losDatos;

    @Test
    public void Hamburguesa_BigMac_NombreEstablecido() {
        elResultadoEsperado = "HAMBURGUESA: BigMac";
        
        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDeHamburguesa = TipoDeHamburguesa.BigMac;
        elResultadoObtenido = new Hamburguesa(losDatos).ComoTexto();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Hamburguesa_McNífica_NombreEstablecido() {
        elResultadoEsperado = "HAMBURGUESA: McNífica";

        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDeHamburguesa = TipoDeHamburguesa.McNifica;
        elResultadoObtenido = new Hamburguesa(losDatos).ComoTexto();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Hamburguesa_CuartoDeLibra_NombreEstablecido() {
        elResultadoEsperado = "HAMBURGUESA: Cuarto de libra";

        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDeHamburguesa = TipoDeHamburguesa.CuartoDeLibra;
        elResultadoObtenido = new Hamburguesa(losDatos).ComoTexto();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }
}
