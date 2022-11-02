
class People{

    private String name;

    public void changeName(String name){

        this.name= name;    
    }
   public String readName(){
    return name;
  }
}



public class Valor_Referencia {
    public static void main(String[] args) {

        /* -------------------------------------------------------------------------- */
        /*                        PASANDO ARGUMENTOS POR VALOR(NO CAMBIA EL VALOR)                        */
        /* -------------------------------------------------------------------------- */
        
        int i = 10;

        System.out.println("El valor de i: " + i);
        test(i); //metodo mas abajo
        System.out.println("El valor sigue siendo: "+i + ", debido a que se pasa el argumento por valor");


        /* -------------------------------------------------------------------------- */
        /*                      PASANDO ARGUMENTOS POR REFERENCIA(CAMBIA VALOR)                     */
        /* -------------------------------------------------------------------------- */

        int [] ages = {20,10,5};
        
        System.out.println("Imprimimos las edades antes de la llamada del metodo test2");
        for (int j : ages) {

            System.out.println("Ages: " + j);
        }
        
        test2(ages); //metodo mas abajo
        
        System.out.println("Despues de la llamada del metodo");

        for (int j : ages) {

            System.out.println("Ages: " + j);
        }

        /* -------------------------------------------------------------------------- */
        /*       PASANDO ARGUMENTOS DE OBJETOS POR REFERENCIA (cAMBIA EL VALOR)       */
        /* -------------------------------------------------------------------------- */

        People p = new People();
        p.changeName("Sergio");

        System.out.println("Antes de llamar al metodo test3");
        System.out.println(p.readName());
        test3(p); //metodo mas abajo
        System.out.println("Despues de llamar al metodo test3");
        System.out.println(p.readName());

    }

    public static void test(int i) {

        System.out.println("Paso de argumento por valor: " + i);
        i = 50;
        System.out.println("Aqui cambia el valor de la variable i a: "+ i);
        
    }

    public static void test2(int [] ages) {

        for (int i = 0; i < ages.length; i++) {

            ages[i] = ages[i] + 20;
            
        }  
    }    

    public static void test3(People p) {

    p.changeName("Marcos");
    }    
}
