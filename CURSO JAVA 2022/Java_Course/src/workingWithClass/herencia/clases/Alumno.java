package workingWithClass.herencia.clases;

//HEREDAMOS CIERTOS ARTRIBUTOS DE LA CLASE PADRE CON EXTENDS
public class Alumno extends Persona {
    private String nombreColegio;
    private double notaCastell;
    private double notasIngles;
    private double notasMatemat;
    

    /**
     * @return String return the nombreColegio
     */
    public String getNombreColegio() {
        return nombreColegio;
    }

    /**
     * @param nombreColegio the nombreColegio to set
     */
    public void setNombreColegio(String nombreColegio) {
        this.nombreColegio = nombreColegio;
    }

    /**
     * @return double return the notaCastell
     */
    public double getNotaCastell() {
        return notaCastell;
    }

    /**
     * @param notaCastell the notaCastell to set
     */
    public void setNotaCastell(double notaCastell) {
        this.notaCastell = notaCastell;
    }

    /**
     * @return double return the notasIngles
     */
    public double getNotasIngles() {
        return notasIngles;
    }

    /**
     * @param notasIngles the notasIngles to set
     */
    public void setNotasIngles(double notasIngles) {
        this.notasIngles = notasIngles;
    }

    /**
     * @return double return the notasMatemat
     */
    public double getNotasMatemat() {
        return notasMatemat;
    }

    /**
     * @param notasMatemat the notasMatemat to set
     */
    public void setNotasMatemat(double notasMatemat) {
        this.notasMatemat = notasMatemat;
    }

}