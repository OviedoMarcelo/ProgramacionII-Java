/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solicitardatosalusuario;

import java.util.Scanner;

/**
 *
 * @author ovied
 */
public class SolicitarDatosAlUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        int edad;
        System.out.println("Ingrese su nombre:");
        nombre = scanner.nextLine();
        System.out.println("Ingrese su edad:");
        edad = Integer.parseInt(scanner.nextLine());
        System.out.println("Su edad nombre es "+nombre+" y su edad es de "+edad+" años");
    }
    
}
