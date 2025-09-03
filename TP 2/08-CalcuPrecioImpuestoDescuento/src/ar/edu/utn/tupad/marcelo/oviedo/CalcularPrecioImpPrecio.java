/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ar.edu.utn.tupad.marcelo.oviedo;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


/**
 * Clase CalcularPrecioImpPrecio
 * 
 * @author Oviedo Marcelo
 * @date 23 ago 2025
 * 
 * Descripción:
 *  TODO: Agregar descripción de la clase
 */

public class CalcularPrecioImpPrecio {

    /**
     * Método principal - punto de entrada
     * TODO: Implementar lógica de la aplicación
     * @param args
     */
    static double precioBase;
    
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner input = new Scanner(System.in);
        double descuento,impuesto;
        System.out.println("Iniciando clase CalcularPrecioImpPrecio...");
        System.out.print("Ingrese el precio base del producto: ");
        precioBase = input.nextInt();
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        impuesto = input.nextInt();
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        descuento = input.nextInt();
        System.out.printf("El precio final del producto es: %.2f%n ",calcularPrecioFinal(impuesto, descuento));
    }

    public static double calcularPrecioFinal(double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto / 100) - (precioBase * descuento / 100);
    
    }
}
