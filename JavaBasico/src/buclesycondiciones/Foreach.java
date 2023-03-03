/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buclesycondiciones;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Foreach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        String[] paises = new String[8];
//        for (int i = 0; i < 8; i++) {
//            paises[i] = JOptionPane.showInputDialog("Ingrese el pais " + (i + 1));
//        }
//        /*paises[0] = "España";
//        paises[1] = "Pan";
//        paises[2] = "Lim";
//        paises[3] = "Edu";
//        paises[4] = "mm";
//        paises[5] = "cc";
//        paises[6] = "ddd";
//        paises[7] = "ddd";*/
//        //String[] paises ={"España","Pan","Lim","Edu","mm","cc","ddd","ddd"};
//        /*for (int i = 0; i < paises.length; i++) {
//            System.out.println("Pais " + (i + 1) + " " + paises[i]);
//        }*/
//
//        for (String elemento : paises) {
//            System.out.println("Pais " + elemento);
//        }
        int[] matriz_aleatorios = new int[80];
        for (int i = 0; i < matriz_aleatorios.length; i++) {
            matriz_aleatorios[i] = (int) Math.round(Math.random() * 100);
        }
        for (int numeros : matriz_aleatorios) {
            System.out.print(numeros+" ");
        }
    }

}
