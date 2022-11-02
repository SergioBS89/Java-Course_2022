

public class Operators {
    
    public static void main(String[] args) {
        
        /* -------------------------------------------------------------------------- */
        /*                           ARITMETICOS (+ - * / %)                          */
        /* -------------------------------------------------------------------------- */

        int i = 50, b = 40;

        System.out.println("operation " + i + " + " + b +" =  " + (i + b));
        System.out.println("operation " + i + " - " + b +" =  " + (i - b));
        System.out.println("operation " + i + " * " + b +" =  " + (i * b));
        System.out.println("operation " + i + " / " + b +" =  " + (i / b));
        System.out.println("operation " + i + " % " + b +" =  " + (i % b));


        /* -------------------------------------------------------------------------- */
        /*                          OPERADORES DE ASIGNACION                          */
        /* -------------------------------------------------------------------------- */

        int n =9, m= 4;
        
        // Incremento de asignacion 
        System.out.println( n +=m); //13
        System.out.println( n +=m); //17
        System.out.println( n +=m); //21

        //Decremento de asignacion
        System.out.println(n -= m); //17
        System.out.println(n -= m); //13
        System.out.println(n -= m); //9

        // Multiplicacion de asignacion
        System.out.println(n *= m); //36
        System.out.println(n *= m); //144
        System.out.println(n *= m); //576

        //Division de asigancion
        System.out.println(n /= m); //144
        System.out.println(n /= m); //36
        System.out.println(n /= m); //9

        /* -------------------------------------------------------------------------- */
        /*                          OPEADORES INCRREMENTALES                          */
        /* -------------------------------------------------------------------------- */
        
        //Preincremento ( se incrementan v & o)
        int v = 30, o = ++v;
        
        System.out.println(v);//31
        System.out.println(o); //31

        //Post incremento (solo se incrementa v)
        v = 30;
        o = v++;

        System.out.println(v); //31 
        System.out.println(o); //30

         //Predecremento 
         v = 30;
         o = --v;
 
         System.out.println(v); //29 
         System.out.println(o); //29

          //Posdecremento 
          v = 30;
          o = v--;
  
          System.out.println(v); //29 
          System.out.println(o); //30


          /* -------------------------------------------------------------------------- */
          /*                           OPERADORES RELACIONALES                          */
          /* -------------------------------------------------------------------------- */

          int in = 10;
          byte bb = 10;
          float vv = 3400e4f; //La e es de exponencial
          float ve = 3400e4f; //La e es de exponencial
          double db = 23.344;
          boolean bl = false;
          
          boolean b1= (in == bb);
          System.out.println(b1); //true
          System.out.println((b1) != false); //true

          boolean b2 = true;
          System.out.println(b2 == bl); //false

          boolean b3 = (vv > db);
          System.out.println(b3);//true

          boolean b4 = (vv <= ve); //true
          System.out.println(b4);

          /* -------------------------------------------------------------------------- */
          /*                             OPERADORES LOGICOS                             */
          /* -------------------------------------------------------------------------- */
          in = 10;
          bb = 10;
          vv = 3400e4f; //La e es de exponencial
          ve = 3400e4f; //La e es de exponencial
          db = 23.344;
          bl = false;
        
          boolean bl1 = (in <= bb && bl == false); // true
          System.out.println(bl1);
          
          boolean bl2 = (in > 8 || bb > 13);
          System.out.println(bl2); //true

          boolean bl3= (in == bb && vv >= ve && db < in);
          System.out.println(bl3); //false
          

          /* -------------------------------------------------------------------------- */
          /*                              OPERADOR TERNARIO                             */
          /* -------------------------------------------------------------------------- */

          var value = 80;
          
          var test = value > 10 ? "Yes" : "NO";
          System.out.println(test);

       
          /*           EJERCICIO NUMERO MAYOR ENTRE 3 USANDO OPERADOR TERNARIO          */
        

          int max = 0;

          var  num1 = 170;
          var  num2 = 50;
          var  num3 = 120;

          max = (num1 > num2)? num1 : num2;
          max = (max > num3)? max : num3;

          System.out.println("El numero mayor es " + max);



       




 
        

       
        

    }
}