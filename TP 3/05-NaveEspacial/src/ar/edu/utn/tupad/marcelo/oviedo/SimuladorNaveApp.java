/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tupad.marcelo.oviedo;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Clase SimuladorNaveApp
 *
 * @author Oviedo Marcelo
 * @date 1 sept 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class SimuladorNaveApp {

    /**
     * Método principal - punto de entrada TODO: Implementar lógica de la
     * aplicación
     */
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("Iniciando clase NaveEspacilApp...");
        System.out.println("Se genera una nueva nave");
        NaveEspacial nave = new NaveEspacial("La estrella de la muerte");
        nave.mostrarInfo();
        System.out.println("La nave despega 🚀");
        nave.despegar();
        nave.mostrarInfo();
        System.out.println("Intentaremos moverlos más del combustible --> 50");
        nave.avanzar(50);
        System.out.println("Cargamos 50 de combustible");
        nave.cargarCombustible(50);
        nave.mostrarInfo();
        System.out.println("Intentaremos moverlos con el combustible recarcado");
        nave.avanzar(50);
        nave.mostrarInfo();

    }

}
