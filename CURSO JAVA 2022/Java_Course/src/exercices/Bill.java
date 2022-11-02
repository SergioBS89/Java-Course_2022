package exercices;
import java.util.Scanner;

public class Bill {

    public static void main(String[] args) {

        String nameFac;
        String descFac;
        Double price1;
        Double price2;

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Introduce el nombre de la factura");
            nameFac = scan.nextLine();
            System.out.println("Introduce la descripcion de la factura");
            descFac = scan.nextLine();
            System.out.println("Introducir precio 1");
            price1 = scan.nextDouble();
            System.out.println("Introducir precio 2");
            price2 = scan.nextDouble();
        }    

        Double total = price1 + price2;
        Double impu = (total * 19)/100;
        
        System.out.println("La factura de "+ nameFac + ", consta de los siguientes gastos: " + descFac + "." + "\nTiene un total bruto de " + total +
        " Euros y un impuesto de " + impu + " Euros. El total asciende a: " + (total+impu) + "." );
        
    }
}