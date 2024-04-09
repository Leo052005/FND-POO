/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_11_has_a;

/**
 *
 * @author leo
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
 
    private Dirreccion direc;//atributo --> es un objeto 

    public Persona() {
         this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.direc = null;
    }

    public Persona(String nombre, String apellido, int edad, Dirreccion direc) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direc = direc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Dirreccion getDirec() {
        return direc;
    }

    public void setDirec(Dirreccion direc) {
        this.direc = direc;
    }
    @Override
    public String toString(){
        String cade;
        cade = "nombre: " + nombre + "\n"+
                "Apellido: " + apellido + "\n"+
                "edad: " + edad + "\n" +
                "Direccion: " + direc;
                
        return cade;
    }
}
