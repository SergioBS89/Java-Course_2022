package workingWithClass.ejerC_abstrac.clases;

public class Tigre extends Felino{

    private String especie;

    public Tigre(String habitat, Float altura, Float largo, Float peso, String nCientifico, Float tamGarras,
            Integer velocidad, String especie) {
        super(habitat, altura, largo, peso, nCientifico, tamGarras, velocidad);
        this.especie = especie;        
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String comer() {
        
        return "Los tigres tambien conocidos como " + this.nombreCientifico + ", comen 5 veces al dia. Su habitat natural para la caza es " + this.habitat;
    }

    @Override
    public String dormir() {
        
        return "La especie de tigres " + this.especie + ", duerme de dia y caza de noche.";
    }

    @Override
    public String correr() {
        
        return "El tigre de " + especie +", alberga un tamaño de " + this.altura + " metros de altura, " + this.largo + " metros de longitud y pesa alrededor de " +
        this.peso + "Kg. Gracias a sus enormes patas, puede llegar a alcanzar " + this.velocidad + " Km/h.";
    }

    @Override
    public String comunicarse() {
        return "El sonido mas caracteristico del tigre es GGGGGGRRRRRRRRRRRRRRRRRR!!!!!";
    }
    

   

}