package ConObjetos;

public class PrecioDelPostre {

    int elPrecioDelPostreOrdenado;

    public PrecioDelPostre(TipoDePostres elTipoDePostres) {
        elPrecioDelPostreOrdenado = DetermineElPrecioDelPostreOrdenado(elTipoDePostres);
    }
    
    private static int DetermineElPrecioDelPostreOrdenado(TipoDePostres elTipoDePostres) {
        if (elTipoDePostres == TipoDePostres.Cono) 
            return 350;
        else if (elTipoDePostres == TipoDePostres.Sundae) 
            return 690;
        else
            return 1250;
    }

    public double ComoNumero() {
        double elPrecioDelPostreConvertido = elPrecioDelPostreOrdenado;
        return elPrecioDelPostreConvertido;
    }
    
}
