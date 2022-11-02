package workingWithClass.interfacesJava.clases;

public abstract class HojaPapel {
     
    protected String contenido;

    public HojaPapel(String contenido){
        this.contenido = contenido;
    }

    abstract public String imprimir();
}