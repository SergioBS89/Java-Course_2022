package workingWithClass.abstractClases.clases;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm {

    private List<Opcion> opciones;

    public SelectForm(String name) {
        super(name);
        this.opciones = new ArrayList<>();
    }

    public SelectForm(String name, List<Opcion> opciones) {
        super(name);
        this.opciones = opciones;
    }

    public void addOption(Opcion opc) {

        this.opciones.add(opc);
    }

    @Override
    public String dibujarHtml() {

        StringBuilder sb = new StringBuilder();
        sb.append("<select name='");
        sb.append(this.name);
        sb.append("'>");
        for (Opcion opcion : this.opciones) {

            sb.append("\n <option value='");
            sb.append(opcion.getValor());
            sb.append("' >");
            sb.append(opcion.getNombre());
            sb.append("</option>");

        }
        sb.append("</select>");

        return sb.toString();
    }

}