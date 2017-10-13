/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaexercicio02proj;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author alessandro.jean
 */
public class ProvaExercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vet = new int[12];
        preencherVetor(vet);

        JOptionPane.showMessageDialog(null, String.format(
                "Valores originais: %s%n%s",
                vetorParaString(vet),
                detectaRepeticao(vet)
                        ? "Há números repetidos neste vetor."
                        : "Não há números repetidos neste vetor."
        ));
    }

    private static void preencherVetor(int[] vetor) {
        Random r = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = r.nextInt(11);
        }
    }

    private static boolean detectaRepeticao(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    private static String vetorParaString(int[] vetor) {
        String f = "";
        for (int i = 0; i < vetor.length; i++) {
            f += String.format("%d%s", vetor[i], i == vetor.length - 1 ? "" : ", ");
        }
        return f;
    }

}
