package workingWithClass.contructoresysobrescritura;

import workingWithClass.contructoresysobrescritura.clases.Cloud;
import workingWithClass.contructoresysobrescritura.clases.Tidus;

public class contructores {
    public static void main(String[] args) {

        Tidus td = new Tidus(10, "ps2", 98800, "Tidus", "", "varón", "luchar con la espada");

        System.out.println(td.toString());
        System.out.println("");
        System.out.println(td.villano());

        Cloud cl = new Cloud("psx", 198800, "Cloud", "Strife", "varón", "luchar con mandoble");
        
        System.out.println("");
        System.out.println(cl.toString());
        System.out.println("");
        System.out.println(cl.villano());

        



        
    }
    
}