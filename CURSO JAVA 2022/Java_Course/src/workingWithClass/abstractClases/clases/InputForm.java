package workingWithClass.abstractClases.clases;

public class InputForm extends ElementoForm{

 private String type = "text";

 public InputForm(String name){
    super(name);
 }
 public InputForm(String name, String type){
    super(name);
    this.type = type;
 }

    @Override
    public String dibujarHtml() {
        
        return "<input type=\"" + this.type + 
                "\" name=\"" + this.name +
                "\" value=\"" + this.valor + "\">";
    }
    
    

    /**
     * @return String return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

}