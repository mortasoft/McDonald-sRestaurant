package ConTellDontAsk;

public class OrdenDeCompra {
    String laHamburguesa;
    double elPrecioDeLaHamburguesaConvertida;
    String lasPapas;
    double elPrecioDeLasPapasConvertidas;
    String laBebida;
    double elPrecioDeLaBebidaConvertida;
    String elPostre;
    double elPrecioDelPostreConvertido;
    
    public OrdenDeCompra(DatosDeLaOrdenDeCompra losDatos) {
        
        laHamburguesa = new Hamburguesa(losDatos).ComoTexto();
        elPrecioDeLaHamburguesaConvertida = new PrecioDeLaHamburguesa(losDatos).ComoNumero();

        lasPapas = new Papas(losDatos).ComoTexto();
        elPrecioDeLasPapasConvertidas = new PrecioDeLasPapas(losDatos).ComoNumero();

        laBebida = new Bebida(losDatos.elTipoDeBebidas).ComoTexto();
        elPrecioDeLaBebidaConvertida = new PrecioDeLaBebida(losDatos).ComoNumero();

        elPostre = new Postre(losDatos).ComoTexto();
        elPrecioDelPostreConvertido = new PrecioDelPostre(losDatos).ComoNumero();

        TotalDelPedido = elPrecioDeLaHamburguesaConvertida + elPrecioDeLasPapasConvertidas + elPrecioDeLaBebidaConvertida + elPrecioDelPostreConvertido + "₡";
        PedidoCompleto = getPedidoDeHamburguesa() + "\n" + getPapasOrdenadas()+ "\n" + getBebidaOrdenada() + "\n" + getPostreOrdenado();
    }
    
    String Hamburguesa;
    String PrecioDeLaHamburguesa;
    String PedidoDeHamburguesa;
    
    String Papas;
    String PrecioDeLasPapas;
    String PapasOrdenadas;
    
    String Bebida;
    String PrecioDeLaBebida;
    String BebidaOrdenada;
    
    String Postre;
    String PrecioDelPostre;
    String PostreOrdenado;
    
    String PedidoCompleto;
    String TotalDelPedido;

    public String getHamburguesa() {
        return Hamburguesa;
    }

    public void setHamburguesa(String Hamburguesa) {
        this.Hamburguesa = Hamburguesa;
    }

    public String getPrecioDeLaHamburguesa() {
        return "PRECIO: " + elPrecioDeLaHamburguesaConvertida;
    }

    public void setPrecioDeLaHamburguesa(String PrecioDeLaHamburguesa) {
        this.PrecioDeLaHamburguesa = PrecioDeLaHamburguesa;
    }

    public String getPedidoDeHamburguesa() {
        return laHamburguesa + "\t" + elPrecioDeLaHamburguesaConvertida;
    }

    public void setPedidoDeHamburguesa(String PedidoDeHamburguesa) {
        this.PedidoDeHamburguesa = PedidoDeHamburguesa;
    }

    public String getPapas() {
        return Papas;
    }

    public void setPapas(String Papas) {
        this.Papas = Papas;
    }

    public String getPrecioDeLasPapas() {
        return "PRECIO: " + elPrecioDeLasPapasConvertidas;
    }

    public void setPrecioDeLasPapas(String PrecioDeLasPapas) {
        this.PrecioDeLasPapas = PrecioDeLasPapas;
    }

    public String getPapasOrdenadas() {
        return lasPapas + "\t" + elPrecioDeLasPapasConvertidas;
    }

    public void setPapasOrdenadas(String PapasOrdenadas) {
        this.PapasOrdenadas = PapasOrdenadas;
    }

    public String getBebida() {
        return Bebida;
    }

    public void setBebida(String Bebida) {
        this.Bebida = Bebida;
    }

    public String getPrecioDeLaBebida() {
        return "PRECIO: " + elPrecioDeLaBebidaConvertida;
    }

    public void setPrecioDeLaBebida(String PrecioDeLaBebida) {
        this.PrecioDeLaBebida = PrecioDeLaBebida;
    }

    public String getBebidaOrdenada() {
        return laBebida + "\t" + elPrecioDeLaBebidaConvertida;
    }

    public void setBebidaOrdenada(String BebidaOrdenada) {
        this.BebidaOrdenada = BebidaOrdenada;
    }

    public String getPostre() {
        return Postre;
    }

    public void setPostre(String Postre) {
        this.Postre = Postre;
    }

    public String getPrecioDelPostre() {
        return "PRECIO: " + elPrecioDelPostreConvertido;
    }

    public void setPrecioDelPostre(String PrecioDelPostre) {
        this.PrecioDelPostre = PrecioDelPostre;
    }

    public String getPostreOrdenado() {
        return elPostre + "\t" + elPrecioDelPostreConvertido;
    }

    public void setPostreOrdenado(String PostreOrdenado) {
        this.PostreOrdenado = PostreOrdenado;
    }

    public String getPedidoCompleto() {
        return PedidoCompleto;
    }

    public void setPedidoCompleto(String PedidoCompleto) {
        this.PedidoCompleto = PedidoCompleto;
    }

    public String getTotalDelPedido() {
        return TotalDelPedido;
    }

    public void setTotalDelPedido(String TotalDelPedido) {
        this.TotalDelPedido = TotalDelPedido;
    }
}
