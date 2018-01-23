package ConObjetos;

public class PrecioDeLaBebida {

    int elPrecioDeLaBebidaOrdenada;

    public PrecioDeLaBebida(TipoDeBebidas elTipoDeBebidas) {
        elPrecioDeLaBebidaOrdenada = DeterminelPrecioDeLaBebida(elTipoDeBebidas);
    }

    private static int DeterminelPrecioDeLaBebida(TipoDeBebidas elTipoDeBebidas) {
        if (elTipoDeBebidas == TipoDeBebidas.Pepsi) 
            return 600;
        else 
            return 650;
    }

    public double ComoNumero() {
        double elPrecioDeLaBebidaConvertida = elPrecioDeLaBebidaOrdenada;
        return elPrecioDeLaBebidaConvertida;
    }

}
