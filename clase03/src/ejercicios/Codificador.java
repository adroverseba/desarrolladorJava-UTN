/*
    Genere una clase que tenga los métodos para realizar la codificación y decodificación
    de un string, dado un número de desplazamiento.
 */
package ejercicios;

import java.util.Scanner;

public class Codificador {

    public static void codificar(String frase, int desplazamiento) {
        String resultado = "";

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            caracter = (char) (caracter + desplazamiento);
            resultado += caracter;
        }

        System.out.println(resultado);
    }

    public static void decodificar(String frase, int desplazamiento) {
        codificar(frase, -desplazamiento);
    }
}
