/*
   Dado un String y una letra, que cuente la cantidad de apariciones de la letra en
   el String
 */
package ejercicios;

import java.util.Scanner;

public class ContadorDeLetras {

    public static void contarLetra() {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        String cadena;
        char letra;

        System.out.println("escriba una frase: ");
        cadena = entrada.nextLine();
        System.out.println("Digite una letra para ver cuantas veces aparece: ");
        letra = entrada.next().charAt(0);

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador++;

            }
        }

        System.out.println("Cantidad de apariciones: " + contador);
    }

}
