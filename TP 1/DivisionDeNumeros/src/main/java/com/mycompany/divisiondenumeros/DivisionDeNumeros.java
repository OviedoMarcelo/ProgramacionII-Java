/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.divisiondenumeros;

import java.util.Scanner;

/**
 *
 * @author oviedo Marcelo
 */
public class DivisionDeNumeros {

    public static void main(String[] args) {
        //Declaración de variables y scanner
        int num1, num2;
        double num3,num4;
        Scanner scanner = new Scanner(System.in);
        //Se solicitan los valores
        System.out.println("Ingrese el primer número Int:");
        num1= Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el segundo número Int:");
        num2= Integer.parseInt(scanner.nextLine());
        
        //Se divide con int
        System.out.println("División de "+num1+"/"+num2+" como int = "+num1/num2);
        
        //Se solicitan los valores doubles
        System.out.println("Ingrese el primer número Int:");
        num3= Double.parseDouble(scanner.nextLine());
        System.out.println("Ingrese el segundo número Int:");
        num4= Double.parseDouble(scanner.nextLine());
        
        //Se divide con double
        System.out.println("División de "+num1+"/"+num2+" como double = "+(double)num1/num2);
        
    }
}
