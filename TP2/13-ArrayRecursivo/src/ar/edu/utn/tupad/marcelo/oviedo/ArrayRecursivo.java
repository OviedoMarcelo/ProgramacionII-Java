/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tupad.marcelo.oviedo;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Clase ArrayRecursivo
 *
 * @author Oviedo Marcelo
 * @date 24 ago 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class ArrayRecursivo {

    /**
     * Método principal - punto de entrada TODO: Implementar lógica de la
     * aplicación
     *
     * @param args
     */
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner input = new Scanner(System.in);
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        int opcion;
        System.out.println("Iniciando clase ManejoArrays...");
        mostrarMenu();
        opcion = input.nextInt();
        while (opcion != 0) {
            switch (opcion) {
                case 1 ->
                    mostrarListadoPrecios(precios,0,precios.length);
                case 2 ->
                    modificarPrecios(precios);
                default ->
                    throw new AssertionError();
            }
            mostrarMenu();
            opcion = input.nextInt();
        }
    }

    static void mostrarListadoPrecios(double[] precios, int indice, int longitud) {
        if (indice >= longitud) {
            return; // caso base
        }
        System.out.println("Precio producto " + (indice + 1) + " $" + precios[indice]);
        mostrarListadoPrecios(precios, indice + 1, longitud);

    }

    static void modificarPrecios(double[] precios) {
        Scanner input = new Scanner(System.in);
        int productoModificar;
        double nuevoPrecio;
        System.out.println("Ingrese el número del producto que quiere modificar, (hay " + precios.length + " productos): ");
        productoModificar = input.nextInt();
        if (productoModificar >= 1 && productoModificar <= precios.length) {
            System.out.println("Ingrese el nuevo valor: ");
            nuevoPrecio = input.nextDouble();
            precios[productoModificar - 1] = nuevoPrecio;
            System.out.println("Precio actualizado con éxito.");
        } else {
            System.out.println("Producto ingresado no existente");
        }

    }

    static void mostrarMenu() {

        System.out.println("Menú:\n"
                + "1-Mostrar el listado de precios\n"
                + "2-Modificar un valor\n"
                + "0-Finalizar\n");
    }
}
