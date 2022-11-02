package workingWithClass.contructoresysobrescritura.clases;

public class Tidus extends NPG{

    private String blitzball;

    // EL CONSTRUCTOR TIENE UNA JERARQUIA DESDE EL PADRE, A ESTE OBJETO LE DOY LA OPCION DE INDICAR EL NUMERO DE JUEGO 
    public Tidus(int num, String consola, double ventas, String nombre, String apellidos, String sexo, String poderes){
        super(num, consola, ventas, nombre, apellidos, sexo, poderes);
        this.blitzball = "es un crack jugando al Blitzball";
    }
    
 



    /**
     * @return String return the blichball
     */
    public String getBlitzball() {
        return blitzball;
    }

    /**
     * @param blitzball the blichball to set
     */
    public void setBlitzball(String blichball) {
        this.blitzball = blichball;
    }

    public String toString(){

        return "En el exitoso juego de Final Fantasy " + getNumJuego() + ", para la consola " + getConsola() + ", con mas de " + getVentas() + " ventas en todo el mundo, conocemos" +
        " a " + getNombre() + " " + getApellidos() + ", personaje " + getSexo() + " que tiene la habilidad de " + getPoderes() + " y " + getBlitzball();
    }

     /* -------------------------------------------------------------------------- */
    /*                   SOBREESCRITURA DE METODOS CON HERENCIA                   */
    /* -------------------------------------------------------------------------- */
    
    public String villano(){

        return "El numero " + getNumJuego() + " de la saga, tiene al malvado villano Yu Yevon";
    }


}