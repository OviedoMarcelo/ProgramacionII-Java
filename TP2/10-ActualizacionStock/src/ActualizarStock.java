
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Clase ActualizarStock
 *
 * @author Oviedo Marcelo
 * @date 24 ago 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class ActualizarStock {

    /**
     * Método principal - punto de entrada TODO: Implementar lógica de la
     * aplicación
     */
    public static void main(String[] args) {

        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner input = new Scanner(System.in);
        int stockActual,cantidadVendida,cantidadRecibida;
        System.out.println("Iniciando clase ActualizarStock...");
        System.out.println("Ingrese el stock actual del producto:");
        stockActual = input.nextInt();
        System.out.println("Ingrese la cantidad vendida:");
        cantidadVendida = input.nextInt();
        System.out.println("Ingrese la cantidad recibida:");
        cantidadRecibida = input.nextInt();
        stockActual = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: "+stockActual);

    }

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida+cantidadRecibida;
    }
    
}
