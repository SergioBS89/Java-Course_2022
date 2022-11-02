package workingWithClass.ejerA.clases;

public class Gerente extends Empleado{

    private Double presupuesto;

   public Gerente(Double presu, Double remu, int idEmpleado, String nombre, String apellido, String numFiscal, String direccion){
    super(remu, idEmpleado, nombre, apellido, numFiscal, direccion);
    this.presupuesto = presu;
   }
    

    /**
     * @return Double return the presupuesto
     */
    public Double getPresupuesto() {
        return presupuesto;
    }

    /**
     * @param presupuesto the presupuesto to set
     */
    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString(){

        return super.toString() + "\n" +
               
               "Presupuesto: " + getPresupuesto();
    }

}