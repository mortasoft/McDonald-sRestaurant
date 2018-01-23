package ConObjetos;

import ConObjetos.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrecioDelPostre_ComoNumero_Tests {
     private double elResultadoEsperado;
        private double elResultadoObtenido;
        private TipoDePostres elTipoDePostres;

    @Test
        public void Postre_Cono_PrecioEstablecido()
        {
            elResultadoEsperado = 350;

            elTipoDePostres = TipoDePostres.Cono;
            elResultadoObtenido = new PrecioDelPostre(elTipoDePostres).ComoNumero();

           assertEquals(elResultadoEsperado, elResultadoObtenido);
        }
            @Test
        public void Postre_Sundae_PrecioEstablecido()
        {
            elResultadoEsperado = 690;

            elTipoDePostres = TipoDePostres.Sundae;
            elResultadoObtenido = new PrecioDelPostre(elTipoDePostres).ComoNumero();

           assertEquals(elResultadoEsperado, elResultadoObtenido);
        }
        @Test
        public void Postre_McFlurry_PrecioEstablecido()
        {
            elResultadoEsperado = 1250;

            elTipoDePostres = TipoDePostres.McFlurry;
            elResultadoObtenido = new PrecioDelPostre(elTipoDePostres).ComoNumero();

            assertEquals(elResultadoEsperado, elResultadoObtenido);
        }
}
