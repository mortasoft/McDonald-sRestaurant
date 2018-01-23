package ConObjetos;

public class Postre {
    String elPostreOrdenado;

    public Postre(TipoDePostres elTipoDePostres) {
        elPostreOrdenado = DetermineElPostre(elTipoDePostres);
    }
    
    private static String DetermineElPostre(TipoDePostres elTipoDePostres) 
    {
        if (elTipoDePostres == TipoDePostres.McFlurry) 
            return  "McFlurry";
        else if (elTipoDePostres == TipoDePostres.Cono) 
            return  "Cono";
        else 
            return "Sundae";
    }

    public String ComoTexto() {
        return "POSTRE: " + elPostreOrdenado;
    }

}
