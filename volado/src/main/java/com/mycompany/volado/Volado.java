package com.mycompany.volado;

import java.util.Scanner;

public class Volado {

    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        Cartera cartera=new Cartera();
        Moneda moneda=new Moneda();
        int menu=0;
        int apuesta=0;
        int cara=0;
        
            cartera.mostarSaldo();
            
            while(menu<3){
                System.out.println("1. Apostar");
                System.out.println("2. Jugar");
                System.out.println("3. Salir");
                System.out.println("Selecciona una opción");
                menu=leer.nextInt();
                
                switch(menu){
                    
                    case 1: 
                        System.out.println("Ingresa la cantidad para tu apuesta");
                        apuesta=leer.nextInt();
                        if(apuesta>cartera.getSaldo()){
                            System.out.println("Tu saldo es insuficiente");
                            apuesta=0;
                            menu=3;
                        }
                        break;
                    
                    case 2:
                        System.out.println("Selecciona aguila=0 o cruz=1");
                        cara=leer.nextInt();
                        moneda.lanzar();
                        moneda.mostrarCara();
                        if(cara==moneda.getCara()){
                            System.out.println("Felicidades, has ganado!");
                            cartera.sumarSaldo(apuesta);
                        }else{
                            System.out.println("Suerte para la proxima T_T");
                            cartera.restarSaldo(apuesta);
                        }
                        cartera.mostarSaldo();
                        break;
                        
                    default:
                        menu=3;
                        break;
                }
            }
            
            

    }
}
