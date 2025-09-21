/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 * Clase Render
 * 
 * @author Oviedo Marcelo
 * @date 15 sept 2025
 * 
 * Descripción:
 *  TODO: Agregar descripción de la clase
 */

public class Render {

    // Atributos de la clase 
    private String formato;
    private Proyecto proyecto;
    // Zona de constructores 

    public Render(String formato) {
        this.formato = formato;
    }
    
    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }
    // Zona de métodos de la clase

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public void mostrarInfo() {
        System.out.println("Renderizando proyecto '" + proyecto.getNombre() + 
                           "' en formato " + formato);
    }

         
    @Override
    public String toString() {
        return "Render{" + "formato=" + formato + ", proyecto=" + proyecto + '}';
    }


}
