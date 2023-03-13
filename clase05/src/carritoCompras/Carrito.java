/*
    clase Carrito que almacenara una lista de ItemProduct 
 */
package carritoCompras;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<ItemCarrito> items;

    public Carrito() {
        items = new ArrayList<>();
    }

    public void agregarItem(Producto producto, int cantidad) {
        ItemCarrito itemCarrito = new ItemCarrito(producto, cantidad);
        items.add(itemCarrito);
    }

    public void eliminarItem(int indice) {
        items.remove(indice);
    }

    public List<ItemCarrito> getItems() {
        return items;
    }

    public double getprecioTotal() {
        double precioTotal = 0;
        for (ItemCarrito item : items) {
            precioTotal += item.precioTotal();
        }
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
                item.getProducto().reducirStock(item.getCantidad());
            }
            System.out.println("Compra realizada con exito");
            items.clear();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
