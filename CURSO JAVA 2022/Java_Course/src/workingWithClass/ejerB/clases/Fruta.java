package workingWithClass.ejerB.clases;

public class Fruta extends Producto {

    private String color;
    private Integer peso;

    public Fruta(String nombre, Double precio, String color, Integer peso) {
        super(nombre, precio);
        this.color = color;
        this.peso = peso;

    }

    /**
     * @return String return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return Integer return the peso
     */
    public Integer getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Integer peso) {
        this.peso = peso;
    }
    
    @Override
    public String toString(){
        return super.toString() +
        "Peso: " + getPeso() + "\n" +
        "Color: " +getColor();
    }
}