/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;

import javax.swing.*;

/**
 *
 * @author david
 */
public class EntradaEjemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre_usuario = JOptionPane.showInputDialog("Ingrese su nombre ");
        String edad = JOptionPane.showInputDialog("Ingrese su edad ");
        int edad_usuario = Integer.parseInt(edad);
        edad_usuario++;
        System.out.println("Hola " + nombre_usuario + " Edad " + (edad_usuario + 1));
    }

}
