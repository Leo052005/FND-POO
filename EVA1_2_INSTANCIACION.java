/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_2_instanciacion;

/**
 *
 * @author leo
 */
public class EVA1_2_INSTANCIACION {

    public static void main(String[] args) {
        Persona Perso1 = new Persona (); // construcotor es un metodo que se llama igual que la clase
        System.out.println("perso1");
        //EL operador "." sirve para tasladar a la direccion de memoria y accerder al contenido del objeto
        Perso1.nombre = "juan";
        Perso1.apellido = "perez";
        Perso1.edad = 50;
        
        
    }
}
class Persona{
    String nombre;
    String apellido;
    int edad;

}