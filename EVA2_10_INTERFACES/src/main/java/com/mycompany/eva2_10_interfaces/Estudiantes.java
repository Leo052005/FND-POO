/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_10_interfaces;

/**
 *
 * @author leo
 */
public class Estudiantes extends Persona implements Datos, GenerarAño{
    private String noControl;

    public Estudiantes() {
        super();
        this.noControl = noControl;
    }

    public Estudiantes(String noControl) {
        this.noControl = noControl;
    }

    public Estudiantes(String noControl, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    

    @Override
    public void imprimirDatos() {
        System.out.println("Nombree: " + getNombre());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Edad: " + getEdad());
    }

    @Override
    public String generarNombreCom() {
        
        return getNombre() + " " + getApellidos();
        
    }

    @Override
    public int generarañonacimiento() { 
        return 2024 - getEdad();
    } 
    
}
