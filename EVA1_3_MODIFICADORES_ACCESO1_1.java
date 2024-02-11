/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_3_modificadores_acceso1_1;

import EZE_LEONARDO.ClasePrueba_2;

/**
 *
 * @author leo
 */
public class EVA1_3_MODIFICADORES_ACCESO1_1 {

    public static void main(String[] args) {
        //instanicacion de un objeto de la clase prueba.
        //la instanciacion se llama objprueba
        Prueba objPrueba = new Prueba();
        objPrueba.x = 0; //visible (protected) mismo paquete 
        objPrueba.y = 0; //visible (public) siempre visible
        objPrueba.z = 0; //visible (default) mismo paquete
        
        //ClsePrueba2 ESTA EN OTRO PAQUETE, diferente al 
        // de la misma clase EVA1_3_MODIFICADORES_ACCESO1_1
       ClasePrueba_2 objClasePrueba_2 = new ClasePrueba_2();
       objClasePrueba_2.y = 0; //VISIBLE (public) siempre visible
        
    }
}
//ES DEFAULT
class Prueba{
    private int w;
    protected int x;
    public int y;
    int z;//DEFAULT
}
