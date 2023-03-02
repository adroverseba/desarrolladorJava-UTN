/*
    Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
    y “b”.
*/
package ejercicios;

import java.util.Scanner;

public class ejercicio01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numeroInicio, numeroFin, contador;
        boolean mostrarPares;

        //se espera que el numero inicial de la cuenta sea menor al num final
        do {
            System.out.println("Ingrese un numero de inicio para la cuenta: ");
            numeroInicio = entrada.nextInt();
            System.out.println("Ingrese un numero final: ");
            numeroFin = entrada.nextInt();

            if (numeroInicio >= numeroFin) {
                System.out.println("El numero de Inicio de la cuenta no puede ser mayor que el numero Final.\n");
            }
        } while (numeroInicio >= numeroFin);

        entrada.nextLine();//consumir el caracter de nueva linea en el buffer
        //pregunta a usuario si quiere mostrar numero pares o impares
        System.out.println("Desea mostrar solo numero pares? (s/n): ");
        String respuesta = entrada.nextLine().toLowerCase().trim();
        mostrarPares = respuesta.equals("s") || respuesta.equals("si");

        //inicializo al contador con el valor del numeroInicio ingresado
        contador = numeroInicio;

        while (contador <= numeroFin) {
            if (mostrarPares && contador % 2 == 0) { //muestra numero pares
                System.out.print(contador + " ");
            } else if (!mostrarPares && contador % 2 != 0) { //muestra impares
                System.out.println(contador + " ");
            }

            contador++;
        }

        entrada.close(); //cierro la entrada
    }
}
