package workingWithClass.interfacesJava;

import workingWithClass.interfacesJava.clases.Curriculum;
import workingWithClass.interfacesJava.clases.Generos;
import workingWithClass.interfacesJava.clases.Impresora;
import workingWithClass.interfacesJava.clases.Informe;
import workingWithClass.interfacesJava.clases.Libro;
import workingWithClass.interfacesJava.clases.PaginaLibro;

public class main {
    public static void main(String[] args) {

        Informe in = new Informe("Mis vivencias por UK", "Sergio Berdiell", "Juan Felipe Cortés");
        Curriculum cv = new Curriculum("CV donde se muestra la experiencia en programacion", "Sergio Berdiell Sanchez", "Desarrollador Back-end");
        
        cv.addExperiencias("Java");
        cv.addExperiencias("JavaScript");
        cv.addExperiencias("Php");
        cv.addExperiencias("Html");
        cv.addExperiencias("Css");
        cv.addExperiencias("Sql");

        Libro lb = new Libro("Pepin pepin", "La guerra de las bragas", Generos.AMOR);
        lb.addPaginas(new PaginaLibro("Bragas al aire"));
        lb.addPaginas(new PaginaLibro("Bragas sucias por todas partes"));
        lb.addPaginas(new PaginaLibro("Llegaron los gallumbos"));
        lb.addPaginas(new PaginaLibro("La guerra de los calzones"));
       
        
//LLAMANDO A LA CLASE IMPRESORA(INTERFAZ), PODEMOS USAR LOS METODOS STATICOS DE LA CLASE
        Impresora.impresionConsola(cv);
        System.out.println("");
        Impresora.impresionConsola(in);
        System.out.println("");
        Impresora.impresionConsola(lb);
     
     

    }

   
}