/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase Banco
 *
 * @author Oviedo Marcelo
 * @date 15 sept 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class Banco {

    // Atributos de la clase 
    private String nombre;
    private String cuit;
    private TarjetaDeCredito tarjeta;

    // Zona de constructores 
    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public Banco(String nombre, String cuit, TarjetaDeCredito tarjeta) {
        this.nombre = nombre;
        this.cuit = cuit;
        this.tarjeta = tarjeta;
    }

    // Zona de métodos de la clase

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    
}
