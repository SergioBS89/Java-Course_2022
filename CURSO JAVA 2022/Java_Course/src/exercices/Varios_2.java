package exercices;

import javax.swing.JOptionPane;


public class Varios_2 {

    public static void main(String[] args) {
        
         /* -------------------------------------------------------------------------- */
    /*                             EJERCICIO NUMERO 9                             */
    /* -------------------------------------------------------------------------- */
    // Escribe una aplicación con un String que contenga una contraseña cualquiera. Después se te pedirá que introduzcas la contraseña,
    //  con 3 intentos. Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo «Enhorabuena». 
    //  Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).

    String passGood = "batman";
    String pass = "";
    boolean incorrect = false;
    int intentos = 3;

    for (int j = 0; j < intentos; j++) {        
        pass = JOptionPane.showInputDialog(null,"Introduce password!" + "     Intentos restantes: " + (intentos - j));
        if(pass.equals(passGood)){
            incorrect = true;
            break;
        }else if (pass.equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, rellena el campo");
            j--;
        }
    }
    if(incorrect){
        JOptionPane.showMessageDialog(null,"Enhorabuena!!");
    }else{
        JOptionPane.showMessageDialog(null,"password incorrecto...Try again");
    }

    /* -------------------------------------------------------------------------- */
    /*                             EJERCICIO NUMERO 10                            */
    /* -------------------------------------------------------------------------- */
    // Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no. Usa un switch para ello.

    String selectday = "";

    selectday = JOptionPane.showInputDialog(null, "Please, insert a day of the week to know if it is laboral or day off:");
    
    selectday = selectday.toLowerCase().trim();

    switch (selectday) {
        case "monday":
            JOptionPane.showMessageDialog(null,"Monday is a laboral day. Go work!!");
            break;
            case "tuesday":
            JOptionPane.showMessageDialog(null,"Tueday is a laboral day. Go work!!");
            break;
            case "wednesday":
            JOptionPane.showMessageDialog(null,"Wednesday is a laboral day. Go work!!");
            break;
            case "thursday":
            JOptionPane.showMessageDialog(null,"Thursday is a laboral day. Go work!!");
            break;
            case "friday":
            JOptionPane.showMessageDialog(null,"Friday is a laboral day. Go work but then starts your weekend bitchhhh!!");
            break;
            case "saturday":
            JOptionPane.showMessageDialog(null,"Ohh yess!! It's weekend...Party time");
            break;
            case "sunday":
            JOptionPane.showMessageDialog(null,"Ohh yess!! It's weekend...Party time");
            break;    
        default:
        JOptionPane.showMessageDialog(null,"That's not a day of the week");
        break;
            
    }

    /* -------------------------------------------------------------------------- */
    /*                             EJERCICIO NUMERO 11                            */
    /* -------------------------------------------------------------------------- */
    // Pide por teclado un número entero positivo (debemos controlarlo) y muestra  el número de cifras que tiene.
    // Por ejemplo: si introducimos 1250, nos muestre que tiene 4 digitos.
    // Tendremos que controlar si tiene una o mas cifras, al mostrar el mensaje.
    
    String num;   
    boolean isNum = true;

    while(isNum){
        num = JOptionPane.showInputDialog(null, "Introduce a number to get how many digits it has");
    try{
        double nu = Double.parseDouble(num);
        if(nu == (double)nu){
            String[] arr = num.split("");
            JOptionPane.showMessageDialog(null, "This number has " + arr.length + " digits");
            isNum = false;            
        }
    }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "opsss...that's not a number");
    };
    }

     
    /* -------------------------------------------------------------------------- */
    /*                             EJERCICIO NUMERO 12                            */
    /* -------------------------------------------------------------------------- */
    // Pide un número por teclado e indica si es un número primo o no. Un número primo es aquel solo puede dividirse entre 1 y si mismo.
    // Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

    String numb = JOptionPane.showInputDialog(null, "Insert a number to know if it is primo");
    int nuum = Integer.parseInt(numb);
    int contt=0;

    for (int i = 1; i < 100; i++) {

        if(nuum % i == 0){

            // System.out.println(i);

            contt ++;

        }    
    }

    if(contt > 2){
        JOptionPane.showMessageDialog(null,"This number isn't a primo");
    }else{
        JOptionPane.showMessageDialog(null,"Is primo");
    }
  
     /* -------------------------------------------------------------------------- */
    /*                             EJERCICIO NUMERO 13                            */
    /* -------------------------------------------------------------------------- */
    // Muestra los números primos entre 1 y 100. El uno no cuenta como primo
    
    int cont2 = 0;
    
    for (int i = 2; i < 100; i++) {
        for (int j = 1; j < 100; j++) {        
            if(i % j == 0){
                cont2++;              
            }
        }
        if(cont2 <= 2){
            System.out.println(i);
        }
        cont2 = 0;
        }



    }//Final calse main
    
}