package workingWithClass.abstractClases.clases;

public class TextAreaForm extends ElementoForm {

    private Integer filas;
    private Integer columnas;

    public TextAreaForm(String name) {
        super(name);
    }

    public TextAreaForm(String name, Integer filas, Integer columnas) {
        super(name);
        this.columnas = columnas;
        this.filas = filas;
    }

    @Override
    public String dibujarHtml() {
       
        return "<textarea cols='" +this.filas+"' rows='"+ this.columnas+"'>" + this.valor + "</textarea>";
    }


    /**
     * @return Integer return the filas
     */
    public Integer getFilas() {
        return filas;
    }

    /**
     * @param filas the filas to set
     */
    public void setFilas(Integer filas) {
        this.filas = filas;
    }

    /**
     * @return Integer return the columnas
     */
    public Integer getColumnas() {
        return columnas;
    }

    /**
     * @param columnas the columnas to set
     */
    public void setColumnas(Integer columnas) {
        this.columnas = columnas;
    }

}