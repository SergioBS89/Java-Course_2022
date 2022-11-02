package workingWithClass.herencia.clases;



/* -------------------------------------------------------------------------- */
/*      ESTA CLASE HEREDA DE ALUMNO Y ASI MISMO DE LA CLASE PADRE PERSONA     */
/* -------------------------------------------------------------------------- */
public class AlumnoInternacional extends Alumno {

    private String pais;
    private String idioma;
    

    /**
     * @return String return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * @return String return the idioma
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * @param idioma the idioma to set
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String toString(){

        return "El alumno " + getNombre() + " " + getApellidos() + ", procedente de " + getPais() + ", ha obtenido la siguiente calificación " +
        + getNotasIngles() +  " en " + getIdioma();  }

}