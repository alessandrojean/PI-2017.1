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
        String[][] m = {new String[1], new String[2], new String[3], new String[4], new String[5]};
        int i=0, j=0;
        String f = "";
        for(String[] v : m){
            for(String n : v){
                n = JOptionPane.showInputDialog(null, String.format("<html>String S<sub>%dx%d</sub>:</html>", i, j));
                f += String.format("%5s", n);
                j++;
            }
            f+="\n";
            i++;
            j=0;
        }        
        JOptionPane.showMessageDialog(null, f);
    }
    
}
