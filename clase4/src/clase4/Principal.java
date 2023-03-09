/*
 // "C:\\Users\\adrov\\Documents\\NetBeansProjects\\java-utn\\clase4\\numeros.txt"
 */
package clase4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) {
        FileReader lectorArchivo;
        try {

            //declaracion de variables
            String filePath = args.length > 0 ? args[0] : "numeros.txt";

            String operation = args.length > 1 ? args[1] : "suma";
            String cadena;
            int result = 0;

            lectorArchivo = new FileReader(filePath);
            BufferedReader lector = new BufferedReader(lectorArchivo);

            while ((cadena = lector.readLine()) != null) {
                result += Integer.parseInt(cadena);
            }

            lector.close();
            System.out.println("El resultado de la operacion " + operation + " es: " + result);
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex);
        } catch (IOException ex) {
            System.err.println("Error: " + ex);
        }

    }
}
