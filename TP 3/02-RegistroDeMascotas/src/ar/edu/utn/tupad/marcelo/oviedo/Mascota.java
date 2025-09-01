/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tupad.marcelo.oviedo;

/**
 * Clase Mascota
 *
 * @author Oviedo Marcelo
 * @date 31 ago 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class Mascota {

    private String nombre;
    private String especie;
    private int edad;

//Constructorores
    
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public Mascota() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + this.nombre + "\nEdad: " + this.edad + "\nEspecie: " + this.especie);
    }

    public void cumplirAnios() {
        this.edad += 1;
    }
}
