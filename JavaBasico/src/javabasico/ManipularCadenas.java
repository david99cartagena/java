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
public class ManipularCadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "Hoy es un estupendo dia para aprender a programar en Java";

        String frase_resumen = frase.substring(0, 29) + "irnos a la playa y olvidarnos de todo..."+
        "y "+frase.substring(29, 57);
        System.out.println(frase_resumen);
    }

}
