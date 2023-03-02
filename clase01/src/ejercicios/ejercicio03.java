/*
     Determinar si una persona pertenece al segmento de ingresos altos
 */
package ejercicios;

import java.util.Scanner;

public class ejercicio03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float ingresos;
        String tieneVehiculosNuevos, tieneInmuebles, tieneActivosSocitarios;
        int vehiculos = 0, inmuebles = 0;
        boolean activosSocietarios;

        //pedir ingresos totales mensuales del hogar
        System.out.print(
                "Ingrese los ingresos mensuales totales del hogar: ");
        ingresos = entrada.nextFloat();

        entrada.nextLine();//consumo el caracter de salto de linea
        //consultar por vehiculos con antiguedad menor a 5 anhos

        System.out.print(
                "Posee vehiculos con una antiguedad menor a 5 anhos? (s/n): ");
        tieneVehiculosNuevos = entrada.nextLine().toLowerCase().trim();

        if (tieneVehiculosNuevos.equals(
                "s") || tieneVehiculosNuevos.equals("si")) {
            System.out.print("Cuantos vehiculos con una antiguedad menor a 5 anhos tiene? ");
            vehiculos = entrada.nextInt();
            entrada.nextLine();//consumo el caracter de salto de linea
        }

        //consultar por inmuebles 
        System.out.print(
                "Posee inmuebles? (s/n): ");
        tieneInmuebles = entrada.nextLine().toLowerCase().trim();

        if (tieneInmuebles.equals(
                "s") || tieneInmuebles.equals("si")) {
            System.out.print("Cuantos inmuebles tiene?: ");
            inmuebles = entrada.nextInt();
            entrada.nextLine();//consumo el caracter de salto de linea
        }

        //consultar por embarcacion, aeronave de lujo o es titular de activos societarios
        System.out.print(
                "Posee una embarcacion, aeronave de lujo o es titular de activos societarios que demuestren capacidad economica plena? (s/n): ");
        tieneActivosSocitarios = entrada.nextLine().toLowerCase().trim();
        activosSocietarios = tieneActivosSocitarios.equals("s") || tieneActivosSocitarios.equals("si");

        if (ingresos >= 489083 || vehiculos >= 3 || inmuebles >= 3 || activosSocietarios) {
            System.out.println("\nLa persona pertenece al segmento de ingresos altos");
        } else {
            System.out.println("\nLa persona NO pertenece al segmento de ingresos altos");
        }
    }
}
