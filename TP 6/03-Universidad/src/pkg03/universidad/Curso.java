/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg03.universidad;

import java.util.Objects;
import java.util.UUID;

/**
 * Clase Curso
 *
 * @author Oviedo Marcelo
 * @date 3 oct 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class Curso {

    // Atributos de la clase 
    private String codigo;
    private String nombre;
    private Profesor profesor;
    // Zona de constructores 

    public Curso(String nombre, Profesor profesor) {
        if (nombre != null && profesor != null) {
            this.codigo = UUID.randomUUID().toString();
            this.nombre = nombre;
            this.profesor = profesor;
        }
    }

    public Curso(String nombre) {
        if (nombre != null ) {
            this.codigo = UUID.randomUUID().toString();
            this.nombre = nombre;
        }
    }
    // Zona de métodos de la clase

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        if (this.profesor == profesor) {
            return; // si ya está asignado, no hace nada
        }
        Profesor anterior = this.profesor;
        this.profesor = profesor;

        // Eliminar la relación previa
        if (anterior != null) {
            anterior.eliminarCurso(this);
        }

        // Sincronizar nueva relación
        if (profesor != null && !profesor.getCursos().contains(this)) {
            profesor.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        if (profesor != null) {
            System.out.println("Profesor asignado al curso:");
            System.out.println("ID: " + this.profesor.getId());
            System.out.println("Nombre: " + this.profesor.getNombre());
            System.out.println("Especialidad: " + this.profesor.getEspecialidad());
        } else {
            System.out.println("Este curso no tiene asignado un profesor.");
        }

    }


    //Sobre escritura de métodos
    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", nombre=" + nombre + ", profesor=" + profesor + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Curso other = (Curso) obj;
        return Objects.equals(this.codigo, other.codigo);
    }

}
