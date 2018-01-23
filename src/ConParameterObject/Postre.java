package ConParameterObject;

public class Postre {
    String elPostreOrdenado;

    public Postre(DatosDeLaOrdenDeCompra losDatos) {
        elPostreOrdenado = DetermineElPostre(losDatos);
    }
    
    private static String DetermineElPostre(DatosDeLaOrdenDeCompra losDatos) 
    {
        if (losDatos.elTipoDePostres == TipoDePostres.McFlurry) 
            return  "McFlurry";
        else if (losDatos.elTipoDePostres == TipoDePostres.Cono) 
            return  "Cono";
        else 
            return "Sundae";
    }

    public String ComoTexto() {
        return "POSTRE: " + elPostreOrdenado;
    }

}
