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
public class Exercise01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String c = "";
        for (int i = 10; i >= 0; i--) {
            c += String.format("%2d\n", i);
            System.out.printf("%2d\n", i);
        }
        c += "Decolar";

        JOptionPane.showMessageDialog(null, c);
    }

}
