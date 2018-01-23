package ConParameterObject;


public class Bebida {
    String laBebidaOrdenada;

    public Bebida(TipoDeBebidas elTipoDeBebidas) {
        laBebidaOrdenada = DetermineLaBebida(elTipoDeBebidas);
    }

    private static String DetermineLaBebida(TipoDeBebidas elTipoDeBebidas) 
    {
        if (elTipoDeBebidas == TipoDeBebidas.Pepsi) 
            return  "Pepsi";
        else 
            return "CocaCola";
    }

    public String ComoTexto() {
        return "BEBIDA: " + laBebidaOrdenada;
    }
}
