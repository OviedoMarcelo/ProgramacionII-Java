/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase Bateria
 *
 * @author Oviedo Marcelo
 * @date 15 sept 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class Bateria {

    // Atributos de la clase 
    private String modelo;
    private String capacidad;

    // Zona de constructores 
    public Bateria(String modelo, String capacidad) {
        if (modelo != null && capacidad != null) {
            this.modelo = modelo;
            this.capacidad = capacidad;
        }
    }

    // Zona de métodos de la clase
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null) {
            this.modelo = modelo;
        }

    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        if (capacidad!=null) {
            this.capacidad = capacidad;
        }
    }

    @Override
    public String toString() {
        return "Bateria{" + "modelo=" + modelo + ", capacidad=" + capacidad + '}';
    }
    
    

}
