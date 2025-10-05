
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 * Clase Biblioteca
 * 
 * @author Oviedo Marcelo
 * @date 1 oct 2025
 * 
 * Descripción:
 *  TODO: Agregar descripción de la clase
 */

public class Biblioteca {


    // Atributos de la clase 
    private String nombre;
    private ArrayList<Libro> libros;
    // Zona de constructores 
    public Biblioteca(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
            this.libros = new ArrayList<>();
        }
    }
    
    
    // Zona de métodos de la clase
    public void agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor){
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        this.libros.add(nuevoLibro);
        System.out.println("Libro agregado correctamente 📖");
        nuevoLibro.mostrarInfo();
    }
    
    public void listarLibros(){
        System.out.println("Todos los libros disponibles son 👇📖");
        for(Libro libro : libros ){
            libro.mostrarInfo();
        }
        System.out.println("----------------------");
    }
    
    public Libro buscarLibroPorIsbn(String isbn){
        int i = 0;
        Libro libroEncontrado = null;
        while (i< libros.size() && !this.libros.get(i).getIsbn().equals(isbn)){
            i++;
        }
        if(i<libros.size()){
            libroEncontrado = this.libros.get(i);
        }
        return libroEncontrado;
    }
    
    public Libro eliminarLibro(String isbn){
        Libro libroElim = buscarLibroPorIsbn(isbn);
        this.libros.remove(libroElim);
        return libroElim;
    }
    
    public int obtenerCantidadLibro(){
        return (libros!=null ? libros.size() : 0);
    }
    
    public ArrayList<Libro> filtrarLibrosPorAnio(int anio){
        ArrayList<Libro> librosFiltrados = new ArrayList<>();
        for (Libro libro : libros){
            if (libro.getAnioPublicacion()== anio) {
               librosFiltrados.add(libro);
            }
        }
        return librosFiltrados;
    }
    
    public void mostrarAutoresDisponibles(){
        Set<Autor> autores = new HashSet<>();
        for (Libro libro : libros){
            autores.add(libro.getAutor());
        }
        for (Autor autor : autores){
            autor.mostrarInfo();
        }
    }
    
}
