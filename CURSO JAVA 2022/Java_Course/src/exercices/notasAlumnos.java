package exercices;

import java.util.Scanner;

public class notasAlumnos {
    public static void main(String[] args) {

        int max5 = 0;
        int min5 = 0;
        int one = 0;
        int numNotas = 10;
        int promedioMax;
        int promedioMin;
        int promedioTotal =0;
        boolean correct = true;
        
        try (Scanner scan = new Scanner(System.in)) {
            double notes;

            for (int i = 0; i < numNotas; i++) {

                System.out.println("Introduce la nota del alumno " + (i +1) + ":");
                notes = scan.nextDouble();

                if(notes == 0){
                    System.out.println("Error");
                    correct = false;
                    break;                
                }else if( notes > 7){
                    System.out.println("La nota maxima debe ser un 7");
                    i--;
                }
                else{

                    promedioTotal += notes;                
                    if(notes >= 5){
                        max5++;
                    }else if(notes < 5 && notes > 1){
                        min5++;
                    }else{
                    one++;
                    }
                }
                
            }

            // Calculo total:

            promedioMax = (max5 * 100) / numNotas;
            promedioMin = (min5 * 100) / numNotas;
            promedioTotal = (promedioTotal / numNotas);
            
            //Si se introduce un cero, no se imprime
            if(correct){

            System.out.println("El " + promedioMax + "% de los alumnos, ha obtenido mas de un 5, el " + promedioMin + "% de los alumnos, "+
            "ha obtenido menos de un 5, y con la increible nota de 1 tenemos un total de.. " + one + " individuos." +
            " El promedio total de las notas es: "+ promedioTotal);
        }
        }
    }
    
}

