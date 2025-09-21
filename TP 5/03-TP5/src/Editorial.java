/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase Editorial
 *
 * @author Oviedo Marcelo
 * @date 15 sept 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class Editorial {

    // Atributos de la clase 
    private String nombre;
    private String direccion;

    // Zona de constructores 
    public Editorial(String nombre, String direccion) {
        if (nombre != null && direccion != null) {
            this.nombre = nombre;
            this.direccion = direccion;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion != null) {
            this.direccion = direccion;
        }

    }

}
