package workingWithClass.ejerC_abstrac;

import workingWithClass.ejerC_abstrac.clases.Guepardo;
import workingWithClass.ejerC_abstrac.clases.Leon;
import workingWithClass.ejerC_abstrac.clases.Lobo;
import workingWithClass.ejerC_abstrac.clases.Mamiferos;
import workingWithClass.ejerC_abstrac.clases.Perro;
import workingWithClass.ejerC_abstrac.clases.Tigre;

public class Main {
    public static void main(String[] args) {
        
          //Creamos un array para agregar las instancias

    Mamiferos [] mamiferosArray = new Mamiferos [5];
    
    Mamiferos tiger = new Tigre("la sabana", 2.0F, 3.0F, 268.0F, "tigeroush", 21.5F, 75, "comun");
    Mamiferos leon = new Leon("la sabana", 2.4f, 3.5f, 280.0f, "leonidas", 23f, 79, 22, 1000f );
    Mamiferos guepardo = new Guepardo("la jungla", 1.8f, 2.6f, 120f, "guepardious", 19f, 127);
    Mamiferos perro = new Perro("casa", 0.80f, 1f, 10f, "perrunious", 3f, 35, "coger la pelota");
    Mamiferos lobo = new Lobo("la montaña", 1.5f, 2.3f, 87f, "wolfiuos", 12f, 56, 38, "blanco");


    mamiferosArray[0]= tiger;
    mamiferosArray[1]= leon;
    mamiferosArray[2]= guepardo;
    mamiferosArray[3]= perro;
    mamiferosArray[4]= lobo;

    for (Mamiferos mamifer : mamiferosArray) {

        System.out.println(mamifer.comer() + "\n");
        System.out.println(mamifer.dormir() + "\n");
        System.out.println(mamifer.correr() + "\n");
        System.out.println(mamifer.comunicarse() + "\n");
        System.out.println("----------------------------");
        
    }
    }
  

}