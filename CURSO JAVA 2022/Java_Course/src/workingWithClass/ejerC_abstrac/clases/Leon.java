package workingWithClass.ejerC_abstrac.clases;

public class Leon extends Felino{

    private Integer numManada;
    private Float decibeliosGruñido;

    public Leon(String habitat, Float altura, Float largo, Float peso, String nCientifico, Float tamGarras,
            Integer velocidad, Integer numManada, Float decibelios) {
        super(habitat, altura, largo, peso, nCientifico, tamGarras, velocidad);
        this.decibeliosGruñido = decibelios;
        this.numManada = numManada;        
    }

 


    @Override
    public String comer() {
        
        return "Los leones suelen cazar en manada, cada manada suele tener " + this.numManada + " de estos voraces felinos. El tamaño de sus garras, "+
        this.tamanyoGarras + " cm en un adulto, es debastador para cualquier presa que coge un leon.";
    }

    @Override
    public String dormir() {
        
        return "Los " + this.nombreCientifico + ", son los felinos salvajes que mas horas estan durmiendo al dia. Les encanta pasar el dia roncando en " +
        this.habitat ;
    }

    @Override
    public String correr() {
        
        return "Los leones llegan a alcanzar los " + this.velocidad + "Km/h.";
    }

    @Override
    public String comunicarse() {
        
        return "Su gran gruñido es capaz de escucharse a varios kilometros de distancia, gracias a sus " + this.decibeliosGruñido + " decibelios.";
    }
    


}