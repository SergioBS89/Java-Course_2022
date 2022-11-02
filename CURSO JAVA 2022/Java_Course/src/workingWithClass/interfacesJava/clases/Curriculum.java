package workingWithClass.interfacesJava.clases;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends HojaPapel implements Impresora{

    private String persona;
    private List<String> experiencias;
    private String carrera;

    public Curriculum(String contenido, String persona, String carrera) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        // INICIALIZAR ARRAY DE LA LISTA EXPERIENCIAS
        this.experiencias = new ArrayList<>();
    }

    /* -------------------------------------------------------------------------- */
    /*           DOS FORMAS DE CREAR EL METODO PARA INSERTAR EN LA LISTA          */
    /* -------------------------------------------------------------------------- */
    public Curriculum addExperiencias(String exp){
    this.experiencias.add(exp);
    return this;
    }
    // public void addExperiencia(String exp) {
    //     this.experiencias.add(exp);
    // }

    @Override
    public String imprimir() {
        
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(this.persona + "\n")
        .append("Profesion: " + this.carrera)
        .append("\n" + "Resumen CV: " + this.contenido)
        .append("\n" + "Experiencias: " + "\n");

        for (String exp : this.experiencias) {

            sb.append("-" + exp + "\n");
        }
        
        return sb.toString();
    }

}