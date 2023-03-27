/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Temporizador;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

/**
 *
 * @author Pc_Estiven
 */
public class PruebaTemporizador2 {

    public static void main(String[] args) {

        Reloj mireloj = new Reloj(5000, true);
        mireloj.enMarcha();
        JOptionPane.showMessageDialog(null, "Presiona aceptar para detener");
        System.exit(0);
    }
}

class Reloj {

    public Reloj(int intervalo, boolean sonido) {
        this.intervalo = intervalo;
        this.sonido = sonido;

    }

    public void enMarcha() {
        ActionListener oyente = new DameLaHora2();
        Timer mitemporizador = new Timer(intervalo, oyente);
        mitemporizador.start();
    }

    private int intervalo;
    private boolean sonido;
    
    //Se usa para evitar metodos de acceso getters y setters
    private class DameLaHora2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Date ahora = new Date();
            System.out.println("La hora cada 5 sg: " + ahora);
            if (sonido) {
                Toolkit.getDefaultToolkit().beep();
            }

        }
    }

}
