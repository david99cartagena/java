/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;

import java.util.*;

/**
 *
 * @author david
 */
public class Uso_Tallas {

    //enum talla{Pequeño,Mediano,Grande};
    enum Talla {
        MINI("S"), MEDIANO("M"), GRANDE("L"), MUYGRANDE("XL");

        private String abreviatura;

        private Talla(String abreviatura) {
            this.abreviatura = abreviatura;
        }

        public String dameAbreviatura() {
            return abreviatura;
        }
    }

    public static void main(String[] args) {
        /*talla s=talla.Pequeño;
        talla m=talla.Mediano;
        talla g=talla.Grande;*/
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una talla: MINI,MEDIANO,GRANDE,MUYGRANDE");
        String entrada_datos = entrada.next().toUpperCase();
        Talla la_talla = Enum.valueOf(Talla.class, entrada_datos);
        System.out.println("Talla = " + la_talla);
        System.out.println("Abreviatura = " + la_talla.dameAbreviatura());

    }

}
