/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_13_polimorfismo_2;

/**
 *
 * @author leo
 */
public class Estudiante extends Persona {
     private String NoControl;

    public Estudiante() {
        this.NoControl = "sin numero de contron";
    }

    public Estudiante(String NoControl) {
        this.NoControl = NoControl;
    }

    public Estudiante(String NoControl, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.NoControl = NoControl;
    }

    public String getNoControl() {
        return NoControl;
    }

    public void setNoControl(String NoControl) {
        this.NoControl = NoControl;
    }
    
    @Override
     public String toString() {
        return super.toString() + " " + NoControl;
    }

     @Override
    public void imprimirDatos(){
    super.imprimirDatos();
    System.out.println("No de control: " + NoControl);

}
    
}
