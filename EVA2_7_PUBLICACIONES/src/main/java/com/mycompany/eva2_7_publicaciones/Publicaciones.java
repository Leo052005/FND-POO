/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_7_publicaciones;

/**
 *
 * @author leo
 */
public abstract class Publicaciones {
    private String titulo;
    private double precio;
    private int copias; //inventario existencias

    public Publicaciones() {
        this.titulo = "---------------------------------------------------------";
        this.precio = 0;
        this.copias = 0;
    }

    public Publicaciones(String titulo, double precio, int copias) {
        this.titulo = titulo;
        this.precio = precio;
        this.copias = copias;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCopias() {
        return copias;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }
    
    //manejar el inventario
    public void venderCopias(int cant){
        //verificar que tengamos existencias 
        if(cant <= copias)
            copias -= cant;
        
    }
    public void imprimirDatos(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Precio: " + precio);
        System.out.println("Copias: " + copias);
    }
}
