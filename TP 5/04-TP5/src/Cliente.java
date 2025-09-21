/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase Cliente
 *
 * @author Oviedo Marcelo
 * @date 15 sept 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class Cliente {

    // Atributos de la clase 
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjetaDeCredito;
    // Zona de constructores 

    public Cliente(String nombre, String dni, TarjetaDeCredito tarjetaDeCredito) {
        this(nombre, dni);
        if (tarjetaDeCredito != null) {
            this.tarjetaDeCredito = tarjetaDeCredito;
        }
        
    }
    
    public Cliente(String nombre, String dni) {
        if (nombre != null && dni != null) {
            this.nombre = nombre;
            this.dni = dni;
        }
        
    }

    // Zona de métodos de la clase
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDni() {
        return dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }
    
    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
        if (tarjetaDeCredito != null) {
            this.tarjetaDeCredito = tarjetaDeCredito;
            if (tarjetaDeCredito.getCliente() != this) {
                tarjetaDeCredito.setCliente(this);
            }
        }
        
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + ", tarjetaDeCredito=" + tarjetaDeCredito.getNumero() + '}';
    }
    
}
