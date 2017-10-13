/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03proj;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author alessandro.jean
 */
public class Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op = JOptionPane.showOptionDialog(null, "Que tipo de números você deseja na matriz?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Inteiros", "Reais"}, "Inteiros");

        if (op != JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(null, manipular(op));
        }
    }

    private static String manipular(int op) {
        if (op == 0) {
            int[][] a = new int[4][4], b = new int[4][4], r = new int[4][4];
            randomizar(a, b);
            calcular(a, b, r);

            return String.format("Matriz A:%n%s%nMatriz B:%n%s%nMatriz resultante:%n%s", passarParaString(a), passarParaString(b), passarParaString(r));
        } else {
            double[][] a = new double[4][4], b = new double[4][4], r = new double[4][4];
            randomizar(a, b);
            calcular(a, b, r);

            return String.format("Matriz A:%n%s%nMatriz B:%n%s%nMatriz resultante:%n%s", passarParaString(a), passarParaString(b), passarParaString(r));
        }
    }

    private static String passarParaString(double[][] m) {
        String r = "";
        for (double[] v : m) {
            for (double e : v) {
                r += String.format("%-5.2f", e);
            }
            r += "\n";
        }

        return r;
    }

    private static String passarParaString(int[][] m) {
        String r = "";
        for (int[] v : m) {
            for (int e : v) {
                r += String.format("%4d", e);
            }
            r += "\n";
        }

        return r;
    }

    private static void randomizar(double[][] m1, double[][] m2) {
        Random r = new Random();
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = r.nextDouble();
                m2[i][j] = r.nextDouble();
            }
        }
    }

    private static void randomizar(int[][] m1, int[][] m2) {
        Random r = new Random();
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = r.nextInt(10);
                m2[i][j] = r.nextInt(10);
            }
        }
    }

    private static void calcular(double[][] m1, double[][] m2, double[][] r) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                r[i][j] = m1[i][j] * 0.7 + m2[i][j];
            }
        }
    }

    private static void calcular(int[][] m1, int[][] m2, int[][] r) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                r[i][j] = m2[i][j] * 3 - m1[i][j];
            }
        }
    }

}
