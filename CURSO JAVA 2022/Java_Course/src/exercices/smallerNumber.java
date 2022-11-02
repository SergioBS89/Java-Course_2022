package exercices;

import java.util.Scanner;

// Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros, 
// usando la clase Scanner ingresar la cantidad de números a comparar, 
// luego utilizando una sentencia for iterar el numero de veces (ingresado) para pedir el numero entero, entonces se requiere:

// Calcular el número menor de todos ellos e imprimir el valor.


public class smallerNumber {
    public static void main(String[] args) {
        
    try (Scanner scan = new Scanner(System.in)) {
                     
        System.out.println("Introduce la cantidad de numeros a comparar:"); //Minimo 10 numeros
        int quantity = scan.nextInt();

        if(quantity < 10){

            System.out.println("Debes insertar minimo 10 numeros para la comparacion");
        }
        else{
        
            int menor = Integer.MAX_VALUE; //Busca siempre el valor mas alto
            int number;

            for (int i = 0; i < quantity; i++) {
            
                System.out.println("Ingrese el numero " + (i+1) + ":");
                number = scan.nextInt();
                menor = (number < menor) ? number : menor; 
                }
            System.out.println("El numero menor es " + menor);
            }
    
    }
    }
    
}