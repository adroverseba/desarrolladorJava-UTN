/*
 
 */
package ejercicios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String frase = "";
        int desplazamiento = 0, optionMenu, submenuOption;

        // menu principal
        do {
            System.out.println("\n\tMenu");
            System.out.println("1. Contador de letras");
            System.out.println("2. Ordenador de lista de numeros");
            System.out.println("3. Sumar numeros de una lista mayores a X");
            System.out.println("4. Codificador de frases");
            System.out.println("5. Exit");
            optionMenu = entrada.nextInt();

            switch (optionMenu) {
                case 1:
                    ContadorDeLetras.contarLetra();
                    break;
                case 2:
                    OrdenadorDeNumeros.ordenarNumeros();
                    break;
                case 3:
                    SumadorDeNumeros.sumarNumerosMayoresAX();
                    break;
                case 4:
                    //submenu del codificador
                    do {
                        System.out.println("\n\tIndique que desea realizar");
                        System.out.println("1. Codificar");
                        System.out.println("2. Decodificar");
                        System.out.println("3. Volver a menu principal");
                        submenuOption = entrada.nextInt();

                        // los mensajes de entrada solo se muestran para las opciones 1 y 2
                        if (submenuOption > 0 && submenuOption < 3) {
                            entrada.nextLine();
                            System.out.print("Digite la frase que desea codificar/decodificar: ");
                            frase = entrada.nextLine();
                            System.out.print("Digite el desplazamiento: ");
                            desplazamiento = entrada.nextInt();
                        }

                        switch (submenuOption) {
                            case 1:
                                Codificador.codificar(frase, desplazamiento);
                                break;
                            case 2:

                                Codificador.decodificar(frase, desplazamiento);
                                break;
                            case 3:
                                break;
                            default:
                                System.out.print("Opcion no valida\n");
                        }

                    } while (submenuOption != 3);

                    break;
                case 5:
                    System.out.println("Muchas gracias, vuelva prontos.");
                    entrada.close();
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (optionMenu != 5);

    }
}
