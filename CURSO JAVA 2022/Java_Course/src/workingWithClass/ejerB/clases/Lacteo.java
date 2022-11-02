package workingWithClass.ejerB.clases;

public class Lacteo  extends Producto {

    private Integer cantidad;
    private Integer proteina;
    

    public Lacteo(String nombre, Double precio, Integer proteina, Integer cantidad){
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteina = proteina;

    }
    

    /**
     * @return Integer return the cantidad
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return Integer return the proteina
     */
    public Integer getProteina() {
        return proteina;
    }

    /**
     * @param proteina the proteina to set
     */
    public void setProteina(Integer proteina) {
        this.proteina = proteina;
    }

    @Override
    public String toString(){
        return super.toString() +
        "Cantidad: " + getCantidad() + "\n" +
        "Proteina: " +getProteina();
    }

}