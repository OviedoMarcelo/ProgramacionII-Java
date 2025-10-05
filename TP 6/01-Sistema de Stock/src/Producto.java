/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.UUID;

/**
 * Clase Producto
 *
 * @author Oviedo Marcelo
 * @date 29 sept 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class Producto {

    //Atributos
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    //Constructores
    Producto(String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        if (nombre != null && precio > 0 && cantidad >= 0 && categoria != null) {
            this.id = UUID.randomUUID().toString();
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
            this.categoria = categoria;
        } else {
            System.out.println("No se pudo generar el producto. Verifique los datos ingresados");
        }

    }

    // Métodos
    public void mostrarInfo() {
        System.out.println("++++++++++++++++++++++++"
                + "\nProducto ID: " + this.id
                + "\nNombre: " + this.nombre
                + "\nPrecio: $" + this.precio
                + "\nCantidad en Stock: " + this.cantidad
                + "\nCategoría: " + this.categoria.name()
                + "\n++++++++++++++++++++++++");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", categoria=" + categoria + '}';
    }

}
