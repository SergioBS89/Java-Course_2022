package workingWithClass.ejerC_abstrac.clases;

public abstract class Canino extends Mamiferos{

    protected String color;
    protected Float tamColmillos;

    public Canino(String habitat, Float altura, Float largo, Float peso, String nCientifico, String color, Float tamColmillos) {
        super(habitat, altura, largo, peso, nCientifico);
        this.color = color;
        this.tamColmillos = tamColmillos;
    }
    
    
}