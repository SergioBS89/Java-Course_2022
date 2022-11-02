package workingWithClass.ejerB.clases;

public class Limpieza extends Producto{

    private String componentes;
    private Double litros;

    public Limpieza(String nombre, Double precio, String componentes, Double litros){
        super(nombre, precio);
        this.litros = litros;
        this.componentes = componentes;

    }
    

    /**
     * @return String return the componentes
     */
    public String getComponentes() {
        return componentes;
    }

    /**
     * @param componentes the componentes to set
     */
    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }

    /**
     * @return Double return the litros
     */
    public Double getLitros() {
        return litros;
    }

    /**
     * @param litros the litros to set
     */
    public void setLitros(Double litros) {
        this.litros = litros;
    }

    @Override
    public String toString(){
        return super.toString() +
        "Componentes: " + getComponentes() + "\n" +
        "Litros: " +getLitros();
    }

}