/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ar.edu.utn.tupad.marcelo.oviedo;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Clase EsAnioBisiesto
 * 
 * @author Oviedo Marcelo
 * @date 23 ago 2025
 * 
 * Descripción:
 *  TODO: Agregar descripción de la clase
 */

public class EsAnioBisiesto {

    /**
     * Método principal - punto de entrada
     * TODO: Implementar lógica de la aplicación
     * @param args
     */
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("Iniciando clase EsAnioBisiesto...");
        Scanner input = new Scanner(System.in);
        int anio;
        System.out.println("Ingrese el año que quiera verificar que si es bisiesto:");
        anio = Integer.parseInt(input.nextLine());
        if ((anio%4 == 0 && anio%100!=0) || (anio%400 == 0) ) {
           System.out.println("El anio "+anio+" es bisiesto");
        }else{
            System.out.println("El año "+anio+" no es bisiesto.");
        }
    }
}
