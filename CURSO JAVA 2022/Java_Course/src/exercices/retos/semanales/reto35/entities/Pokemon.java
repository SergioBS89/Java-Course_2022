package exercices.retos.semanales.reto35.entities;

public class Pokemon {

    private String nombre;
    private Tipos tipo;
    private Integer ataque;
    private Integer defensa;
    private Integer vida;
    private Habilidades atqPricipal;
    private Habilidades atqSecundario;

    public Pokemon(String nombre, Tipos tipo, Integer ataque, Integer defensa, Integer vida, Habilidades atqPricipal,
            Habilidades atqSecundario) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataque = ataque;
        this.defensa = defensa;
        this.vida = vida;
        this.atqPricipal = atqPricipal;
        this.atqSecundario = atqSecundario;
    }

    public Pokemon() {
    }

    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Tipos return the tipo
     */
    public Tipos getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }

    /**
     * @return Integer return the ataque
     */
    public Integer getAtaque() {
        return ataque;
    }

    /**
     * @param ataque the ataque to set
     */
    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    /**
     * @return Integer return the defensa
     */
    public Integer getDefensa() {
        return defensa;
    }

    /**
     * @param defensa the defensa to set
     */
    public void setDefensa(Integer defensa) {
        this.defensa = defensa;
    }

    /**
     * @return Integer return the vida
     */
    public Integer getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(Integer vida) {
        this.vida = vida;
    }

    /**
     * @return Habilidades return the atqPricipal
     */
    public Habilidades getAtqPricipal() {
        return atqPricipal;
    }

    /**
     * @param atqPricipal the atqPricipal to set
     */
    public void setAtqPricipal(Habilidades atqPricipal) {
        this.atqPricipal = atqPricipal;
    }

    /**
     * @return Habilidades return the atqSecundario
     */
    public Habilidades getAtqSecundario() {
        return atqSecundario;
    }

    /**
     * @param atqSecundario the atqSecundario to set
     */
    public void setAtqSecundario(Habilidades atqSecundario) {
        this.atqSecundario = atqSecundario;
    }

}