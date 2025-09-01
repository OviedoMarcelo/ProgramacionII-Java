/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ar.edu.utn.tupad.marcelo.oviedo;

import java.time.Year;


/**
 * Clase Libro
 * 
 * @author Oviedo Marcelo
 * @date 1 sept 2025
 * 
 * Descripción:
 *  TODO: Agregar descripción de la clase
 */

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo!=null) {
            this.titulo = titulo;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor!=null) {
            this.autor = autor;
        }

    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion >=0 && anioPublicacion <=Year.now().getValue()) {
            this.anioPublicacion = anioPublicacion;
        }else{
            System.out.println("Año de publicación incorrecto. No se actualiza.");
        }
    }

}
