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
public class Exercise02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String n = JOptionPane.showInputDialog(null, "Número:", "0"), r="";
        for(int i=n.length()-1; i>=0;i--)
            r+=n.charAt(i);
        
        JOptionPane.showMessageDialog(null, String.format("Número original: %s\nNúmero invertido: %s", n, r));
    }
    
}
