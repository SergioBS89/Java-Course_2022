package exercices.retos.semanales.reto35;

import javax.swing.JOptionPane;

import exercices.retos.semanales.reto35.entities.Habilidades;
import exercices.retos.semanales.reto35.entities.Pokemon;
import exercices.retos.semanales.reto35.entities.Tipos;

/*
 * Enunciado: Crea un programa que calcule el daño de un ataque durante
 * una batalla Pokémon.
 * - La fórmula será la siguiente: daño = ataque - defensa * efectividad
 * - Efectividad: x2 (súper efectivo), x1 (neutral), x0.5 (no es muy efectivo)
 * - Sólo hay 4 tipos de Pokémon: Agua, Fuego, Planta y Eléctrico 
 *   (buscar su efectividad)
 * - El programa recibe los siguientes parámetros:
 *  - Tipo del Pokémon atacante.
 *  - Tipo del Pokémon defensor.
 *  - Ataque: Entre 1 y 100.
 *  - Defensa: Entre 1 y 100.
 */
public class Main {

    public static void main(String[] args) {

        /* -------------------------------------------------------------------------- */
        /* LISTA DE POKEMON */
        /* -------------------------------------------------------------------------- */

        // Pokemon tipo agua
        Habilidades agua1 = new Habilidades("Pistola de agua", 50);
        Habilidades agua2 = new Habilidades("Hidrobomba", 80);
        Pokemon squirtle = new Pokemon("Squirtle", Tipos.AGUA, 15, 20, 3000, agua1, agua2);
        Pokemon wartortle = new Pokemon("Wartortle", Tipos.AGUA, 25, 30, 5000, agua1, agua2);
        Pokemon blastoise = new Pokemon("Blastoise", Tipos.AGUA, 45, 50, 7000, agua1, agua2);
        // Pokemon de tipo planta
        Habilidades planta1 = new Habilidades("Latigo cepa", 50);
        Habilidades planta2 = new Habilidades("Rayo solar", 80);
        Pokemon bulbasour = new Pokemon("Bulbasour", Tipos.PLANTA, 13, 21, 3200, planta1, planta2);
        Pokemon ivisaur = new Pokemon("Ivysaur", Tipos.PLANTA, 24, 31, 4900, planta1, planta2);
        Pokemon vanosaur = new Pokemon("Venusaur", Tipos.PLANTA, 43, 51, 7200, planta1, planta2);
        // Pokemon de tipo fuego
        Habilidades fuego1 = new Habilidades("Ascuas", 50);
        Habilidades fuego2 = new Habilidades("Llamarada", 80);
        Pokemon charmander = new Pokemon("Charmander", Tipos.FUEGO, 17, 18, 3050, fuego1, fuego2);
        Pokemon charmaleon = new Pokemon("Charmaleon", Tipos.FUEGO, 27, 28, 4800, fuego1, fuego2);
        Pokemon charizard = new Pokemon("Charizard", Tipos.FUEGO, 47, 48, 6990, fuego1, fuego2);

        // Pokemon de tipo electrico
        Habilidades habi1 = new Habilidades("Chispas", 50);
        Habilidades habi2 = new Habilidades("Rayo", 70);
        Habilidades habi3 = new Habilidades("Trueno", 100);
        Pokemon pikachu = new Pokemon("Pikachu", Tipos.ELECTRICO, 16, 19, 3800, habi1, habi3);
        Pokemon raichu = new Pokemon("Raichu", Tipos.ELECTRICO, 36, 39, 7500, habi2, habi3);

        // SELECCIONA LOS DOS POKEMON
        combate(charizard, blastoise);

    }

    /* -------------------------------------------------------------------------- */
    /* METODO PARA LA BATALLA */
    /* -------------------------------------------------------------------------- */

