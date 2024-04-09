/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_6_clases_abtractas;

/**
 *
 * @author leo
 */
public class Circulo extends Figura{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularAreas() {
        return Math.pow(radio, 2)* Math.PI;
    }

    @Override
    public double calcularPeri() {
        return (radio * 2)*Math.PI;
        
    }
    
    
}
