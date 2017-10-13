/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02proj;

import javax.swing.JOptionPane;

/**
 *
 * @author alessandro.jean
 */
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op = JOptionPane.showOptionDialog(null, "Que tipo de números você deseja manipular?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Inteiros", "Reais"}, "Inteiros");

        if (op != JOptionPane.CLOSED_OPTION) {
            String f;

            if (op == JOptionPane.YES_OPTION) {
                int a = Integer.parseInt(JOptionPane.showInputDialog("Número A:", 1)),
                        b = Integer.parseInt(JOptionPane.showInputDialog("Número B:", 1));
                f = String.format("Os dois números digitados são %d e %d, sendo que o produto deles é %d", a, b, manipulaEntradas(a, b));
            } else {
                double a = Double.parseDouble(JOptionPane.showInputDialog("Número A:", 1)),
                        b = Double.parseDouble(JOptionPane.showInputDialog("Número B:", 1));
                f = String.format("Os dois números digitados são %.1f e %.1f, sendo que a soma deles é %.1f", a, b, manipulaEntradas(a, b));
            }

            JOptionPane.showMessageDialog(null, f);
        }
    }

    private static int manipulaEntradas(int a, int b) {
        return a * b;
    }

    private static double manipulaEntradas(double a, double b) {
        return a + b;
    }

}
