/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class05.exercise.classroom;

import javax.swing.JOptionPane;

/**
 *
 * @author alessandro.jean
 */
public class Exercise06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Número 1:", "0")),
                n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Número 2:", "10"));
        String r = "";

        if (n2 > n1) {
            for (int i = n1; i <= n2; i++) {
                r += i + (i == n2 - 1 ? " e " : (i == n2 ? "" : ", "));
            }
        } else {
            for (int i = n2; i <= n1; i++) {
                r += i + (i == n1 - 1 ? " e " : (i == n1 ? "" : ", "));
            }
        }

        JOptionPane.showMessageDialog(null, String.format("Sequência:\n%s.", r));

    }

}
