/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class04.exercise.classroom;

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
        int s = 0;
        String n = JOptionPane.showInputDialog(null, "Número:", "0");
        
        for (int i = 0; i < n.length(); i++) {
            s += Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        
        JOptionPane.showMessageDialog(null, String.format("A soma dos dígitos do número %s é: %d", n, s));
    }
    
}
