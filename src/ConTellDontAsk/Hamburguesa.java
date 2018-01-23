package ConTellDontAsk;

public class Hamburguesa {
    String laHamburguesaOrdenada;

    public Hamburguesa(DatosDeLaOrdenDeCompra losDatos) {
        laHamburguesaOrdenada = DetermineLaHamburguesa(losDatos);
    }
    
    private static String DetermineLaHamburguesa(DatosDeLaOrdenDeCompra losDatos) {
        if (losDatos.elTipoDeHamburguesa == TipoDeHamburguesa.BigMac) 
            return "BigMac";
        else if (losDatos.elTipoDeHamburguesa == TipoDeHamburguesa.McNifica) 
            return "McNífica";
        else 
            return  "Cuarto de libra";
    }

    public String ComoTexto() {
        return "HAMBURGUESA: " + laHamburguesaOrdenada;
        
    }
}
