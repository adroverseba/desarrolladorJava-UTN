/*
    a. Dado un String y una letra, que cuente la cantidad de apariciones de la letra en
        el String
    b. Dados 3 números y un orden (ascendente o decreciente) que ordene los
        mismos y los retorne en un vector de 3
    c. Dado un vector de números, y un número X, que sume todos los números > X y
        retorne el resultado
 */
package ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del array: "));

        arreglo = new int[nElementos];

        for (int i = 0; i < nElementos; i++) {
            System.out.print(i + 1 + ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }

        //Ordenamiento del arreglo
        for (int i = 0; i < nElementos - 1; i++) {
            for (int j = 0; j < nElementos - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {   // si elementoActual > elementoSiguiente
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }

        //imprimo el valor del arreglo ordenado
        System.out.println("\nArreglo ordenado en forma creciente: ");
        for (int i : arreglo) {
            System.out.print(i + " - ");
        }

        System.out.println("\nArreglo ordenado decreciente: ");
        for (int i = nElementos - 1; i >= 0; i--) {
            System.out.print( arreglo[i] + " - ");
        }

    }

}
