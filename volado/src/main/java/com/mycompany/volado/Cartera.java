package com.mycompany.volado;


public class Cartera {
    
    private int saldo;
    
    public Cartera(){
        this.saldo=1000;
    }
    
    public void mostarSaldo(){
        System.out.println("Saldo de la cartera: $"+this.saldo);
    }
    
    public void sumarSaldo(int valor){
        this.saldo+=valor;
    }
    
    public void restarSaldo(int valor){
        this.saldo-=valor;
    }
    
    public void setSaldo(int valor){
        this.saldo=valor;
    }
    
    public int getSaldo(){
        return this.saldo;
    }
    
    
}
