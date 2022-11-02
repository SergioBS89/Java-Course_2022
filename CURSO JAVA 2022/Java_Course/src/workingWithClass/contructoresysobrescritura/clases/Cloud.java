package workingWithClass.contructoresysobrescritura.clases;

public class Cloud extends NPG {

    private String moto;

    public Cloud(){}

    // EL CONSTRUCTOR TIENE UNA JERARQUIA DESDE EL PADRE, A ESTE OBJETO POR DEFECTO, SE LE INSTANCIA EL VALOR 7 DEL NUMERO DE LA SAGA
    public Cloud(String consola, double ventas, String nombre, String apellidos, String sexo, String poderes){
        super(consola, ventas, nombre, apellidos, sexo, poderes);
        this.moto = " es un fenomeno luchando mientras conduce una moto";
    }
  
    

    /**
     * @return String return the moto
     */
    public String getMoto() {
        return moto;
    }

    /**
     * @param moto the moto to set
     */
    public void setMoto(String moto) {
        this.moto = moto;
    }

    public String toString(){

        return "En el exitoso juego de Final Fantasy " + getNumJuego() + ", para la consola " + getConsola() + ", con mas de " + getVentas() + " ventas en todo el mundo, conocemos" +
        " a " + getNombre() + " " + getApellidos() + ", personaje " + getSexo() + " que tiene la habilidad de " + getPoderes() + " y " + getMoto();
    }

      /* -------------------------------------------------------------------------- */
    /*                   SOBREESCRITURA DE METODOS CON HERENCIA                   */
    /* -------------------------------------------------------------------------- */
    
    public final String villano(){

        return super.villano()  + ". El numero " + getNumJuego() + " de la saga, tiene al malvado villano Sephiroth";

    }

}