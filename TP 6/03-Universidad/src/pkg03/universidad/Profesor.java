/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg03.universidad;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Clase Profesor
 *
 * @author Oviedo Marcelo
 * @date 3 oct 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class Profesor {

    // Atributos de la clase 
    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos = new ArrayList<>();
    // Zona de constructores 

    public Profesor(String nombre, String especialidad) {
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    // Basic setters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

//Metodos adicionales de clases
    public void agregarCurso(Curso curso) {
        if (curso != null && !cursos.contains(curso)) {
            cursos.add(curso);
            if (curso.getProfesor() == null || !curso.getProfesor().equals(this)) {
                curso.setProfesor(this);
            }
        }
    }

    public void eliminarCurso(Curso curso) {
        if (curso != null && this.cursos.contains(curso)) {
            this.cursos.remove(curso);
            if (curso.getProfesor() == this) {
                curso.setProfesor(null);
            }
        }
    }

    public void listarCursos() {
        if (!cursos.isEmpty()) {
            System.out.println("Cursos asignados al profesor:");
            for (Curso curso : cursos) {
                System.out.println("Código: " + curso.getCodigo());
                System.out.println("Nombre: " + curso.getNombre());
            }
        } else {
            System.out.println("El profesor aún no tiene cursos asignados.");
        }

    }

    public void mostrarInfo() {
        System.out.println("ID: " + this.id);
        System.out.println("Profesor: " + this.nombre);
        System.out.println("Especialidad: " + this.especialidad);
        System.out.println("Cantidad de cursos: " + this.cursos.size());
    }

}


