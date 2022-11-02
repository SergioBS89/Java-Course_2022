package workingWithClass.abstractClases.validador.clases;

public class EmailValidador extends Validador {

     
    protected String mensaje = "El formato del email no es correcto";
    
    private final String REGEX_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

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

       return (valor.matches(REGEX_EMAIL));
    }

    
}