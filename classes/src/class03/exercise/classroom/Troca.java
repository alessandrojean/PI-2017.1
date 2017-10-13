/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class03.exercise.classroom;

import javax.swing.JOptionPane;

/**
 *
 * @author alessandro.jean
 */
public class Troca {

    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "A:").replace(",", ".")),
                b = Double.parseDouble(JOptionPane.showInputDialog(null, "B:").replace(",", "."));

        a = a * b;
        b = a / b;
        a = a / b;

        /*double c = a;
         a = b;
         b = c;*/
        JOptionPane.showMessageDialog(null, String.format("A: %.18f\nB: %.18f", a, b));
    }
}
