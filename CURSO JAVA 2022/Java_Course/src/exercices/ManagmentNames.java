package exercices;
import java.util.Scanner;

public class ManagmentNames {
    public static void main(String[] args) {
        
        String name1 = "";
        String name2 = "";
        String name3 = "";
        String f;
        String f2;
        String f3;
      

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Please, insert one name: ");
            name1 = scan.nextLine();
            System.out.println("Introduce anhoter name: ");
            name2 = scan.nextLine();
            System.out.println("Finally, introduce another name: ");
            name3 = scan.nextLine();
        }

        
        f = (name1.substring(1,2)).toUpperCase().concat(".").concat(name1.substring(name1.length()-2));
        f2 = (name2.substring(1,2)).toUpperCase().concat(".").concat(name2.substring(name2.length()-2));
        f3 = (name3.substring(1,2)).toUpperCase().concat(".").concat(name3.substring(name3.length()-2));
        

        var finalName = f + "_" + f2 + "_" +f3;
        
        System.out.println(finalName);
        


    }
    
}