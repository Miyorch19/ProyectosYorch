package com.mycompany.ejer2main;


public class Celular {
    private int minutosPlan;
    private int segundosPlanHablados;

    public Celular(int minutosPlan) {
        this.minutosPlan = minutosPlan;
        this.segundosPlanHablados = 0;
    }

    public void realizarLlamada(float segundos) {
        int segundosLlamada = (int) segundos;
        if (segundosPlanHablados + segundosLlamada <= minutosPlan * 60) {
            segundosPlanHablados += segundosLlamada;
            System.out.println("Llamada realizada por " + segundosLlamada + " segundos.");
        } else {
            System.out.println("No puedes realizar la llamada, excedes los minutos del plan.");
        }
    }

    public void cambiarMinutosPlan(int valor) {
        if (valor > 10) {
            minutosPlan = valor;
            System.out.println("El plan ha sido cambiado a " + valor + " minutos.");
        } else {
            System.out.println("El valor debe ser mayor a 10 para cambiar el plan.");
        }
    }

    public void reiniciarTiempo() {
        segundosPlanHablados = 0;
        System.out.println("Tiempo de llamadas reiniciado a cero.");
    }
    public int verValorApagar() {
        int minutosUtilizados = segundosPlanHablados / 60;
        return minutosUtilizados * minutosPlan;
    }
}
