package workingWithClass.ejerA.clases;

public class Empleado extends Persona{

    private Double remuneracion;
    private int idEmpleado;
    

    public Empleado(Double remu, int idEmpleado, String nombre, String apellido, String numFiscal, String direccion){
     super(nombre, apellido, numFiscal, direccion);
     this.idEmpleado = idEmpleado;
     this.remuneracion = remu;
    }
    

    /**
     * @return double return the remuneracion
     */
    public double getRemuneracion() {
        return remuneracion;
    }

    /**
     * @param remuneracion the remuneracion to set
     */
    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    /**
     * @return int return the idEmpleado
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Double aumentarRemuneracion(int porcentaje){

        Double remuneracion = getRemuneracion();
        int por = porcentaje;
        //Cambio de tipo
        double aumento =  (remuneracion * por) / 100;
        //Retorno del aumento 
        return  aumento + getRemuneracion();
    }

    @Override
    public String toString(){

        return super.toString() + "\n" +
               "Id Empleado: " + getIdEmpleado() + "\n" +
               "Remuneracion: " + getRemuneracion();
    }


}