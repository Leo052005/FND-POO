/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_8_cosntructores;

/**
 *
 * @author leo
 */
public class EVA1_8_COSNTRUCTORES {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setnoCliente("leonardo");
        cuenta.setnoCuenta(23550357);
        cuenta.depositar(20000);
        cuenta.imprimirDatosCuenta();
    }
}