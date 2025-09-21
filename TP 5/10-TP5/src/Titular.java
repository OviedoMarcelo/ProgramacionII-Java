/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 * Clase Titular
 * 
 * @author Oviedo Marcelo
 * @date 15 sept 2025
 * 
 * Descripción:
 *  TODO: Agregar descripción de la clase
 */

public class Titular {

       // Atributos de la clase 
    private String nombre;
    private String dni;
    private CuentaBancaria cuentaBancaria;
   
    // Zona de constructores 
    
public Titular(String nombre, String dni, CuentaBancaria cuentaBancaria) {
    this.nombre = nombre;
    this.dni = dni;
    this.cuentaBancaria = cuentaBancaria;
}

public Titular(String nombre, String dni) {
    this.nombre = nombre;
    this.dni = dni;
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

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + ", cuentaBancaria=" + cuentaBancaria.getCbu() + '}';
    }



    
    

}