    public static double atacar(Pokemon luchador_A, Pokemon luchador_B, boolean primer_turno, int atqPoS) {

        double daño = 0; // Daño dependiendo del tipo

        // Efectos
        double muyEfectivo = 2;
        double neutral = 1.1;
        double noEfectivo = 0.5;

        // Frase que cambia en funcion del daño
        String resultado = "";

        // Cambio el inicio de turno entre luchador a y b
        if (primer_turno == false) {
            Pokemon pok = luchador_A;
            luchador_A = luchador_B;
            luchador_B = pok;
        }
        // Uso de habilidad priamria o secundaria
        double habi;
        String nombreHabi = "";
        if (atqPoS == 1) {
            habi = luchador_A.getAtqPricipal().getPoder();
            nombreHabi = luchador_A.getAtqPricipal().getNombreHabilidad();

        } else if (atqPoS == 2) {
            habi = luchador_A.getAtqSecundario().getPoder();
            nombreHabi = luchador_A.getAtqSecundario().getNombreHabilidad();
        } else {
            habi = 0;
            nombreHabi = "Golpe desconocido...el pokemon rival ni se inmuto!";
        }

        // CONDIONES PARA EFECTIVIDAD DE TIPOS
        if (luchador_A.getTipo() == Tipos.AGUA && luchador_B.getTipo() == Tipos.FUEGO
                || luchador_A.getTipo() == Tipos.ELECTRICO && luchador_B.getTipo() == Tipos.AGUA
                || luchador_A.getTipo() == Tipos.PLANTA && luchador_B.getTipo() == Tipos.AGUA
                || luchador_A.getTipo() == Tipos.FUEGO && luchador_B.getTipo() == Tipos.PLANTA) {

            daño = habi * (luchador_A.getAtaque() * muyEfectivo) - luchador_B.getDefensa();
            resultado = "Es super efectivo!!";

        } else if (luchador_A.getTipo() == Tipos.FUEGO && luchador_B.getTipo() == Tipos.AGUA
                || luchador_A.getTipo() == Tipos.AGUA && luchador_B.getTipo() == Tipos.ELECTRICO
                || luchador_A.getTipo() == Tipos.PLANTA && luchador_B.getTipo() == Tipos.FUEGO
                || luchador_A.getTipo() == Tipos.ELECTRICO && luchador_B.getTipo() == Tipos.PLANTA) {

            daño = habi * (luchador_A.getAtaque() * noEfectivo) - luchador_B.getDefensa();
            resultado = "El ataque no fue efectivo";

        } else {

            daño = habi * (luchador_A.getAtaque() * neutral) - luchador_B.getDefensa();
            resultado = "Buen golpe";
        }

        System.out.println(luchador_A.getNombre() + " ataca!!");
        System.out.println("Ha usado " + nombreHabi);
        System.out.println("Ha restado a su oponente " + daño + " puntos de vida... " + resultado);

        return daño; // Retornamos el daño que causo el ataque
    }

    public static void combate(Pokemon luchador_A, Pokemon luchador_B) {

        System.out.println(
                " EMPIEZA LA BATALLA" + "\n" + luchador_A.getNombre() + " vs " + luchador_B.getNombre() + "\n");
        System.out.println(luchador_A.getNombre() + " = " + luchador_A.getVida() + " pv.");
        System.out.println(luchador_B.getNombre() + " = " + luchador_B.getVida() + " pv.");

        double vidaPokemonA = luchador_A.getVida();
        double vidaPokemonB = luchador_B.getVida();
        boolean fin = true;
        String queHabilidad = "";
        int atqPrima_secun;

        /* ------------------- ALTERNO JUGADOR A Y B CONTINUAMENTE ------------------ */

        while (fin) {
            queHabilidad = JOptionPane.showInputDialog(null, "Seleccionar ataque \n"
                    + "\n" + luchador_A.getNombre() + ":  1-" + luchador_A.getAtqPricipal().getNombreHabilidad() + "\n"
                    +
                    "2-" + luchador_A.getAtqSecundario().getNombreHabilidad());

            if (queHabilidad.equals("1")) {
                atqPrima_secun = 1;
            } else if (queHabilidad.equals("2")) {
                atqPrima_secun = 2;
            } else {
                atqPrima_secun = 3;
            }
            // primer turno true ataca el luchador a
            vidaPokemonB -= atacar(luchador_A, luchador_B, true, atqPrima_secun);

            if (vidaPokemonB >= 0) {
                System.out.println("La vida de " + luchador_B.getNombre() + " es: " + vidaPokemonB);
            } else {
                System.out.println(luchador_B.getNombre() + " ha sido derrotado...");
                System.out.println(luchador_A.getNombre() + " WINS!");
                fin = false;
            }
            // Pregunto si el valor fin es true para continuar con el programa, de lo
            // contrario no se ejecuta el codigo
            if (fin) {
                queHabilidad = JOptionPane.showInputDialog(null, "Seleccionar ataque \n"
                        + "\n" + luchador_B.getNombre() + ":  1-" + luchador_B.getAtqPricipal().getNombreHabilidad()
                        + "\n" +
                        "2-" + luchador_B.getAtqSecundario().getNombreHabilidad());

                if (queHabilidad.equals("1")) {
                    atqPrima_secun = 1;
                } else if (queHabilidad.equals("2")) {
                    atqPrima_secun = 2;
                } else {
                    atqPrima_secun = 3;
                }

                // primer turno false ataca el luchador b
                vidaPokemonA -= atacar(luchador_A, luchador_B, false, atqPrima_secun);
                if (vidaPokemonA >= 0) {
                    System.out.println("La vida de " + luchador_A.getNombre() + " es: " + vidaPokemonA);
                } else {
                    System.out.println(luchador_A.getNombre() + " ha sido derrotado!!");
                    System.out.println(luchador_B.getNombre() + " WINS!");
                    fin = false;
                }
            }
        }
    }

}
