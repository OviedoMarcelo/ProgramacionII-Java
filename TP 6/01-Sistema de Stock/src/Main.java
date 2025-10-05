
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 * Clase Main
 * 
 * @author Oviedo Marcelo
 * @date 29 sept 2025
 * 
 * Descripción:
 *  TODO: Agregar descripción de la clase
 */

public class Main {

    /**
     * Método principal - punto de entrada
     * TODO: Implementar lógica de la aplicación
     */
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner input = new Scanner(System.in);
        System.out.println("Iniciando clase Main...");
        //Se instancia la clase inventario y 5 productos
        Inventario inventario = new Inventario();
        Producto pro1=new Producto("Dulce de Leche", 1500, 5, CategoriaProducto.ALIMENTOS);
        Producto pro2=new Producto("Televisor", 750000, 10, CategoriaProducto.ELECTRONICA);
        Producto pro3=new Producto("Camiseta de fútbol", 85500, 12, CategoriaProducto.ROPA);
        Producto pro4=new Producto("Harina Integral", 1000, 10, CategoriaProducto.ALIMENTOS);
        Producto pro5=new Producto("Tabla de picar", 1500, 5, CategoriaProducto.HOGAR);
        inventario.agregarProducto(pro1);
        inventario.agregarProducto(pro2);
        inventario.agregarProducto(pro3);
        inventario.agregarProducto(pro4);
        inventario.agregarProducto(pro5);
        
        // Ejecuto el menú
        new Menu(inventario).run();
        
        
    }

}
