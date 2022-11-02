package workingWithClass.ejerCatalogo_intefaces.clases;



public class IPhone extends Electronico {

    private String modelo;
    private String color;


    public IPhone(String fabricante, int precio, String color, String modelo) {
        super(fabricante, precio);
        this.color = color;
        this.modelo= modelo;
    }
    
    


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getPrecioVenta(){

        int iva = 21;
        double conIva = (this.getPrecio() * iva ) / 100;
        return conIva + getPrecio();
    }

    @Override
    public String datosProducto(){
        return "Fabricante: " + getFabricante() + "\n" +
               "Modelo: " + getModelo() + "\n" +
               "Color: " + getColor() + "\n" +
               "Precio: " + getPrecio() + "\n" + 
               "Precio con IVA: " + getPrecioVenta() + "\n" ;
    }
}