/*
   Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden
*/
package ejercicios;

public class ejercicio02 {
     public static void main(String[] args) {
        int numeroInicio=5, numeroFinal=14;
        boolean mostrarPares = true;
        
        for(int i = numeroFinal; i >= numeroInicio ; i--){
            if(mostrarPares && i%2 == 0){
                System.out.print(i + " ");
            }else if(!mostrarPares && i%2!=0){
                System.out.print(i + " ");
            }
        }
    }
}
