/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buclesycondiciones;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class AdivinaNumeroWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aleatorio = (int) (Math.random() * 100);
        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int intentos = 0;

        while (numero != aleatorio) {
            intentos++;

            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero, por favor "));

            if (aleatorio < numero) {
                JOptionPane.showInputDialog("Debe ingresar otro numero mas bajo ");
            } else if (aleatorio > numero) {
                JOptionPane.showInputDialog("Debe ingresar otro numero mas alto ");
            }

        }
        JOptionPane.showMessageDialog(null, "Numero Correcto " + numero + " con " + intentos+" Intentos ");
    }

}
