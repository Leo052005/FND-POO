/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_9_final;

/**
 *
 * @author leo
 */
public final class Computo extends Electronica {
    private String ram;
    private String hd;
    private String procesador;

    public Computo() {
        this.ram = "-------";
        this.hd = "---------------";
        this.procesador = "---------------";
    }

    public Computo(String ram, String hd, String procesador) {
        this.ram = ram;
        this.hd = hd;
        this.procesador = procesador;
    }

    public Computo(String ram, String hd, String procesador, String marca, boolean garantia, String nombre, double precio) {
        super(marca, garantia, nombre, precio);
        this.ram = ram;
        this.hd = hd;
        this.procesador = procesador;
    }

    public Computo(String ram, String hd, String procesador, String marca, boolean garantia) {
        super(marca, garantia);
        this.ram = ram;
        this.hd = hd;
        this.procesador = procesador;
    }

    public String getRam() {
        return ram;
    }

    public String getHd() {
        return hd;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    @Override
      public String toString(){
          String cade = super.toString() + "\n";
          cade += "RAM: " + ram + "\n" +
           "HD: " + hd + "\n" +
            "Procesador: " + procesador;
          return cade;
      }  
}
