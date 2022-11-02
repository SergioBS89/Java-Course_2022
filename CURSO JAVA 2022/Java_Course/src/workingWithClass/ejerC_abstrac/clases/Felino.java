package workingWithClass.ejerC_abstrac.clases;

public abstract class Felino extends Mamiferos {

    protected Float tamanyoGarras;
    protected Integer velocidad;

    public Felino(String habitat, Float altura, Float largo, Float peso, String nCientifico, Float tamGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nCientifico);
        this.velocidad = velocidad;
        this.tamanyoGarras = tamGarras;
    }

    
    
    
}