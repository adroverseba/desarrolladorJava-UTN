/*
    clase encargada de realizar descuentos segun una cantidad minima de compra.
    La misma hereda de la clase abstracta Descuento.
 */
package carritoCompras;

public class DescuentoPorMonto extends Descuento {

    private final double montoMinimo;

    public DescuentoPorMonto(String nombre, double porcentajeDescuento, double montoMinimo) {
        super(nombre, porcentajeDescuento);
        this.montoMinimo = montoMinimo;
    }

    public double getMontoMinimo() {
        return montoMinimo;
    }

    @Override
    public boolean aplicaDescuento(Carrito carrito) {
        return carrito.getPrecioTotalCarrito()>= montoMinimo;
    }
}
