/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ar.edu.utn.tupad.marcelo.oviedo;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


/**
 * Clase DescuentoEspecial
 * 
 * @author Oviedo Marcelo
 * @date 24 ago 2025
 * 
 * Descripción:
 *  TODO: Agregar descripción de la clase
 */

public class DescuentoEspecial {

    /**
     * Método principal - punto de entrada
     * TODO: Implementar lógica de la aplicación
     */
    static double descuentoEspecial= 0.10;
    
    
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner input = new Scanner(System.in);
        double precio;
        System.out.println("Iniciando clase DescuentoEspecial...");
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        calcularDescuentoEspecial(precio);
    }

    static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio * descuentoEspecial;
        System.out.println("El descuento especial aplicado es de: "+descuentoAplicado);
        System.out.println("El precio final con descuento es de: "+(precio-descuentoAplicado));
    }
}
