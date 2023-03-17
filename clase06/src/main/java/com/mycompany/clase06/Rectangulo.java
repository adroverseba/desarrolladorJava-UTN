/*
*/
package com.mycompany.clase06;

public class Rectangulo {
    public double ancho;
    public double largo;
    public String color;
    public boolean activo;
    
    //constructores
    public Rectangulo() {
    }

    public Rectangulo(double ancho, double largo) {
        this.ancho = ancho;
        this.largo = largo;
        this.color = "rojo";
        this.activo = true;
    }

    //getters y setters
    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public String getColor() {
        return color;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    
}
