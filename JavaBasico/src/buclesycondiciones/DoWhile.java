/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buclesycondiciones;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*do {            
            linea cod1
            linea cod2
        } while (condicion);
         */

        int aleatorio = (int) (Math.random() * 100);
        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int intentos = 0;
        do {
            intentos++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero, por favor "));

            if (aleatorio < numero) {
                JOptionPane.showInputDialog("Debe ingresar otro numero mas bajo ");
            } else if (aleatorio > numero) {
                JOptionPane.showInputDialog("Debe ingresar otro numero mas alto ");
            }
        } while (numero != aleatorio);
        JOptionPane.showMessageDialog(null, "Numero Correcto " + numero + " con " + intentos + " Intentos ");
    }
}
