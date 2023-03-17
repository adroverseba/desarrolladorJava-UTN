/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.clase06;

public class Calculadora {
//    public static void main(String[] args) {
//        var calculadora = new Calculadora();
//        System.out.println("El resultado de la division es: "+calculadora.dividir(7, 7));
//    }
//
//    public Calculadora() {
//
//    }

    public double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public double restar(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public double dividir(double numero1, double numero2){
        if(numero2 == 0){         
                throw new IllegalArgumentException("No se puede divir por cero");            
        }
        return numero1 / numero2;
    }

}
