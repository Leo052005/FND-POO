/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_6_exception;

import java.util.Scanner;

/**
 *
 * @author leo
 */
public class EVA3_6_EXCEPTION {

    public static void main(String[] args) {
         try{
        Scanner captu = new Scanner(System.in);
        System.out.println("Valor del numerador:");
        int nume = captu.nextInt();
        System.out.println("Valor del divisor:");
        int div = captu.nextInt();
        int resu = nume / div;
        System.out.println("El resultado es: " + resu);
        }catch(Exception e){
        e.printStackTrace();
        }
        System.out.println("FIN DEL PROGRAMA");
        }
    }

