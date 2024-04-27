/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_examen;

/**
 *
 * @author leo
 */
public class PorHoras extends Empleados {
    private int salarioPorHora;

    public PorHoras() {
        super();
        this.salarioPorHora = 0;
    }

    public PorHoras(int salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public PorHoras(int salarioPorHora, int nombre, int salarioBase) {
        super(nombre, salarioBase);
        this.salarioPorHora = salarioPorHora;
    }

    public int getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(int salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    @Override
    public int getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getSalarioBase() {
        return salarioBase;
    }

    @Override
    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }
     public void calcularSalarioAnual(){
         System.out.println("Tu salario por hora es: " + salarioPorHora);   
    }
     public int toint(){
         return salarioPorHora;
     }
     public void MostarSalarioAnual(){
         System.out.println("tu salario anual es: " + salarioPorHora);
     }
    
    
}
