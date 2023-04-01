/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.clase07.Carrito;
import com.mycompany.clase07.DescuentoPorcentual;
import com.mycompany.clase07.LeerArchivo;
import com.mycompany.clase07.TipoDescuentoEnum;
import com.mycompany.excepciones.DescuentoInvalido;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author adrov
 */
public class DescuentoPorcentualTest {

    private Carrito carrito;
    private DescuentoPorcentual descuentoPorcentual;

    public DescuentoPorcentualTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        String archivo = "src/main/java/resources/productosCarrito.txt";
        carrito = new Carrito(LeerArchivo.leerItems(archivo), TipoDescuentoEnum.PORCENTUAL);
        descuentoPorcentual = new DescuentoPorcentual("descuento porcentual", 0.1);

    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void descuentoPorcentualDebeDar() {
        try {
            descuentoPorcentual.aplicarDescuento(carrito);
            double precioFinalCarrito = carrito.getPrecioTotalCarrito();
            assertEquals(113400.0, precioFinalCarrito);
        } catch (DescuentoInvalido ex) {
            System.out.println("Error: " + ex);
        }
    }
}


//113400.0
