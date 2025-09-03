/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ar.edu.utn.tupad.marcelo.oviedo;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


/**
 * Clase ClasificionDeEdad
 * 
 * @author Oviedo Marcelo
 * @date 23 ago 2025
 * 
 * Descripción:
 *  TODO: Agregar descripción de la clase
 */

public class ClasificionDeEdad {

    /**
     * Método principal - punto de entrada
     * TODO: Implementar lógica de la aplicación
     * @param args
     */
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner input = new Scanner(System.in);
        System.out.println("Iniciando clase ClasificionDeEdad...");
        int edad;
        System.out.print("Ingrese su edad para indicarle en que etapa de su vida esta: ");
        edad=input.nextInt();
        
        if (edad < 0) {
            System.out.println("Edad ingresada no válida.");
        } else if (edad <= 11) {
            System.out.println("Usted es un niño.");
        } else if (edad <= 17) {
            System.out.println("Usted es un adolescente.");
        } else if (edad <= 59) {
            System.out.println("Usted es un adulto.");
        } else {
            System.out.println("Usted es un adulto mayor.");
        }
      
    }

}
