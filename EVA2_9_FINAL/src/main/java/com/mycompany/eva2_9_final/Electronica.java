/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_9_final;

/**
 *
 * @author leo
 */
public class Electronica extends Producto {
    private String marca;
    private boolean garantia;

    public Electronica() {
         this.marca = "----------------------";
        this.garantia = true;
    }

    public Electronica(String marca, boolean garantia, String nombre, double precio) {
        super(nombre, precio);
        this.marca = marca;
        this.garantia = garantia;
    }

    public Electronica(String marca, boolean garantia) {
        this.marca = marca;
        this.garantia = garantia;
    }

    public String getMarca() {
        return marca;
    }

    public boolean isGarantia() {
        return garantia;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }
    @Override
    public String toString(){
        String cade = super.toString() + "\n";
        cade += "marca: " + marca + "\n" +
                "Garantia: " + garantia;
        return cade;
    }
    
}
