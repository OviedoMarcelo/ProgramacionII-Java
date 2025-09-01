/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tupad.marcelo.oviedo;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Clase RegistroEstudiantesApp
 *
 * @author Oviedo Marcelo
 * @date 31 ago 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class RegistroEstudiantesApp {

    /**
     * Método principal - punto de entrada TODO: Implementar lógica de la
     * aplicación
     */
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("Iniciando clase RegistroEstudiantesApp...");
        Estudiante estudiante1 = new Estudiante();
        System.out.println("Instancia de estudiante sin datos:");
        estudiante1.mostrarInfo();
        estudiante1.setApellido("Oviedo");
        estudiante1.setNombre("Marcelo");
        estudiante1.setCurso("Programación 2");
        estudiante1.setCalificacion(6);
        System.out.println("Instancia de estudiante con datos: ");
        estudiante1.mostrarInfo();
        System.out.println("Se sube 1 punto la calificación");
        estudiante1.subirCalificacion(1);
        estudiante1.mostrarInfo();
        System.out.println("Se baja 3 puntos la calificación");
        estudiante1.bajarCalificacion(3);
        estudiante1.mostrarInfo();
        
       
    }

}
