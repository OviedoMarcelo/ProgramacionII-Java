
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Clase Main
 *
 * @author Oviedo Marcelo
 * @date 1 oct 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class Main {

    /**
     * Método principal - punto de entrada TODO: Implementar lógica de la
     * aplicación
     * @param args
     */
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("Iniciando clase Main...");
        //Se iniciliza la biblioteca
        Biblioteca miBiblioteca = new Biblioteca("Biblioteca Sagrada");

        //Se generan 3 autores
        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("Jorge Luis Borges", "Argentino");
        Autor autor3 = new Autor("Isabel Allende", "Chilena");
        System.out.println("\n\n");

        //Se agregan 5 libros
        // Libros de Gabriel García Márquez
        miBiblioteca.agregarLibro("978-0307474728", "Cien años de soledad", 1967, autor1);
        miBiblioteca.agregarLibro("978-0307389732", "El amor en los tiempos del cólera", 1985, autor1);

        // Libros de Jorge Luis Borges
        miBiblioteca.agregarLibro("978-0142437889", "Ficciones", 1944, autor2);
        miBiblioteca.agregarLibro("978-0143105299", "El Aleph", 1949, autor2);

        // Libro de Isabel Allende
        miBiblioteca.agregarLibro("978-1501117015", "La casa de los espíritus", 1982, autor3);
        System.out.println("\n\n");

        //Se listan los libros
        miBiblioteca.listarLibros();
        System.out.println("\n\n");

        //Se busca un libro por ISBN
        String isbnBuscado = "978-0142437889";
        Libro libroBuscado = miBiblioteca.buscarLibroPorIsbn(isbnBuscado);
        if (libroBuscado != null) {
            System.out.println("Se encontó el libro: ");
            libroBuscado.mostrarInfo();
        } else {
            System.out.println("No se encontró el libro buscado de ISBN: " + isbnBuscado);
        }
        System.out.println("\n\n");

        //Buscar por año específico 
        int aniobuscado = 1944;
        ArrayList<Libro> librosPorAnio = miBiblioteca.filtrarLibrosPorAnio(aniobuscado);
        if (librosPorAnio != null) {
            System.out.println("Se encontraron libros publicados en " + aniobuscado);
            for (Libro libro : librosPorAnio) {
                libro.mostrarInfo();
            }
        } else {
            System.out.println("No se encontraron libros publicados en " + aniobuscado);
        }
        System.out.println("\n\n");

        //Se elimina  libro por ISBN
        String isbnEliminar = "978-0142437889";
        Libro libroEliminado = miBiblioteca.eliminarLibro(isbnEliminar);
        if (libroEliminado != null) {
            System.out.println("Se eliminó correctamente el libro:");
            libroEliminado.mostrarInfo();
            System.out.println("Biblioteca actualizada: ");
            miBiblioteca.listarLibros();
        }else{
            System.out.println("No se encontró el libro a eliminar. No se modifica la biblioteca.");
        }
        
        //Mostrar los libros totales
        System.out.println("Los libros actuales en la biblioteca son: "+miBiblioteca.obtenerCantidadLibro()+"\n");
        
        //Mostrar todos los autores disponibles
        System.out.println("Todos los autores disponibles son:");
        miBiblioteca.mostrarAutoresDisponibles();
    }

}
