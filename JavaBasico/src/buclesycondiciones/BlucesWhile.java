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
public class BlucesWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
        Bucle indeterminados
        while(condicion){
        mientras
       
        linea 1
        linea 2
        }
        
        Do - while
        
        Bucle determinados
        For
        For - each

         */
        String clave = "David";
        String pass = "";

        while (clave.equals(pass) == false) {
            pass = JOptionPane.showInputDialog("Ingrese la contraseña ");
            if (clave.equals(pass) == false) {

                System.out.println("Contraseña incorrecta ");
            }

        }
        System.out.println("Contraseña ok acceso permitido");

    }

}
