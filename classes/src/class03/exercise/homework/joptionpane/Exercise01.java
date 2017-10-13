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
public class Exercise01 {

    public static void main(String[] args) {
        double p, h, imc;

        p = Double.parseDouble(JOptionPane.showInputDialog(null, "Peso (kg):").replace(",", "."));
        h = Double.parseDouble(JOptionPane.showInputDialog(null, "Altura (m):").replace(",", "."));

        imc = p / Math.pow(h, 2);

        String m = "";

        if (imc < 18.5) {
            m = "Você está abaixo do peso ideal";
        } else if (imc >= 18.5 && imc < 25) {
            m = "Parabéns -- você está em seu peso normal!";
        } else if (imc >= 25 && imc < 30) {
            m = "Você está acima de seu peso (sobrepeso)";
        } else if (imc >= 30 && imc < 35) {
            m = "Obesidade grau I";
        } else if (imc >= 35 && imc < 40) {
            m = "Obesidade grau II)";
        } else if (imc >= 40) {
            m = "Obesidade grau III";
        }

        JOptionPane.showMessageDialog(null, m);
    }
}
