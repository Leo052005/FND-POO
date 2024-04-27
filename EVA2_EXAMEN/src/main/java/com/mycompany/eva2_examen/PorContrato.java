/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_examen;

/**
 *
 * @author leo
 */
public class PorContrato extends Empleados {
    private int salarioMensual1;

    public PorContrato() {
        super();
        this.salarioMensual1 = 0;
    }

    public PorContrato(int salarioMensual1) {
        this.salarioMensual1 = salarioMensual1;
    }

    public PorContrato(int salarioMensual1, int nombre, int salarioBase) {
        super(nombre, salarioBase);
        this.salarioMensual1 = salarioMensual1;
    }

    public int getSalarioMensual1() {
        return salarioMensual1;
    }

    public void setSalarioMensual1(int salarioMensual1) {
        this.salarioMensual1 = salarioMensual1;
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

    public int toint(){
        return salarioMensual1;
    }
    public void MostarSalarioMensual(){
        System.out.println("tu salario mensual es: " + salarioMensual1);
    }
}
