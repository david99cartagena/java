/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buclesycondiciones;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class UsoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*for (int i = 0; i < 20; i+=2) {
            System.out.println("David " + i);
        }
         */
        int arroba = 0;
        boolean punto = false;

        String email = JOptionPane.showInputDialog("Ingresa email ");
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                arroba++;
            }
            if (email.charAt(i) == '.') {
                punto = true;
            }
        }
        if (arroba == 1 && punto == true) {
            JOptionPane.showMessageDialog(null, "Correo correcto ");
        } else {
            JOptionPane.showMessageDialog(null, "Correo incorrecto ");
        }
    }

}
