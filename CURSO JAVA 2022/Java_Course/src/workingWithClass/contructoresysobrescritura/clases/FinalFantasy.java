package workingWithClass.contructoresysobrescritura.clases;

public class FinalFantasy {

    private int numJuego;
    private String consola;
    private double ventas;

    public FinalFantasy(){}

    //CREO DOS CONSTRUCTORES, UNO QUE LLEVA POR DEFECTO EL NUMERO DEL JUEGO
    public FinalFantasy(String consola, double ventas){
        this.numJuego = 7;
        this.consola = consola;
        this.ventas =  ventas;
    }
    public FinalFantasy(int num, String consola, double ventas){
        this.numJuego = num;
        this.consola = consola;
        this.ventas =  ventas;
    }

    /**
     * @return int return the numJuego
     */
    public int getNumJuego() {
        return numJuego;
    }

    /**
     * @param numJuego the numJuego to set
     */
    public void setNumJuego(int numJuego) {
        this.numJuego = numJuego;
    }

    /**
     * @return String return the consola
     */
    public String getConsola() {
        return consola;
    }

    /**
     * @param consola the consola to set
     */
    public void setConsola(String consola) {
        this.consola = consola;
    }

    /**
     * @return double return the ventas
     */
    public double getVentas() {
        return ventas;
    }

    /**
     * @param ventas the ventas to set
     */
    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    /* -------------------------------------------------------------------------- */
    /*                   SOBREESCRITURA DE METODOS CON HERENCIA                   */
    /* -------------------------------------------------------------------------- */
    
    public String villano(){

        return "Esta saga tiene muchos villanos";
    }

}