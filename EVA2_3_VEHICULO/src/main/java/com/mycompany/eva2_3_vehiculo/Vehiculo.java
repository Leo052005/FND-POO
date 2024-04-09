/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_3_vehiculo;

/**
 *
 * @author leo
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private String color;
    
    public Vehiculo(){
        marca = "toyota";
        modelo = "supra";
        año = 1999;
        color = "blanco";
        
    }
    public Vehiculo(String marca, String modelo, int año, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
                
    }
   // metodos get y set
     public String getamarca(){
        return marca;
    }
    public void setmarca(String valor){
        marca = valor;
    }
    public String getmodelo(){
        return modelo;
    }
    public void setmodelo(String valor){
        modelo = valor;
    }
    public int getaño(){
        return año;
    }
    public void setaño(int valor){
        año = valor;
    }
    public String getcolor(){
        return color;  
    }
    public void setcolor(String valor){
        color = valor;
    }
    public void imiprimirDatos(){
        System.out.println("MARCA:  " + marca);
        System.out.println("MODELO: " + modelo);
        System.out.println("AÑO: " + año);
        System.out.println("COLOR: " + color);
    }
}
