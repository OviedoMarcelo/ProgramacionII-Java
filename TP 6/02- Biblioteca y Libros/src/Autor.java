
import java.util.Objects;
import java.util.UUID;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Clase Autor
 *
 * @author Oviedo Marcelo
 * @date 1 oct 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class Autor {

    // Atributos de la clase 
    private String id;
    private String nombre;
    private String nacionalidad;
    // Zona de constructores 

    public Autor(String nombre, String nacionalidad) {
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    // Zona de métodos de la clase
    //Getters and setter
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    //Métodos de clase adicionales
    public void mostrarInfo() {
        System.out.println("+++++++++++++++++"
                +"\nID: "+id
                + "\nAutor: " + nombre
                + "\nNacionalidad: " + nacionalidad+
                "\n+++++++++++++++++");
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.nacionalidad);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Autor other = (Autor) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.nacionalidad, other.nacionalidad);
    }

}
