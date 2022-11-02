package exercices.retos.semanales.reto36;
/*
 * Enunciado: ¡La Tierra Media está en guerra! En ella lucharán razas leales
 * a Sauron contra otras bondadosas que no quieren que el mal reine
 * sobre sus tierras.
 * Cada raza tiene asociado un "valor" entre 1 y 5:
 * - Razas bondadosas: Pelosos (1), Sureños buenos (2), Enanos (3),
 *   Númenóreanos (4), Elfos (5)
 * - Razas malvadas: Sureños malos (2), Orcos (2), Goblins (2),
 *   Huargos (3), Trolls (5)
 * Crea un programa que calcule el resultado de la batalla entre
 * los 2 tipos de ejércitos:
 * - El resultado puede ser que gane el bien, el mal, o exista un empate.
 *   Dependiendo de la suma del valor del ejército y el número de integrantes.
 * - Cada ejército puede estar compuesto por un número de integrantes variable
 *   de cada raza.
 * - Tienes total libertad para modelar los datos del ejercicio.
 * Ej: 1 Peloso pierde contra 1 Orco
 *     2 Pelosos empatan contra 1 Orco
 *     3 Pelosos ganan a 1 Orco
 */

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        // Integrantes ejercito bueno
        Integer pelosos = 1, sureños_buenos = 2, enanos = 3, numenoreanos = 4, elfos = 5;

        // Integrantes ejercito malo
        Integer sureños_malos = 2, orcos = 2, goblins = 2, huargos = 3, trolls = 5;

        Integer poderEjercitoBueno;
        Integer poderEjercitoMalo;
        String resultado;
        Integer total;
        Integer sauron = 2000;
        Integer aragorn = 3000;

        JOptionPane.showInternalMessageDialog(null, "BIENVENIDO A LA BATALLA POR LA TIERRA MEDIA!");
        JOptionPane.showInternalMessageDialog(null, "Es hora de seleccionar las tropas de cada bando");

        /* ------------------------------- BANDO BUENO ------------------------------ */

        // PELOSOS
        resultado = JOptionPane.showInputDialog(null, "¿Cuantos Pelosos lucharán en el bando de Aragorn?");
        total = Integer.parseInt(resultado);
        poderEjercitoBueno = pelosos * total;

        // SUREÑOS BUENOS
        resultado = JOptionPane.showInputDialog(null, "¿Cuantos Sureños lucharán en el bando de Aragorn?");
        total = Integer.parseInt(resultado);
        poderEjercitoBueno += sureños_buenos * total;
        
        // ENANOS
        resultado = JOptionPane.showInputDialog(null, "¿Cuantos Enanos lucharán en el bando de Aragorn?");
        total = Integer.parseInt(resultado);
        poderEjercitoBueno += enanos * total;
      
        // NUMENOREANOS
        resultado = JOptionPane.showInputDialog(null, "¿Cuantos Numenoreanos lucharán en el bando de Aragorn?");
        total = Integer.parseInt(resultado);
        poderEjercitoBueno += numenoreanos * total;

        // ELFOS
        resultado = JOptionPane.showInputDialog(null, "¿Cuantos Elfos lucharán en el bando de Aragorn?");
        total = Integer.parseInt(resultado);
        poderEjercitoBueno += elfos * total;

        

        /* ------------------------------- BANDO MALO ------------------------------ */

        // SUREÑOS MALOS
        resultado = JOptionPane.showInputDialog(null, "¿Cuantos Sureños lucharán con Sauron?");
        total = Integer.parseInt(resultado);
        poderEjercitoMalo = sureños_malos * total;
        // ORCOS
        resultado = JOptionPane.showInputDialog(null, "¿Cuantos Orcos lucharán con Sauron?");
        total = Integer.parseInt(resultado);
        poderEjercitoMalo += orcos * total;
        // GOBLINS
        resultado = JOptionPane.showInputDialog(null, "¿Cuantos Goblins lucharán con Sauron?");
        total = Integer.parseInt(resultado);
        poderEjercitoMalo += goblins * total;
        // HUARGOS
        resultado = JOptionPane.showInputDialog(null, "¿Cuantos Huargos lucharán con Sauron?");
        total = Integer.parseInt(resultado);
        poderEjercitoMalo += huargos * total;
        // TROLLS
        resultado = JOptionPane.showInputDialog(null, "¿Cuantos Trolls lucharán con Sauron?");
        total = Integer.parseInt(resultado);
        poderEjercitoMalo += trolls * total;
        
        JOptionPane.showMessageDialog(null, "El bando dirigido por Aragorn tiene una fuerza total de " + poderEjercitoBueno + " puntos." +
        "El bando dirigido por Sauron tiene una fuerza total de " + poderEjercitoMalo + " puntos.");
        
        JOptionPane.showMessageDialog(null, "Tras una batalla encarnizada, se unen a las filas de combate Aragorn y Sauron...El " + 
        "bando campeon es:");

        poderEjercitoBueno += aragorn;
        poderEjercitoMalo += sauron;

        if(poderEjercitoBueno > poderEjercitoMalo){
        JOptionPane.showMessageDialog(null, "----ARAGORN WINS----");
        }else if (poderEjercitoBueno == poderEjercitoMalo){
            JOptionPane.showMessageDialog(null, "----IMPOSIBLE! HA SIDO UN EMPATE----");
        }else{
            JOptionPane.showMessageDialog(null, "----SAURON WINS----");
        }

    }

}