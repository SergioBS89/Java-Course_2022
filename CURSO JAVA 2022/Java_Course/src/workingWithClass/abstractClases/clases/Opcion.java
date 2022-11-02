package workingWithClass.abstractClases.clases;

public class Opcion {

    private String nombre;
    private String valor;


    public Opcion(){};

    public Opcion(String nombre, String valor){
        this.nombre = nombre;
        this.valor = valor;
    }
    

    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return String return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

}