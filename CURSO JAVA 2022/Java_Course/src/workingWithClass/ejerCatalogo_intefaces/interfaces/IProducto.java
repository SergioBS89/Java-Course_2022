package workingWithClass.ejerCatalogo_intefaces.interfaces;

public interface IProducto {
    
    public int getPrecio();
    public double getPrecioVenta();
    public String datosProducto();

    static void imprimir (IProducto prod){

        System.out.println(prod.datosProducto());
    }

}