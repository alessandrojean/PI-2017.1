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
public class Exercise05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "Tabuada do 10:\n\n";
        for (int i = 0; i <= 10; i++) {
            s += String.format("%d x 10 = %d\n", i, i * 10);
        }
        
        JOptionPane.showMessageDialog(null, s);
    }

}
