/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tupad.marcelo.oviedo;

/**
 * Clase Estudiante
 *
 * @author Oviedo Marcelo
 * @date 31 ago 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class Estudiante {

    //Atributes
    private String nombre;
    private String apellido;
    private String curso;
    private int calificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido != null) {
            this.apellido = apellido;
        }
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if (curso != null) {
            this.curso = curso;
        }

    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        if (calificacion >= 0 || calificacion <= 10) {
            this.calificacion = calificacion;
        }

    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\nCurso: " + this.curso + "\nCalificación: " + this.calificacion);
    }

    public void subirCalificacion(int puntos) {
        if ((this.calificacion + puntos) > 10) {
            this.calificacion = 10;
        } else {
            this.calificacion += puntos;
        }
    }

    public void bajarCalificacion(int puntos) {
        if ((this.calificacion - puntos) < 0) {
            this.calificacion = 0;
        } else {
            this.calificacion -= puntos;
        }
    }

}
