package com.mycompany.ventas;

import java.util.Random;


public class Venta {
    
    public int[][] ventas;
    Random rnd=new Random();
    
    public Venta(){
        ventas=new int[12][4];
    }
    
    public void poblar(){
        for (int i=0; i<12; i++){
            for(int j=0; j<4; j++){
                ventas[i][j]=rnd.nextInt(100);
            }
        }
    }
    
    public float promedio(){
        int sumaTotal = 0;
        int cantidadElementos = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++) {
                sumaTotal += ventas[i][j];
                cantidadElementos++;
            }
        }

        if (cantidadElementos > 0) {
            return (float) sumaTotal / cantidadElementos;
        } else {
            return 0; 
        }
    }
    
    public float[] promedioAnual(){
        float[] promedios=new float[4];
         for (int i = 0; i < 4; i++) {
             float promedio=0;
             for (int j = 0; j < 12; j++) {
                 promedio+=this.ventas[j][i];
             }
            promedios[i]=promedio/12;
        }
         return promedios;
    }
    
    public int[] PeroesMeses() {
    int[] peoresMeses = new int[12];

    for (int i = 0; i < 12; i++) {
        int menorVenta = ventas[i][0];
        int anioMenorVenta = 1;

        for (int j = 1; j < 4; j++) {
            if (ventas[i][j] < menorVenta) {
                menorVenta = ventas[i][j];
                anioMenorVenta = j + 1;
            }
        }

        peoresMeses[i] = anioMenorVenta;
    }

    return peoresMeses;
}
    
       public void imprimirTabla(){
                for (int i = 0; i < 4; i++) {
                    String fila="|";
                    for (int j = 0; j < 12; j++) {
                        fila+=this.ventas[j][i]+"|";
                    }
                    System.out.println(fila);
                    System.out.println("--------------------------------------------");
                }
            }
        }
    


