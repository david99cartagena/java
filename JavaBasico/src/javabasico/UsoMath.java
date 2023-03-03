/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;

/**
 *
 * @author david
 */
public class UsoMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        /*Clase predefinidas
        String, Math, Array, Thread
        */

        /*double raiz = Math.sqrt(9);
        System.out.println(resultado);*/
        
        /*double num1 = 5.85;
        int resultado =(int) Math.round(num1);
        // refundicion
        System.out.println(resultado);*/
        double base = 5;
        double exponente = 3;
        int resultado = (int) Math.pow(base, exponente);
        System.out.println("el resultado de " + base + " elevado a " + exponente + " es " + resultado);

    }

}
