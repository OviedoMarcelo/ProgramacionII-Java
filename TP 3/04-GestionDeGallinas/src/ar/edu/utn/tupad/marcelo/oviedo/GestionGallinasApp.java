/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tupad.marcelo.oviedo;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Clase GestionGallinasApp
 *
 * @author Oviedo Marcelo
 * @date 1 sept 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class GestionGallinasApp {

    /**
     * Método principal - punto de entrada TODO: Implementar lógica de la
     * aplicación
     */
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("Iniciando clase GestionGallinasApp...");
        System.out.println("Se generan 2 gallinas con diferentes valores y se imprime su resultado.");
        Gallina gallina1 = new Gallina(1);
        Gallina gallina2 = new Gallina(2, 15);
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        System.out.println("------------------------------------------");
        System.out.println("Las Gallinas envejecen y ponen huevos de forma aleatoria.");
        gallina1.envejecer();
        gallina1.envejecer();
        gallina2.envejecer();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo(3);
        gallina2.ponerHuevo();
        gallina2.ponerHuevo(4);
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }

}
