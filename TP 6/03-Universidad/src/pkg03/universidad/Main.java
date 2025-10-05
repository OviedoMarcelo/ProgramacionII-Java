/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg03.universidad;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Clase Main
 *
 * @author Oviedo Marcelo
 * @date 3 oct 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class Main {

    /**
     * Método principal - punto de entrada TODO: Implementar lógica de la
     * aplicación
     */
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("Iniciando clase Main...");
        Universidad uni = new Universidad("UTN");

        // 1. Crear profesores y cursos
        Profesor prof1 = new Profesor("Carlos López", "Matemática");
        Profesor prof2 = new Profesor("María Pérez", "Programación");
        Profesor prof3 = new Profesor("Ana Torres", "Redes");

        Curso c1 = new Curso("Matemática I");
        Curso c2 = new Curso("Programación");
        Curso c3 = new Curso("Base de Datos");
        Curso c4 = new Curso("Redes");
        Curso c5 = new Curso("Física");

        // 2. Agregar profesores y cursos a la universidad
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        //Listado de prueba
        uni.listarCursos();
        uni.listarProfesores();

        // 3. Asignar profesores a cursos
        uni.asignarProfesorACurso(prof1.getId(), c1.getCodigo());
        uni.asignarProfesorACurso(prof1.getId(), c2.getCodigo());
        uni.asignarProfesorACurso(prof2.getId(), c3.getCodigo());
        uni.asignarProfesorACurso(prof3.getId(), c4.getCodigo());
        uni.asignarProfesorACurso(prof3.getId(), c5.getCodigo());

        // 4. Listar cursos y profesores
        uni.listarCursos();
        uni.listarProfesores();
        System.out.println("\n\n");

        // 5. Cambiar profesor de un curso
        System.out.println("\n-- Cambiando profesor de 'Programación' a María Pérez --");
        c2.setProfesor(prof2);
        uni.listarCursos();
        uni.listarProfesores();
        System.out.println("\n\n");

        // 6. Remover un curso
        System.out.println("\n-- Removiendo curso 'Física' del profesor Ana Torres --");
        prof3.eliminarCurso(c5);
        uni.listarProfesores();
        uni.listarCursos();
        System.out.println("\n\n");

        // 7. Remover profesor (dejando profesor = null)
        System.out.println("\n-- Quitando profesor de 'Base de Datos' --");
        c3.setProfesor(null);
        uni.listarCursos();
        uni.listarCursos();
        System.out.println("\n\n");

        // 8. Reporte
        System.out.println("\n--- REPORTE: Cantidad de cursos por profesor ---");
        System.out.println(prof1.getNombre() + ": " + prof1.getCursos().size() + " curso(s)");
        System.out.println(prof2.getNombre() + ": " + prof2.getCursos().size() + " curso(s)");
        System.out.println(prof3.getNombre() + ": " + prof3.getCursos().size() + " curso(s)");
    }
}
