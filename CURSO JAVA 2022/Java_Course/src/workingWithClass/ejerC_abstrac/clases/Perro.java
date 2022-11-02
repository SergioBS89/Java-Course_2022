package workingWithClass.ejerC_abstrac.clases;

public class Perro extends Felino{

    private String habilidad;

    public Perro(String habitat, Float altura, Float largo, Float peso, String nCientifico, Float tamGarras,
            Integer velocidad, String habilidad) {
        super(habitat, altura, largo, peso, nCientifico, tamGarras, velocidad);
        this.habilidad = habilidad;
    }

    @Override
    public String comer() {
        return "Los perros o cientificamente conocidos como " +this.nombreCientifico+", comen lo que les dan en casa";
    }

    @Override
    public String dormir() {
        
        return "Juegan de dia y duermen de noche. Tambien les encanta hacer el perro.";
    }

    @Override
    public String correr() {
        
        return "Ademas de correr y ladrar, los perros tienen diferentes habilidades. Una de ellas es " + this.habilidad;
    }

    @Override
    public String comunicarse() {
        
        return "Se comunican con ladridos. Guaaaaaa Guaaaaaa.";
    }
    
}