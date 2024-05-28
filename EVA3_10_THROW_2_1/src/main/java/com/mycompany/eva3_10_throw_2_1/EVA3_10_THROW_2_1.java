/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_10_throw_2_1;

import java.util.Scanner;

/**
 *
 * @author leo
 */
public class EVA3_10_THROW_2_1 {

    public static void main(String[] args) {
       /*try{
        Persona perso = new Persona("leo","agui",-1 );
       }catch(RuntimeException ex){
           ex.printStackTrace();
           
       }*/
       Scanner scanner = new Scanner(System.in);

       
                System.out.print("Ingrese el nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese el apellido: ");
                String apellido = scanner.nextLine();
        do {
            try {
               
                System.out.print("Ingrese la edad: ");
                int edad = Integer.parseInt(scanner.nextLine());

                Persona persona = new Persona(nombre, apellido, edad);
                System.out.println("Persona creada exitosamente:");
                System.out.println("Nombre: " + persona.getNombre());
                System.out.println("Apellido: " + persona.getApellido());
                System.out.println("Edad: " + persona.getEdad());
                break; // Si llega aquí sin lanzar una excepción, sale del bucle do-while
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número para la edad.");
            } catch (RuntimeException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (true);
       
        System.out.println("FIN DEL PROGRAMA");
       
    }
}
class Persona{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
         this.nombre = "";
        this.apellido = "";
        this.edad = 0;
    }

    public Persona(String nombre, String apellido, int edad)  {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        if((edad < 0) ||(edad > 120))
            throw new RuntimeException("Edad no validad");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad)  {
        if((edad < 0) ||(edad > 120))
            throw new RuntimeException("Edad no validad");
        this.edad = edad;
    }
    
    
}