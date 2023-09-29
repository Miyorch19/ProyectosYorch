package com.mycompany.ventas;


public class Ventas {

    public static void main(String[] args) {
        
        Venta v=new Venta();
            v.poblar();
            v.imprimirTabla();
        for (int i = 0; i < 12; i++) {
            System.out.println((i+1)+". "+v.ventas[i][0]);
        }
        
        System.out.println("El promedio es: " +v.promedio());

        float[] promedios=v.promedioAnual();
        System.out.println("");
        System.out.println("LISTA DE PROMEDIO ANUAL:");
        
        for (int i = 0; i < promedios.length; i++) {
            System.out.println("Año "+1+"-"+promedios[i]);
        }
        System.out.println("");
        System.out.println("LISTA DE PEORES MESES:");
        
        int[] peoresMeses = v.PeroesMeses();
            for (int i = 0; i < peoresMeses.length; i++) {
                System.out.println("Mes " + (i+1) + "-" + peoresMeses[i]);
    }

    }
    
    
}
