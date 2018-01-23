package ConProcedimiento;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Hamburguesa_Tests extends Escenarios {

    private String elResultadoEsperado;
    private OrdenDeCompra laOrden;
    private String elResultadoObtenido;

    @Test
    public void Hamburguesa_BigMac_NombreEstablecido() {
        elResultadoEsperado = "HAMBURGUESA: BigMac";

        laOrden = UnPedidoCompleto_Hambrugesa_BigMac();
        elResultadoObtenido = laOrden.laHamburguesa;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Hamburguesa_McNífica_NombreEstablecido() {
        elResultadoEsperado = "HAMBURGUESA: McNífica";

        laOrden = UnPedidoCompleto_Hamburguesa_McNifica();
        elResultadoObtenido = laOrden.laHamburguesa;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Hamburguesa_CuartoDeLibra_NombreEstablecido() {
        elResultadoEsperado = "HAMBURGUESA: Cuarto de libra";

        laOrden = UnPedidoCompleto_Hamburguesa_CuartoDeLibra();
        elResultadoObtenido = laOrden.laHamburguesa;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Hamburguesa_BigMac_PrecioEstablecido() {
        elResultadoEsperado = "PRECIO: 3500.0";

        laOrden = UnPedidoCompleto_Hambrugesa_BigMac();
        elResultadoObtenido = laOrden.elPrecioDeLaHamburguesa;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Hamburguesa_McNífica_PrecioEstablecido() {
        elResultadoEsperado = "PRECIO: 3450.0";

        laOrden = UnPedidoCompleto_Hamburguesa_McNifica();
        elResultadoObtenido = laOrden.elPrecioDeLaHamburguesa;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Hamburguesa_CuartoDeLibra_PrecioEstablecido() {
        elResultadoEsperado = "PRECIO: 3300.0";

        laOrden = UnPedidoCompleto_Hamburguesa_CuartoDeLibra();
        elResultadoObtenido = laOrden.elPrecioDeLaHamburguesa;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

}
