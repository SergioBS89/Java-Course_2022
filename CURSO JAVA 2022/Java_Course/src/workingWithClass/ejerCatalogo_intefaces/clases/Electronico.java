package workingWithClass.ejerCatalogo_intefaces.clases;

import workingWithClass.ejerCatalogo_intefaces.interfaces.IElectronico;

public abstract class Electronico extends Producto implements IElectronico{

    private String fabricante;

    public Electronico(String fabricante, int precio){
        super(precio);
        this.fabricante = fabricante;
    }


    @Override
    public String getFabricante() {
        
        return fabricante;
    }
    
}