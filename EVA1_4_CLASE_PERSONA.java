/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_4_clase_persona;

/**
 *
 * @author leo
 */
public class EVA1_4_CLASE_PERSONA {

    public static void main(String[] args) {
        Persona perso = new Persona();
        perso.setnombre("leo");
        perso.setapellido("Aguilar");
        perso.setedad(18);
        System.out.println("nombre " + perso.getnombre());
        System.out.println("Apellido " + perso.getapellido());
        System.out.println("edad " + perso.getedad());
    }
}
class Persona{
    //ATRIBUTOS: Deven ser privados(por diseño)
        private String nombre;
        private String apellido;
        private int edad;
        
    //METODOS: debe haber metodos publicos (interfaz)
    //que nos permitira manipular los atributos
    //JAVA----> estos metodos son los metodos get y set
    //Metodo get ---> nos permite recuperar un valor (lectura)
    //Metodo set---> nos permite asignar un valor (escritura)
        public String getnombre(){
            return nombre;
        }
        public void setnombre(String valor){
            nombre = valor;
        }
        public String getapellido(){
            return apellido;
        }
        public void setapellido(String valor){
            apellido = valor;
        }
        public int getedad(){
            return edad;
        }
        public void setedad(int valor){
            edad = valor;
        }
}