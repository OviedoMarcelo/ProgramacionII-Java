/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tupad.marcelo.oviedo;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Clase ValidacionDeNota
 *
 * @author Oviedo Marcelo
 * @date 23 ago 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class ValidacionDeNota {

    /**
     * Método principal - punto de entrada TODO: Implementar lógica de la
     * aplicación
     *
     * @param args
     */
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner input = new Scanner(System.in);
        System.out.println("Iniciando clase ValidacionDeNota...");
        int nota;
        boolean notaValida = false;
        do {
            System.out.print("Ingrese la nota a guardar: ");
            nota=input.nextInt();
            if (nota >=0 && nota <=10) {
                System.out.println("Nota guardada correctamente. 💾 ");
                notaValida=true;
            }else{
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10. ✖️");
            }
        } while (!notaValida);
    }

}
