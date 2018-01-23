package ConObjetos;

public class PrecioDeLasPapas {
    int elPrecioDeLasPapasOrdenadas;

    public PrecioDeLasPapas(TipoDePapas elTipoDePapas) {
        elPrecioDeLasPapasOrdenadas = DetermineElPrecioDeLasPapas(elTipoDePapas);
    }
    private static int DetermineElPrecioDeLasPapas(TipoDePapas elTipoDePapas) {
        if (elTipoDePapas == TipoDePapas.Pequeña) 
            return 800;
        else if (elTipoDePapas == TipoDePapas.Mediana) 
            return 900;
        else 
            return 1000;
    }

    public double ComoNumero() {
        double elPrecioDeLasPapasConvertidas = elPrecioDeLasPapasOrdenadas;
        return elPrecioDeLasPapasConvertidas;
    }
    
}
