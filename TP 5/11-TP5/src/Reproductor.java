/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase Reproductor
 *
 * @author Oviedo Marcelo
 * @date 15 sept 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class Reproductor {

    // Atributos de la clase 
    private Cancion[] playlist;
    // Zona de constructores 

    public Reproductor() {
        System.out.println("Se instancia un reproductor");
    }
    // Zona de métodos de la clase

    public Cancion[] getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Cancion[] playlist) {
        this.playlist = playlist;
    }
    
    public void reproducir(Cancion cancion){
        System.out.println("Reproduciendo: "+cancion.getTitulo()+" "+" de " +cancion.getArtista());
    }

}
