/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_13_polimorfismo_2;

/**
 *
 * @author leo
 */
public class EVA2_13_POLIMORFISMO_2 {

    public static void main(String[] args) {
       Persona perso1 = new Persona("leo","agu");
       Persona perso2 = new Persona("eze","lla");
       Persona perso3 = new Persona("ezeleo","agulla");
       
       Estudiante estu1 = new Estudiante("12321");
       Estudiante estu2 = new Estudiante("43211");
       Estudiante estu3 = new Estudiante("98976");
       
       imprimirDatos(perso1);
       imprimirDatos(perso2);
       imprimirDatos(perso3);
       imprimirDatos(estu1);
       imprimirDatos(estu2);
       imprimirDatos(estu3);
       
       
       
       
    }
    public static void imprimirDatos(MostarDatos datos){
        datos.imprimirDatos();
    
    }
}
