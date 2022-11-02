import java.util.Scanner;

public class ClassMath {
    
    public static void main(String[] args) {
        
        /* ----------------------------- Valor absoluto ----------------------------- */
        
        int i = 30;
        Math.abs(i);
        System.out.println("Math.abs(i): " + i);

        /* ------------------------ Maximo entre dos numeros ------------------------ */

        double db = 10.5999;
        double db2 = 280.7777;

        var result = Math.max(db, db2);
        System.out.println("Math.max: "+result);

        /* ------------------------ Minimo entre dos numeros ------------------------ */

        short s = 23;
        short ss = 12;
        var res = Math.min(s, ss);
        System.out.println("Math.max: "+res);

        /* ------------------- Metodo para redondear hacia arriba ------------------- */

        double ceil = 5.8;
        var res2 = Math.ceil(ceil);
        System.out.println("Math.ceil: " + res2);

         /* ------------------- Metodo para redondear hacia abajo ------------------- */

         double floor = 5.8;
         var res3 = Math.floor(floor);
         System.out.println("Math.floor: " + res3);

        //  Metodo para redondear al alza o a la baja en funcion del valor de la variable

        double a1= 3.8;
        double a2 = 3.3;

        var res4 = Math.round(a1);
        var res5 = Math.round(a2);

        System.out.println("Math.round: " + res4);
        System.out.println("Math.round: " + res5);

        /* -------------------------------- Valor PI -------------------------------- */

        System.out.println("Valor PI: " + Math.PI);

        /* ---------------------------- Valor raiz cuadrada --------------------------- */

        int in = 8;

        var e = Math.sqrt(in);
        System.out.println("Math.sqrt: " + e);

        /* -------------------- Generacion de numeros aleatorios -------------------- */

        double [] nums = new double [20];

        for (int j = 0; j < 20; j++) {

            nums[j] = (double) (Math.random()*20)+1;

            System.out.println("Numero aleatorio " + j+1 + ": " + nums[j]);
        }

        /* -------------------------------------------------------------------------- */
        /*                             AREA DE UN CIRCULO                             */
        /* -------------------------------------------------------------------------- */

        double radio;

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Introduce el radio de un circulo");
            radio = scan.nextDouble();
        }
        //Formula para obtener el radio
        
        double area = Math.PI * (radio * 2);
        // double area = Math.PI * (Math.pow(radio, 2)); Lo mismo!

        System.out.println("El area del circulo de " + radio + " es: " + area);
         
    
    }
}