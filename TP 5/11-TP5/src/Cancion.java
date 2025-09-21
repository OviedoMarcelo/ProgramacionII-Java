/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 * Clase Cancion
 * 
 * @author Oviedo Marcelo
 * @date 15 sept 2025
 * 
 * Descripción:
 *  TODO: Agregar descripción de la clase
 */

public class Cancion {

     // Atributos de la clase 
    private String titulo;
    private String artista;
    // Zona de constructores 
    
    public Cancion(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }
    // Zona de métodos de la clase  }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", artista=" + artista + '}';
    }
    


}
