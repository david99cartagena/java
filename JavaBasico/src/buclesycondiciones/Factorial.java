/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buclesycondiciones;

import javax.swing.*;

/**
 *
 * @author david
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long resultado = 1l;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

        for (int i = numero; i > 0; i--) {
            resultado = resultado * i;
        }
        JOptionPane.showMessageDialog(null, "El Factorial de " + numero + "! es: " + resultado);
    }

}
