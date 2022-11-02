import java.util.Arrays;
import java.util.Collections;

public class ArraysJava {
    public static void main(String[] args) {
        
        /* -------------------------------------------------------------------------- */
        /*                              ARRAYS DE ENTEROS                             */
        /* -------------------------------------------------------------------------- */
        
        //Declaracion de array de 5 elementos
        int [] numbers = new int [5];

        String num1 = "234"; //Podemos agregar cadenas con Integer.valueOf()

        numbers[0] = Integer.valueOf(num1);
        numbers[1] = 10;
        numbers[2] = (int) 56l; //forzamos la conversion de un long a int (Cuidado con la perdida de info)
        numbers[3] = 450;
        numbers[4] = -33;
         
        //Imprimo el array
        for (int i = 0; i < numbers.length; i++) {        
          
        
            System.out.println(numbers[i]);   
           }

        System.out.println("NUMEROS ORDENADOS DE MENOR A MAYOR");
        
        /* ---------------------- Metodo para ordenar un array de menor a mayor ---------------------- */
        
        int[ ] orderMin = Arrays.copyOf(numbers, numbers.length); //Copio el array original
        Arrays.sort(orderMin);     

        for (int j = 0; j < orderMin.length; j++) {
            System.out.println(orderMin[j]);
       } 

     /* ------------------- Ordenando un array de mayor a menor ------------------ */

     int [] orderMax = new int [5];
     var cont = 0;

        for (int i = orderMin.length-1; i >= 0; i--) {         

            orderMax[cont] = orderMin[i];
            cont +=1;
        }

        System.out.println("NUMEROS DE MAYOR A MENOR");
        
        for (int n = 0; n < orderMax.length; n++) {

            System.out.println(orderMax[n]);
            
        }


        /* -------------------------------------------------------------------------- */
        /*                              ARRAYS DE STRINGS                             */
        /* -------------------------------------------------------------------------- */

        // Podemos agregar directamente al array los elementos

        String [] names = {"Tomas", "Pepe", "Sergio", "Andres", "Leo"};

        System.out.println("NOMBRES");

        for (String n : names) {
            System.out.println(n);            
        }

        /* ------------------- Ordenar arrays por orden alfabetico ------------------ */
        
        System.out.println("NOMBRES ORDENADOS DE LA A-Z");
        Arrays.sort(names);

        for (String n : names) {
            System.out.println(n);            
        }

     /* ---- Podemos cambiar el orden de un array para ordenar de la Z a la A ---- */
    
     //Copio el array para crear una nueva instancia
    String [] names2 = Arrays.copyOf(names, names.length);

    Arrays.sort(names2, Collections.reverseOrder());  
    
    System.out.println("NOMBRES ORDENADOS DE LA Z-A");
    for (String ss : names2) {

        System.out.println(ss);       
    
    }


    /* -------------------------------------------------------------------------- */
    /*                        METODO ORDENAR STRINGS ARRAYS BURBUJA                     */
    /* -------------------------------------------------------------------------- */

    String [] letters = {"a","g","e","s","y","b","w","l","n","p"};

    var total = letters.length;

    for (int i = 0; i < total -1; i++) {

        for (int j = 0; j < total-i-1; j++) {

           if(letters[j + 1].compareTo(letters[j]) < 0){

            var aux = letters[j+1];
            letters[j+1] = letters[j];
            letters[j] = aux;
           }
            
        }    
        
    }
    
    System.out.println("Metodo burbuja Strings");

    for (int i = 0; i < letters.length; i++) {
        System.out.println(letters[i]);
    }
 
 
    /* -------------------------------------------------------------------------- */
    /*                        METODO ORDENAR NUMEROS ARRAY BURBUJA                     */
    /* -------------------------------------------------------------------------- */

    double [] numbb = {12.4, 54.99, 87,33, 700, 472,999};

    var total2 = numbb.length;

    for (int i = 0; i < total2 -1; i++) {

        for (int j = 0; j < total2-i-1; j++) {

           if(numbb[j + 1] < numbb[j]){

            var aux = numbb[j+1];
            numbb[j+1] = numbb[j];
            numbb[j] = aux;
           }
            
        }    
        
    }
    System.out.println("Metodo burbuja Numeros y ordenado de mayor a menor");

    for (int i = numbb.length-1; i  >= 0; i--) {
        System.out.println(numbb[i]);
    }
     

    /* -------------------------------------------------------------------------- */
    /*                    BUSCAR UN ELEMENTO DENTRO DE UN ARRAY                   */
    /* -------------------------------------------------------------------------- */

    int [] nb = {23,45,99,9,5,1,2,3,4,56,7,77};

    var search = 56;
    var search2 = 101;
    boolean exist = false;

    for (int i = 0; i < nb.length; i++) {

    if(search2 == nb[i]){
        exist = true;
    }        
    }
    if(exist){
        System.out.println("Numero existe");
    }else{

        System.out.println("Numero no existe");
    }

   


    }
    
}