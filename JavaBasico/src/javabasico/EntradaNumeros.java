/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class EntradaNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*double x = 10000.0;
        System.out.printf("%1.2f", x / 3);*/
        String num1 = JOptionPane.showInputDialog("introduce un numero");
        double num2 = Double.parseDouble(num1);
        System.out.print("la raiz de " + num2 + " es ");
        System.out.printf("%1.4f", Math.sqrt(num2));
    }

}
