package ConObjetos;

public class PrecioDeLaHamburguesa {
    int elPrecioDeLaHamburguesaOrdenada;

    public PrecioDeLaHamburguesa(TipoDeHamburguesa elTipoDeHamburguesa) {
        elPrecioDeLaHamburguesaOrdenada = DetermineElPrecioDeLaHamburguesa(elTipoDeHamburguesa);
    }
    
    private static int DetermineElPrecioDeLaHamburguesa(TipoDeHamburguesa elTipoDeHamburguesa) {
        if (elTipoDeHamburguesa == TipoDeHamburguesa.BigMac) 
            return 3500;
        else if (elTipoDeHamburguesa == TipoDeHamburguesa.McNifica) 
            return  3450;
        else 
            return  3300;
    }

    public double ComoNumero() {
        double elPrecioDeLaHamburguesaConvertida = elPrecioDeLaHamburguesaOrdenada;
        return elPrecioDeLaHamburguesaConvertida;
    }
}
