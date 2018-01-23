package ConObjetos;

import ConObjetos.*;

public class Escenarios {

    private TipoDeHamburguesa laHamburguesa;
    private TipoDePapas lasPapas;
    private TipoDeBebidas laBebida;
    private TipoDePostres elPostre;
    
    public OrdenDeCompra UnPedidoCompleto_Hambrugesa_BigMac()
    {
        laHamburguesa = TipoDeHamburguesa.BigMac;
        lasPapas =  TipoDePapas.Pequeña;
        laBebida = TipoDeBebidas.Pepsi;
        elPostre =  TipoDePostres.McFlurry;
        
        return new OrdenDeCompra(laHamburguesa, lasPapas, laBebida,elPostre);
    }
    public OrdenDeCompra UnPedidoCompleto_Hamburguesa_McNifica()
    {
        laHamburguesa = TipoDeHamburguesa.McNifica;
        lasPapas =  TipoDePapas.Pequeña;
        laBebida = TipoDeBebidas.Pepsi;
        elPostre =  TipoDePostres.McFlurry;
        
        return new OrdenDeCompra(laHamburguesa, lasPapas, laBebida,elPostre);
    }
    public OrdenDeCompra UnPedidoCompleto_Hamburguesa_CuartoDeLibra()
    {
        laHamburguesa = TipoDeHamburguesa.CuartoDeLibra;
        lasPapas =  TipoDePapas.Pequeña;
        laBebida = TipoDeBebidas.Pepsi;
        elPostre =  TipoDePostres.McFlurry;
        
        return new OrdenDeCompra(laHamburguesa, lasPapas, laBebida,elPostre);
    }
    public OrdenDeCompra UnPedidoCompleto_Papas_PapasPequeñas()
    {
        laHamburguesa = TipoDeHamburguesa.CuartoDeLibra;
        lasPapas =  TipoDePapas.Pequeña;
        laBebida = TipoDeBebidas.Pepsi;
        elPostre =  TipoDePostres.McFlurry;
        
        return new OrdenDeCompra(laHamburguesa, lasPapas, laBebida,elPostre);
    }
    public OrdenDeCompra UnPedidoCompleto_Papas_PapasMedianas()
    {
        laHamburguesa = TipoDeHamburguesa.CuartoDeLibra;
        lasPapas =  TipoDePapas.Mediana;
        laBebida = TipoDeBebidas.Pepsi;
        elPostre =  TipoDePostres.McFlurry;
        
        return new OrdenDeCompra(laHamburguesa, lasPapas, laBebida,elPostre);
    }
    public OrdenDeCompra UnPedidoCompleto_Papas_PapasGrandes()
    {
        laHamburguesa = TipoDeHamburguesa.CuartoDeLibra;
        lasPapas =  TipoDePapas.Grande;
        laBebida = TipoDeBebidas.Pepsi;
        elPostre =  TipoDePostres.McFlurry;
        
        return new OrdenDeCompra(laHamburguesa, lasPapas, laBebida,elPostre);
    }
    public OrdenDeCompra UnPedidoCompleto_Bebida_Pepsi()
    {
        laHamburguesa = TipoDeHamburguesa.CuartoDeLibra;
        lasPapas =  TipoDePapas.Grande;
        laBebida = TipoDeBebidas.Pepsi;
        elPostre =  TipoDePostres.McFlurry;
        
        return new OrdenDeCompra(laHamburguesa, lasPapas, laBebida,elPostre);
    }
    public OrdenDeCompra UnPedidoCompleto_Bebida_CocaCola()
    {
        laHamburguesa = TipoDeHamburguesa.CuartoDeLibra;
        lasPapas =  TipoDePapas.Grande;
        laBebida = TipoDeBebidas.CocaCola;
        elPostre =  TipoDePostres.McFlurry;
        
        return new OrdenDeCompra(laHamburguesa, lasPapas, laBebida,elPostre);
    }
    
    public OrdenDeCompra UnPedidoCompleto_Postre_Cono()
    {
        laHamburguesa = TipoDeHamburguesa.CuartoDeLibra;
        lasPapas =  TipoDePapas.Grande;
        laBebida = TipoDeBebidas.CocaCola;
        elPostre =  TipoDePostres.Cono;
        
        return new OrdenDeCompra(laHamburguesa, lasPapas, laBebida,elPostre);
    }
    public OrdenDeCompra UnPedidoCompleto_Postre_Sundae()
    {
        laHamburguesa = TipoDeHamburguesa.CuartoDeLibra;
        lasPapas =  TipoDePapas.Grande;
        laBebida = TipoDeBebidas.CocaCola;
        elPostre =  TipoDePostres.Sundae;
        
        return new OrdenDeCompra(laHamburguesa, lasPapas, laBebida,elPostre);
    }
    public OrdenDeCompra UnPedidoCompleto_Postre_McFlurry()
    {
        laHamburguesa = TipoDeHamburguesa.CuartoDeLibra;
        lasPapas =  TipoDePapas.Grande;
        laBebida = TipoDeBebidas.CocaCola;
        elPostre =  TipoDePostres.McFlurry;
        
        return new OrdenDeCompra(laHamburguesa, lasPapas, laBebida,elPostre);
    }
}
