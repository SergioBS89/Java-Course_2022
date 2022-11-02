package workingWithClass.abstractClases.clases;

import java.util.ArrayList;
import java.util.List;

import workingWithClass.abstractClases.validador.clases.Validador;

// import java.util.List;

public abstract class ElementoForm {

    protected String name;
    protected String valor;
    protected List<Validador> validadores;
    protected List<String> errores;

    //CONSTRUCTORES
    public ElementoForm(){
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    };

    public ElementoForm(String name){
        this(); //Llama al constructor anterior
        this.name = name;
    }

   //METODOS

   public String getNameElemento(){
    return name;
   }
    public List<String> getErrores(){
        return errores;
    }
    public void setValor(String valor){    
        this.valor = valor;
    }
    
    //METODO PARA CREAR AGREGAR EL VALIDADOR A LA INSTANCIA DE LA CLASE
    public ElementoForm addValidador(Validador vali){
        this.validadores.add(vali);
        return this;
    }

    public Boolean isValido(){
     
        for (Validador val: validadores) {
        //Si no es valido, agregamos el error a la lista
            if(!val.isValido(this.valor)){
                this.errores.add(val.getMensaje());
            }
            
        }
        //Si no hay errores, retorna true
        return this.errores.isEmpty();
    }
    
    abstract public String dibujarHtml();

    
}