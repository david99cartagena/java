/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;

import java.util.*;

/**
 *
 * @author david
 */
public class EntradaEjemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre ");
        String nombre_usuario = entrada.nextLine();

        System.out.println("Introduce tu edad ");
        int edad = entrada.nextInt();

        System.out.println(" hola " + nombre_usuario + " edad para el año sig   " + (edad + 1));
    }

}
