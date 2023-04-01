/*
 */
package com.mycompany.clase07;

import com.mycompany.excepciones.DescuentoInvalido;

public class Uso_Carrito {

    public static void main(String[] args) {
        /*INSTANCIO algunos productos MANUALMENTE*/
//        Producto producto1 = new Producto("silla gamer thunderx3", "silla gamer super comoda y exclusiva para gamer", 75000, 3);
//        Producto producto2 = new Producto("Teclado redragon kumara", "teclado mecanico gamer retroiluminado", 15000, 6);
//        Producto producto3 = new Producto("mouse redragon impact", "mouse gamer con 12 botones personalizables ", 18000, 7);

        /*INSTANCIO el carrito*/
 /* CREO CARRITO NECESARIO PARA CARGA MANUAL DE PRODUCTOS */
//        Carrito carrito = new Carrito();

        /* CREO CARRITO NECESARIO PARA LECTURA DE ARCHIVO */
        String archivo = "src/main/java/resources/productosCarrito.txt";
        Carrito carrito = new Carrito(LeerArchivo.leerItems(archivo), TipoDescuentoEnum.PORCENTUAL); //leo los productos desde un archivo
        DescuentoPorcentual descuentoPorcentual = new DescuentoPorcentual("descuento porcentual", 0.1);
//        System.out.println(carrito.getItems().get(0).getProducto().getPrecio());
        try {
            /*AGREGAR productos al carrito MANUALMENTE*/
//        carrito.agregarItem(producto1, 4); verificar comprando una cantidad mayor al del stock
//        carrito.agregarItem(producto1, 3);
//        carrito.agregarItem(producto2, 4);
//        carrito.agregarItem(producto3, 1);

            /*INSTANCIO los descuentos por cantidad*/
//        DescuentoPorCantidad descuentoPorCantidad = new DescuentoPorCantidad("Descuento por Cantidad", 5, 60);
//        DescuentoPorMonto descuentoPorMonto = new DescuentoPorMonto("Descuento por Monto", 15, 100000);
//valido si corresponde algun descuento
//        if (descuentoPorMonto.aplicaDescuento(carrito)) {   //valido descuento por monto
//            descuentoPorMonto.aplicarDescuento(carrito);
//        } else if (descuentoPorCantidad.aplicaDescuento(carrito)) {  //valido descuento por cantidad
//            descuentoPorCantidad.aplicarDescuento(carrito);
//        }
            System.out.println("Precio total del carrito: " + carrito.getPrecioTotalCarrito() + "\n"); //muestro el costo total del carrito sin descuentos aplicados si corresponde
            descuentoPorcentual.aplicarDescuento(carrito); //aplico el descuento porcentual
            if (carrito.isDescuentoAplicado()) {
                System.out.println("Precio total del carrito a pagar con descuento incluido: " + carrito.getPrecioTotalCarrito() + "\n"); //muestro el costo total del carrito con descuentos aplicados si corresponde

            } else {
                System.out.println("Precio total del carrito a pagar: " + carrito.getPrecioTotalCarrito() + "\n"); //muestro el costo total del carrito con descuentos aplicados si corresponde

            }

//        carrito.setPrecioTotalCarrito(precioConDescuento);
            carrito.realizarCompra();
//        System.out.println("Stock del producto1 luego de la compra: " + producto1.getStock()); //verifico el stock del producto1 despues de la compra(si la carga de productos la hago de la manera manual)

        } catch (DescuentoInvalido ex) {
            System.err.println("Error: " + ex);
        }

    }
}


/*                          TODO
FALTA REALIZAR EL PUNTO 3
 */
