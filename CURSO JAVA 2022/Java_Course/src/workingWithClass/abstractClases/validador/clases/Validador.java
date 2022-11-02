package workingWithClass.abstractClases.validador.clases;

public abstract class Validador {

     protected String mensaje;

     
     public abstract String getMensaje();
     
     public abstract void setMensaje(String mensaje);

     public abstract Boolean isValido(String valor);

}