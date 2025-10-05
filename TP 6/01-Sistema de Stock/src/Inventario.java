
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Clase Inventario
 *
 * @author Oviedo Marcelo
 * @date 29 sept 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class Inventario {

// Atributos    
    private ArrayList<Producto> productos = new ArrayList<>();

// Constructor
//Metodos personalizados
    /**
     * Agrega un producto a la lista de productos del carrito.
     * <p>
     * Si el producto pasado como parámetro es distinto de {@code null}, se
     * añade a la colección interna. En caso contrario, se muestra un mensaje
     * indicando que no se pudo agregar.
     * </p>
     *
     * @param p el producto a agregar; no debe ser {@code null}
     */
    public void agregarProducto(Producto p) {
        if (p != null) {
            this.productos.add(p);
        } else {
            System.out.println("No se puedo agregar el producto");
        }
    }

    public void listarProductos() {
        System.out.println("Se listaran todos los productos cargados");
        for (Producto producto : productos) {
            producto.mostrarInfo();
        }
        System.out.println("Fin del listado");
    }

    public Producto buscarProductoPorId(String id) {
        int i = 0;
        Producto prodEncontrado = null;
        while (i < productos.size() && !this.productos.get(i).getId().equals(id)) {
            i++;
        }
        if (i < productos.size()) {
            prodEncontrado = this.productos.get(i);
        }
        return prodEncontrado;
    }

    public Producto eliminarProducto(String id) {
        Producto prodElim = buscarProductoPorId(id);
        this.productos.remove(prodElim);
        return prodElim;
    }

    public Producto actualizarStock(String id, int nuevaCantidad) {
        Producto productoAct = buscarProductoPorId(id);
        productoAct.setCantidad(nuevaCantidad);
        return productoAct;
    }

    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> prodEncontrados = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getCategoria() == categoria) {
                prodEncontrados.add(producto);
            }
        }
        return prodEncontrados;
    }

    public int obtenerTotalStock() {
        int contadorStock = 0;
        for (Producto producto : productos) {
            contadorStock += producto.getCantidad();
        }
        return contadorStock;
    }

    public Producto obtenerProductoConMayorStock() {
        int mayorStock = -1;
        Producto prodMayorStock = null;
        for (Producto producto : productos) {
            if (producto.getCantidad() > mayorStock) {
                prodMayorStock = producto;
                mayorStock = producto.getCantidad();
            }
        }
        return prodMayorStock;
    }

    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> prodEncontrados = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                prodEncontrados.add(producto);
            }
        }
        return prodEncontrados;
    }

    public void mostrarCategoriasDisponibles() {
        System.out.println("Categorías disponibles:");
        for (CategoriaProducto c : CategoriaProducto.values()) {
            try {
                // si tu enum tiene getDescripcion()
                System.out.println("- " + c.name() + " — " + c.getDescripcion());
            } catch (NoSuchMethodError | UnsupportedOperationException e) {
                // fallback si no hay descripción
                System.out.println("- " + c.name());
            }
        }
    }

}
