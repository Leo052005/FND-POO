/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_1_sobrecarga_metodos;

/**
 *
 * @author leo
 */
public class EVA2_1_SOBRECARGA_METODOS {

    public static void main(String[] args) {
        System.out.println("LA SUMA 5 + 4 = " + sumar(5,4));
        System.out.println("LA SUMA 5 + 4 = " + sumar(5.3,4.1));
        System.out.println("LA SUMA HOLA + MUNDO = " + sumar("HOLA", "MUNODO"));
        System.out.println("HOLA");
        System.out.println("5");
        System.out.println(true);
                
    }
    //sumar: metodos de sobrecarga 
                    //firma nombre de metodos(tipo de dato, tipo de dato)
    public static int sumar(int num1, int num2){
        return num1 + num2;
    }
    public static double sumar(double num1, double num2){
        return num1 + num2;
        
    }
     public static String sumar(String num1, String num2){
        return num1 + num2;
        
    }
    public static void sumar(){
        System.out.println("suma que no hace nada");  
    } 
     
     
     
}