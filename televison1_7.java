/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_7_television1;

/**
 *
 * @author leo
 */
class televison {
   private int volumen;
   private int canal;
   private boolean estaEnsendida;
   
   //NO HAY METODO GET Y SET
   
   public void subirVolumen(){
       if(estaEnsendida)
       volumen += 1;
   }
   public void bajarVolumen(){
       if(estaEnsendida && volumen >0)
       volumen -= 1;
   }
   public void subirCanal(){
       if(estaEnsendida)
       canal += 1;
   }
   public void bajarCanal(){
       if(estaEnsendida && canal >0)
       canal -= 1;
   }
   public void cambiarCanal (int noCanal){
       if(estaEnsendida)
       canal = noCanal;
   }
   public void power(){
       /*if(estaEnsendida == true)
           estaEnsendida = false;
       else
           estaEnsendida = true;*/
       //NEGACION: cambiar el volor booleano por su contrario (negativo)
       estaEnsendida = !estaEnsendida;
   }
   public void imprimirconfiguracion(){
       System.out.println("Volumen; " + volumen);
       System.out.println("Canal: " + canal);
       System.out.println("Ensendido: " + estaEnsendida);
   }
    
}
