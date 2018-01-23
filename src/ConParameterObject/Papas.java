package ConParameterObject;

public class Papas {
    
    String lasPapasOrdenadas;

    public Papas(DatosDeLaOrdenDeCompra losDatos) {
        lasPapasOrdenadas = DetermineLasPapas(losDatos);
    }
    
    private static String DetermineLasPapas(DatosDeLaOrdenDeCompra losDatos) {
        if (losDatos.elTipoDePapas == TipoDePapas.Pequeña) 
            return "Papas Pequeñas";
        else if (losDatos.elTipoDePapas == TipoDePapas.Mediana) 
            return "Papas Medianas";
        else 
            return "Papas Grandes";
    }

    public String ComoTexto() {
        return "PAPAS: " + lasPapasOrdenadas;
    }
}
