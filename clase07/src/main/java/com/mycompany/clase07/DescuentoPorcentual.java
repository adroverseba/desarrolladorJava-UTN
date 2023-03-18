/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase07;

public class DescuentoPorcentual extends Descuento{
    
    public DescuentoPorcentual(String nombreDescuento, double cantidadDescuento){
        super(nombreDescuento, cantidadDescuento);
    }
    
    
    //aplica el descuento PORCENTUAL solo si el carrito tiene tipo de descuento PORCENTUAL
    @Override
    public double aplicarDescuento(Carrito carrito,double cantidad){
       double precioConDescuento;
        if(carrito.getTipoDescuento().equals(TipoDescuentoEnum.valueOf("PORCENTUAL"))){
         precioConDescuento = carrito.getPrecioTotalCarrito()- carrito.getPrecioTotalCarrito()*cantidad;
            
        }else{
            throw new IllegalArgumentException("Tipo de descuento invalido");
        }
        return precioConDescuento; 
    }
}
