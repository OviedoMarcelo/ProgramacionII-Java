/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase Usuario
 *
 * @author Oviedo Marcelo
 * @date 15 sept 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class Usuario {

    // Atributos de la clase 
    private String nombre;
    private String dni;
    private Celular celular;
    // Zona de constructores 

    public Usuario(String nombre, String dni) {
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
    
    public Celular getCelular() {
        return celular;
    }
    
    public void setCelular(Celular celular) {
        if (celular != null) {
            this.celular = celular;
            if (this != celular.getUsuario()) {
                celular.setUsuario(this);
                
            }
        }
        
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + ", celular=" + celular.getMarca()+" "+celular.getModelo() +celular.getBateria().toString()+'}';
    }
    
    
    
}
