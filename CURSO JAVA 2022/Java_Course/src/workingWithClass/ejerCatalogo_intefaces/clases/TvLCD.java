package workingWithClass.ejerCatalogo_intefaces.clases;



public class TvLCD extends Electronico {

    private int pulgadas;


    public TvLCD(String fabricante, int precio, int pulgadas) {
        super(fabricante, precio);
        this.pulgadas = pulgadas;
    }
   
    public int getPulgadas() {
        return pulgadas;
    }

   
    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
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
               "Pulgadas: " + getPulgadas() + "'' \n" +
               "Precio: " + getPrecio() + "\n" + 
               "Precio con IVA: " + getPrecioVenta() + "\n" ;
    }

   

}