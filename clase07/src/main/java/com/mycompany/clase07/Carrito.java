/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.clase07;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<ItemCarrito> items;
    private double precioTotalCarrito = 0;
    private TipoDescuentoEnum tipoDescuento;
    private boolean descuentoAplicado = false;

    //Constructor para leer productos pasados por archivo
    public Carrito(List<ItemCarrito> items, TipoDescuentoEnum tipoDescuento) {
        this.items = items;
        this.tipoDescuento = tipoDescuento;
        this.precioTotalCarrito = this.calcularPrecioTotal();

    }

    //constructor para pasar productos al carrito por consola
    public Carrito() {
        items = new ArrayList<>();
    }

    //constructor agrega productos y cantidad del mismo
    public void agregarItem(Producto producto, int cantidad) {
        ItemCarrito itemCarrito = new ItemCarrito(producto, cantidad);
        items.add(itemCarrito);
        calcularPrecioTotal(); //calculo el precio total del carrito
    }

    public void eliminarItem(int indice) {
        items.remove(indice);
        calcularPrecioTotal(); //actualizo precio total del carrrito
    }

    public List<ItemCarrito> getItems() {
        return items;
    }

    public double getPrecioTotalCarrito() {
        return precioTotalCarrito;
    }

    public void setPrecioTotalCarrito(double precioNuevo) {
        precioTotalCarrito = precioNuevo;
    }

    public TipoDescuentoEnum getTipoDescuento() {
        return tipoDescuento;
    }

    public double calcularPrecioTotal() {
        double precioTotal = 0;
        for (ItemCarrito item : items) {
            precioTotal += item.precioTotal();
        }
//        if (tipoDescuento.equals(TipoDescuentoEnum.PORCENTUAL )){
//            this.precioTotalCarrito = 
//        }else if(tipoDescuento.equals(TipoDescuentoEnum.FIJO)){
//            
//        };
        this.precioTotalCarrito = precioTotal;
        return precioTotal;
    }

    public int getCantidadTotal() {
        int cantidadTotal = 0;
        for (ItemCarrito item : items) {
            cantidadTotal += item.getCantidad();
        }
        return cantidadTotal;
    }

    public void realizarCompra() {
        try {
            for (ItemCarrito item : items) {
                item.getProducto().reducirStock(item.getCantidad()); //reduzco el stock del producto a comprar
            }
            System.out.println("Compra realizada con exito");
            items.clear(); //limpio el ArrayList carrito debido a que la compra ha sido efectuada
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public boolean isDescuentoAplicado() {
        return descuentoAplicado;
    }

    public void setDescuentoAplicado(boolean descuentoAplicado) {
        this.descuentoAplicado = descuentoAplicado;
    }
    
    
}
