package ConTellDontAsk;

import ConTellDontAsk.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrecioDeLaBebida_ComoNumero_Tests {

    private double elResultadoEsperado;
    private double elResultadoObtenido;
    private TipoDeBebidas elTipoDeBebidas;
    private DatosDeLaOrdenDeCompra losDatos;

    @Test
    public void Bebidas_Pepsi_PrecioEstablecido() {
        elResultadoEsperado = 600;

        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDeBebidas = TipoDeBebidas.Pepsi;
        elResultadoObtenido = new PrecioDeLaBebida(losDatos).ComoNumero();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Bebidas_CocaCola_PrecioEstablecido() {
        elResultadoEsperado = 650;

        losDatos = new DatosDeLaOrdenDeCompra();
        losDatos.elTipoDeBebidas = TipoDeBebidas.CocaCola;
        elResultadoObtenido = new PrecioDeLaBebida(losDatos).ComoNumero();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }
}
