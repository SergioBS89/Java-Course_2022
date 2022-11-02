import javax.swing.*;
import java.util.Scanner;

public class StartingWithJava {

    public static void main(String[] args) {



        //USANDO TRY CATCH PARA VALIDAR LA ENTRADA DE DATOS

        String userNumber;

        //VENTANAS DE DIALOGO CON JAVA
        userNumber = JOptionPane.showInputDialog(null, "Escribe un numero");
        try {
            Integer.parseInt(userNumber);

        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Escribe un numero, no un texto");
            //Reinicio del programa
            main(args);
            System.exit(0
            );
        }
        JOptionPane.showMessageDialog(null,"El numero introducido es el " + userNumber);
        String name = "Sergio Berdiell Sanchez";
        System.out.println("My name is: " + name);

        //Los STRINGS al ser instancias de una clase, tienen diferentes metodos, un ejempolo seria:
        System.out.println("name.toUpperCase() = " + name.toUpperCase());
        System.out.println("name.toLowerCase() = " + name.toLowerCase());

        //A diferencia de las cadenas, tenemos varibles de diferentes tipos con int, bool, chart... estas no son
        //instancias de una clase, son valores PRIMITIVOS, por lo tanto no tienen metodos

        // int number = 33;
        // double number2 = 33.33;
        // float number3 = 33.33f;

        //Para usar los metodos en estos valores, tenemos las clases Integer, Float, Double..

        Integer intNumber = 33;
        System.out.println("intNumber.longValue() = " + intNumber.longValue());

        Double doubleNumber = 333.333;
        System.out.println("doubleNumber.intValue() = " + doubleNumber.intValue());

        Float floarNumber = 43f;
        System.out.println(" floarNumber.intValue() = " +  floarNumber.intValue());

        //EN LAS ULTIMAS VERSIONES DEL JDK DE JAVA (ENTORNO DE DESARROLLO), SE PUEDE UTILIZAR LA PALABRA RESERVADA DE
        //VAR PARA DECLARAR VARIBLES

        var string = "eooooo"; //string
        // var num = 12; 
        System.out.println("string.compareTo('hola'); = " +  string.compareTo("hola"));


       


     //USANDO LA CLASE SCANNER PARA INTRODUCIR DATOS DESDE LA TERMINAL

    try (Scanner scan = new Scanner(System.in)) {
        System.out.println("Ingrese en texto");
        String text = scan.nextLine();
        System.out.println("Texto introducido: " + text);
    }
}
}
