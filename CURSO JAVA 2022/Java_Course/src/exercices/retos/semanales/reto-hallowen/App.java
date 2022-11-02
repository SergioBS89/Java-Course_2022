
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;

import entities.Person;

/*
 * Enunciado: Este es un reto especial por Halloween.
 * Deberemos crear un programa al que le indiquemos si queremos realizar "Truco
 * o Trato" y un listado (array) de personas con las siguientes propiedades:
 * - Nombre de la niña o niño
 * - Edad
 * - Altura en centímetros
 *
 * Si las personas han pedido truco, el programa retornará sustos (aleatorios)
 * siguiendo estos criterios:
 * - Un susto por cada 2 letras del nombre por persona
 * - Dos sustos por cada edad que sea un número par
 * - Tres sustos por cada 100 cm de altura entre todas las personas
 * - Sustos: 🎃 👻 💀 🕷 🕸 🦇
 *
 * Si las personas han pedido trato, el programa retornará dulces (aleatorios)
 * siguiendo estos criterios:
 * - Un dulce por cada letra de nombre
 * - Un dulce por cada 3 años cumplidos hasta un máximo de 10 años por persona
 * - Dos dulces por cada 50 cm de altura hasta un máximo de 150 cm por persona
 * - Dulces: 🍰 🍬 🍡 🍭 🍪 🍫 🧁 🍩
 */

public class App {
    public static void main(String[] args) throws Exception {

        int largoNombre = 0;
        int añosCumplidos = 0;
        double altura = 0;
        int cantidadDulces = 0;
        int cantidadSustos = 0;
        // Dulces
        String[] dulces = { "🍰", "🍬", "🍡", "🍭", "🍪", "🍫", "🧁", "🍩" };
        // sustos
        String[] sustos = { "🎃", "👻", "💀", "🕷", " 🕸", " 🦇" };

        // Lista de personas
        Person p1 = new Person("Tomas", 10, 125.5);
        Person p2 = new Person("Ana", 9, 115.5);
        Person p3 = new Person("Alvaro", 10, 130.1);
        Person p4 = new Person("Victor", 8, 105.9);

        ArrayList<Person> arr = new ArrayList<>();
        arr.add(p1);
        arr.add(p2);
        arr.add(p3);
        arr.add(p4);

        // Preguntamos si quiere truco o trato

        String respuesta;
        respuesta = JOptionPane.showInputDialog(null, "Truco o trato");

        if ((respuesta.toLowerCase().trim()).equals("trato")) {

            // Repartiendo dulces
            for (Person person : arr) {
                largoNombre = person.getName().length();
                añosCumplidos = person.getAge() / 3;
                altura = person.getHeigth() / 50;
                cantidadDulces = (int) (largoNombre + añosCumplidos + altura);
                // Indicamos el nombre y numero de sustos por pantalla
                JOptionPane.showMessageDialog(null, person.getName() + " , esto es para ti..." + cantidadDulces +
                        " dulces!!! pasarlo bien niños");

                for (int i = 0; i < cantidadDulces; i++) {

                    int indiceAleatorioDulces = numeroAleatorioEnRango(0, dulces.length - 1);
                    String repartirDulces = dulces[indiceAleatorioDulces];
                    JOptionPane.showMessageDialog(null,
                            repartirDulces);
                }
            }

        } else if ((respuesta.toLowerCase().trim()).equals("truco")) {
            // Repartiendo sustos
            for (Person person : arr) {
                largoNombre = person.getName().length();

                if (person.getAge() % 2 == 0) {
                    añosCumplidos = 2;
                }
                altura = person.getHeigth() / 100;
                cantidadSustos = (int) (largoNombre + añosCumplidos + altura);
                // Indicamos el nombre y numero de dulces por pantalla
                JOptionPane.showMessageDialog(null, person.getName() + " , esto es para ti..." + cantidadSustos +
                        " sustos!!! JIJI JAJAJA");
                for (int i = 0; i < cantidadSustos; i++) {

                    int indiceAleatorioSustos = numeroAleatorioEnRango(0, sustos.length - 1);
                    String repartirSustos = sustos[indiceAleatorioSustos];
                    JOptionPane.showMessageDialog(null,
                            repartirSustos);
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Cierras la puerta");
        }
    }

    public static int numeroAleatorioEnRango(int minimo, int maximo) {
        // nextInt regresa en rango pero con límite superior exclusivo, por eso sumamos
        // 1
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
}
