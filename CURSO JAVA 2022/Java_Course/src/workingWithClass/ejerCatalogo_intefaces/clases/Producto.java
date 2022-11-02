package workingWithClass.ejerCatalogo_intefaces.clases;

import workingWithClass.ejerCatalogo_intefaces.interfaces.IProducto;

public abstract class Producto implements IProducto {

    private int precio;

    public Producto(int precio){
        this.precio = precio;
    }


    @Override
    public int getPrecio() {
        return precio;
    }



}