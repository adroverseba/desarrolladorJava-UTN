/*
    Tome el ejercicio B de la clase 3 y que por parámetro se pueda elegir si es una
    codificación o decodificación, el valor del desplazo, y 2 archivos, uno para la entrada y
    otro para la salida. Que por pantalla solo indique si terminó o no correctamente, los
    resultados deben estar en el archivo de salida

 */
package ejercicio3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Codificador {

    private static FileReader fileReader;
    private static FileWriter writer;
    private static BufferedReader reader;

    public static void ejecutar(String action, int desplazamiento, String fileInput, String fileOutput) {
        try {

            String result = "", readedText = "", cadena;
            fileReader = new FileReader(fileInput);
            reader = new BufferedReader(fileReader);
            writer = new FileWriter(fileOutput);

            while ((cadena = reader.readLine()) != null) {
                readedText += cadena;
//              System.out.println(cadena);
            }
            
            //codificar
            if (action.equalsIgnoreCase("codificar")) {

                for (int i = 0; i < readedText.length(); i++) {
                    char caracter = readedText.charAt(i);
                    caracter = (char) (caracter + desplazamiento);
                    result += caracter;
                }
                System.out.println("Archivo codificado con exito");

            } else if(action.equalsIgnoreCase("decodificar")){
                for (int i = 0; i < readedText.length(); i++) {
                    char caracter = readedText.charAt(i);
                    caracter = (char) (caracter - desplazamiento);
                    result += caracter;
                }
                System.out.println("Archivo Decodificado con exito");
            }
//                System.out.println(readedText);
//                System.out.println(result);
                writer.write(result);
                writer.close();
                
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex);
        } catch (IOException ex) {
            System.err.println("Error: " + ex);
        }
    }

//    public static void decodificar(String frase, int desplazamiento) {
//        codificar(frase, -desplazamiento);
//    }
}
