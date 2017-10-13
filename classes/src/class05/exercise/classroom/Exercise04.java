/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class05.exercise.classroom;

import javax.swing.JOptionPane;

/**
 *
 * @author alessandro.jean
 */
public class Exercise04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] n = new double[10];
        double s = 0;
        for(int i=0;i<n.length;i++){
            n[i] = Double.parseDouble(JOptionPane.showInputDialog(null, String.format("Nota %d:", i+1), "0,0"));
            s+=n[i];
        }
        
        JOptionPane.showMessageDialog(null, String.format("A média das 10 notas é: %.1f", s / 10));
        
    }
    
}
