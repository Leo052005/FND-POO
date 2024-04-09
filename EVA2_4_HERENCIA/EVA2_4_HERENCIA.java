/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_herencia;

/**
 *
 * @author leo
 */
public class EVA2_4_HERENCIA {
   

    public static void main(String[] args) {
        
        persona perso = new persona();
        //TODAS LAS CLASES EN JAVA DECIENDEN DE LA CLASE objeto
        System.out.println(perso.toString());
        //el metodo toSring() no es implementado por nosotros, viene
        // por herencia 
        Estudiante estu = new Estudiante();
        System.out.println("NOMBRE: " + estu.getNombre());
        System.out.println("APELLIDO: " + estu.getApellido());
        System.out.println("EDAD: " + estu.getEdad());
        System.out.println("NO. CONTRONL: " + estu.getNoControl());
    }
}
//CLASE PADRE 
class persona{
    private String nombre;
    private String apellido;
    private int edad;
    
    public persona(){
        this.nombre = "SIN NOMBRE";
        this.apellido = "SIN apellido";
        this.edad = 0;
    }

    public persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    

    public persona(String nombre) {
        this.nombre = nombre;
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

    public int getEdad() {
        return edad;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}//CLASE HIJO 
class Estudiante extends persona {
        private String noControl;

        public Estudiante() {
            noControl = "18";
        }

        public Estudiante(String noControl) {
            this.noControl = noControl;
        }

        public String getNoControl() {
            return noControl;
        }

        public void setNoControl(String noControl) {
            this.noControl = noControl;
        }
        
    }
