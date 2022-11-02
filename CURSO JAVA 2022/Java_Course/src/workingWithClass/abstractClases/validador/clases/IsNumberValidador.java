package workingWithClass.abstractClases.validador.clases;

public class IsNumberValidador extends Validador{
   
    protected String mensaje = "Los caracteres deben de ser de tipo numerico";

    @Override
    public String getMensaje() {
        return this.mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public Boolean isValido(String valor) {

        try {
           Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}