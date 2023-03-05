/*
 
 */
package ejercicios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        ContadorDeLetras.contarLetra();
//        OrdenadorDeNumeros.ordenarNumeros();
//        SumadorDeNumeros.sumarNumerosMayoresAX();

  Scanner entrada = new Scanner(System.in);
        String frase;
        int desplazamiento;

        System.out.print("Digite la frase que desea codificar: ");
        frase = entrada.nextLine();
        System.out.print("Digite el desplazamiento: ");
        desplazamiento = entrada.nextInt();
        
//        Codificador.codificar(frase,desplazamiento);
        Codificador.decodificar(frase, desplazamiento);
    }
}
