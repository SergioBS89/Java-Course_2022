package workingWithClass.ejerC_abstrac.clases;

public abstract class Mamiferos {

    protected String habitat;
    protected Float altura;
    protected Float largo;
    protected Float peso;
    protected String nombreCientifico;

    public Mamiferos(String habitat, Float altura, Float largo, Float peso, String nCientifico){
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
        this.largo = largo;
        this.nombreCientifico = nCientifico;
    }

    public abstract String comer();
    public abstract String dormir();
    public abstract String correr();
    public abstract String comunicarse();   

}