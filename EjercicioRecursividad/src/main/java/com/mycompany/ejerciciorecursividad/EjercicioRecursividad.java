package com.mycompany.ejerciciorecursividad;

import java.util.Scanner;

public class EjercicioRecursividad {

    public static void main(String[] args) {
        
        // EJERCICIO 1
        Operaciones op1=new Operaciones();
        int resultado=op1.factorial(3);
        System.out.println("El factorial del numero indicado es: " + resultado);
        
        // EJERCICIO 2
        Operaciones op2=new Operaciones();
        System.out.println("La suma del numero natual dado es de: " + op2.sumaNaturales(2));

        // EJERCICIO 3
        Operaciones op3=new Operaciones();
        System.out.println("Suma: "+op3.Suma(4, 4));
        System.out.println("Resta. " + op3.Resta(4, 2));
        System.out.println("Multiplicacion: " + op3.Multiplicacion(4, 2));
        System.out.println("Division: " + op3.Division(4, 0));
    }
}
