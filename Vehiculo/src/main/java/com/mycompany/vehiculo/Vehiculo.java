package com.mycompany.vehiculo;


public class Vehiculo {

    public static void main(String[] args) {
        
        Auto auto1=new Auto();
        auto1.subirCambio();
        System.out.println(auto1.conocerMarcha());

        int x;
        for (x = 1; x<=10; x++){
            System.out.println(auto1.acelerar());
        }
        
                auto1.subirCambio();
        System.out.println(auto1.conocerMarcha());
                auto1.subirCambio();
        System.out.println(auto1.conocerMarcha());
        
        auto1.conocerVelocidad();
        
        
       
    }
}
