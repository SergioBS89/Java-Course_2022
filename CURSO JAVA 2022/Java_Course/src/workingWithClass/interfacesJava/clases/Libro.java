package workingWithClass.interfacesJava.clases;

import java.util.ArrayList;
import java.util.List;

//AL IMPLEMENTAR LA INTERFAZ, PODEMOS HACER USO DE LOS METODOS DE LA INTERFAZ SIN NECESIDAD DE QUE HAYA UNA RELACION PADRE HIJO
public class Libro implements Impresora {

    private String autor;
    private String titulo;
    private List<Impresora> paginas;
    private Generos genero;


    public Libro(String autor, String titulo, Generos genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro addPaginas(Impresora pag){
        this.paginas.add(pag);
        return this;
    }


    public String imprimir() {
      
        StringBuilder sb = new StringBuilder("Titulo: " + this.titulo + "\n")
        .append("Autor: " + this.autor + "\n")
        .append("Genero: " + this.genero + "\n")
        .append("Paginas: " + "\n");

        for (Impresora hojaPapel : paginas) {
            sb.append("-" + hojaPapel.imprimir() + "\n");
        }
        return sb.toString();
    }
    
    
}