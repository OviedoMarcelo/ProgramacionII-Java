/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase EditorVideo
 *
 * @author Oviedo Marcelo
 * @date 15 sept 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class EditorVideo {
    // Atributos de la clase 
    // Zona de constructores 
    // Zona de métodos de la clase

    // Dependencia de creación: exportar crea un Render a partir de un Proyecto
    public static void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto); // creación dentro del método
        render.mostrarInfo();
    }
}
