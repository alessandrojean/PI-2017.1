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
public class Exercise04 {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de livros:"));

        double ca = 0.25 * n + 7.5, cb = 0.5 * n + 2.5;
        JOptionPane.showMessageDialog(null, String.format("%s é a melhor opção para compra!\nValor total: R$%.2f", ca < cb ? "A" : "B", ca < cb ? ca : cb));
    }
}
