/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg03.universidad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oviedo Marcelo
 */
public class Universidad {

    // Atributos de la clase 
    private String nombre;
    private List<Profesor> profesores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();
    // Zona de constructores 

    public Universidad(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }
    // Zona de métodos de la clase

    public void agregarProfesor(Profesor profesor) {
        if (profesor != null && !this.profesores.contains(profesor)) {
            this.profesores.add(profesor);
        } else {
            System.out.println("El profesor ya se estaba en la lista.");
        }
    }

    public void agregarCurso(Curso curso) {
        if (curso != null && !this.cursos.contains(curso)) {
            this.cursos.add(curso);
        } else {
            System.out.println("El curso ya se encuentra en los cursos disponibles.");
        }
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Profesor profesor = this.buscarProfesorPorId(idProfesor);
        Curso curso = this.buscarCursoPorCodigo(codigoCurso);
        if (profesor != null && curso != null) {
            curso.setProfesor(profesor);
        }
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        int i = 0;
        int cantCursos = this.cursos.size();
        Curso cursoEncontrado = null;
        while (i < cantCursos && !this.cursos.get(i).getCodigo().equals(codigo)) {
            i++;
        }
        if (i < cantCursos) {
            cursoEncontrado = this.cursos.get(i);
        }
        return cursoEncontrado;
    }

    public Profesor buscarProfesorPorId(String id) {
        int i = 0;
        int cantProfesores = this.profesores.size();
        Profesor profesorEncontrado = null;
        while (i < cantProfesores && !this.profesores.get(i).getId().equals(id)) {
            i++;
        }
        if (i < cantProfesores) {
            profesorEncontrado = this.profesores.get(i);
        }
        return profesorEncontrado;
    }

    public void listarProfesores() {
        if (!this.profesores.isEmpty()) {
            System.out.println("++++Profesores++++");
            for (Profesor profesor : this.profesores) {
                System.out.println("---------------");
                System.out.println("ID: " + profesor.getId());
                System.out.println("Nombre: " + profesor.getNombre());
                System.out.println("Especialidad: " + profesor.getEspecialidad());
                System.out.println("---------------");
            }
        }
    }

    public void listarCursos() {
        if (!this.cursos.isEmpty()) {
            System.out.println("++++Cursos++++");
            for (Curso curso : this.cursos) {
                System.out.println("---------------");
                System.out.println("Codigo: " + curso.getCodigo());
                System.out.println("Nombre: " + curso.getNombre());
                System.out.println("Profesor: " + (curso.getProfesor() != null && curso.getProfesor().getNombre() != null ? curso.getProfesor().getNombre() : "Sin profesor asignado"));
                System.out.println("---------------");
            }
        }
    }

    public void eliminarCurso(String codigo) {
        Curso cursoEliminar = buscarCursoPorCodigo(codigo);
        if (cursoEliminar != null) {
            if (cursoEliminar.getProfesor() != null) {
                cursoEliminar.getProfesor().eliminarCurso(cursoEliminar);
            }
            this.cursos.remove(cursoEliminar);
        }
    }

    public void eliminarProfesor(String id) {
        Profesor profEliminar = buscarProfesorPorId(id);
        if (profEliminar != null) {
            ArrayList<Curso> cursosDesvincular = profEliminar.getCursos();
            for (Curso curso : cursosDesvincular) {
                curso.setProfesor(null);
            }
        }
        this.profesores.remove(profEliminar);
    }

}
