/*
 
 */
package ejercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String fileInput="";
        int desplazamiento = 0, submenuOption;

        do {
            System.out.println("\n\tIndique que desea realizar");
            System.out.println("1. Codificar");
            System.out.println("2. Decodificar");
            System.out.println("3. Salir");
            submenuOption = entrada.nextInt();

            // los mensajes de entrada solo se muestran para las opciones 1 y 2
            if (submenuOption > 0 && submenuOption < 3) {
                entrada.nextLine();
                System.out.print("Digite la ruta del archivo a leer: ");
                fileInput = entrada.nextLine();
//                System.out.print("Digite la ruta del archivo donde quiere guardar la codificacion/decodificacion: ");
//                fileOutput = entrada.nextLine();
                System.out.print("Digite el desplazamiento: ");
                desplazamiento = entrada.nextInt();
            }

            switch (submenuOption) {
                case 1:
                    Codificador.ejecutar("codificar", desplazamiento,fileInput,"codOutputMessage.txt");
                    break;
                case 2:

                    Codificador.ejecutar("decodificar", desplazamiento,fileInput,"deCodOutputMessage.txt");
                    break;
                case 3:
                    break;
                default:
                    System.out.print("Opcion no valida\n");
            }

        } while (submenuOption != 3);

    }
}
