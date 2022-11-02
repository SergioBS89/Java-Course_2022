package workingWithClass.interfacesJava.clases;

public interface Impresora {

    public String imprimir();

    //MEOTODO CON DEFAULT (SON METODOS QUE TIENEN UN VALOR POR DEFECTO)
    default String tinta(){

        return "La impresora todavia tiene tinta";
    }

     /* -------------------------------------------------------------------------- */
    /*             METODO CREADO PARA IMPRIMIR DIRECTAMENTE EN CONSOLA USANDO STATIC EN UNA IMPLEMENTACION       */
    /* -------------------------------------------------------------------------- */

    //LLamamos como argumento a impresora para tener el metodo imprimir disponible desde cualquier instancia
    static void impresionConsola(Impresora hoja){
        System.out.println(hoja.imprimir());

        //LLAMADA AL METODO DE LA INTERFAZ DEFAULT(SON METODOS QUE NO PUEDEN SER MODIFICADOS, SON PARA LLAMARLOS DIRECTAMENTE)
        System.out.println(hoja.tinta());
    }
    
}