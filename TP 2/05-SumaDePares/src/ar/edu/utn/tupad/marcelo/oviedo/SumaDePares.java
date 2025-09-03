/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tupad.marcelo.oviedo;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Clase SumaDePares
 *
 * @author Oviedo Marcelo
 * @date 23 ago 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class SumaDePares {

    /**
     * Método principal - punto de entrada TODO: Implementar lógica de la
     * aplicación
     *
     * @param args
     */
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner input = new Scanner(System.in);
        System.out.println("Iniciando clase SumaDePares...\n");
        int numero, sumaTotal;
        boolean pedirNumero = true;
        sumaTotal = 0;
        System.out.println("Solicitaremos números para sumar solo los pares ingresados.\n");
        while (pedirNumero) {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = input.nextInt();
            if (numero == 0) {
                pedirNumero = false;
            } else if (numero % 2 == 0) {
                sumaTotal += numero;
            }
        }
        System.out.println("La suma total de los números pares es de: " + sumaTotal);

    }

}
