/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class04.exercise.homework;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alessandro.jean
 */
public class Exercise01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n50 = Integer.parseInt(JOptionPane.showInputDialog(null, "Notas de R$50:", "0")),
                n10 = Integer.parseInt(JOptionPane.showInputDialog(null, "Notas de R$10:", "0")),
                n5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Notas de R$5:", "0")),
                n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Notas de R$1:", "0"));

        while (true) {
            if (n50 == 0 && n10 == 0 && n5 == 0 && n1 == 0) {
                JOptionPane.showMessageDialog(null, "Nenhuma nota disponível!\nEncerrando o programa.");
                break;
            }

            int v = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor para saque:\n(Digite \"0\" para cancelar.", "0")), vt = v;
            int n50t = 0, n10t = 0, n5t = 0, n1t = 0;
            int n50a = n50, n10a = n10, n5a = n5, n1a = n1;

            if (v == 0) {
                break;
            }

            if (n50 > 0) {
                n50t = vt / 50;
                if (n50 >= n50t) {
                    vt = n50t == 0 ? vt : vt % 50;
                } else {
                    vt = vt - n50 * 50;
                    n50t = n50;
                }
                n50 -= n50t;
            }
            if (n10 > 0) {
                n10t = vt / 10;
                if (n10 >= n10t) {
                    vt = n10t == 0 ? vt : vt % 10;
                } else {
                    vt = vt - n10 * 10;
                    n10t = n10;
                }
                n10 -= n10t;
            }
            if (n5 > 0) {
                n5t = vt / 5;
                if (n5 >= n5t) {
                    vt = n5t == 0 ? vt : vt % 5;
                } else {
                    vt = vt - n5 * 5;
                    n5t = n5;
                }
                n5 -= n5t;
            }
            if (n1 > 0) {
                n1t = vt;
                if (n1 >= n1t) {
                    vt = n1;
                } else {
                    vt = vt - n1;
                    n1t = n1;
                }
                n1 -= n1t;
            }

            if ((n1t + n5t * 5 + n10t * 10 + n50t * 50) == v) {
                JOptionPane.showMessageDialog(null, String.format("Valor sacado: R$%d\n\nNotas:\nR$50: %2d\nR$10: %2d\nR$5: %3d\nR$1: %3d", v, n50t, n10t, n5t, n1t));
            } else {
                n1 = n1a;
                n5 = n5a;
                n10 = n10a;
                n50 = n50a;
                JOptionPane.showMessageDialog(null, "Saque indisponível.");
            }

            //System.out.printf("N50: %d, N10: %d, N5: %d, N1: %d\n", n50, n10, n5, n1);
        }
    }

}
