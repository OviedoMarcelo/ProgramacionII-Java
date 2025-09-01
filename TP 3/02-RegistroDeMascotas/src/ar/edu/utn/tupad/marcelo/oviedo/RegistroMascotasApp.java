/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tupad.marcelo.oviedo;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Clase RegistroMascotasApp
 *
 * @author Oviedo Marcelo
 * @date 31 ago 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class RegistroMascotasApp {

    /**
     * Método principal - punto de entrada TODO: Implementar lógica de la
     * aplicación
     */
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner input = new Scanner(System.in);
        System.out.println("Iniciando clase RegistroMascotasApp...");
        System.out.println("Se crea una mascota y se asignan datos");
        System.out.println("-------------------------");

        Mascota mimascota = new Mascota("Rubita", "Perro", 1);
        mimascota.mostrarInfo();
        System.out.println("-------------------------");
        System.out.println("La mascota cumplirá 2 veces años");
        System.out.println("-------------------------");
        mimascota.cumplirAnios();
        mimascota.cumplirAnios();
        mimascota.mostrarInfo();
    }

}
