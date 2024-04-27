/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_examen;

import java.awt.BorderLayout;

/**
 *
 * @author leo
 */
public class TiempoCompleto extends Empleados {
    private int salarioMensual;

    public TiempoCompleto() {
        super();
        this.salarioMensual = 0;
    }
   
    public TiempoCompleto(int salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public TiempoCompleto(int salarioMensual, int nombre, int salarioBase) {
        super(nombre, salarioBase);
        this.salarioMensual = salarioMensual;
    }

    public int getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(int salarioMensual) {
        this.salarioMensual = salarioMensual;
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
        System.out.println("Tu salario mensual es: " + salarioMensual);
    }
    public int toint(){
     return salarioMensual;   
    }
    public void MostarSalarioAnual(){
        System.out.println("tu salario anual es: " + salarioMensual);
    }
}
