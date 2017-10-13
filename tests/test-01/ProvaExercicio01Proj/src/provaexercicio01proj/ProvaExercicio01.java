/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaexercicio01proj;

import javax.swing.JOptionPane;

/**
 *
 * @author alessandro.jean
 */
public class ProvaExercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Número n: ", "10")), s = 0;
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        int ip = n % 2 == 0 ? n - 1 : n;

        String f = String.format("A soma dos %d primeiros números inteiros é: %d%nO maior número ímpar mais próximo a %d é: %d", n, s, n, ip);
        
        JOptionPane.showMessageDialog(null, f);
    }

}
