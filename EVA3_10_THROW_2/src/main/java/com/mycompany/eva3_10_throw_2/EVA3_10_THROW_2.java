/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_10_throw_2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leo
 */
public class EVA3_10_THROW_2 {

    public static void main(String[] args) {
        try {
            /*try {
            Persona perso = new Persona("leo", "agui lla", -18);
            } catch (Exception ex) {
            ex.printStackTrace();
            
            }*/
            Persona perso = new Persona();
            perso.setNombre("leo");
            perso.setApellido("aguilar");
            perso.setEdad(19);
            System.out.println("FIN DEL PRGRAMA");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
}
class Persona{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
         this.nombre = "";
        this.apellido = "";
        this.edad = 0;
    }

    public Persona(String nombre, String apellido, int edad) throws Exception {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        if((edad < 0) ||(edad > 120))
            throw new Exception("Edad no validad");
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

    public void setEdad(int edad) throws Exception {
        if((edad < 0) ||(edad > 120))
            throw new Exception("Edad no validad");
        this.edad = edad;
    }
    
    
}
        