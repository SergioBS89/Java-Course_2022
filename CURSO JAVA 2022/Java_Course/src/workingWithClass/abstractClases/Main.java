package workingWithClass.abstractClases;


import java.util.Arrays;
import java.util.List;

import workingWithClass.abstractClases.clases.ElementoForm;
import workingWithClass.abstractClases.clases.InputForm;
import workingWithClass.abstractClases.clases.Opcion;
import workingWithClass.abstractClases.clases.SelectForm;
import workingWithClass.abstractClases.clases.TextAreaForm;
import workingWithClass.abstractClases.validador.clases.EmailValidador;
import workingWithClass.abstractClases.validador.clases.LargoValidador;
import workingWithClass.abstractClases.validador.clases.NoNullValidador;
import workingWithClass.abstractClases.validador.clases.RequiredValidador;


public class Main {
    public static void main(String[] args) {
        
        //CREO LAS INSTANCIAS DE INPUT FORM
        InputForm user = new InputForm("Username");
        InputForm pass = new InputForm("Password");
        InputForm email = new InputForm("Email","email");

        user.setValor("");
        pass.setValor("eeee");
        email.setValor("sergio@gmail");

        //Implementamos los validadores
        user.addValidador(new RequiredValidador());
        pass.addValidador(new NoNullValidador()).addValidador(new LargoValidador(5,15));
        email.addValidador(new EmailValidador());
        
        //CREO LA INSTANCIA DE TEXTAREA
        TextAreaForm ta = new TextAreaForm("Experiencia", 5, 5);

        ta.setValor("Estudiando Java");

        //CREO LA INSTANCIA DEL SELECT OPTION
        SelectForm sf = new SelectForm("Lenguajes programacion");
          
        //LE AGREGRO LAS OPCIONES EN UNA LISTA<OPCION>

        sf.addOption( new Opcion("Java", "1"));
        sf.addOption( new Opcion("JavaScript", "2"));
        sf.addOption( new Opcion("Python", "3"));
        sf.addOption( new Opcion("PHP", "4"));
        sf.addOption( new Opcion("Angular", "5"));

        
        // PARA RECORRER TODOS LOS OBJETOS CREADOS ANTERIORMENTE PODEMOS HACERLO DE VARIAS FORMAS, ES EL MISMO RESULTADO

       /* --------------------------------- opcion1 -------------------------------- */
        // List<ElementoForm> elementosHTML = new ArrayList<>();

        // elementosHTML.add(user);
        // elementosHTML.add(pass);
        // elementosHTML.add(email);
        // elementosHTML.add(sf);  
        // elementosHTML.add(ta);

        /* --------------------------------- opcion2 -------------------------------- */
        
        List<ElementoForm> elementosHTML = Arrays.asList(user,pass,email,sf,ta);


        //Recorro el array y lo imprimo 

        for (ElementoForm elementoForm : elementosHTML) {

            System.out.println(elementoForm.dibujarHtml());
            
        }

        //Comprobamos la lista de errores

        elementosHTML.forEach(error ->{

            if(!error.isValido()){

                error.getErrores().forEach(get->{
                    System.out.println("Elemento: " + error.getNameElemento() + "........" + get);
                });
            }
        });
        
    }
    
}