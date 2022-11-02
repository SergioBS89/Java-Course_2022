package workingWithClass.ejerCatalogo_intefaces;

import java.util.*;

import workingWithClass.ejerCatalogo_intefaces.clases.Comic;
import workingWithClass.ejerCatalogo_intefaces.clases.IPhone;
import workingWithClass.ejerCatalogo_intefaces.clases.TvLCD;
import workingWithClass.ejerCatalogo_intefaces.interfaces.IProducto;

public class Main {
    public static void main(String[] args) {

        // IProducto [] arrayProductos = new IProducto [7];

        List <IProducto> arr = new ArrayList<>();
        
        IProducto p = new IPhone("Apple", 950, "white", "13 pro");
        IProducto p2 = new TvLCD("Samsung", 1250, 50);
        IProducto p3 = new Comic(20, new Date(), "Patrick Rofuss", "El silencio del viento", "Planeta", "Kvock");
        IProducto p4 = new Comic(35, new Date(), "Echihiro Oda", "One Piece", "Manga", "Luffy");

        arr.add(p);
        arr.add(p2);
        arr.add(p3);
        arr.add(p4);

        for (IProducto iProduct : arr) {

            IProducto.imprimir(iProduct);
            System.out.println("........................");
            
        }

        
    }    
}