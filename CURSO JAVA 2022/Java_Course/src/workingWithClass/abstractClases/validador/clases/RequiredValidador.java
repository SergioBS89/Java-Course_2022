package workingWithClass.abstractClases.validador.clases;

public class RequiredValidador extends Validador{
 
    protected String mensaje = "Es obligatorio rellenar los campos";

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

       return (valor != null && valor.length() > 0);
    }

    
}