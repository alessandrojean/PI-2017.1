/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class07.exercise.classroom;

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
        float[] n = new float[10];
        float s = 0;
        for(int i = 0;i<n.length;i++){
            n[i] = Float.parseFloat(JOptionPane.showInputDialog(null, String.format("Número da posição %d:",i), "0"));
        }
        for(int i = 0;i<n.length;i++){
            s+=n[i];
        }
        JOptionPane.showMessageDialog(null, String.format("A soma dos valores é: %.2f", s));
    }
    
}
