public class ConversionTypes {

    public static void main(String[] args) {

        /* ---------------- CONVERSION DE CADENAS DE TEXTO A NUMEROS ---------------- */
    String number = "50";
    //Paso a entero
        Integer.parseInt(number);
        System.out.println("integer = " + number);
    //Paso a double
        number = "9999999999999999999";
        Double.parseDouble(number);
        System.out.println("double = " + number);

    //Paso a boolean
        var bool = "true";
        boolean b = Boolean.parseBoolean(bool);
        System.out.println("boolean = " + b);

   /* ---------- CONVERSION DE TEXTOS A NUMEROS (DOS FORMAS POSIBLES) ---------- */
       
        var str1 = 100;
        var str2 = 9999999;
        
        // Forma numero 1
        Integer.toString(str1);
        System.out.println(str1);

        // Forma numero 2

        String.valueOf(str2);
        System.out.println(str2);

        /* --------------------- CASTING O FORZAR LA COMPRESION --------------------- */

        int i = 1000; // 32 bits de alamcenamiento

        // short s = i;   Arroja error porque es demasiado pequeño (16 bits).
        // Podemos forzarlo haciendo uso del CASTING, sin embargo hay que tener cuidado porque se puede perder informacion si se sobrepasa la capacidad
        short s = (short) i;
        
        // Probamos a sobrepasar el valor de un short para comprobar que no se comprime correctamente
        int ii= 44444444;
        short max = (short)ii;

        long l = i; //En este caso no hay problema porque el long soporta 64 bits

        System.out.println(i + " " + s + " "+ l +" "+ "La compresion es erronea: " + max);
  

   





    }

}
