/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class07.exercise.classroom;

import javax.swing.JOptionPane;

/**
 *
 * @author alessandro.jean
 */
public class Exercise03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] x = new int[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Número da posição %d:", i), "0"));
        }

        String v = "";
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] > x[j]) {
                    x[i] += x[j];
                    x[j] = x[i] - x[j];
                    x[i] = x[i] - x[j];
                }
            }
            v += String.format("%d%s", x[i], i == x.length - 1 ? "" : ", ");
        }

        JOptionPane.showMessageDialog(null, String.format("Vetor ordenado em ordem crescente:%n%s", v));
    }

}
