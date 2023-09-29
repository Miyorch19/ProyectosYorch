package com.mycompany.colectivo;

import java.util.Scanner;

public class Colectivo {

    public static void main(String[] args) {
    
        Scanner scr = new Scanner(System.in);
        Bus bus = new Bus();

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Establecer valor de pasaje");
            System.out.println("2. Agregar pasajero");
            System.out.println("3. Ver ganancia");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scr.nextInt();
            scr.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor del pasaje: ");
                    int valorPasaje = scr.nextInt();
                    bus.setValorPasaje(valorPasaje);
                    System.out.println("Valor de pasaje establecido correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el número de asiento: ");
                    int numeroAsiento = scr.nextInt();
                    scr.nextLine(); // Consumir la nueva línea
                    System.out.print("Ingrese el nombre del pasajero: ");
                    String nombrePasajero = scr.nextLine();
                    System.out.print("¿El pasajero tiene descuento? (si/no): ");
                    String tieneDescuentoStr = scr.nextLine().toLowerCase();

                    boolean tieneDescuento;
                    if (tieneDescuentoStr.equals("si")) {
                        tieneDescuento = true;
                    } else if (tieneDescuentoStr.equals("no")) {
                        tieneDescuento = false;
                    } else {
                        System.out.println("Respuesta no válida. Se asume que el pasajero no tiene descuento.");
                        tieneDescuento = false;
                    }

                    Persona nuevoPasajero = new Persona(nombrePasajero, tieneDescuento);
                    bus.agregarPasajero(numeroAsiento, nuevoPasajero);
                    break;
                case 3:
                    double ganancia = bus.verGanancia();
                    System.out.println("Ganancia total del bus: $" + ganancia);
                    break;
                case 4:
                    System.out.println("¡Gracias por usar el sistema!");
                    scr.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
}
