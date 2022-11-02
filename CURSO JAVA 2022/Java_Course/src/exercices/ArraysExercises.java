package exercices;

public class ArraysExercises {
    public static void main(String[] args) {
        
        int [] numbers = new int [10];

        /* ---------------------- Rellenar un array del 1 al 10 --------------------- */

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = i + 1; //Llenamos el array del 1-10     
        }
        
        /* - Imprimir el array mostrando el primer y ultimo numero consecutivamente - */
        for (int i = 0; i < (numbers.length -i); i++) {
        
            System.out.print(numbers[i] + " ");
            System.out.println(numbers[numbers.length - i - 1]);
                        
        }

        /* ------- Crear nuevo array e insertar los elementos del anterior for ------ */

        int [] numbers2 = new int [10];
        var cont = 0;

        for (int i = 0; i < (numbers.length -i); i++) {
            
            //La variable contador se ve a incrementar 2 veces en cada ejecucion
            numbers2[cont++]= numbers[i];
            numbers2[cont++] = numbers[numbers.length - i -1];
                        
        }
         
        System.out.println("Nuevo array con las posiciones de la anterior iteracion");

        for (int i = 0; i < numbers2.length; i++) {
            
            System.out.println("Array posicion " + i + " valor: " + numbers2[i]);
        }

        /* -------------------------------------------------------------------------- */
        /*                         COMNBINAR DOS ARRAYS EN UNO                        */
        /* -------------------------------------------------------------------------- */

         int [] arr = new int [10];
         int [] arr2 = new int [10];
         int [] arrTotal = new int [arr.length + arr2.length];


         /* -------- Relleno los dos arrays, uno con pares y otro con impares -------- */


         for (int i = 0; i < arr.length; i++) {
     
                arr[i] = (i + 1) * 2 - 1;
           
            // System.out.println( "Posicion " + i +" Valor: " + arr[i]);
            }
          
            
         for (int j = 0; j < arr2.length; j++) {           
             
                arr2[j] = (j + 1) *2;          
         }
       
         /* ------------------ Agregamos los numero al tercer array ------------------ */
        var cont2 = 0;
         for (int i = 0; i < arr.length; i++) {

            arrTotal[cont2++] = arr[i];
            arrTotal[cont2++] = arr2[i];
            
         }

         for (int i = 0; i < arrTotal.length; i++) {
            
            System.out.println("Posicion: " + i + " Valor: " + arrTotal[i]);
         }
              

         /* -------------------------------------------------------------------------- */
         /*                     OBTENER EL NUMERO MAYOR DE UN ARRAY                    */
         /* -------------------------------------------------------------------------- */

         int [] numbbers = {2, 500, 98, 24, 65, 1, 44, 99};

         var mayor = 0;

         for (int i = 0; i < numbbers.length; i++) {

            if (numbbers[i] > mayor){

                mayor = numbbers[i];
            }
            
         }

         System.out.println(mayor);
    }
    
}