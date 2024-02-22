/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_triangulo;

/**
 *
 * @author leo
 */
public class TRIANGULO_1 { //TRIANGULO RECTANGULO 
    private double base;
    private double altura;
    
    public TRIANGULO_1(){
        base = 0;
        altura = 0;    
    }
    
    public double getbase(){
        return base;
    }
    public void setbase(double valor){
        base = valor;
    }
    public double getaltura(){
        return altura;
    }
    public void setaltura(double valor){
        altura = valor;
    }
    
    private double calcularArea(){
        return (base * altura) / 2;
        
    }
     private double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
       
    }

    private double calcularPerimietro(){
        double hipotenusa = calcularHipotenusa();
        return base + altura + hipotenusa;
    }
    
    
    public void imprimirDatos(){
        System.out.println("El area es: " + calcularArea() );
        System.out.println("El perimetro es: " + calcularPerimietro());
    }
}
