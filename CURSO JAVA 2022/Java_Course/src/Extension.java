

public class Extension {
    public static void main(String[] args) {
        
        /* -------------------------------------------------------------------------- */
        /*       OBTENER LA EXTENSION DE UN ARCHIVO USANDO LOS METODOS DE STRING      */
        /* -------------------------------------------------------------------------- */

        String file = "mycar_hondacivic.jpeg";
        String file2 = "mycar_hondacivic.png";
        String file3 = "mycar.hondacivic.pdf";
        
        /* -------------------------- Forma NO recomendable ------------------------- */
        System.out.println(file.substring(file.length()-4,file.length())); //Jpeg (Valido)
        System.out.println(file2.substring(file2.length()-4,file2.length())); //.png (No valido)

        /* --------------------------Forma correcta si solo contine un punto el archivo----------------------------- */
        System.out.println(file.indexOf(".")); //Posicion del punto
        System.out.println(file.substring(file.indexOf(".")+1));//jpeg
        System.out.println(file2.substring(file2.indexOf(".")+1));//png
        System.out.println(file3.substring(file3.indexOf(".")+1));//hondacivic.pdf

        /* -------------------------- LA FORMA 100% SEGURA -------------------------- */
        System.out.println(file3.lastIndexOf(".")); //Posicion del punto empezando por atras
        System.out.println(file3.substring(file3.lastIndexOf(".")+1));//pdf
        

    }
    
}