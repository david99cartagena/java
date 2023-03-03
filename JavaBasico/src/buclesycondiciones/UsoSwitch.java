/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buclesycondiciones;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author david
 */
public class UsoSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);

        System.out.println("Elige una opcion"
                + "\n1: Cuadrado "
                + "\n2: Rectangulo "
                + "\n3: Triangulo "
                + "\n4: Circulo");

        int figura = entrada.nextInt();

        switch (figura) {

            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado "));
                System.out.print("El area del cuadrado es " + Math.pow(lado, 2));
                break;
            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la Base "));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la Altura "));
                System.out.print("El area del rectangulo es " + base * altura);
                break;
            case 3:
                base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la Base "));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la Altura "));
                System.out.print("El area del triangulo es " + (base * altura) / 2);
                break;
            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio "));
                System.out.print("El area del circulo es ");
                System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));
                break;
            default:
                System.out.print("la opcion no es correcta ");
        }

    }

}
