package ConTellDontAsk;

public class PrecioDeLasPapas {
    int elPrecioDeLasPapasOrdenadas;

    public PrecioDeLasPapas(DatosDeLaOrdenDeCompra losDatos) {
        elPrecioDeLasPapasOrdenadas = DetermineElPrecioDeLasPapas(losDatos);
    }
    private static int DetermineElPrecioDeLasPapas(DatosDeLaOrdenDeCompra losDatos) {
        if (losDatos.elTipoDePapas == TipoDePapas.Pequeña) 
            return 800;
        else if (losDatos.elTipoDePapas == TipoDePapas.Mediana) 
            return 900;
        else 
            return 1000;
    }

    public double ComoNumero() {
        double elPrecioDeLasPapasConvertidas = elPrecioDeLasPapasOrdenadas;
        return elPrecioDeLasPapasConvertidas;
    }
    
}
