package com.mycompany.mainclima2;


public class Clima {

    private Temperatura[] temperaturas;

    public Clima(int cantidadDias) {
        temperaturas = new Temperatura[cantidadDias];
    }

    public void agregarTemperatura(int posicion, Temperatura t) {
        temperaturas[posicion] = t;
    }

    public float verPromedioMinima() {
        float sum = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            sum += temperaturas[i].getMinima();
        }
        return sum / temperaturas.length;
    }

    public float verPromedioMaxima() {
        float sum = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            sum += temperaturas[i].getMaxima();
        }
        return sum / temperaturas.length;
    }

    public boolean hayTemperaturasRegistradas() {
        return temperaturas.length > 0;
    }

    public float obtenerTemperaturaMaxima() {
        if (hayTemperaturasRegistradas()) {
            float maxima = temperaturas[0].getMaxima();
            for (int i = 1; i < temperaturas.length; i++) {
                if (temperaturas[i].getMaxima() > maxima) {
                    maxima = temperaturas[i].getMaxima();
                }
            }
            return maxima;
        } else {
            return Float.NaN; 
        }
    }

    public float obtenerTemperaturaMinima() {
        if (hayTemperaturasRegistradas()) {
            float minima = temperaturas[0].getMinima();
            for (int i = 1; i < temperaturas.length; i++) {
                if (temperaturas[i].getMinima() < minima) {
                    minima = temperaturas[i].getMinima();
                }
            }
            return minima;
        } else {
            return Float.NaN; 
        }
    }
}
