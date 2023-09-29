package com.mycompany.colectivo;


public class Bus {
    private int valorPasaje;
    private Persona[] clientes = new Persona[40];

    public int getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    public void agregarPasajero(int numeroAsiento, Persona persona) {
        if (numeroAsiento >= 1 && numeroAsiento <= 40) {
            if (clientes[numeroAsiento - 1] == null) {
                clientes[numeroAsiento - 1] = persona;
                System.out.println("Pasajero agregado al asiento " + numeroAsiento);
            } else {
                System.out.println("El asiento " + numeroAsiento + " ya está ocupado.");
            }
        } else {
            System.out.println("Número de asiento inválido.");
        }
    }

    public double verGanancia() {
        double gananciaTotal = 0;
        for (Persona cliente : clientes) {
            if (cliente != null) {
                gananciaTotal += valorPasaje;
                if (cliente.isDescuento()) {
                    gananciaTotal -= (0.1 * valorPasaje); // Aplicar descuento del 10%
                }
            }
        }
        return gananciaTotal;
    }
}
