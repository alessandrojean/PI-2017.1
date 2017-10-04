/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class03.exercise.homework.joptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author alessandro.jean
 */
public class Exercise02 {

    public static void main(String[] args) {
        double a, b, c;

        a = Double.parseDouble(JOptionPane.showInputDialog(null, "A (Ax²):").replace(",", "."));
        b = Double.parseDouble(JOptionPane.showInputDialog(null, "B (Bx):").replace(",", "."));
        c = Double.parseDouble(JOptionPane.showInputDialog(null, "C (C):").replace(",", "."));;

        String m = "";

        if (a == 0) {
            m = String.format("Raiz única: %.2f", -c / b);
        } else {
            double d = Math.pow(b, 2) - 4 * a * c;
            if (d == 0) {
                m = String.format("Delta=0 (x1=x2): %.2f", (-b + Math.sqrt(d)) / (2 * a));
            } else if (d > 0) {
                m = String.format("X1: %.2f\nX2: %.2f", (-b + Math.sqrt(d)) / (2 * a), (-b - Math.sqrt(d)) / (2 * a));
            } else if (d < 0) {
                m = String.format("X1: %.2f+%.2fi\nX2: %.2f-%.2fi", -b / 2, Math.sqrt(-d) / 2, -b / 2, Math.sqrt(-d) / 2);
            }
        }

        JOptionPane.showMessageDialog(null, m);
    }
}
