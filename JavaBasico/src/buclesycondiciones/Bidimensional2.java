/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buclesycondiciones;

/**
 *
 * @author david
 */
public class Bidimensional2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrix = {
            {10, 15, 20, 25, 30},
            {2, 6, 8, 10, 12},
            {12, 16, 18, 110, 112},
            {22, 66, 88, 0, 1000}
        };

        for (int[] fila : matrix) {
            System.out.println();
            for (int z : fila) {
                System.out.print(z + " ");
            }
        }

    }

}
