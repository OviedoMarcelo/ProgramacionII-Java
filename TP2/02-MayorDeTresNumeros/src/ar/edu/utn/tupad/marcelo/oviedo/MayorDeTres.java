/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ar.edu.utn.tupad.marcelo.oviedo;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


/**
 * Clase MayorDeTres
 *
 * @author Oviedo Marcelo
 * @since 2025-08-23
 *
 * Descripción:
 *  Lee N enteros por consola y muestra el mayor de los ingresados.
 */

public class MayorDeTres {

    /**
     * Método principal - punto de entrada
     * TODO: Implementar lógica de la aplicación
     */
    //Cantidad de numeros a ingresar como constante
    public static final  int NUMEROS_A_INGRESAR = 3;
            
            
    public static void main(String[] args) {
      
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner input = new Scanner(System.in);
        System.out.println("Iniciando clase MayorDeTres...");
        int numeroIngresado,numeroMayor;
        numeroMayor=Integer.MIN_VALUE;
        System.out.println("Ingrese "+NUMEROS_A_INGRESAR+ " números enteros y le diremos cual fue el mayor");
        
        for (int i = 0; i < NUMEROS_A_INGRESAR; i++) {
            System.out.println("Ingrese el numero n°"+(i+1)+": ");
            numeroIngresado=Integer.parseInt(input.nextLine());
            if (numeroIngresado >numeroMayor) {
                numeroMayor=numeroIngresado;                
            }            
        }
        System.out.println("El número más grande ingresado fue el "+numeroMayor);
    }

}
