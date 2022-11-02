package workingWithClass.ejerA;

import workingWithClass.ejerA.clases.Gerente;


// Una compañía maneja empleados y clientes, entre los empleados hay gerentes que manejan presupuesto para su área (modificable) y a todos
//  los empleados se les puede aumentar el sueldo, se pide una jerarquía de clase de los tipos de persona mencionados, tomando como base la 
//  figura del diagrama UML de clases.

// Para todas las clases de la jerarquía tenga en cuenta los métodos getter, un constructor y el toString() con sobre-escritura,
//  para Gerente además el método setter de presupuesto.

// También incluir una clase main con algún ejemplo de un Gerente e imprimir todos sus datos (y heredados) vía toString().


public class Main {

    public static void main(String[] args) {
        
        Gerente ge = new Gerente(10000.0, 20500.0, 999, "Alfonso", "Pietro", "775421BNB", "Santiago 23 (Barcelona");
        System.out.println(ge.toString());
        System.out.println("");
        //Aumento el sueldo
        ge.setRemuneracion(ge.aumentarRemuneracion(4));
        System.out.println(ge.toString());

    }
    
}