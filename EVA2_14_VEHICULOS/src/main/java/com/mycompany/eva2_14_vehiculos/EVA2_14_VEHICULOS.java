/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_14_vehiculos;

/**
 *
 * @author leo
 */
public class EVA2_14_VEHICULOS {

    public static void main(String[] args) {
        Vehiculos flota[] = new Vehiculos[7];
        flota[0] = new Automovil (2,10);
        flota[1] = new Automovil (2,30);
        flota[2] = new Automovil (5,90);
        flota[2] = new Automovil (2,100);
        
        Automovil auto = (Automovil)flota[0];
        System.out.println("Numero de puertas del auto: " + auto.getPuertas());
        Motocicleta moto = (Motocicleta)flota[3];
        System.out.println("Capacidad (cc) de la motocilceta: " + moto.getCapacidad());
        
        if(flota[2] instanceof Automovil)
            auto = (Automovil)flota[2];
        System.out.println("Numero de puertas de auto: " + auto.getPuertas());
        
        acelerar(auto,10);
        System.out.println("Velocidad del auto: " + auto.getVelocidad());
        acelerar(auto, 10);
        System.out.println("Velocidad del auto: " + auto.getVelocidad());
        acelerar(moto, 30);
        System.out.println("velocidad de moto: " + moto.getVelocidad());
        acelerar(flota[1], 100);
        System.out.println("Velocidad de flota[1]: " + moto.getVelocidad());
        
        
           
    }
   
    public static void acelerar(Vehiculos Vehiculos, int ajuste){
        Vehiculos.acelerar(ajuste);
     
    
    }
   
   
}
