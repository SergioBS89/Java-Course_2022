package workingWithClass.ejerC_abstrac.clases;

public class Guepardo extends Felino{

    public Guepardo(String habitat, Float altura, Float largo, Float peso, String nCientifico, Float tamGarras,
            Integer velocidad) {
        super(habitat, altura, largo, peso, nCientifico, tamGarras, velocidad);
        
    }


    @Override
    public String comer() {
        return "Los guepardos comen habitualmente fuera de su habitat natural. ";
    }

    @Override
    public String dormir() {
        
        return "Estos felinos llamados tambien "+ this.nombreCientifico + ", duermen siemrpe en " + this.habitat + " (su habitat).";
    }

    @Override
    public String correr() {
        
        return "Varios estudios indican que estos felinos son los mas rapidos del planeta, alcanzando la friolera de "+this.velocidad + " Km/h.";
    }

    @Override
    public String comunicarse() {
        
        return "Los guepardos se comunican a traves de ligeros sonidos producidos por la friccion de sus dientes";
    }

    
}