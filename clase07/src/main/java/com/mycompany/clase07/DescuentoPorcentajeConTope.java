/*
 */
package com.mycompany.clase07;

public class DescuentoPorcentajeConTope extends DescuentoPorcentual {

    private double tope;

    public DescuentoPorcentajeConTope(String nombreDescuento, double cantidadDescuento, double tope) {
        super(nombreDescuento, cantidadDescuento);
        this.tope = tope;
    }

    //getters y setters
    public double getTope() {
        return tope;
    }

    public void setTope(double tope) {
        this.tope = tope;
    }
    
    @Override
    public double aplicarDescuento(Carrito carrito){
        double precioConDescuento;
          if(carrito.getTipoDescuento().equals(TipoDescuentoEnum.valueOf("PORCENTUAL"))){
        double descuentoAplicado = Math.min(carrito.getPrecioTotalCarrito()*this.getCantidadDescuento(),tope);
         precioConDescuento = carrito.getPrecioTotalCarrito()- carrito.getPrecioTotalCarrito()*descuentoAplicado;
        }else{
            throw new IllegalArgumentException("Tipo de descuento invalido");
        }
        return precioConDescuento; 
    }
    
    
}
