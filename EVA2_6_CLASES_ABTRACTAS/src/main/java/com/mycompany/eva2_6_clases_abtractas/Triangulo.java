/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_6_clases_abtractas;

/**
 *
 * @author leo
 */
public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {
        this.base = 0;
        this.altura = 0;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    

    @Override
    public double calcularAreas() {
        return (base * altura) / 2;
        
    }
    private double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
       
    }

    @Override
    public double calcularPeri() {
        return base * altura + calcularHipotenusa();
    }
    
}
