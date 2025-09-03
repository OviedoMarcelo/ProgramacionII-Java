/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tupad.marcelo.oviedo;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Clase ContadorDePosNegCer
 *
 * @author Oviedo Marcelo
 * @date 23 ago 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class ContadorDePosNegCer {

    /**
     * Método principal - punto de entrada TODO: Implementar lógica de la
     * aplicación
     */
    public static final int NUMEROS_A_INGRESAR = 10;

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        int numero;
        int positivos = 0, negativos =0 ,ceros = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Iniciando clase ContadorDePosNegCer...");
        System.out.println("Se solicitaran " + NUMEROS_A_INGRESAR + " numeros y se indicaran cuantos son positivos, cuantos negativos y cuantos ceros");
        for (int i = 1; i <= NUMEROS_A_INGRESAR; i++) {
            System.out.print("Ingrese el número n: ° "+i);
            numero=input.nextInt();
            if (numero>0) {
                positivos+=1;
            }else if (numero<0) {
                negativos+=1;
            }else{
                ceros+=1;
            }
            
        }
        System.out.println("Resultado: "
                +"\nTotal de números positivo: "+positivos
                + "\nTotal de números negativos: "+negativos
                +"\nTotal de ceros: "+ceros);
    }

}
