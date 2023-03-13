/*
    Clase donde se encuentra el metodo principal de la app
 */
package carritoCompras;

public class Uso_Carrito {

    public static void main(String[] args) {
        //instacio algunos productos
        Producto producto1 = new Producto("silla gamer thunderx3", "silla gamer super comoda y exclusiva para gamer", 75000, 3);
        Producto producto2 = new Producto("Teclado redragon kumara", "teclado mecanico gamer retroiluminado ", 15000, 6);
        Producto producto3 = new Producto("mouse redragon impact", "mouse gamer con 12 botones personalizables ", 18000, 7);

        //instancio el carrito
        Carrito carrito = new Carrito();

        //agregar productos al carrito
//        carrito.agregarItem(producto1, 4); verificar comprando una cantidad mayor al del stock
        carrito.agregarItem(producto1, 3);
        carrito.agregarItem(producto2, 4);
        carrito.agregarItem(producto3, 1);

        carrito.realizarCompra();
        System.out.println(producto1.getStock());
    }
}
