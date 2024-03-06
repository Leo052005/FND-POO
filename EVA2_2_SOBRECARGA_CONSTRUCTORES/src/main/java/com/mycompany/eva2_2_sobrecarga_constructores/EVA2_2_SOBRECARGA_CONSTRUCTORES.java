/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2_sobrecarga_constructores;

/**
 *
 * @author leo
 */
public class EVA2_2_SOBRECARGA_CONSTRUCTORES {

    public static void main(String[] args) {
       Persona perso1 = new Persona();
       perso1.imprimirDatos();
       Persona perso2 = new Persona("leo", "aguilar",70);
       perso2.imprimirDatos();
    }
}
