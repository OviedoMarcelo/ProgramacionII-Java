/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 * Clase Menu
 * 
 * @author Oviedo Marcelo
 * @date 1 oct 2025
 * 
 * Descripción:
 *  TODO: Agregar descripción de la clase
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private final Inventario inventario;
    private final Scanner input = new Scanner(System.in);

    public Menu(Inventario inventario) {
        this.inventario = inventario;
    }

    public void run() {
        int opcion;
        do {
            imprimirMenu();
            opcion = leerEntero("Elegí una opción: 👇 ");
            switch (opcion) {
                case 1 -> crearProductosDemo();
                case 2 -> inventario.listarProductos();
                case 3 -> buscarPorId();
                case 4 -> filtrarPorCategoria();
                case 5 -> eliminarPorId();
                case 6 -> actualizarStock();
                case 7 -> mostrarTotalStock();
                case 8 -> mostrarProductoMayorStock();
                case 9 -> filtrarPorPrecio1000a3000();
                case 10 -> mostrarCategoriasDisponibles();
                case 0 -> System.out.println("Fin del programa. 👋️");
                default -> System.out.println("Opción inválida. ✖️");
            }
            System.out.println();
        } while (opcion != 0);
    }

    // ===== Opciones =====

    // 1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.
    private void crearProductosDemo() {
        System.out.println("Cargando 5 productos de ejemplo...");
        try {
            inventario.agregarProducto(new Producto("Yerba Mate 1kg", 3200, 20, CategoriaProducto.ALIMENTOS));
            inventario.agregarProducto(new Producto("Auriculares BT", 15000, 8, CategoriaProducto.ELECTRONICA));
            inventario.agregarProducto(new Producto("Remera Negra M", 5200, 15, CategoriaProducto.ROPA));
            inventario.agregarProducto(new Producto("Lámpara de mesa", 9800, 6, CategoriaProducto.HOGAR));
            inventario.agregarProducto(new Producto("Cafetera filtro", 27500, 4, CategoriaProducto.HOGAR));
            System.out.println("Listo. Se agregaron 5 productos.");
        } catch (Exception e) {
            System.out.println("Error creando productos: " + e.getMessage());
        }
    }

    // 3. Buscar un producto por ID y mostrar su información.
    private void buscarPorId() {
        String id = leerLinea("Ingresá el ID del producto: ");
        Producto p = inventario.buscarProductoPorId(id);
        if (p != null) {
            p.mostrarInfo();
        } else {
            System.out.println("No se encontró producto con id " + id);
        }
    }

    // 4. Filtrar y mostrar productos por categoría específica.
    private void filtrarPorCategoria() {
        CategoriaProducto cat = leerCategoria();
        if (cat == null) return;
        ArrayList<Producto> lista = inventario.filtrarPorCategoria(cat);
        if (lista.isEmpty()) {
            System.out.println("No hay productos en la categoría " + cat.name());
        } else {
            System.out.println("Productos en categoría " + cat.name() + ":");
            for (Producto p : lista) p.mostrarInfo();
        }
    }

    // 5. Eliminar un producto por su ID y listar los productos restantes.
    private void eliminarPorId() {
        String id = leerLinea("ID a eliminar: ");
        Producto eliminado = inventario.eliminarProducto(id);
        if (eliminado != null) {
            System.out.println("Eliminado: " + eliminado.getNombre());
        } else {
            System.out.println("No se encontró producto con id " + id);
        }
        inventario.listarProductos();
    }

    // 6. Actualizar el stock de un producto existente.
    private void actualizarStock() {
        String id = leerLinea("ID del producto a actualizar: ");
        int nuevaCant = leerEntero("Nueva cantidad: ");
        Producto actualizado = inventario.actualizarStock(id, nuevaCant);
        if (actualizado != null) {
            System.out.println("Stock actualizado. Nuevo estado:");
            actualizado.mostrarInfo();
        } else {
            System.out.println("No se encontró producto con id " + id);
        }
    }

    // 7. Mostrar el total de stock disponible.
    private void mostrarTotalStock() {
        int total = inventario.obtenerTotalStock();
        System.out.println("Stock total disponible: " + total + " unidades");
    }

    // 8. Obtener y mostrar el producto con mayor stock.
    private void mostrarProductoMayorStock() {
        Producto p = inventario.obtenerProductoConMayorStock();
        if (p != null) {
            System.out.println("Producto con mayor stock:");
            p.mostrarInfo();
        } else {
            System.out.println("No hay productos cargados.");
        }
    }

    // 9. Filtrar productos con precios entre $1000 y $3000.
    private void filtrarPorPrecio1000a3000() {
        ArrayList<Producto> lista = inventario.filtrarProductosPorPrecio(1000, 3000);
        if (lista.isEmpty()) {
            System.out.println("No hay productos entre $1000 y $3000.");
        } else {
            System.out.println("Productos entre $1000 y $3000:");
            for (Producto p : lista) p.mostrarInfo();
        }
    }

    // 10. Mostrar las categorías disponibles con sus descripciones.
    private void mostrarCategoriasDisponibles() {
        // llamo al metodo
        inventario.mostrarCategoriasDisponibles();

    }

    // ===== Helpers =====

    private void imprimirMenu() {
        System.out.println("""
            ===== Menú Inventario =====
            1) Crear 5 productos de ejemplo
            2) Listar todos los productos
            3) Buscar producto por ID
            4) Filtrar productos por categoría
            5) Eliminar producto por ID
            6) Actualizar stock de un producto
            7) Mostrar total de stock
            8) Mostrar producto con mayor stock
            9) Filtrar productos entre $1000 y $3000
            10) Mostrar categorías disponibles
            0) Salir
            """);
    }

    private int leerEntero(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                String s = input.nextLine().trim();
                return Integer.parseInt(s);
            } catch (NumberFormatException ex) {
                System.out.println("Ingresá un entero válido.");
            }
        }
    }

    private double leerDouble(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                String s = input.nextLine().trim().replace(',', '.'); // acepta coma
                return Double.parseDouble(s);
            } catch (NumberFormatException ex) {
                System.out.println("Ingresá un número válido.");
            }
        }
    }

    private String leerLinea(String prompt) {
        System.out.print(prompt);
        return input.nextLine().trim();
    }

    private CategoriaProducto leerCategoria() {
        System.out.println("Elegí una categoría:");
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println("- " + c.name());
        }
        String txt = leerLinea("Categoría: ").toUpperCase();
        try {
            return CategoriaProducto.valueOf(txt);
        } catch (IllegalArgumentException ex) {
            System.out.println("Categoría inválida.");
            return null;
        }
    }
}

