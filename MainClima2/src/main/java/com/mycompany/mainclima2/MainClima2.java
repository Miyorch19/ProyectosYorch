package com.mycompany.mainclima2;

import java.util.Scanner;

public class MainClima2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de días a registrar:");
        int cantidadDias = leer.nextInt();

        Clima clima = new Clima(cantidadDias);

        for (int i = 0; i < cantidadDias; i++) {
            Temperatura t = new Temperatura();

            System.out.println("Ingresa la temperatura máxima del día " + (i + 1) + ":");
            t.setMaxima(leer.nextFloat());
            System.out.println("Ingrese la temperatura mínima del día " + (i + 1) + ":");
            t.setMinima(leer.nextFloat());

            clima.agregarTemperatura(i, t);
        }

        if (clima.hayTemperaturasRegistradas()) {
            System.out.println("El promedio de las temperaturas máximas es de: " + clima.verPromedioMaxima());
            System.out.println("El promedio de las temperaturas mínimas es de: " + clima.verPromedioMinima());
            System.out.println("La temperatura más alta es: " + clima.obtenerTemperaturaMaxima());
            System.out.println("La temperatura más baja es: " + clima.obtenerTemperaturaMinima());
        } else {
            System.out.println("No hay temperaturas registradas.");
        }
    }
}
