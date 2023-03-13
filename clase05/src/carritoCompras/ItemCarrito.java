/*
    clase ItemCarrito encargada de recibir los productos y la cantidad de item de dicho producto que van a ser comprados
 */
package carritoCompras;

public class ItemCarrito {

    private Producto producto;
    private int cantidad;

    public ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double precioTotal() {
        return producto.getPrecio() * cantidad;
    }

}
