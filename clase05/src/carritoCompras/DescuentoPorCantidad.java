/*
    clase encargada de realizar descuentos por cantidad de productos a comprar
 */
package carritoCompras;

public class DescuentoPorCantidad extends Descuento {

    private int cantidadMinima;

    public DescuentoPorCantidad(String nombre, double porcentajeDescuento, int cantidadMinima) {
        super(nombre, porcentajeDescuento);
        this.cantidadMinima = cantidadMinima;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }

    @Override
    public boolean aplicaDescuento(Carrito carrito) {
        return carrito.getCantidadTotal() >= cantidadMinima;
    }
}
