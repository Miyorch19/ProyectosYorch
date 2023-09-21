package com.mycompany.volado;

import java.util.Random;

public class Moneda {
    
    private int cara;
    Random rnd=new Random();
    
    public Moneda(){
        this.cara=0;     
    }
    
    public Moneda(int valor){
        this.cara=valor;
    }
    
    public void mostrarCara(){
        if(this.cara==0){
            System.out.println("AGUILA"); 
        }else{
            System.out.println("SOL");
        }
    }
    
    public void lanzar(){
        this.cara=rnd.nextInt(2);
    }
    
    public int getCara(){
        return this.cara;
    }
    
}
