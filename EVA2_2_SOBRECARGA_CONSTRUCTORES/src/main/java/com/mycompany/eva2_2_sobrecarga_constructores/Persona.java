/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_2_sobrecarga_constructores;

/**
 *
 * @author leo
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    
    public Persona(){
        nombre = "SIN NOMBRE";
        apellido = "SIN APELLIDO";
        edad = 0;
    }
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    // metodos get y set
    
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String valor){
        nombre = valor;
    }
    public String getapellido(){
        return apellido;
    }
    public void setapellido(String valor){
        apellido = valor;
    }
    public int getedad(){
        return edad;
    }
    public void setedad(String valor){
        nombre = valor;
    }
    
    public void imprimirDatos(){
        System.out.println("nombre: " + nombre);
        System.out.println("apellido: " + apellido);
        System.out.println("edad: " + edad);
    }
}
