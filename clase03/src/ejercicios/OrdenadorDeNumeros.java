/*
        Dados 3 números y un orden (ascendente o decreciente) que ordene los
        mismos y los retorne en un vector de 3
    c. Dado un vector de números, y un número X, que sume todos los números > X y
        retorne el resultado
 */
package ejercicios;

public class OrdenadorDeNumeros {

    public static void ordenarNumeros() {
        LectorOrdenador lector = new LectorOrdenador();
//        entrada = new Scanner(System.in);
        int arreglo[], nElementos, aux;
        boolean ordenamientoCreciente;

        System.out.println("Digite la cantidad de elementos que desea ordenar(longitud del array): ");
        //todo modificar esto de abajo
//        nElementos = entrada.nextInt();
        nElementos = lector.lectorEntero();

        arreglo = new int[nElementos];

        for (int i = 0; i < nElementos; i++) {
            System.out.print(i + 1 + ". Digite un numero: ");
            arreglo[i] = lector.lectorEntero();
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

//        entrada.nextLine();
        System.out.println("Desea ordenar la lista de numeros de manera creciente?:(s/n) ");
        ordenamientoCreciente = lector.lectorString().equalsIgnoreCase("s");

//        imprimo el valor del arreglo ordenado
        if (ordenamientoCreciente) {
            System.out.println("\nArreglo ordenado en forma creciente: ");
            for (int i : arreglo) {
                System.out.print(i + " - ");
            }

        } else {
            System.out.println("\nArreglo ordenado decreciente: ");
            for (int i = nElementos - 1; i >= 0; i--) {
                System.out.print(arreglo[i] + " - ");
            }

        }

    }

}
