/*
    Dado un vector de números, y un número X, que sume todos los números > X y
    retorne el resultado
 */
package ejercicios;

import java.util.Scanner;

public class SumadorDeNumeros {

    public static void sumarNumerosMayoresAX() {
        Scanner entrada = new Scanner(System.in);
        int numeroX, numeroElementos, numero, suma;
        int numeros[];

        System.out.print("Digite la cantidad de numeros que quiere ingresar: ");
        numeroElementos = entrada.nextInt();

        numeros = new int[numeroElementos];
        for (int i = 0; i < numeroElementos; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numero = entrada.nextInt();
            numeros[i] = numero;
        }

        System.out.print("\nDigite el numero X para buscar todos los numeros mayores a este y sumarlos: ");
        numeroX = entrada.nextInt();

        suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > numeroX) {
                suma += numeros[i];
            }
        }
        System.out.println("\nLa suma total es:" + suma);
    }
}
