package com.mycompany.ejercicios;

import java.text.DecimalFormat;

public class Calculos {
    
    float mon1=0, conversion=0;
    float monedaconver=0;
    String TipoMoneda="";
    String monAmon="";
    
    
    // EJERCICIO 1
    public int elMayor(int num1, int num2){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }
    
    // EJERCICIO 2
    public int elMenor(int num1, int num2, int num3){
        if (num1 < num2 && num1 < num3){
            return num1;
        }else if(num2<num3){
            return num2;
        }else{
            return num3;
        }
    }
    
    // EJERCICIO 3
    
        public int NumerosPares(int num1){
            int numPares=0;
            
            for (int i=2;i<=num1;i++){
                if(i%2==0){
                    numPares++;
                }
            }
            return numPares;
        }
        
        
    // EJERCICIO 4
        
        public int SumaNumeros(int num1){
            int suma=0;
            
            for (int i=1; i<=num1;i++){
                suma+=i;
            }
            return suma;
        }
        
    // EJERCICIO 5
        
        public int NumerosImpares(int num1, int num2){
            int cantImpares=0;
            
            for (int i=num1;i<=num2;i++){
                if(i%2 != 0){
                    cantImpares++;
                }
            }
            return cantImpares;
        }
    

    
    // EJERCICIO 6
    public void setPesoaDolar(int a){
        monedaconver=17.08f;
        this.mon1=a;
        this.conversion=(int)mon1/monedaconver;
        TipoMoneda="dolares";
        monAmon=" pesos a dolares ";
    }
    public void imprimir(){
        DecimalFormat formato1 = new DecimalFormat("#.00");
        System.out.println("La conversion de" + monAmon + " es de: " + formato1.format(conversion) + " " + TipoMoneda);
    }          
}


