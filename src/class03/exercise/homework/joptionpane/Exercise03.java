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
public class Exercise03 {

    public static void main(String[] args) {
        String n = JOptionPane.showInputDialog(null, "Conceito: ");

        String m = "";
        if (n.equalsIgnoreCase("a")) {
            m = "Desempenho excepcional";
        } else if (n.equalsIgnoreCase("b")) {
            m = "Bom desempenho";
        } else if (n.equalsIgnoreCase("c")) {
            m = "Desempenho adequado";
        } else if (n.equalsIgnoreCase("d")) {
            m = "Aproveitamento mínimo";
        } else if (n.equalsIgnoreCase("f")) {
            m = "Reprovado";
        } else if (n.equalsIgnoreCase("o")) {
            m = "Reprovado por falta";
        } else if (n.equalsIgnoreCase("i")) {
            m = "Incompleto";
        }

        JOptionPane.showMessageDialog(null, m);
    }
}
