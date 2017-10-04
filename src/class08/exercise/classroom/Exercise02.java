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
public class Exercise02 {

    private static double[][] m = new double[5][5];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        fillMatrixTransposed(m, "M");
        
        System.out.println(generateString(m));
    }
    
    private static void fillMatrixTransposed(double[][] m, String name) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[j][i] = Double.parseDouble(JOptionPane.showInputDialog(null, String.format("<html>Número %s<sub>%dx%d</dub>:</html>", name, i, j)));
            }
        }
    }
    
    private static String generateString(double[][] m){
        String f = "";
        for(int i = 0; i< m.length; i++){
            for(int j = 0; j<m[i].length; j++){
                f+=String.format("%5.2f %s", m[i][j], j == m[i].length - 1 ? "\n" : "");
            }
        }          
        return f;
    }
    
}
