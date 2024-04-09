/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_11_has_a;

/**
 *
 * @author leo
 */
public class EVA2_11_HAS_A {

    public static void main(String[] args) {
        Dirreccion direc = new Dirreccion("arcos", "18500", "real", "13453", "chihua", "chihua");
        Persona perso = new Persona("leo", "aguilar", 19, direc);
        System.out.println(perso.toString());
    }
}
