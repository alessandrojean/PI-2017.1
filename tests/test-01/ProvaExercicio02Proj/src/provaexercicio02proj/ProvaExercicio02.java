/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaexercicio02proj;

import java.util.Scanner;

/**
 *
 * @author alessandro.jean
 */
public class ProvaExercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Posição do primeiro dia do mês em relação a domingo: ");
        int p = (new Scanner(System.in)).nextInt();

        if (p>=0 && p < 7) {
            System.out.printf("%n%s %s %s %s %s %s %s%n", "Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sab");
            for (int i = 1; i <= 31 + p; i++) {
                if (i - p > 0) {
                    System.out.printf("%3d %s", i - p, i % 7 == 0 || i==31+p ? "\n" : "");
                } else {
                    System.out.printf("%3s ", "");
                }
            }
        }
        else{
            System.out.printf("%nA posição %d é inválida!%nPor favor, digite um valor no intervalo de 0 a 6.", p);
        }
    }

}
