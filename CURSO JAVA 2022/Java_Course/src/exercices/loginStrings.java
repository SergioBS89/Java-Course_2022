package exercices;
import java.util.Scanner;

public class loginStrings {
    public static void main(String[] args) {
        
        String user = "Sergio";
        String user2 = "monica";
        String pass = "batman";
        String pass2 = "1234";

        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Introduce your username");
            String u = s.next();
            System.out.println("Introduce the password");
            String p = s.next();

            boolean isLogued = false;

            if(user.equalsIgnoreCase(u) && pass.equalsIgnoreCase(p)||user2.equalsIgnoreCase(u) && pass2.equalsIgnoreCase(p)){
                isLogued = true;
            }
            if(isLogued){
                if(user.equalsIgnoreCase(u)){
                System.out.println("Welcome " + user + "!!");
            }else{
                System.out.println("Welcome " + user2 + "!!");
            }
            }else{
                System.out.println("User incorrect");
                main(args);
            }
        }
    }
    
}