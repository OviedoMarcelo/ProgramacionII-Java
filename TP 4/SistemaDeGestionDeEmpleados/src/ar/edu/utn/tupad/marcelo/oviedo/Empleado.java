/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tupad.marcelo.oviedo;

import java.util.Objects;

/**
 * Clase Empleado
 *
 * @author Oviedo Marcelo
 * @date 1 sept 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public final class Empleado {

    private static int contador = 1; //Separo el contados del total de empleados para considerar el despido de un empleado
    private static int totalEmpleados = 0;
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    //Constructores
    public Empleado(String nombre, String puesto, double salario) {
        this.id = Empleado.contador++; //Le asigno un el id más alto y aumento el contador
        Empleado.totalEmpleados++;
        this.setNombre(nombre);
        this.setPuesto(puesto);
        this.setSalario(salario);
    }

    public Empleado(String nombre, String puesto) {
        this(nombre, puesto, 0);
    }

    public Empleado() {
        this("Sin nombre", "Sin puesto asignado", 0);
    }

    //Getters and setters
    public static int getTotalEmpleados() {
        return Empleado.totalEmpleados;
    }

    public static void setTotalEmpleados(int totalEmpleados) {
        Empleado.totalEmpleados = totalEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isBlank()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre no válido. No se registra nombre en el empleado.");
        }
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        if (puesto != null && !puesto.isBlank()) {
            this.puesto = puesto;
        } else {
            System.out.println("Puesto no válido. No se registra el puesto en el empleado.");
        }

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Salario ingresado no válido. No se guarda salario en el empleado.");
        }

    }

//Métodos de instancia
    public void actualizarSalario(double salario) {
        this.setSalario(Math.round(salario*100.0)/100.0);
    }

    public void actualizarSalario(int porc_salario) {
        double salarioActual = this.getSalario();
        double nuevoSalario = salarioActual * (1 + porc_salario / 100.0);
        double salarioRedondeado = Math.round(nuevoSalario*100.0)/100.0;        
        this.setSalario(salarioRedondeado);
    }

//Sobrecarga de métodos
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + Objects.hashCode(this.puesto);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.salario) ^ (Double.doubleToLongBits(this.salario) >>> 32));
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
        final Empleado other = (Empleado) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.salario) != Double.doubleToLongBits(other.salario)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.puesto, other.puesto);
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }

}  // Class end

