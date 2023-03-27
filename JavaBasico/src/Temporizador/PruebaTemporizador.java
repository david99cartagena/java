/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Temporizador;

import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.*;
import java.util.Date;

/**
 *
 * @author Pc_Estiven
 */
public class PruebaTemporizador {

    public static void main(String[] args) {
        
        // instancia        new para inicializar
        DameLaHora oyente = new DameLaHora();
        Timer miTemporizador = new Timer(8000, oyente);
        miTemporizador.start();
        JOptionPane.showMessageDialog(null, "Presiona aceptar para detener");
        System.exit(0);

    }
}

class DameLaHora implements ActionListener {
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Date ahora = new Date();
        System.out.println("La hora cada 8 sg: " + ahora);
        //Sonido para notificar los segundos
        Toolkit.getDefaultToolkit().beep();

    }
}
