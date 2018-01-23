package ConObjetos;

public class Hamburguesa {
    String laHamburguesaOrdenada;

    public Hamburguesa(TipoDeHamburguesa elTipoDeHamburguesa) {
        laHamburguesaOrdenada = DetermineLaHamburguesa(elTipoDeHamburguesa);
    }
    
    private static String DetermineLaHamburguesa(TipoDeHamburguesa elTipoDeHamburguesa) {
        if (elTipoDeHamburguesa == TipoDeHamburguesa.BigMac) 
            return "BigMac";
        else if (elTipoDeHamburguesa == TipoDeHamburguesa.McNifica) 
            return "McNífica";
        else 
            return  "Cuarto de libra";
    }

    public String ComoTexto() {
        return "HAMBURGUESA: " + laHamburguesaOrdenada;
        
    }
}
