/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_13_polimorfismo_2;

/**
 *
 * @author leo
 * 
 */
            //persona extends MostrarDatos <--- para el polimorfismo 
public class Persona implements MostarDatos {
    
    private String nombre;
    private String apellidos;

    public Persona() {
        this.nombre = "sin nombre";
        this.apellidos = "sin apellido";
    }

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos;
    }

    @Override
    public void imprimirDatos() {
        
    }
    
}
  

