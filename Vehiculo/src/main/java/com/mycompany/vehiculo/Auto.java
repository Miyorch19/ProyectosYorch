package com.mycompany.vehiculo;


public class Auto {
    
    private String potente = "aaaa";
    private int velocidad = 20;
    private int marcha = 1;
    private int velocidadMaxima = 120;
    private int velocidadMaximaReversa = 60;
    
    public void conocerVelocidad(){
        System.out.println("La velocidad del vehiculo es " + velocidad + " km/h");
    }
    
    public int subirCambio()
    {
        if(marcha >=1 || marcha < 6)
        {
            marcha++;
        }
        return marcha;
    }
    
    public int bajarCambio()
    {
        if(marcha > 1 || marcha <=6)
        {
            marcha--;
        }
        return marcha;
    }
    
    public int reversa()
    {
        marcha = 6;
        return marcha;
    }
    
    public int acelerar()
    {
        if(marcha==-1 && velocidad < velocidadMaximaReversa )
        {
            velocidad++;
        }
        if(velocidad >= 0 && velocidad < velocidadMaxima)
        {
            velocidad++;
        }
        return velocidad;
    }
    
    public int frenar()
    {
        if(velocidad >=1)
        {
            velocidad--;
        }
        return velocidad;
    }
    public String conocerMarcha()
    {
        String mensaje="";
        switch (marcha)
        {
            case -1: mensaje = "vas en reversa"; break;
            case 1: mensaje = "vas en primera"; break;
            case 2: mensaje = "vas en segunda"; break;
            case 3: mensaje = "vas en tercera"; break;
            case 4: mensaje = "vas en cuarta"; break;
            case 5: mensaje = "vas en quinta"; break;
            case 6: mensaje = "vas en sexta"; break;
        }
        return mensaje;
    }
    
}
