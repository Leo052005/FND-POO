/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_examen;

/**
 *
 * @author leo
 */
public class Empleados {
    int nombre;
    int salarioBase;

    public Empleados() {
    }

    public Empleados(int nombre, int salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }
    public int toint(){
        return nombre + salarioBase;
        
    }
    public void MostarSalarioAnual(){
        System.out.println("tu salario base: " + salarioBase );
    }
    
}
