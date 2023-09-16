
package com.mycompany.ejerciciorecursividad;

public class Operaciones {
    
    //EJERCICIO 1 - FACTORIAL
    public int factorial (int num){
        if(num==0){
            return 1;
        }else{
            return num*factorial(num-1);
        }
    }
    
    // EJERCICIO 2 - SUMA DE NUMEROS NATURALES
    
    public int sumaNaturales(int num){
        if(num==1){
            return 1;
        }else{
            return num + sumaNaturales(num-1);
        }
    }

// EJERCICIO 3 - CALCULADORA ARITMETICA

    public double Suma(double num1, double num2){
        return num1+num2;
    }

    public double Resta(double num1, double num2){
        return num1-num2;
    }

    public double Multiplicacion(double num1, double num2){
        return num1*num2;
    }

    public double Division(double num1, double num2){
        if(num2==0){
            System.out.println("No se puede dividir entre cero");
        }
        return num1/num2;
    }
    
    
    

}
