package com.mycompany.ahorcado;

import java.util.Random;

public class Palabra {
    
    private String[] palabrasx={"Auto","Windows","Linux","Perro","Gato","Casa"};
    Random rnd= new Random();
    private String palabras=palabrasx[rnd.nextInt(palabrasx.length)];
    private char[] palabra=new char[this.palabras.length()];  
    private char[] palabraAux=new char[this.palabras.length()];  
    private int errores=0;

    
    
    public Palabra(){
        
        for (int i=0; i<palabra.length;i++){
            this.palabra[i]='*';
            this.palabraAux[i]=this.palabras.charAt(i);
        }
    }
    
    public String getPalabras(){
        return this.palabras;
    }
    
    public void setPalabras(String palabra){
        this.palabras=palabra;
    }
    
    public void cambiarPalabra(){
        palabras=palabrasx[rnd.nextInt(palabrasx.length)];
        this.errores=0;
        
    }
    
    public void verificarPalabra(char letra){
        int correcto=0;
        for (int i=0; i<this.palabras.length();i++){
            if(this.palabraAux[i]==letra){
                this.palabra[i]=letra;
                correcto++;
            }
        }
        if(correcto==0){
            this.errores++;
        }
        
    }
    
    public void imprimirPalabra(){
            String p="";
        for (int i=0; i<this.palabra.length;i++){
            p+="_"+palabra[i];
        }
        System.out.println(p);
        this.imprimirAhorcado();
    }
    
    public void imprimirAhorcado(){
        switch(this.errores){
            
            case 0:
                System.out.println("TIENES 3 INTENTOS");
                System.out.println("ERRORES: " + this.errores);
                break;
                
            case 1:
                System.out.println("TE QUEDAN 2 INTENTOS");
                System.out.println(" (T_T) ");
                break;
            
            case 2: 
                System.out.println("TE QUEDA 1 INTENTO");
                System.out.println(" (T_T) ");
                System.out.println("//| |\\\\ ");
                break;
            
            case 3:
                System.out.println("AHORCADO");
                System.out.println(" (T_T) ");
                System.out.println("//| |\\\\");
                System.out.println("  | |");
                System.out.println(" // \\\\");
                break;
               
            default:
                System.out.println("AHORCADO");
                System.out.println(" (T_T) ");
                System.out.println("//| |\\\\");
                System.out.println("  | |");
                System.out.println(" // \\\\");
                break;
                
                
        }
    }
    
}
