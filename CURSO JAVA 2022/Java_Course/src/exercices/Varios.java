package exercices;

import java.util.Scanner;

public class Varios {
    public static void main(String[] args) {

/* -------------------------------------------------------------------------- */
/*      EJER 1      Comprobar si una cadena de texto es palindromo o no.            */
/* -------------------------------------------------------------------------- */
// Un palidondromo son las palabras que se leen igual tanto de pricipio a fin como vicerversa (Ana, olelo);

      String pal = "anitatina"; //Cadena a evaluar

      /* -------------------------------- SOULCION A -------------------------------- */
   
      String [] arr = pal.split("");
     
      String equ = "";
    
    // for (int i = 0; i < arr.length; i++) {          
    //  a += arr[i];      
    // }
    for(int f = arr.length - 1; f  >= 0 ; f--){                 
     equ += arr[f];   
    }  
        

    if(pal.equals(equ)){
        System.out.println("La cadena de texto es un palindromo");
    }
    else{
        System.out.println("La cadena de texto no es un palindromo");
    }

    /* ------------------------------- SOLUCION B ------------------------------- */

    StringBuilder sb = new StringBuilder();
    sb.append(pal);
    sb.reverse();
    
    if(sb.toString().equals(pal)){

        System.out.println("La cadena es palindroma");
    }else{
        System.out.println("No es palindroma");
    }


    /* -------------------- EJECUCION DEL EJERCICIO NUMERO 2 -------------------- */

    System.out.println(search("Mi nombre es Sergio, tengo 34 años y me encnta programar!!!!!", "sergio"));   

      /* -------------------- EJECUCION DEL EJERCICIO NUMERO 3-------------------- */

    cuadrado(5);

         /* -------------------------------------------------------------------------- */
 /*                             EJERCICIO NUMERO 4                             */
 /* -------------------------------------------------------------------------- */
//leer numeros array y sumar los números pares y por otro lado, la suma de los números impares que se ingresaron. 


int [] numbers = {10,20,30,40,50,60,70,80,90,100,11,21,31,41,51,61,71,81,91,101};

int pares = 0;
int impares = 0;

for (int i = 0; i < numbers.length; i++) {
    
    if(numbers[i] % 2 == 0){
        System.out.println(pares);
        pares += numbers[i];
    }else{        
        impares += numbers[i];
    }
}

System.out.println("la suma total de numeros pares es = " + pares);
System.out.println("la suma total de numeros impares es = " + impares);

/* -------------------------------------------------------------------------- */
/*                             EJERCICIO NUMERO 5                             */
/* -------------------------------------------------------------------------- */

// Leer varias palabras y que se detenga al leer FIN, y muestre todas las palabras que se leyeron. (10 pts.)

     Scanner scan = new Scanner(System.in);
     String text = "";
     String textComplete = "";

     do {

        System.out.println("Escribe una palabra");
        text = scan.next();
        textComplete += text + ", ";
        
     } while (!text.equals("fin"));

     System.out.println("Las palabras que introdujo el usuario hasta la palabra fin son: " + textComplete);


     /* -------------------------------------------------------------------------- */
     /*                                 EJERCICIO 6                                */
     /* -------------------------------------------------------------------------- */
    //  Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.

    int i = 0;
    while(i < 100){
        i++;
        System.out.println(i);
    }
    // Salto de linea
    System.out.println();
    System.out.println();

    /* -------------------------------------------------------------------------- */
    /*                                 EJERCICIO 7                                */
    /* -------------------------------------------------------------------------- */
    // Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.

    int max = 100;

    for (int j = 1; j <= max; j++) {
       
        if(j % 2 == 0){
            System.out.println(j);
        }else if(j % 3 == 0){
            System.out.println(j);
        }
    }
     
        /* -------------------------------------------------------------------------- */
        /*                             EJERCICIO NUMERO 8                             */
        /* -------------------------------------------------------------------------- */
    // Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá tantas ventas por teclado
    //  como número de ventas se hayan indicado.
    //  Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.

    int ventas = 0;
    int prices = 0;
    int total = 0;
    int numSells =0;
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el numero de ventas para la siguiente factura");
    ventas = sc.nextInt();

    for (int j = 0; j < ventas; j++) { 
        
            System.out.println("Introduce la venta numero "+ (j+1));
            prices = sc.nextInt();
            total += prices;
            numSells ++;
    }

    System.out.println("El numero de ventas es de " +  numSells + ".Unds y el total asciende a: " + total + "$");

    } //Fin de clase main





    /* -------------------------------------------------------------------------- */
    /*           EJERCICIO 2 Busqueda de una palabra dentro de una frase          */
    /* -------------------------------------------------------------------------- */

    //La palabra y la frase deben ser parametros de una funcion

    public static String search(String phrase, String word) {

        int count = 0;
     
        //Creo un array y limpio la cadena de texto (paso a minusculas y elimino caracteres especiales
        
       String [] arr =  phrase.toLowerCase().replaceAll("[^\\w\\s]","").split(" ");

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

            if(word.toLowerCase().equals(arr[i])){
                count++;
            }            
        }

        
        return "El numero de coincidencias es " + count;
    }

    /* -------------------------------------------------------------------------- */
    /*                        EJERCICIO 3 DIBUJAR CUADRADO                        */
    /* -------------------------------------------------------------------------- */

    // Crear un programa que permita el ingreso de un valor y muestre dibujado con * un
    // cuadrado. (no usar estructura de control como arreglo, lista, etc.)
    
    // Ejemplo:
    
    // Ingrese valor: 4
    
    // Salida:
    // * * * *
    // * * * *
    // * * * *
    // * * * *

    public static void cuadrado(int lados) {

        for(int i = 0; i < lados; i++){

            for(int f = 0; f < lados; f++){

                System.out.print("*");                
            }
            System.out.println();
        }        
    }    




}
