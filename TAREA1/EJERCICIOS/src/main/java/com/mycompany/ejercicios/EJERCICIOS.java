package com.mycompany.ejercicios;


public class EJERCICIOS {

    public static void main(String[] args) {
        
        Calculos c1 = new Calculos();
        
        // EJERCICIO 1
        System.out.println("El numero mayor es: "+c1.elMayor(2, 10));
        
        // EJERCICIO 2
        System.out.println("El numero menor de los 3 es : "+c1.elMenor(1, 20, 11));
        
        // EJERCICIO 3
        System.out.println("La cantidad de numeros pares entre 0 y el limite dado es de: "+c1.NumerosPares(20));
        
        // EJERCICIO 4
        System.out.println("La suma de los numeros desde 0 hasta el numero dado es de: "+c1.SumaNumeros(3));
        
        // EJERCICIO 5
        System.out.println("La cantidad de numeros impares entre la cantidad dada es de: "+c1.NumerosImpares(1, 5));
        
        // EJERCICIO 6
        c1.setPesoaDolar(20);
        c1.imprimir();

    }
}
