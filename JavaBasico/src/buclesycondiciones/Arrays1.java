/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buclesycondiciones;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Arrays1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //int[] mi_matriz=new int[10];
        /*
        Forma 1
        int [] mi_matriz=new int[5];
        mi_matriz[0]=5;
        mi_matriz[1]=10;
        mi_matriz[2]=15;
        mi_matriz[3]=20;
        mi_matriz[4]=25;
         */
        //Forma 2 int [] mi_matriz={5,10,15,20,25};
        
        ///int mi_matriz2[] = new int[5];
        /*
        int[] mi_matriz = new int[5];
        mi_matriz[0] = 5;
        mi_matriz[1] = 10;
        mi_matriz[2] = 15;
        mi_matriz[3] = 20;
        mi_matriz[4] = 25;
        */
        int [] mi_matriz={5,10,16,12,14};
        for (int i = 0; i < mi_matriz.length; i++) {
            JOptionPane.showMessageDialog(null, "Valor de posicion " + i + " numero " + mi_matriz[i]);
        }

    }

}
