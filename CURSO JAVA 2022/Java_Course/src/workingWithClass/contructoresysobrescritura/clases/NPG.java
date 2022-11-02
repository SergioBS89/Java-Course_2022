package workingWithClass.contructoresysobrescritura.clases;

public class NPG extends FinalFantasy{
    
    private String nombre;
    private String apellidos;
    private String sexo;
    private String poderes;

    public NPG(){}
    
    public NPG(String consola, double ventas, String nombre, String apellidos, String sexo, String poderes){
        super(consola, ventas);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.poderes = poderes;
    }

    public NPG(int num, String consola, double ventas, String nombre, String apellidos, String sexo, String poderes){
        super(num, consola, ventas);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.poderes = poderes;
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
     * @return String return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return String return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return String return the poderes
     */
    public String getPoderes() {
        return poderes;
    }

    /**
     * @param poderes the poderes to set
     */
    public void setPoderes(String poderes) {
        this.poderes = poderes;
    }

     /* -------------------------------------------------------------------------- */
    /*                   SOBREESCRITURA DE METODOS CON HERENCIA                   */
    /* -------------------------------------------------------------------------- */
    
    @Override
    public String villano(){
        
    return super.villano() + "Dependiendo del numero de la saga, exiten villanos con caracteristicas propias";
    }


}