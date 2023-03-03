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
public class PesoIdeal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String genero = "";

        do {
            genero = JOptionPane.showInputDialog("Introduec tu genero (H/M)");

        } while (genero.equalsIgnoreCase("H") == false
                && genero.equalsIgnoreCase("M") == false);

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su altura en cm "));
        int pesoideal = 0;
        if (genero.equalsIgnoreCase("H")) {
            pesoideal = altura - 110;
        } else if (genero.equalsIgnoreCase("M")) {
            pesoideal = altura - 120;
        }
        JOptionPane.showMessageDialog(null, "Tu peso ideal es " + pesoideal + "Kg");
    }

}
