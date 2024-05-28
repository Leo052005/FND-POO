/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_5_multiples_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author leo
 */
public class EVA3_5_MULTIPLES_CATCH {

    public static void main(String[] args) {
        //inputM
        try{
        Scanner captu = new Scanner(System.in);
        System.out.println("Valor del numerador:");
        int nume = captu.nextInt();
        System.out.println("Valor del divisor:");
        int div = captu.nextInt();
        int resu = nume / div;
        System.out.println("El resultado es: " + resu);
        }catch(InputMismatchException e){
        e.printStackTrace();
        }catch(ArithmeticException e){
            e.printStackTrace();   
    }
        System.out.println("FIN DEL PROGRAMA");
    }
}
