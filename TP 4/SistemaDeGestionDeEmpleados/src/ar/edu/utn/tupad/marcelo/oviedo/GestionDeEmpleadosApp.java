/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tupad.marcelo.oviedo;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Clase GestionDeEmpleadosApp
 *
 * @author Oviedo Marcelo
 * @date 1 sept 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class GestionDeEmpleadosApp {

    /**
     * Método principal - punto de entrada TODO: Implementar lógica de la
     * aplicación
     */
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("Iniciando clase GestionDeEmpleadosApp...");
        System.out.println("Genero 3 empleados con distintos los 3 constructores generados");
        Empleado empleado1 = new Empleado("Marcelo", "Programador", 1500000);
        Empleado empleado2 = new Empleado("Carlos", "Analista de negocio");
        Empleado empleado3 = new Empleado();
        System.out.println("------------------------");
        System.out.println("Empleados creados: 💼");
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println("------------------------");
        System.out.println("Se completan los datos del empleado 3 con datos incorrectos y correctos");
        empleado3.setNombre(" ");
        empleado3.setNombre("Mariano");
        empleado3.setPuesto("Consultor");
        empleado3.setSalario(850000.99);
        System.out.println("------------------------");
        System.out.println("Empleado 3 modificado: 💼");
        System.out.println(empleado3);
        System.out.println("------------------------");
        System.out.println("Se aumentan los sueldos de los 3 empleados. 2 empleados primeros un 30% y al consultor se aumento a un valor fijo");
        empleado1.actualizarSalario(30);
        empleado2.actualizarSalario(1500000.597);
        empleado3.actualizarSalario(30);
        System.out.println("------------------------");
        System.out.println("Sueldos aumentados con éxito 💵");
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println("------------------------");
        System.out.println("Total de empleados generados 👷 : "+Empleado.getTotalEmpleados());
    }

}
