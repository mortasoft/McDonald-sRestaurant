package ConParameterObject;

public class PrecioDeLaHamburguesa {
    int elPrecioDeLaHamburguesaOrdenada;

    public PrecioDeLaHamburguesa(DatosDeLaOrdenDeCompra losDatos) {
        elPrecioDeLaHamburguesaOrdenada = DetermineElPrecioDeLaHamburguesa(losDatos);
    }
    
    private static int DetermineElPrecioDeLaHamburguesa(DatosDeLaOrdenDeCompra losDatos) {
        if (losDatos.elTipoDeHamburguesa == TipoDeHamburguesa.BigMac) 
            return 3500;
        else if (losDatos.elTipoDeHamburguesa == TipoDeHamburguesa.McNifica) 
            return  3450;
        else 
            return  3300;
    }

    public double ComoNumero() {
        double elPrecioDeLaHamburguesaConvertida = elPrecioDeLaHamburguesaOrdenada;
        return elPrecioDeLaHamburguesaConvertida;
    }
}
