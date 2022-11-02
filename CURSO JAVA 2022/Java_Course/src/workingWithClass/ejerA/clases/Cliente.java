package workingWithClass.ejerA.clases;

public class Cliente extends Persona {

    private int idCliente;
    
    public Cliente(int id, String nombre, String apellido, String numFiscal, String direccion){

        super(nombre, apellido, numFiscal, direccion);
        this.idCliente = id;
    }

    /**
     * @return int return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString(){

        return super.toString() + "\n" +
               "Id cliente:" + getIdCliente();
    }

}