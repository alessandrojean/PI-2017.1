/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01proj;

import javax.swing.JOptionPane;

/**
 *
 * @author alessandro.jean
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op = JOptionPane.showOptionDialog(null, "Qual figura você deseja calcular a área?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Retângulo", "Círculo"}, "Retângulo");

        if (op != JOptionPane.CLOSED_OPTION) {
            String f;

            if (op == JOptionPane.YES_OPTION) {
                int b = Integer.parseInt(JOptionPane.showInputDialog("Base:", 1)),
                        h = Integer.parseInt(JOptionPane.showInputDialog("Altura:", 1));
                f = String.format("A área do retângulo de base %d e altura %d é: %.2f", b, h, calculaArea(b, h));
            } else {
                int r = Integer.parseInt(JOptionPane.showInputDialog("Raio:", 1));
                f = String.format("A área do círculo de raio %d é: %.2f", r, calculaArea(r));
            }

            JOptionPane.showMessageDialog(null, f);
        }

    }

    private static double calculaArea(int r) {
        return Math.PI * Math.pow(r, 2);
    }

    private static double calculaArea(int b, int h) {
        return b * h;
    }

}
