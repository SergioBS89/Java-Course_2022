
public class Wrapper {

    public static void main(String[] args) {

        /* -------------------------------------------------------------------------- */
        /* Tipos de wrappers en Java */
        /* -------------------------------------------------------------------------- */
        // Existen 8 tipos primitivos predefinidos en Java, cada uno de los tipos de
        // tipos de datos primitivos tienen
        // asociados su correspondiente clase Wrapper para poder realizar las
        // conversiones de tipos primitivos a objetos (tipos no primitivos).

        // Tipos primitivos (no son objetos y por tanto no poseen métodos)
        // Wrappers(son objeto y por tanto poseen métodos)

        // byte Byte
        // short Short
        // int Integer
        // long Long
        // boolean Boolean
        // float Float
        // double Double
        // char Character

        /* -------------------------------------------------------------------------- */
        /* INTEGER */
        /* -------------------------------------------------------------------------- */

        // INTEGER es un OBJETO que tiene sus propias funciones

        // Creando objetos de tipo Integer con int
        int i = 32768;
        Integer intObj = Integer.valueOf(i); // Froma explicita
        Integer intObj2 = 32768; // Forma implicita

        // Creando objetos con cadenas
        String num = "32768";
        Integer intObj3 = Integer.valueOf(num);

        // Creando objetos con otros tipos

        Integer intObj4 = 34533;
        Short s = intObj4.shortValue(); // El short pierde informacion al superar capacidad

        Long l = intObj4.longValue();

        System.out.println(intObj + "\n" + intObj2 + "\n" + intObj3 + "\n" + s + "\n" + l);

        /* -------------------------------------------------------------------------- */
        /* BOOLEAN */
        /* -------------------------------------------------------------------------- */

        Integer num1, num2;
        num1 = 10;
        num2 = 10;

        boolean b = (num1 == num2);
        // Paso de tipo primitivo a objeto
        Boolean bl = Boolean.valueOf(b);

        Boolean bl2 = false;

        System.out.println("Comparando objetos de tipo boolean: " + (b));// true
        System.out.println("Comparando objetos de tipo boolean: " + (bl.equals(b)));// true
        System.out.println("Comparando objetos de tipo boolean: " + (bl.equals(bl2)));// false
        System.out.println("Comparando objetos de tipo boolean: " + (bl == bl2));// false

    }

}