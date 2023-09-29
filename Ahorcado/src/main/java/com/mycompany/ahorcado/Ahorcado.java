package com.mycompany.ahorcado;

import java.util.Scanner;

public class Ahorcado {

    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        Palabra palabra = new Palabra();
        String letra;
        int menu=0;
        
        palabra.imprimirPalabra();
        
        while(menu<3){
            
            System.out.println("1. Insertar una letra");
            System.out.println("2. Cambiar palabra");
            System.out.println("3. Salir");
            menu=leer.nextInt();
            
                switch(menu){
                    
                    case 1:
                        System.out.println("Inserta una letra:");
                        letra=leer.next();
                        palabra.verificarPalabra(letra.charAt(0));
                        palabra.imprimirPalabra();
                        break;
                     
                    case 2: 
                        System.out.println("Cambiar palabra");
                        palabra.cambiarPalabra();
                        break;
                        
                    case 3:
                        menu=3;
                        break;
                        
                    default:
                        menu=3;
                        break;       
                }
        }    
    }
}
