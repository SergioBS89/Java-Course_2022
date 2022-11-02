package workingWithClass.abstractClases.validador.clases;

public class LargoValidador extends Validador {

    // %d es una notacion que se modifica a traves de string.format
    protected String mensaje = "El largo de los caracteres debe ser entre %d y %d";
    private int min;
    private int max = Integer.MAX_VALUE;

    public LargoValidador() {
    };

    public LargoValidador(int min, int max) {

        this.min = min;
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

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
        // Modifica el valor de mensaje %d
        this.mensaje = String.format(this.mensaje, min, max);
        if (valor == null) {
            return true;
        }

        return (valor.length() >= this.min && valor.length() <= this.max);
    }

}