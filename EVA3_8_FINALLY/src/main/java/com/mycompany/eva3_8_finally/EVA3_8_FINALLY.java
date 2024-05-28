/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author leo
 */
public class EVA3_8_FINALLY {

    public static void main(String[] args) {
        try{
       Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese un valor:");
      int nume = scanner.nextInt();
        System.out.println("el valor capturado es: " + nume);
        }catch(InputMismatchException e){
            e.printStackTrace();   
    }finally{
            System.out.println("esta esepcion siempre se ejecuta");
        }   
        System.out.println("Fin.");
    }
}
