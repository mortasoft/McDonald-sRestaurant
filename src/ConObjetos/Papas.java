package ConObjetos;

public class Papas {
    
    String lasPapasOrdenadas;

    public Papas(TipoDePapas elTipoDePapas) {
        lasPapasOrdenadas = DetermineLasPapas(elTipoDePapas);
    }
    
    private static String DetermineLasPapas(TipoDePapas elTipoDePapas) {
        if (elTipoDePapas == TipoDePapas.Pequeña) 
            return "Papas Pequeñas";
        else if (elTipoDePapas == TipoDePapas.Mediana) 
            return "Papas Medianas";
        else 
            return "Papas Grandes";
    }

    public String ComoTexto() {
        return "PAPAS: " + lasPapasOrdenadas;
    }
}
