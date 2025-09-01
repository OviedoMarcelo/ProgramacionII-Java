/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tupad.marcelo.oviedo;

/**
 * Clase NaveEspacial
 *
 * @author Oviedo Marcelo
 * @date 1 sept 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class NaveEspacial {

    private String name;
    private int combustible;
    private boolean despego;

    public NaveEspacial(String name, int combustible) {
        this.name = name;
        this.combustible = combustible;
    }

    public NaveEspacial(String name) {
        this.name = name;
        this.combustible = 25;
    }

    public String getNave() {
        return name;
    }

    public void setNave(String name) {
        this.name = name;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        if (combustible >0) {
            this.combustible = combustible;
        }

    }

    public void despegar() {
        this.despego = true;
    }

    public void aterrizar() {
        this.despego = false;
    }

    public void avanzar(int distancia) {
        if (despego) {
            if (this.combustible >= distancia) {
                this.combustible -= distancia;
                System.out.println("La nave avanzó correctamente la distancia solicitada: " + distancia);
            } else {
                System.out.println("No se puedo avanzar, no hay combustible suficiente");
            }
        }else{
            System.out.println("La nave no despegó");
        }
    }

    public void mostrarInfo() {
        System.out.println("Nave: " + this.name);
        System.out.println("Combustible: " + this.combustible);
        System.out.println("La nave esta aterrizada: " + !this.despego);
    }
    
    public void cargarCombustible(int combustible){
        if (combustible > 0) {
            this.combustible += combustible;
        }
    }

}
