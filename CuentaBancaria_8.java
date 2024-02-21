/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_8_cosntructores;

/**
 *
 * @author leo
 */
public class CuentaBancaria {
    private double saldo;
    private int noCuenta;
    private String noCliente;
    
    public CuentaBancaria(){
        noCuenta = 0;
        noCliente = "SIN CLIENTE";
        saldo = 1000000;
    }
    //RETIRAR
    public void retirar(double monto){
        //SI monto esta en tu saldo
        if(monto <= saldo)
            saldo = saldo - monto;
    }
    //DEPOSITAR
    public void depositar(double monto){
        saldo = saldo + monto;
    }
    //get y set para nombre de cliente y no de cuenta
    public void setnoCliente(String cliente){
        noCliente = cliente;
    }
    public String getnoCliente(){
        return noCliente;
    }
    public void setnoCuenta(int cuenta){
        noCuenta = cuenta;
    }
    public int getnoCuenta(){
        return noCuenta;
    }
    public void imprimirDatosCuenta(){
        System.out.println("El cliente es: " + noCliente);
        System.out.println("El numero de cuenta es: " + noCuenta);
        System.out.println("El saldo es: " + saldo);
    }
}
