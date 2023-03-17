/*
 */

import com.mycompany.clase06.Calculadora;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calculadora;

    public CalculadoraTest() {
        this.calculadora = new Calculadora();
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

//    1. El resultado de multiplicar 80 por 3 da 240
    @Test
    public void elResuldato80por3DeberiaDar240() {
        assertEquals(240, calculadora.multiplicar(80, 3));
    }

//    2. El resultado de sumar 150 y 180, dividido por 3, da 110
    @Test
    public void elResultadoDeberiaDar110() {
        assertEquals(110, calculadora.dividir(calculadora.sumar(150, 180), 3));
    }

//    3. El resultado de restar 90 y 50, multiplicado por 15, no da 605.
    @Test
    public void elResultadoNoDeberiaDar605() {
        assertNotEquals(605, calculadora.multiplicar(calculadora.restar(90, 50), 15));
    }

//    4. El resultado de sumar 70 y 40, multiplicado por 25, no da 2700.
    @Test
    public void elResultadoNoDeberiaDar2700() {
        assertNotEquals(2700, calculadora.multiplicar(calculadora.sumar(70, 40), 25));
    }
}
