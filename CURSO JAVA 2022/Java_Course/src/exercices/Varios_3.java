package exercices;

import java.util.ArrayList;


import javax.swing.JOptionPane;

public class Varios_3 {
    public static void main(String[] args) {

   

    /* -------------------------------------------------------------------------- */
    /*                             EJERCICIO NUMERO 14                            */
    /* -------------------------------------------------------------------------- */
    // Del siguiente String «La lluvia en Sevilla es una maravilla» cuenta cuantas vocales hay en total (recorre el String con charAt).

    String sevilla = "La lluvia en Sevilla es una maravilla";
    sevilla = sevilla.replaceAll(" ", "");
    char letter;
    int cont = 0;
 
     for (int i = 0; i < sevilla.length(); i++) {
 
         letter = sevilla.charAt(i);
         if(letter == 'a' || letter =='e' || letter == 'i' || letter == 'o' || letter == 'u'){
          cont ++;
         }
     }
     System.out.println("La lluvia en Sevilla es una maravilla, contiene "+ cont + " vocales");

    /* -------------------------------------------------------------------------- */
    /*                             EJERCICIO NUMERO 15                            */
    /* -------------------------------------------------------------------------- */
    // Reemplaza todas las a del String anterior por una e.

    String sevilla2 = "La lluvia en Sevilla es una maravilla";
    char letter2;

    for (int i = 0; i < sevilla2.length(); i++) {

        // System.out.println(sevilla2.charAt(i));
     
        letter2 = sevilla2.charAt(i);
        if(letter2 == 'a'){
            letter2 = 'e';
        }
        System.out.print(letter2);
    }

    /* -------------------------------------------------------------------------- */
    /*                             EJERCICIO NUMERO 16                            */
    /* -------------------------------------------------------------------------- */
    // Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int) y un signo aritmético (String),
    // Según este último se realizara la operación correspondiente. Al final mostrara el resultado en un cuadro de dialogo.

   String n1 = JOptionPane.showInputDialog(null,"Inserte el primer numero" );
   String n2 = JOptionPane.showInputDialog(null,"Inserte el segundo numero" );
   String simb = JOptionPane.showInputDialog(null,"Inserte el oparador (+,-,x,/)" );

   double nn1 = Double.parseDouble(n1);
   double nn2 = Double.parseDouble(n2);

   switch (simb) {
    case "+":
     JOptionPane.showMessageDialog(null, "Resultado de " + nn1 + simb + nn2 + "=" + (nn1 + nn2));        
        break;
    case "-":
    JOptionPane.showMessageDialog(null, "Resultado de " + nn1 + simb + nn2 + "=" + (nn1 - nn2));        
        break;
    case "*":
    JOptionPane.showMessageDialog(null, "Resultado de " + nn1 + simb + nn2 + "=" + (nn1 * nn2));        
       break;
    case "x":
    JOptionPane.showMessageDialog(null, "Resultado de " + nn1 + simb + nn2 + "=" + (nn1 * nn2));        
       break;
    case "/":
    JOptionPane.showMessageDialog(null, "Resultado de " + nn1 + simb + nn2 + "=" + (nn1 / nn2));        
       break;
   
    default:
        break;
   }
   
   /* -------------------------------------------------------------------------- */
   /*                             EJERCICIO NUMERO 17                            */
   /* -------------------------------------------------------------------------- */
//    Crear una aplicación que nos permite insertar números hasta que insertemos un -1. Calcular el numero de números introducidos.

boolean exit = false;
ArrayList <Integer> arr = new ArrayList<Integer>();
int numI;

while(exit != true){
String numb = JOptionPane.showInputDialog(null, "Inserta un numero:    Para salir insertar -1");
numI = Integer.parseInt(numb);
if(numI != -1){
arr.add(numI);
}else{
    exit = true;
}
}
JOptionPane.showMessageDialog(null, "La cantidad de numeros introducidos ha sido: " + arr.size());

/* -------------------------------------------------------------------------- */
/*                             EJERCICIO NUMERO 18                            */
/* -------------------------------------------------------------------------- */
// Eliminar los espacios de una frase pasada por consola por el usuario.

String frase = JOptionPane.showInputDialog(null, "Dime una frase y le quitaré los espacios");

JOptionPane.showMessageDialog(null, "Tu frase sin espacios es: "+ frase.replaceAll(" ", "").trim());

/* -------------------------------------------------------------------------- */
/*                             EJERCICIO NUMERO 19                            */
/* -------------------------------------------------------------------------- */
// Pedir al usuario que nos escriba frases de forma infinita hasta que insertemos una cadena vacia. Mostrar la cadena resultante

boolean stop = false;
String result = "";

while(!stop){

    String st = JOptionPane.showInputDialog(null, "Insert a word          press enter to exit");
    if(!st.equals("")){

        result = result.concat(" ").concat(st);
    }
    else{
        stop = true;
    }
}
JOptionPane.showMessageDialog(null, "Complete phrase is: " + result);

/* -------------------------------------------------------------------------- */
/*                             EJERCICIO NUMERO 20                            */
/* -------------------------------------------------------------------------- */
// Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el usuario lo pida y mostraremos el resultado por pantalla.

String show = "FCB is a football club from barcelona, in my opinion it is the best club in around the world";
boolean stp = false;

while (!stp) {
JOptionPane.showMessageDialog(null, show);
String opt =JOptionPane.showInputDialog(null, "Push 1 to LowwerCase  -------Push 2 to UpperCase");
if(opt.equals("1")){
    JOptionPane.showMessageDialog(null, show.toLowerCase());
    stp = true;
}else if (opt.equals("2")){
    JOptionPane.showMessageDialog(null, show.toUpperCase());
    stp = true;
}else{
    JOptionPane.showMessageDialog(null, "Presh the correct key");
}

}









    } //Fin de calse main 
}