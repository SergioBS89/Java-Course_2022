package exercices;
import java.util.Scanner;

public class DepositFuel {
    public static void main(String[] args) {
        
        var deposit = 0;

        try (Scanner scan = new Scanner(System.in)) {
     
        System.out.println("Cual es la cantidad de gasoil que tiene el deposito?");
        deposit = scan.nextInt();

        if(deposit >= 70){
            System.out.println("Estanque lleno");

        }else if(deposit >= 60 && deposit < 70){
          System.out.println("Estanque casi lleno");
        }else if(deposit >= 40  && deposit < 60){
            System.out.println("Estanque  3/4");
        }else if(deposit >= 35  && deposit < 40){
            System.out.println("Medio Estanque ");
        }else if(deposit>= 20  && deposit < 35){
            System.out.println("Suficiente");
        }else if(deposit >= 1  && deposit < 20){
            System.out.println("Insuficiente");
        }
        else{
            System.out.println("Stopppppp!!!!");
        }
    }
}
    
}