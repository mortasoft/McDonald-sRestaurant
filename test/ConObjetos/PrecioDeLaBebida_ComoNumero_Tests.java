package ConObjetos;

import ConObjetos.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrecioDeLaBebida_ComoNumero_Tests {

    private double elResultadoEsperado;
    private double elResultadoObtenido;
    private TipoDeBebidas elTipoDeBebidas;

    @Test
    public void Bebidas_Pepsi_PrecioEstablecido() {
        elResultadoEsperado = 600;

        elTipoDeBebidas = TipoDeBebidas.Pepsi;
        elResultadoObtenido = new PrecioDeLaBebida(elTipoDeBebidas).ComoNumero();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Bebidas_CocaCola_PrecioEstablecido() {
        elResultadoEsperado = 650;

        elTipoDeBebidas = TipoDeBebidas.CocaCola;
        elResultadoObtenido = new PrecioDeLaBebida(elTipoDeBebidas).ComoNumero();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }
}
