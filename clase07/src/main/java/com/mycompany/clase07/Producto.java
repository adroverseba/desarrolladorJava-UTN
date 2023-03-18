/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase07;

import java.time.LocalDate;


public class Producto {

    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private final LocalDate fechaAlta;

    //constructor 1
    public Producto(String nombre,String descripcion,double precio,int stock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio=precio;
        this.stock=stock;
        this.fechaAlta= LocalDate.now();
    }
    
    //Constructor 2. Con valor por defecto de stock = 10
    public Producto(String nombre,String descripcion,double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio=precio;
        this.stock=10;
        this.fechaAlta= LocalDate.now();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }
    
    //metodo para reducir el stock de productos una vez realizada la compra
    public void reducirStock(int cantidad){
        if( cantidad > stock) throw new IllegalArgumentException("No hay suficiente STOCK disponible.");
        stock -= cantidad;
    }
    
}