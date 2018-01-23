package ConTellDontAsk;

public class PrecioDeLaBebida {

    int elPrecioDeLaBebidaOrdenada;

    public PrecioDeLaBebida(DatosDeLaOrdenDeCompra losDatos) {
        elPrecioDeLaBebidaOrdenada = DeterminelPrecioDeLaBebida(losDatos);
    }

    private static int DeterminelPrecioDeLaBebida(DatosDeLaOrdenDeCompra losDatos) {
        if (losDatos.elTipoDeBebidas == TipoDeBebidas.Pepsi) 
            return 600;
        else 
            return 650;
    }

    public double ComoNumero() {
        double elPrecioDeLaBebidaConvertida = elPrecioDeLaBebidaOrdenada;
        return elPrecioDeLaBebidaConvertida;
    }

}
