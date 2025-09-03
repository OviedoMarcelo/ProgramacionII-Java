/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tupad.marcelo.oviedo;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Clase CalculadoraDeDescuento
 *
 * @author Oviedo Marcelo
 * @date 23 ago 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class CalculadoraDeDescuento {

    /**
     * Método principal - punto de entrada TODO: Implementar lógica de la
     * aplicación
     *
     */
    public static final int DES_A = 10;
    public static final int DES_B = 15;
    public static final int DES_C = 20;

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner input = new Scanner(System.in);
        System.out.println("Iniciando clase CalculadoraDeDescuento...");
        double precioProducto;
        char categoria;
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());

        if (precioProducto > 0) {
            System.out.print("Ingrese la categoría del producto (A, B o C): ");
            categoria = input.nextLine().toUpperCase().charAt(0);
            switch (categoria) {
                case 'A' -> {
                    System.out.println("Precio original: $" + precioProducto);
                    System.out.println("Descuento aplicado del " + DES_A + "% por ser Categoría A");
                    System.out.println("Precio final: $" + (precioProducto * (1 - (DES_A / 100.0))));
                }
                case 'B' -> {
                    System.out.println("Precio original: $" + precioProducto);
                    System.out.println("Descuento aplicado del " + DES_B + "% por ser Categoría B");
                    System.out.println("Precio final: $" + (precioProducto * (1 - (DES_B / 100.0))));
                }
                case 'C' -> {
                    System.out.println("Precio original: $" + precioProducto);
                    System.out.println("Descuento aplicado del " + DES_C + "% por ser Categoría C");
                    System.out.println("Precio final: $" + (precioProducto * (1 - (DES_C / 100.0))));
                }
                default ->
                    System.out.println("La categoría no es válida");
            }
        } else {
            System.out.println("El precio del producto ingresado no es válido");
        }
    }

}
