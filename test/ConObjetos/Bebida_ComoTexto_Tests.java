package ConObjetos;

import ConObjetos.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Bebida_ComoTexto_Tests {

    private String elResultadoEsperado;
    private String elResultadoObtenido;
    private TipoDeBebidas elTipoDeBebidas;

    @Test
    public void Bebidas_Pepsi_NombreEstablecido() {
        elResultadoEsperado = "BEBIDA: Pepsi";

        elTipoDeBebidas = TipoDeBebidas.Pepsi;
        elResultadoObtenido = new Bebida(elTipoDeBebidas).ComoTexto();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }

    @Test
    public void Bebidas_CocaCola_NombreEstablecido() {
        elResultadoEsperado = "BEBIDA: CocaCola";

        elTipoDeBebidas = TipoDeBebidas.CocaCola;
        elResultadoObtenido = new Bebida(elTipoDeBebidas).ComoTexto();

        assertEquals(elResultadoEsperado, elResultadoObtenido);
    }
}
