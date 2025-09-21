/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 * Clase Documento
 * 
 * @author Oviedo Marcelo
 * @date 15 sept 2025
 * 
 * Descripción:
 *  TODO: Agregar descripción de la clase
 */

public class Documento {

    // Atributos de la clase 
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;
    // Zona de constructores 
    public Documento(String titulo, String contenido, FirmaDigital firmaDigital,String codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(codigoHash,  fecha,  usuario);
    }
    
    // Zona de métodos de la clase

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    
}
