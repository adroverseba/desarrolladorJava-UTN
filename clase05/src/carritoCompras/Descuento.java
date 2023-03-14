/*
 */
package carritoCompras;

public abstract class Descuento {

    private String nombre;
    private double porcentajeDescuento;

    public Descuento(String nombre, double porcentajeDescuento) {
        this.nombre = nombre;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    abstract public boolean aplicaDescuento(Carrito carrito);

    public void aplicarDescuento(Carrito carrito) {
        double precioConDescuento = carrito.getPrecioTotalCarrito() - carrito.getPrecioTotalCarrito() * porcentajeDescuento / 100;
        carrito.setPrecioTotalCarrito(precioConDescuento);
        System.out.println("Decuento del " + porcentajeDescuento + "% aplicado.");
    }

}
