package workingWithClass.ejerA.clases;

public class Persona {

    private String nombre;
    private String apellido;
    private String numFiscal;
    private String direccion;

    public Persona(String nombre, String apellido, String numFiscal, String direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numFiscal = numFiscal;
        this.direccion = direccion;
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
     * @return String return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return String return the numFiscal
     */
    public String getNumFiscal() {
        return numFiscal;
    }

    /**
     * @param numFiscal the numFiscal to set
     */
    public void setNumFiscal(String numFiscal) {
        this.numFiscal = numFiscal;
    }

    /**
     * @return String return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String toString(){

        return "Nombre: " + getNombre() + "\n" +
               "Apellido: " + getApellido()+ "\n" +
               "Numero fiscal: " + getNumFiscal()+ "\n" +
               "Direccion: " + getDireccion();
    }

}