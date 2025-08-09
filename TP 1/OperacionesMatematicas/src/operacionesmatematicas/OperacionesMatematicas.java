/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesmatematicas;

import java.util.Scanner;

/**
 *
 * @author ovied
 */
public class OperacionesMatematicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicializo el scanner
        Scanner scanner = new Scanner(System.in);
        int num1,num2;
        System.out.println("Bienvenido el programa para realizaar las operaciones básicas entre 2 números");
        System.out.println("Ingrese el primer número: ");
        num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el segundo número: ");
        num2 = Integer.parseInt(scanner.nextLine());
        
        //Operaciones
        System.out.println("\nResultados:");
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("División: " + ((double) num1 / num2)); //Es importante castear 1 número a double para que la división sea correcta
        } else {
            System.out.println("División: No es posible dividir por cero.");
        }
    }
    
}
