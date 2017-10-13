/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01proj;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author alessandro.jean
 */
public class Exercicio01 {

    private static Random random = new Random();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, gerar());
    }

    private static String gerar() {
        int contTrocarGanha = 0, contTrocarPerde = 0;

        for (int i = 0; i < 1000; i++) {

            if (verificarEscolha()) {
                contTrocarPerde++;
            } else {
                contTrocarGanha++;
            }

        }

        return String.format("Vezes em que trocar ganha: %d (%.2f%%)%n"
                + "Vezes em que trocar perde: %d (%.2f%%)", contTrocarGanha, (contTrocarGanha / 1000.0) * 100, contTrocarPerde, (contTrocarPerde / 1000.0) * 100);
    }

    private static boolean verificarEscolha() {
        boolean[] portas = new boolean[3];
        portas[random.nextInt(3)] = true;

        int escolha = random.nextInt(3);
        
        return portas[escolha];
    }

}
