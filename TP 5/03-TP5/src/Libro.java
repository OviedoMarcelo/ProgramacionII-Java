/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase Libro
 *
 * @author Oviedo Marcelo
 * @date 15 sept 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class Libro {

    // Atributos de la clase 
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;
    // Zona de constructores 

    public Libro(String titulo, String isbn, Editorial editorial) {
        if (titulo != null && isbn != null && editorial != null) {
            this.titulo = titulo;
            this.isbn = isbn;
            this.editorial = editorial;
        }

    }

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this(titulo, isbn, editorial);
        if (autor != null) {
            this.autor = autor;
        }
    }

    // Zona de métodos de la clase
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        if (autor != null) {
            this.autor = autor;
        }

    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        if (editorial != null) {
            this.editorial = editorial;
        }

    }

}
