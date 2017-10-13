/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class05.exercise.classroom;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author alessandro.jean
 */
public class Exercise03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int[][] n = new int[10][5];
        String s = "";
        
        for(int i=0;i<10;i++){
            for(int j=0;j<5;j++)
                n[i][j] = r.nextInt(6) + 1;
            s+=String.format("%d %d %d %d %d\n", n[i][0], n[i][1], n[i][2], n[i][3], n[i][4]);
        }
            
        JOptionPane.showMessageDialog(null, s);
        
    }
    
}
