/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_7_uso_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author leo
 */
public class EVA3_7_USO_EXCEPTION {

    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean error = true;

        do {
            try {
                System.out.println("Por favor, ingresa un número entero:");
                numero = scanner.nextInt();
                error = false; // Si llegamos aquí, no hubo error
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        } while (error);

        System.out.println("El número ingresado es: " + numero);
        scanner.close();
    }   
}
