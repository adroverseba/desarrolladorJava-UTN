/*
    clase encargada de la lectura de archivos
 */
package carritoCompras;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeerArchivo {

    public static List<ItemCarrito> leerItems(String nombreArchivo) {
        List<ItemCarrito> items = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(nombreArchivo);
            BufferedReader lector = new BufferedReader(fileReader);
            String line;
            //extraigo los valores de cada una de las lineas del archivo y almaceno en 
            while ((line = lector.readLine()) != null) {
                String[] partes = line.split(",");
                int cantidad = Integer.parseInt(partes[0]);
                double precioUnitario = Double.parseDouble(partes[1]);
                String nombreProduct = partes[2];
                String descProduct = partes[3];

                Producto productoNuevo = new Producto(nombreProduct, descProduct, precioUnitario);
                ItemCarrito item = new ItemCarrito(productoNuevo, cantidad);
                items.add(item);
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        return items;
    }
}
