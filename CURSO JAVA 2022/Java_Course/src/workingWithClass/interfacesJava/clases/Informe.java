package workingWithClass.interfacesJava.clases;

public class Informe extends HojaPapel implements Impresora{

    private String autor;
    private String revisor;

    public Informe(String contenido, String autor, String revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
       
        return "Este informe ha sido escrito por " + this.autor + " y es revisado por " + this.revisor + ".\n" +
        "Contenido: " + this.contenido ;
    }
    
}