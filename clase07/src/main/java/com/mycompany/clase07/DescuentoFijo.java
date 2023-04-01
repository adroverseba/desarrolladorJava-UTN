/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase07;

import com.mycompany.excepciones.DescuentoInvalido;

public class DescuentoFijo extends Descuento {

    //metodo contructor
    public DescuentoFijo(String nombreDescuento, double cantidadDescuento) {
        super(nombreDescuento, cantidadDescuento);
    }

    @Override
    public double aplicarDescuento(Carrito carrito) throws DescuentoInvalido {
        double precioConDescuento;
        if (carrito.getTipoDescuento().equals(TipoDescuentoEnum.FIJO)) {
            precioConDescuento = carrito.getPrecioTotalCarrito() - this.getCantidadDescuento();
            carrito.setPrecioTotalCarrito(precioConDescuento);
            carrito.setDescuentoAplicado(true);
        }else{
            throw new DescuentoInvalido("Tipo de descuento invalido");
        }
        return precioConDescuento;
    }

}
