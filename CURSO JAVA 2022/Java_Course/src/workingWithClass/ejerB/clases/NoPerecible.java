package workingWithClass.ejerB.clases;

public class NoPerecible extends Producto{

    private String contenido;
    private Integer calorias;

    public NoPerecible(String nombre, Double precio, String contenido, Integer calorias){
        super(nombre, precio);
        this.contenido = contenido;
    this.calorias = calorias;
    }
    
    

    /**
     * @return Integer return the contenido
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * @param contenido the contenido to set
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * @return Integer return the calorias
     */
    public Integer getCalorias() {
        return calorias;
    }

    /**
     * @param calorias the calorias to set
     */
    public void setCalorias(Integer calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString(){
        return super.toString() +
        "Contenido: " + this.contenido + "\n" +
        "Calorias: " + this.calorias;
    }

}