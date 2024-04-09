/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_11_has_a;

/**
 *
 * @author leo
 */
public class Dirreccion {
    private String calle;
    private String numero;
    private String colonia;
    private String cp;
    private String ciudad;
    private String estado;

    public Dirreccion() {
         this.calle = "";
        this.numero = "";
        this.colonia = "";
        this.cp = "";
        this.ciudad = "";
        this.estado = "";
    }

    public Dirreccion(String calle, String numero, String colonia, String cp, String ciudad, String estado) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @Override
   public String toString(){
    String cade = "calle: " + calle + "\n" + "numero: " + numero + "\n" +
            "colonia: " + colonia + " C.P. " + cp + "\n" +
            "ciudad: " + ciudad + " Estado " + estado;
    return cade;
}
    
}
