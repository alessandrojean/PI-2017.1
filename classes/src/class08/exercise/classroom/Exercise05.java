/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class08.exercise.classroom;

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
        double[][] m = new double[5][];
        double mV=0;
        String f = "";
        for(int i = 0; i< m.length; i++){
            m[i] = new double[i+1];
            for(int j = 0; j<m[i].length; j++){
                m[i][j] = Double.parseDouble(JOptionPane.showInputDialog(null, String.format("<html>Número m<sub>%dx%d</dub>:</html>", i, j)));
                mV+=m[i][j]/15;
                f += String.format("%5.2f %s", m[i][j], j == m[i].length - 1 ? "\n" : "");
            }
        }        
        //JOptionPane.showMessageDialog(null, f);
        System.out.println(f);
        System.out.printf("Média: %.2f%n", mV);
    }
    
}
