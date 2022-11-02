package exercices;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Varios_4 {
    
    public static void main(String[] args) {
        
/* -------------------------------------------------------------------------- */
/*                             EJERCICIO NUMERO 21                            */
/* -------------------------------------------------------------------------- */
// Dada una cadena, extraer la segunda y tercera letra usando el método substring.
// Dada una cadena, extraer la cuarta y sexta palabra letra usando el método split.


String cad = "Esto es una cadena de texto para un ejercicio";

System.out.println(cad.substring(1, 3));

String [] arr = cad.split(" ");

for (int i = 0; i < arr.length; i++) {

    if(i == 1){
        System.out.println(arr[3]);
    }else if(i == 2){
        System.out.println(arr[5]);
    }
    
}

/* -------------------------------------------------------------------------- */
/*                             EJERCICIO NUMERO 22                            */
/* -------------------------------------------------------------------------- */
// Pedir números al usuario y cuando el usuario meta un -1 se terminará el programa.
// Al terminar, mostrará lo siguiente:
// – mayor numero introducido
// – menor numero introducido
// – suma de todos los numeros
// – media de la suma 

// El número -1 no contara como número.

boolean exit = false;
String number;
ArrayList <Integer> arra = new ArrayList<Integer>();
int mayor = 0;
int menor = Integer.MAX_VALUE;
int suma = 0;
int media = 0;

while(!exit){
number = JOptionPane.showInputDialog(null, "Insert a number:     ----exit press -1----");

if(number.equals("-1")){
    exit = true;
}else{
    arra.add(Integer.parseInt(number));
}
}
for (int i = 0; i < arra.size(); i++) {

    if(mayor < arra.get(i)){
        mayor = arra.get(i);
    }
    if(menor > arra.get(i)){
        menor = arra.get(i);
    }
suma += arra.get(i);
}
media = suma / arra.size();

System.out.println("El numero mas grande es: "  + mayor);
System.out.println("El numero mas pequeño es: "  + menor);
System.out.println("La suma total es: "  + suma);
System.out.println("La media total es: "  + media);

    }//Fin de clase main
    
}