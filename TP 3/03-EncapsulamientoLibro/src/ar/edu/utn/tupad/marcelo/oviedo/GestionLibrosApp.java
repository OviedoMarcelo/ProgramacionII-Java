/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tupad.marcelo.oviedo;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Clase GestionLibrosApp
 *
 * @author Oviedo Marcelo
 * @date 1 sept 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class GestionLibrosApp {

    /**
     * Método principal - punto de entrada TODO: Implementar lógica de la
     * aplicación
     */
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("Iniciando clase GestionLibrosApp...");
        System.out.println("Se genera un libro con su clase constructora");
        Libro libro1 = new Libro("No hay amores felices", "Sergio Olguin", 2015);
        System.out.println("Generado correctamente el libro:");
        System.out.println("Libro: " + libro1.getTitulo() + "\nAutor: " + libro1.getAutor() + "\nAño: " + libro1.getAnioPublicacion());
        System.out.println("---------------------");
        System.out.println("Se modifica el año de publicación a 2038, año inválido ya que se toman solo años mayores a cero y menores al año actual ");
        libro1.setAnioPublicacion(2038);
        System.out.println("Libro: " + libro1.getTitulo() + "\nAutor: " + libro1.getAutor() + "\nAño: " + libro1.getAnioPublicacion());
        System.out.println("---------------------");
        System.out.println("Se modifica el año de publicación a 2016, año correcto y válido");
        libro1.setAnioPublicacion(2016);
        System.out.println("Libro: " + libro1.getTitulo() + "\nAutor: " + libro1.getAutor() + "\nAño: " + libro1.getAnioPublicacion());
    }

}
