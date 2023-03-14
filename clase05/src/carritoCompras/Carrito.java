/*
    clase Carrito que almacenara una lista de ItemProduct 
 */
package carritoCompras;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<ItemCarrito> items;
    private double precioTotalCarrito = 0;

    //Constructor para leer productos pasados por archivo
    public Carrito(List<ItemCarrito> items) {
        this.items = items;
        precioTotalCarrito = this.calcularPrecioTotal();
    }

    //constructor para pasar productos al carrito por consola
    public Carrito() {
        items = new ArrayList<>();
    }

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

    public double calcularPrecioTotal() {
        double precioTotal = 0;
        for (ItemCarrito item : items) {
            precioTotal += item.precioTotal();
        }
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
}
