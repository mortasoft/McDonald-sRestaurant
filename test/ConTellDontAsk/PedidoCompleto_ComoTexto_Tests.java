package ConTellDontAsk;

import ConTellDontAsk.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PedidoCompleto_ComoTexto_Tests extends Escenarios {

    private String elResultadoEsperado;
    private String elResultadoObtenido;
    private OrdenDeCompra laOrden;

    @Test
    public void PedidoCompleto_Hamburguesa_BigMac() {
        elResultadoEsperado = "HAMBURGUESA: BigMac\t3500.0\nPAPAS: Papas Pequeñas\t800.0\nBEBIDA: Pepsi\t600.0\nPOSTRE: McFlurry\t1250.0";

        laOrden = UnPedidoCompleto_Hambrugesa_BigMac();
        elResultadoObtenido = laOrden.PedidoCompleto;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void PedidoCompleto_Hamburguesa_McNifica() {
        elResultadoEsperado = "HAMBURGUESA: McNífica\t3450.0\nPAPAS: Papas Pequeñas\t800.0\nBEBIDA: Pepsi\t600.0\nPOSTRE: McFlurry\t1250.0";

        laOrden = UnPedidoCompleto_Hamburguesa_McNifica();
        elResultadoObtenido = laOrden.PedidoCompleto;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void PedidoCompleto_Hamburguesa_CuartoDeLibra() {
        elResultadoEsperado = "HAMBURGUESA: Cuarto de libra\t3300.0\nPAPAS: Papas Pequeñas\t800.0\nBEBIDA: Pepsi\t600.0\nPOSTRE: McFlurry\t1250.0";

        laOrden = laOrden = UnPedidoCompleto_Hamburguesa_CuartoDeLibra();
        elResultadoObtenido = laOrden.PedidoCompleto;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void PedidoCompleto_Papas_PapasPequeñas() {
        elResultadoEsperado = "HAMBURGUESA: Cuarto de libra\t3300.0\nPAPAS: Papas Pequeñas\t800.0\nBEBIDA: Pepsi\t600.0\nPOSTRE: McFlurry\t1250.0";

        laOrden = UnPedidoCompleto_Papas_PapasPequeñas();
        elResultadoObtenido = laOrden.PedidoCompleto;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void PedidoCompleto_Papas_PapasMedianas() {
        elResultadoEsperado = "HAMBURGUESA: Cuarto de libra\t3300.0\nPAPAS: Papas Medianas\t900.0\nBEBIDA: Pepsi\t600.0\nPOSTRE: McFlurry\t1250.0";
        laOrden = UnPedidoCompleto_Papas_PapasMedianas();
        elResultadoObtenido = laOrden.PedidoCompleto;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void PedidoCompleto_Papas_Grandes() {
        elResultadoEsperado = "HAMBURGUESA: Cuarto de libra\t3300.0\nPAPAS: Papas Grandes\t1000.0\nBEBIDA: Pepsi\t600.0\nPOSTRE: McFlurry\t1250.0";

        laOrden = UnPedidoCompleto_Papas_PapasGrandes();
        elResultadoObtenido = laOrden.PedidoCompleto;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void PedidoCompleto_Bebida_Pepsi() {
        elResultadoEsperado = "HAMBURGUESA: Cuarto de libra\t3300.0\nPAPAS: Papas Grandes\t1000.0\nBEBIDA: Pepsi\t600.0\nPOSTRE: McFlurry\t1250.0";

        laOrden = UnPedidoCompleto_Bebida_Pepsi();
        elResultadoObtenido = laOrden.PedidoCompleto;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void PedidoCompleto_Bebida_CocaCola() {
        elResultadoEsperado = "HAMBURGUESA: Cuarto de libra\t3300.0\nPAPAS: Papas Grandes\t1000.0\nBEBIDA: CocaCola\t650.0\nPOSTRE: McFlurry\t1250.0";

        laOrden = UnPedidoCompleto_Bebida_CocaCola();
        elResultadoObtenido = laOrden.PedidoCompleto;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void PedidoCompleto_Postre_McFlurry() {
        elResultadoEsperado = "HAMBURGUESA: Cuarto de libra\t3300.0\nPAPAS: Papas Grandes\t1000.0\nBEBIDA: CocaCola\t650.0\nPOSTRE: McFlurry\t1250.0";
        laOrden = UnPedidoCompleto_Postre_McFlurry();
        elResultadoObtenido = laOrden.PedidoCompleto;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void PedidoCompleto_Postre_Cono() {
        elResultadoEsperado = "HAMBURGUESA: Cuarto de libra\t3300.0\nPAPAS: Papas Grandes\t1000.0\nBEBIDA: CocaCola\t650.0\nPOSTRE: Cono\t350.0";

        laOrden = UnPedidoCompleto_Postre_Cono();
        elResultadoObtenido = laOrden.PedidoCompleto;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void PedidoCompleto_Postre_Sundae() {
        elResultadoEsperado = "HAMBURGUESA: Cuarto de libra\t3300.0\nPAPAS: Papas Grandes\t1000.0\nBEBIDA: CocaCola\t650.0\nPOSTRE: Sundae\t690.0";

        laOrden = UnPedidoCompleto_Postre_Sundae();
        elResultadoObtenido = laOrden.PedidoCompleto;

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }
}
