package ConParameterObject;

public class PrecioDelPostre {

    int elPrecioDelPostreOrdenado;

    public PrecioDelPostre(DatosDeLaOrdenDeCompra losDatos) {
        elPrecioDelPostreOrdenado = DetermineElPrecioDelPostreOrdenado(losDatos);
    }
    
    private static int DetermineElPrecioDelPostreOrdenado(DatosDeLaOrdenDeCompra losDatos) {
        if (losDatos.elTipoDePostres == TipoDePostres.Cono) 
            return 350;
        else if (losDatos.elTipoDePostres == TipoDePostres.Sundae) 
            return 690;
        else
            return 1250;
    }

    public double ComoNumero() {
        double elPrecioDelPostreConvertido = elPrecioDelPostreOrdenado;
        return elPrecioDelPostreConvertido;
    }
    
}
