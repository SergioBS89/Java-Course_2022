
public class Strings {
    public static void main(String[] args) {
        
         /* -------------------------------------------------------------------------- */
         /*                          FORMAS DE CREAR UN STRING                         */
         /* -------------------------------------------------------------------------- */

        String s = "This course is from Udemy"; //Forma literal 
        String ss = "This course is from Udemy"; //Forma literal 
        String snew = new String("This course is from Udemy"); // Instancia desde el objeto
        String ssnew = new String("This course is to learn Java"); // Instancia desde el objeto

        //si creamos la compracion entre ambas varibles:
        
         /* ------------------------ Podemos comparar el tipo ------------------------ */
        //Son el mismo Objeto? 
        boolean equal = (s == snew); 
        System.out.println("literal = instancia ?? " + equal); //Falso
        
        equal = (snew == ssnew);
        System.out.println("instancia = instancia ?? " + equal);//Falso

       /* ------------------------ Podemos comparar el valor ----------------------- */
        //Son del mismo tipo?
        equal = s.equals(snew);
        System.out.println("literal equal(literal)  ??" + equal); //verdadero

        equal = s.equals(ss);
        System.out.println("literal equal(literal) ??" + equal); //verdadero

        //EL METODO EQUALS COMPARA EL VALOR DE LA VARIABLE, MIENTRAS QUE CON EL SIGNO DE IGUAL COMPARAMOS EL OBJETO


        /* -------------------------------------------------------------------------- */
        /*                            CONCANTENANDO STRINGS                           */
        /* -------------------------------------------------------------------------- */

        // Hay varias formas de concatenar una cadena 
         
        /* -------------------- CONCATENAR STRINGS METODO SIMPLE -------------------- */

         var str1 = "Hi! my name is ";
         var str2 = "Sergio, i'm learning Java in this moment ";
         var str3 = "so let me show you how concat different strings using +=";
 
         str1 += str2;
         str1 += str3;
 
         System.out.println(str1);

        /* ------------------------- Usando el metodo CONCAT() ------------------------ */

        var st = "Hi! my name is ";
        var st2 = "Sergio, i'm learning Java in this moment ";
        var st3 = "so let me show you how concat different strings";

        String text = st.concat(st2 + "" +st3);
        System.out.println(text);

        // Otra de las posibles formas es ir agregando en una cadena de texto todo lo que queramos

        String text2 = st + st2 + st3 + ", yesterday i did an interview with Daniel from Gft and I think it was really good.";
        System.out.println(text2);


        /* -------------------------------------------------------------------------- */
        /*      TEXT DE RENDIMIENTO PARA CONCATENACION DE STRINGS USANDO UN LOOP      */
        /* -------------------------------------------------------------------------- */
        String a = "ala ";
        String b = "bol";
        String c = "";

        StringBuilder sb = new StringBuilder();

        // Calaculo de milisengudos 
       long start = System.currentTimeMillis();

        for (int i = 0; i < 5; i++) {
        
            // c = c.concat(a).concat(b).concat("\n"); // 500 itera => 3ms, 5000 itera => 71ms, 50000 itera => 2037ms  
            // c += a + b + "\n"; // 500 itera => 2ms, 5000 itera => 52ms, 50000 itera => 1750ms   
            sb.append(a + b + "\n");  // 500 itera => 0.5ms , 5000 itera => 5ms, 50000 itera => 21ms      
            
        }
        long end = System.currentTimeMillis();

        System.out.println(c);
        System.out.println(sb.toString());
        System.out.println(end -start);

        //COMO CONCLUSION SE PUEDE APRECIAR QUE CLARAMENTE SI NECESITAMOS ITERAR GRAN CANTIDAD DE VECES, USAREMOS EL OBJETO 
        // STRING BUILDER POR SU GRAN EFICIENCIA


        /* -------------------------------------------------------------------------- */
        /*                      VALIDAR UN STRING (NULL - VACIO)                      */
        /* -------------------------------------------------------------------------- */

        String n = null;
        Boolean bol = (n == null);
        String empt = "";        
        String empt2 = "";        
        String blank = "     ";        
        
        // Validacion de null
        if (bol){
            n = "I'm null";
        }
        //Validacion de cadena vacia
        if(empt.length() <=0){
            empt = "I'm empty";
        }
        //validacion de cadena vacia 2
        if(! empt.isEmpty()){
           empt2 = "I'm not empty, i took the value from before if";
        }

        //La forma mas segura de validar un string vacio es usar blank(), valida que este vacio aunque contenga espacios en blanco

        if(blank.isBlank()){
            blank = "Yes, I'm an empty string, but i have some spaces between.";
        }



        System.out.println(bol); // true
        System.out.println(n);
        System.out.println(empt);
        System.out.println(empt2);
        System.out.println(blank);



        /* -------------------------------------------------------------------------- */
        /*                  METODOS MAS IMPORTANTES PARA LOS STRINGS                  */
        /* -------------------------------------------------------------------------- */

        String car = "Honda Civic";

        //Calcular el largo de la cadena
        System.out.println("Long: " + car.length());

       //Convertir a mayusculas 
       System.out.println("UpperCase: " + car.toUpperCase());

        //Convertir a minisculas
        System.out.println("LowerCase: " + car.toLowerCase());

        //Comparar dos strings
        System.out.println("Comparation: " + car.equals("Honda Civic")); //Retorna true
        System.out.println("Comparation: " + car.equals("honda civic")); //Retorna flase
        System.out.println("Comparation: " + car.equalsIgnoreCase("honda civic")); //Retorna true

        //Obtener una letra de la cadena 
        System.out.println("First letter: " + car.charAt(0));
        System.out.println("Last letter: " + car.charAt(car.length() - 1)); //Para mostrar la ultima letra

        //Tomar fragmento del string
        System.out.println("Some piece: " + car.substring(6)); //Se toma el fragmento desde la posicion 6 incluida en adelante
        System.out.println("Some piece: " + car.substring(3,8)); //Se toma el fragmento de una posicion a otra, la ultima no cuenta

        String potato = "potato";

        //Remplazar ciertos caracteres
        System.out.println("Changing characters: "+ potato.replace("o", "a")); //patata

        //Buscar la primera coincidencia de un caracter
        System.out.println("Looking for the same letter: "+ potato.indexOf("t"));
        //Buscar la ultima coincidencia de un caracter
        System.out.println("Looking for the same letter: "+ potato.lastIndexOf("t"));
        //Si no hay coincidencias usando el metodo index of, devulve un valor negativo -1
        
        //Buscar alguna letra (Alternativa al anterior metodo)
        System.out.println("Looking for some character: " + potato.contains("pota"));//true
        System.out.println("Looking for some character: " + potato.contains("z"));//false

        //La cadena empieza por...
        System.out.println("Star with: " + potato.startsWith("pot")); //true      
        
        //La cadena termina en....
        System.out.println("End with: "+ potato.endsWith("sasa")); //false

        //Eliminando espacios de una cadena delante y detras

        String spaces = "    hello there      wow ";
        System.out.println("Remove spaces: " + spaces.trim());
        System.out.println("With spaces: " + spaces);

        //Eliminando espacios de una cadena, sin cambios de linea o tabuladores
        System.out.println("Remove all spaces: "+ spaces.trim().replace(" ", ""));
        
        String tt = "Hello" + "\n" + "Eiii " + "\n" + "Eiii" + "\n" + "Eiii";
        // Elimina espacios, tabuladores, retornos
        System.out.println("String with different lines: " + tt);
        System.out.println("String with different lines: " + tt.replaceAll("\\s",""));

        //Eliminar caracteres especiales de una cadena REPLACE ALL

        String proof = "My name is Sergio!!! and my gmail is sergio@hotmail.com";
        String result =  proof.replaceAll("[^\\w\\s]","");

        System.out.println("String without special characters: " + result);


        /* -------------------------------------------------------------------------- */
        /*                  METODOS PARA CONVERTIR CADENAS EN ARRAYS                  */
        /* -------------------------------------------------------------------------- */

        String bar = "Barcelona the best team";
        
        // Agregamos en formato char, una cadena de texto a un array
        char [] arr = bar.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            System.out.println("Position array:"+ i +" => " + arr[i]);            
        }
        //salto de linea
         System.out.println("");

        //Con el metodo split(), podemos agregar una cadena a un array, separando fragementos 

        String [] arr2 = bar.split("a");

        for (int i = 0; i < arr2.length; i++) {
 
             System.out.println("Position array:"+ i +" => " + arr2[i].replaceAll(" ", ""));
        }
        System.out.println("");
        //Segundo ejemplo usando split()
        String p = "house.london.fly.png";

        String [] arr3= p.split("[.]"); //Indicamos que se separen por el punto, caracteres especiales van entre []

        for (int i = 0; i < arr3.length; i++) {
 
             System.out.println("Position array:"+ i +" => " + arr3[i]);
        }
    }

    
}