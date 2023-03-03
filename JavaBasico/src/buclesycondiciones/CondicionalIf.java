/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buclesycondiciones;

import java.util.*;

/**
 *
 * @author david
 */
public class CondicionalIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Condicional if
        if(true){
        } 
        else {
        }
         */
        //Condicional switch
        /*
        switch (valor a evaluar){
            caso valor 1;
                codigo a ejecutar;
                break;
            caso valor 2;
                codigo a ejecutar;
                break;
        }
         */
        //Evalua edad
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su edad usuario, por favor ");

        int edad = entrada.nextInt();

        if (edad < 18) {
            System.out.print("Eres un adolecente ");
        } else if (edad < 40) {
            System.out.print("Eres un joven ");
        } else if (edad < 65) {
            System.out.print("Eres maduro ");
        } else {
            System.out.print("cuidese ");
        }

    }
}
