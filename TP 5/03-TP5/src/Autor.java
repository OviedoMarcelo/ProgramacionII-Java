/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase Autor
 *
 * @author Oviedo Marcelo
 * @date 15 sept 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class Autor {

    // Atributos de la clase 
    private String nombre;
    private String nacionalidad;

    // Zona de constructores 
    public Autor(String nombre, String nacionalidad) {
        if (nombre != null && nacionalidad != null) {
            this.nombre = nombre;
            this.nacionalidad = nacionalidad;
        }
    }
    // Zona de métodos de la clase

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }

    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        if (nacionalidad != null) {
            this.nacionalidad = nacionalidad;
        }
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    }

//Fin de clase    
}
