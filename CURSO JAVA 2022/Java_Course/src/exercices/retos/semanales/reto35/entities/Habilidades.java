package exercices.retos.semanales.reto35.entities;

public class Habilidades{
    
    private String nombreHabilidad;
    private double poder;
    

    public Habilidades(String nombreHabilidad, double poder) {
        this.nombreHabilidad = nombreHabilidad;
        this.poder = poder;
    }

    /**
     * @return String return the nombreHabilidad
     */
    public String getNombreHabilidad() {
        return nombreHabilidad;
    }

    /**
     * @param nombreHabilidad the nombreHabilidad to set
     */
    public void setNombreHabilidad(String nombreHabilidad) {
        this.nombreHabilidad = nombreHabilidad;
    }

    /**
     * @return double return the poder
     */
    public double getPoder() {
        return poder;
    }

    /**
     * @param poder the poder to set
     */
    public void setPoder(double poder) {
        this.poder = poder;
    }

}