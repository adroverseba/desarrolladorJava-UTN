/*
 */
package com.mycompany.clase07;

import com.mycompany.excepciones.DescuentoInvalido;

public abstract class Descuento {

    private String nombreDescuento;
    private double cantidadDescuento;

    public Descuento(String nombreDescuento, double cantidadDescuento) {
        this.nombreDescuento = nombreDescuento;
        this.cantidadDescuento = cantidadDescuento;
    }

    abstract public double aplicarDescuento(Carrito carrito)throws DescuentoInvalido;

    //getters y setters
    public String getNombreDescuento() {
        return nombreDescuento;
    }

    public double getCantidadDescuento() {
        return cantidadDescuento;
    }

    public void setNombreDescuento(String nombreDescuento) {
        this.nombreDescuento = nombreDescuento;
    }

    public void setCantidadDescuento(double cantidadDescuento) {
        this.cantidadDescuento = cantidadDescuento;
    }
    
    
}
