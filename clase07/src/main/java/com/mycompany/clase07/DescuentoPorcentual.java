/*
 */
package com.mycompany.clase07;

import com.mycompany.excepciones.DescuentoInvalido;

public class DescuentoPorcentual extends Descuento {

    public DescuentoPorcentual(String nombreDescuento, double cantidadDescuento) {
        super(nombreDescuento, cantidadDescuento);
    }

    //aplica el descuento PORCENTUAL solo si el carrito tiene tipo de descuento PORCENTUAL
    @Override
    public double aplicarDescuento(Carrito carrito) throws DescuentoInvalido {
        double precioConDescuento;
        if (carrito.getTipoDescuento().equals(TipoDescuentoEnum.PORCENTUAL)) {
            //lanzo error si el precio del carrito es igual a 0
            if (carrito.getPrecioTotalCarrito() == 0) {
                throw new DescuentoInvalido("No se puede aplicar un descuento si el precio del carrito es 0");
            }
            //calculo el precio con descuento
            precioConDescuento = carrito.getPrecioTotalCarrito() - carrito.getPrecioTotalCarrito() * this.getCantidadDescuento();
            //lanzo error si el precio del carrito con descuento es un valor negativo
            if (precioConDescuento < 0) {
                throw new DescuentoInvalido("El producto con el descuento no puede tener un valor negativo");
            }
            //configuro el precio del carrito y el descuento aplicado en true
            carrito.setPrecioTotalCarrito(precioConDescuento);
            carrito.setDescuentoAplicado(true);
        } else {
            throw new DescuentoInvalido("Tipo de descuento invalido");

        }
        return precioConDescuento;
    }
}
