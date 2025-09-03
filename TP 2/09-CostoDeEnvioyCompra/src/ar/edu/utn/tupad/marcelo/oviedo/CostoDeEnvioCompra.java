/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tupad.marcelo.oviedo;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Clase CostoDeEnvioCompra
 *
 * @author Oviedo Marcelo
 * @date 24 ago 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class CostoDeEnvioCompra {

    /**
     * Método principal - punto de entrada TODO: Implementar lógica de la
     * aplicación
     *
     * @param args
     */
    static double VALOR_PESO_INTERNACIONAL = 10;
    static double VALOR_PESO_NACIONAL = 5;

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner input = new Scanner(System.in);
        double peso,precio,costoEnvio;
        String zona;
        System.out.println("Iniciando clase CostoDeEnvioCompra...");
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el peso del paquete en kg: ");
        peso = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese la zona del envio (Nacional o Internacional): ");
        zona = input.nextLine();
        costoEnvio = calcularCostoEnvio(peso, zona);
        System.out.println("El costo del envío es: "+costoEnvio);
        System.out.println("El costo total a pagar es: "+calcularTotalCompra(precio, costoEnvio));
        
    }

    public static double calcularCostoEnvio(double peso, String zona) {
        if (null == zona.toUpperCase()) {
            return 0;

        } else {
            return switch (zona.toUpperCase()) {
                case "INTERNACIONAL" ->
                    peso * VALOR_PESO_INTERNACIONAL;
                case "NACIONAL" ->
                    peso * VALOR_PESO_NACIONAL;
                default ->
                    0;
            };
        }

    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        return precioProducto+costoEnvio;
    
    }



}
