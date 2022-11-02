package workingWithClass;

public class SobrecargaMetodos {

   //Al privatizar el constructor de la clase, impedimos crear instancias
    private SobrecargaMetodos(){}
    
    // LA SOBRECARGA DE METODOS NOS AYUDA A UTILIZAR UN MISMO METODO SIN LA NECESIDAD DE CAMBIAR SU NOMBRE, SOLO CAMBIA EL TIPO 

    public static int sumar(int a, int b){

        return a+b;
    }

    public static float sumar (float a, int b){

        return a + b;
    }

    public static double sumar (double a, double b){
        return a + b;

    }


    //En este ejemplo hay que cambiar los tipos de datos para hacer la suma
    public static String sumar ( String a, String b){

        int result;
        String ret;
        try{
            result = Integer.parseInt(a) + Integer.parseInt(b);
        }
        catch(NumberFormatException e){
            result = 0;
        }
        ret = String.valueOf(result);
        return ret;
        
    }

    public static int sumar (int a, int b, int c){

        return a +b +c;
    }

    /* -------------------------------------------------------------------------- */
    /*                  USO DE VARARGS PARA ARGUEMENTOS VARIABLES                 */
    /* -------------------------------------------------------------------------- */

    //Podemos mandar tantos argumentos como deseemos

    public static int sumar(int ... argumentos){
     int total = 0;
     for (int i : argumentos) {
        total += i;
     }
     return total;
    }
    
}