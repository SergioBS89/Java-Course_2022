package workingWithClass.herencia.clases;

public class Profesor extends Persona {

    private String asignatura;
    
    

    /**
     * @return String return the asignatura
     */
    public String getAsignatura() {
        return asignatura;
    }

    /**
     * @param asignatura the asignatura to set
     */
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

}