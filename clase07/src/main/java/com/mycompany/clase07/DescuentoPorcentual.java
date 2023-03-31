/*
 */
package com.mycompany.clase07;

public class DescuentoPorcentual extends Descuento {

    public DescuentoPorcentual(String nombreDescuento, double cantidadDescuento) {
        super(nombreDescuento, cantidadDescuento);
    }

    //aplica el descuento PORCENTUAL solo si el carrito tiene tipo de descuento PORCENTUAL
    @Override
    public double aplicarDescuento(Carrito carrito) {
        double precioConDescuento;
        if (carrito.getTipoDescuento().equals(TipoDescuentoEnum.PORCENTUAL)) {
            precioConDescuento = carrito.getPrecioTotalCarrito() - carrito.getPrecioTotalCarrito() * this.getCantidadDescuento();
            carrito.setPrecioTotalCarrito(precioConDescuento);
            carrito.setDescuentoAplicado(true);
        } else {
            throw new IllegalArgumentException("Tipo de descuento invalido");
        }
        return precioConDescuento;
    }
}
