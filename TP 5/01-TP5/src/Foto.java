/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase Foto
 *
 * @author Oviedo Marcelo
 * @date 15 sept 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class Foto {

    // Atributos de la clase 
    private String imagen;
    private String formato;

    // Zona de constructores 
    public Foto(String imagen, String formato) {
        if (imagen != null && formato != null) {
            this.imagen = imagen;
            this.formato = formato;
        }

    }

    // Zona de métodos de la clase
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        if (imagen != null) {
            this.imagen = imagen;
        }
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        if (formato != null) {
            this.formato = formato;
        }

    }

    @Override
    public String toString() {
        return "Foto{" + "imagen=" + imagen + ", formato=" + formato + '}';
    }

}
