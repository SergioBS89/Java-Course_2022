package workingWithClass.ejerC_abstrac.clases;

public class Lobo extends Felino {

    private Integer numCamada;
    private String especieLobo;

    public Lobo(String habitat, Float altura, Float largo, Float peso, String nCientifico, Float tamGarras,
            Integer velocidad, Integer numCamada, String especie) {
        super(habitat, altura, largo, peso, nCientifico, tamGarras, velocidad);
        this.numCamada = numCamada;
        this.especieLobo = especie;
    }

    

    @Override
    public String comer() {
        return "Los lobos cazan en solitario, sin embargo son muy fieles con sus congeneres y comparten la comida. Suelen vivir en camadas de "+
        this.numCamada + " lobos.";
    }

    @Override
    public String dormir() {
        
        return "Los lobos o "+ this.nombreCientifico + ", duermen por el dia y cazan por la noche.";
    }

    @Override
    public String correr() {

        return "El Lobo " + this.especieLobo +", alberga un tamaño de " + this.altura + " metros de altura, " + this.largo + " metros de longitud y pesa alrededor de " +
        this.peso + "Kg. Gracias a sus enormes garras, puede correr por terrenos ariscos y alcanzar " + this.velocidad + " Km/h.";
    }

    @Override
    public String comunicarse() {
        
        return "Su aullido puede escucharse a miles de metros de distancia. AAAAAAAAAUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!";
    }

    
}