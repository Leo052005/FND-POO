/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_9_throw;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leo
 */
public class EVA3_9_THROW {

    public static void main(String[] args) {  
        try {//Aqui estamos en un punto en el codigo
            //donde yo no podemos pasar la bolita al siguiente
            metodoproblematico();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
     public static void metodoproblematico() throws Exception{
         System.out.println("metodo problematico");
         throw new Exception("me van a matar causa pipipipipipipipi");
         //System.out.println("muchos prblemas");
         
     }
}
