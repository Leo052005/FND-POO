/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_12_polimorfismo;

/**
 *
 * @author leo
 */
public class EVA2_12_POLIMORFISMO {

    public static void main(String[] args) {
       Estudiante estudiante = new Estudiante("1110", "leo", "agu");
        System.out.println(estudiante);
        Persona persona = estudiante;//polimorfismo
        System.out.println(persona.getNombre());
        System.out.println(persona.getApellidos());
         
        
       
    }
}
class Persona{
    private String nombre;
    private String apellidos;

    public Persona() {
        this.nombre = "sin nombre";
        this.apellidos = "sin apellido";
    }

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos;
    }
    
}
class Estudiante extends Persona{
    private String NoControl;

    public Estudiante() {
        this.NoControl = "sin numero de contron";
    }

    public Estudiante(String NoControl) {
        this.NoControl = NoControl;
    }

    public Estudiante(String NoControl, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.NoControl = NoControl;
    }

    public String getNoControl() {
        return NoControl;
    }

    public void setNoControl(String NoControl) {
        this.NoControl = NoControl;
    }
    
    @Override
     public String toString() {
        return super.toString() + " " + NoControl;
    }
}