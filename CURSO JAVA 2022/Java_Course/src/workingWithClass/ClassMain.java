package workingWithClass;

//IMPORTAMOS LOS METODOS DE LA CLASE SOBRECARGAMETODOS
import static workingWithClass.SobrecargaMetodos.*;

public class ClassMain {

    public static void main(String[] args) {

        //Instancia con datos por defecto de la clase

        Vehicles a = new Vehicles();
        
        //Instancia con datos personalizados
        Vehicles v = new Vehicles();
        v.setBranch("Mercedes");
        v.setModel("CLK");
        v.setColor("Red");
        v.setMotor(3000);
    

        //Lllamada al metodo de la clase
        System.out.println(a.details()); 
        System.out.println("----------------------------------");
        System.out.println(v.details());
        System.out.println("------------------------------");

        System.out.println("El "+ a.getBranch() + " " + a.getModel() + " " + a.speed(300));



            /* -------------------------------------------------------------------------- */
    /*                      PROBANDO LA SOBRECARGA DE METODOS                     */
    /* -------------------------------------------------------------------------- */
   

    int entero = 20;
    float flotante = 23.65F;
    double doble = 45.45;
    String cadena = "99";

    System.out.println("Suma sobrecarga: " + sumar(entero, entero));
    System.out.println("Suma sobrecarga: " + sumar(doble, doble ));
    System.out.println("Suma sobrecarga: " + sumar(cadena, cadena));
    System.out.println("Suma sobrecarga: " + sumar(flotante, flotante));
    System.out.println("Suma sobrecarga: " + sumar(entero, entero,entero));
    //llamando al metodo de argumentos variables (varargs)
    System.out.println("Suma sobrecarga: " + sumar(entero, entero,entero,entero,entero,entero,entero,entero));

    
    }
   
}