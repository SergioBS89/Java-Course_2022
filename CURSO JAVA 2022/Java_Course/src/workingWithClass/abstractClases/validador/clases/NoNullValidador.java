package workingWithClass.abstractClases.validador.clases;

public class NoNullValidador extends Validador {

    protected String mensaje = "El campo no puede ser nulo";

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

       return (valor != null);
    }

}