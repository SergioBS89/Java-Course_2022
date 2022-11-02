package workingWithClass.herencia;

import workingWithClass.herencia.clases.Alumno;
import workingWithClass.herencia.clases.AlumnoInternacional;
import workingWithClass.herencia.clases.Profesor;

public class Herencia {
    public static void main(String[] args) {
        
        Alumno al = new Alumno();
        Profesor pr = new Profesor();

        al.setNombre("Sergio");
        al.setEdad(33);
        al.setApellidos("Berdiell Sanchez");
        al.setNotasMatemat(10);
        pr.setNombre("Aurelio");
        pr.setEdad(48);
        pr.setApellidos("Lopez");
        pr.setAsignatura("Matematicas");

        System.out.println("Profesor de "+ pr.getAsignatura() + ": " + pr.getNombre() + " " + pr.getApellidos() + ", ha calificado al alumno " + 
        al.getNombre() + " " + al.getApellidos() + ", con la siguiente nota: " + al.getNotasMatemat());

        AlumnoInternacional ai = new AlumnoInternacional();
        ai.setNombre("Thomas");
        ai.setApellidos("William");
        ai.setNotasIngles(10);
        ai.setPais("Norway");
        ai.setIdioma("Ingles");
        
        //Metodo toString
        System.out.println(ai.toString());
    }
    
}