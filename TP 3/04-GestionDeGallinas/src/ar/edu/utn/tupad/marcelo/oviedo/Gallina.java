package ar.edu.utn.tupad.marcelo.oviedo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Clase Gallina
 *
 * @author Oviedo Marcelo
 * @date 1 sept 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class Gallina {

    private static int contador = 0;
    private final int id;
    private int edad;
    private int huevosPuestos;

    public Gallina() {
        this.id = ++contador;
    }

    public Gallina(int edad, int huevosPuestos) {

        this.id = ++contador;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    public Gallina(int edad) {

        this.id = ++contador;
        this.edad = edad;
        this.huevosPuestos = 0;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        if (huevosPuestos >= 0) {
            this.huevosPuestos = huevosPuestos;
        }

    }

    public void ponerHuevo() {
        this.huevosPuestos += 1;
    }

    public void ponerHuevo(int cantHuevos) {
        this.huevosPuestos += cantHuevos;
    }

    public void envejecer() {
        this.edad += 1;
    }

    public void mostrarEstado() {
        System.out.println("GallinaID: " + this.id);
        System.out.println("Edad: " + this.edad);
        System.out.println("Huevos puestos: " + this.huevosPuestos);
        System.out.println("------------------------------");
    }
}
