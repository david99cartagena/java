/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Uso_Vehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Coche micoche = new Coche();//Instaciar,Ejemplar de una clase
        //Clase Ejemplar Constructor

        /*
        Metodos Getters Captamos
        Metodos Setters modificamos
         */
 /*
        micoche.establece_color(JOptionPane.showInputDialog("Introduce un color para el coche"));

        System.out.println(micoche.dime_datos_generales());

        System.out.println(micoche.dime_color());

        micoche.configurar_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero? "));

        System.out.println(micoche.dime_asientos());

        micoche.configura_aireacondicionado(JOptionPane.showInputDialog("¿Tiene Aire Acondicionado de cuero? "));

        System.out.println(micoche.dime_aireacondicionado());

        System.out.println(micoche.dime_peso_coche());

        System.out.println("El precio final del coche es: " + micoche.precio_coche());
         */

 /*Herencia

        Forma correcta

        Vehiculo
        Es un
        Coche,Camion,Furgoneta

         */
        Coche micoche1 = new Coche();
        micoche1.establece_color("rojo");

        Furgoneta mifurgoneta1 = new Furgoneta(7, 580);
        mifurgoneta1.establece_color("morada");
        mifurgoneta1.configurar_asientos("si");
        mifurgoneta1.configura_aireacondicionado("si");

        System.out.println(micoche1.dime_datos_generales() + micoche1.dime_color());
        System.out.println(mifurgoneta1.dime_datos_generales() + mifurgoneta1.dimeDatosFurgoneta());

    }

}
