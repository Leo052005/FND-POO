/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_5_super;

/**
 *
 * @author leo
 */
public class Persona {
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private int edad;
    private char genero;

    public Persona() {
        this.nombre = "--------";
        this.apPaterno = "-------";
        this.apMaterno = "------";
        this.edad = 0;
        this.genero = '-';
                
    }

    public Persona(String nombre, String apPaterno, String apMaterno, int edad, char genero) {
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.edad = edad;
        this.genero = genero;
    }
    public void imprimirDatos(){
        System.out.println("nombre: " + nombre);
        System.out.println("apPaterno: " + apPaterno);
        System.out.println("apMaterno: " + apMaterno);
        System.out.println("edad: " + edad );
        System.out.println("genero: " + genero);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public char getGenero() {
        return genero;
    }
    
    }

