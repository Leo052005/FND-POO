/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_5_super;

/**
 *
 * @author leo
 */             //hijo            DE    padre
                // subclase      DE     hijo
public class Estudiantes  extends Persona{
    private String noControl;
    private String carrera;
//La LLAMADA AL CONSTRUCTOR DE LA SUPER CLASE ES OBLIGATORIO
//SIEMPRE DEBE SER LA PRIMERA INSTRUCCION.
    public Estudiantes() {
        super();
        this.noControl = "------";
        this.carrera = "-------";
    }

    public Estudiantes(String noControl, String carrera) {
        this.noControl = noControl;
        this.carrera = carrera;
    }

    public Estudiantes(String nombre, String apPaterno, String apMaterno, int edad, char genero,String noControl, String carrera) {
        super(nombre, apPaterno, apMaterno, edad, genero);
        this.noControl = noControl;
        this.carrera = carrera;
    }

    public String getNoControl() {
        return noControl;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("No.control: " + noControl);
        System.out.println("Carrera: " + carrera);
    }
    
}
