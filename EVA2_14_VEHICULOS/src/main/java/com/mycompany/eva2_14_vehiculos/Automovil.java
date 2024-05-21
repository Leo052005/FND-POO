/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_14_vehiculos;

/**
 *
 * @author leo
 */
public class Automovil extends Vehiculos {
   private int puertas;

    public Automovil() {
         super();
        this.puertas = 0;
    }

    public Automovil(int puertas) {
        this.puertas = puertas;
    }

    public Automovil(int puertas, int velocidad) {
        super(velocidad);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
   

  
   
   
}
