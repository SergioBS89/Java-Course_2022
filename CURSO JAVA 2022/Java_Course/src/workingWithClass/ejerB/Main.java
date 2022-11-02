package workingWithClass.ejerB;

import java.util.ArrayList;

import workingWithClass.ejerB.clases.Fruta;
import workingWithClass.ejerB.clases.Lacteo;
import workingWithClass.ejerB.clases.Limpieza;
import workingWithClass.ejerB.clases.NoPerecible;
import workingWithClass.ejerB.clases.Producto;

public class Main {
    public static void main(String[] args) {

        // OBJETOS NO PERECIBLES
        NoPerecible np = new NoPerecible("Lata atun", 4.0, "Atun al natural", 90);
        NoPerecible np2 = new NoPerecible("Lata alubias", 5.30, "Alubias con jamon y chorizo", 480);

        // OBJETOS DE LIMPIEZA
        Limpieza li = new Limpieza("Fairi", 4.10, "Producto de limpieza para vajillas", 1.3);
        Limpieza li2 = new Limpieza("Lejia", 0.90, "Producto de limpieza", 5.0);

        //OBJETOS LACTEOS
        Lacteo la = new Lacteo("Yougurt pro", 2.15, 10, 4);
        Lacteo la2 = new Lacteo("Queso fresco", 2.80, 5, 8);

        //OBJETOS FRUTA
        Fruta fr = new Fruta("Melocoton", 3.90, "Naranja", 2);
        Fruta fr2 = new Fruta("Fresones", 2.40, "Rojo", 6);

        // Producto [] productos = {np,np2,li,li2,la,la2,fr,fr2};
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(np);
        productos.add(np2);
        productos.add(fr);
        productos.add(fr2);
        productos.add(la);
        productos.add(la2);
        productos.add(li);
        productos.add(li2);

        for (Producto pro : productos) {
            System.out.println(pro.toString());
            System.out.println("");
            
        }
    }

}