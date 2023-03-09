/*

 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LectorOrdenador {

    private static Scanner entrada;

    public LectorOrdenador() {
        entrada = new Scanner(System.in);
    }

    public int lectorEntero() {
        int res = 0;
        while (res == 0) {
            try {
                res = entrada.nextInt();
            } catch (InputMismatchException e) {
                entrada.nextLine(); //evita bucle infinito
                System.err.println("ADVERTENCIA: tipo de dato incorrecto");
                System.out.println("Inserte nuevamente el valor");
            }
        }
        return res;
    }

    public String lectorString() {
        String resp = "";
        entrada.nextLine();
        while (true) {
            try {
                resp = entrada.nextLine().trim();
                if (resp.equalsIgnoreCase("s") || resp.equalsIgnoreCase("n")) {
                    break;
                } else if (!Character.isAlphabetic(resp.charAt(0))) {
                    throw new InputMismatchException("Tipo de dato incorrecto");
                } else {
                    throw new IllegalArgumentException("Entrada inválida");
                }
            } catch (InputMismatchException e) {
                System.err.println("ADVERTENCIA: tipo de dato incorrecto");
                System.out.println("Inserte nuevamente el valor");
            } catch (IllegalArgumentException e) {
                System.err.println("ADVERTENCIA: valor incorrecto");
                System.out.println("Inserte solo 's' o 'n'");
            }
        }
        return resp;
    }
}
