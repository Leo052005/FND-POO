/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_4_try_cath;

/**
 *
 * @author leo
 */
public class EVA3_4_TRY_CATH {

    public static void main(String[] args) {
        //unchecked ----> es mejor no usa una excepcion
        int x = 10, y = 0;
        int resu = 0;
        
        try {//codigo que ouede generar una excepcion
            resu = x / y;
        }catch(ArithmeticException e){ //codigo que atiende la execpcion
            System.out.println("Ups!! Fallo el programa!! :´( pipipipipipipipi me van a matar causa pipipipipipi ");
            e.printStackTrace();
        }
        System.out.println("Resultado de x / y = " + resu);
        
    }
}
