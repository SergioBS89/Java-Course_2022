package workingWithClass.interfacesJava.clases;

public class PaginaLibro extends HojaPapel implements Impresora{

    public PaginaLibro(String contenido) {
        super(contenido);
    
    }

    // @Override
    public String imprimir() {
        
        return this.contenido;
    }
    
}