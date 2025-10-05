/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase Libro
 *
 * @author Oviedo Marcelo
 * @date 1 oct 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class Libro {

    // Atributos de la clase 
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    // Zona de constructores 
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = (isbn != null && !isbn.isBlank()) ? isbn : "SIN-ISBN";
        this.titulo = (titulo != null && !titulo.isBlank()) ? titulo : "SIN-TITULO";
        this.anioPublicacion = (anioPublicacion > 0 && anioPublicacion <= java.time.Year.now().getValue())
                ? anioPublicacion : 0;
        this.autor = (autor != null) ? autor : new Autor("DESCONOCIDO", "N/A");
    }

   // Getters and setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

     // Zona de métodos de la clase
    public void mostrarInfo(){
        System.out.println("++++++++++++++");
        System.out.println("Libro: "+titulo);
        System.out.println("Autor: "+autor.getNombre());
        System.out.println("Año de publicación:  "+anioPublicacion);
        System.out.println("ISBN: "+isbn);
        System.out.println("++++++++++++++");
    }
}
