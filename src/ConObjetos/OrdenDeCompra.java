package ConObjetos;

public class OrdenDeCompra {
    String laHamburguesa;
    double elPrecioDeLaHamburguesaConvertida;
    String elPedidoDeHamburguesa;
    String lasPapas;
    double elPrecioDeLasPapasConvertidas;
    String elPedidoDePapas;
    String laBebida;
    double elPrecioDeLaBebidaConvertida;
    String elPedidoDeBebida;
    String elPostre;
    double elPrecioDelPostreConvertido;
    String elPedidoDePostre;
    
    public OrdenDeCompra(TipoDeHamburguesa elTipoDeHamburguesa, TipoDePapas elTipoDePapas, TipoDeBebidas elTipoDeBebidas, TipoDePostres elTipoDePostres) {
        
        laHamburguesa = new Hamburguesa(elTipoDeHamburguesa).ComoTexto();
        Hamburguesa = laHamburguesa;

        elPrecioDeLaHamburguesaConvertida = new PrecioDeLaHamburguesa(elTipoDeHamburguesa).ComoNumero();
        PrecioDeLaHamburguesa = "PRECIO: " + elPrecioDeLaHamburguesaConvertida;

        elPedidoDeHamburguesa = laHamburguesa + "\t" + elPrecioDeLaHamburguesaConvertida;
        PedidoDeHamburguesa = elPedidoDeHamburguesa;

        lasPapas = new Papas(elTipoDePapas).ComoTexto();
        Papas = lasPapas;

        elPrecioDeLasPapasConvertidas = new PrecioDeLasPapas(elTipoDePapas).ComoNumero();
        PrecioDeLasPapas = "PRECIO: " + elPrecioDeLasPapasConvertidas;

        elPedidoDePapas = lasPapas + "\t" + elPrecioDeLasPapasConvertidas;
        PapasOrdenadas = elPedidoDePapas;

        laBebida = new Bebida(elTipoDeBebidas).ComoTexto();
        Bebida = laBebida;

        elPrecioDeLaBebidaConvertida = new PrecioDeLaBebida(elTipoDeBebidas).ComoNumero();
        PrecioDeLaBebida = "PRECIO: " + elPrecioDeLaBebidaConvertida;

        elPedidoDeBebida = laBebida + "\t" + elPrecioDeLaBebidaConvertida;
        BebidaOrdenada = elPedidoDeBebida;

        elPostre = new Postre(elTipoDePostres).ComoTexto();
        Postre = elPostre;

        elPrecioDelPostreConvertido = new PrecioDelPostre(elTipoDePostres).ComoNumero();
        PrecioDelPostre = "PRECIO: " + elPrecioDelPostreConvertido;

        elPedidoDePostre = elPostre + "\t" + elPrecioDelPostreConvertido;
        PostreOrdenado = elPedidoDePostre;

        TotalDelPedido = elPrecioDeLaHamburguesaConvertida + elPrecioDeLasPapasConvertidas + elPrecioDeLaBebidaConvertida + elPrecioDelPostreConvertido + "₡";
        PedidoCompleto = elPedidoDeHamburguesa + "\n" + elPedidoDePapas + "\n" + elPedidoDeBebida + "\n" + elPedidoDePostre;
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

    public String getPrecioDeLaHamburguesa() {
        return PrecioDeLaHamburguesa;
    }

    public void setPrecioDeLaHamburguesa(String PrecioDeLaHamburguesa) {
        this.PrecioDeLaHamburguesa = PrecioDeLaHamburguesa;
    }

    public String getPedidoDeHamburguesa() {
        return PedidoDeHamburguesa;
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
        return PrecioDeLasPapas;
    }

    public void setPrecioDeLasPapas(String PrecioDeLasPapas) {
        this.PrecioDeLasPapas = PrecioDeLasPapas;
    }

    public String getPapasOrdenadas() {
        return PapasOrdenadas;
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
        return PrecioDeLaBebida;
    }

    public void setPrecioDeLaBebida(String PrecioDeLaBebida) {
        this.PrecioDeLaBebida = PrecioDeLaBebida;
    }

    public String getPostre() {
        return Postre;
    }

    public void setPostre(String Postre) {
        this.Postre = Postre;
    }

    public String getPrecioDelPostre() {
        return PrecioDelPostre;
    }

    public void setPrecioDelPostre(String PrecioDelPostre) {
        this.PrecioDelPostre = PrecioDelPostre;
    }

    public String getPostreOrdenado() {
        return PostreOrdenado;
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
