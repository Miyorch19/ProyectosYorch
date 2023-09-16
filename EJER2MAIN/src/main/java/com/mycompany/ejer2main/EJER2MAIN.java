package com.mycompany.ejer2main;


public class EJER2MAIN {

    public static void main(String[] args) {
        
        Celular c1 = new Celular(500);
        c1.realizarLlamada(120); 
        c1.cambiarMinutosPlan(600); 
        c1.realizarLlamada(720); 
        c1.reiniciarTiempo(); 
        c1.realizarLlamada(180); 
        int valorAPagar = c1.verValorApagar();
        System.out.println("Valor a pagar: $" + valorAPagar);
    }
}
