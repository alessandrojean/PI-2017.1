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
public class Exercise06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] m = {new double[1], new double[2], new double[3], new double[4], new double[5]};
        int i=0, j=0;
        String f = "";
        for(double[] v : m){
            for(double n : v){
                n = Double.parseDouble(JOptionPane.showInputDialog(null, String.format("<html>Número M<sub>%dx%d</dub>:</html>", i, j)));
                f += String.format("%5.2f ", n);
                j++;
            }
            f+="\n";
            i++;
            j=0;
        }        
        //JOptionPane.showMessageDialog(null, f);
        System.out.println(f);
    }
    
}
