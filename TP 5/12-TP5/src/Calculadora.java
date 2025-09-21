/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase Calculadora
 *
 * @author Oviedo Marcelo
 * @date 15 sept 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class Calculadora {

    // Atributos de la clase 
    private static final double PORCENTAJE_IMPUESTO = 0.25;
    // Zona de constructores 

    public Calculadora() {
    }

    // Zona de métodos de la clase
    
    //Es static para poder usar sin una instancia
    public static double calcularPrecioConImpuesto(Impuesto impuesto) {
        return impuesto.getMonto() * (1 + PORCENTAJE_IMPUESTO);
    }

}
