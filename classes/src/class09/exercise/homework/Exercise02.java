/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class09.exercise.homework;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author alessandro.jean
 */
public class Exercise02 {

    static int[] numbers = new int[1000], numberCount = new int[101];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        readNumbers(numbers);

        checkRandomCount(1000, numberCount);

        int optionA = checkOptionA();
        int optionB = checkOptionB();
        int optionC = checkOptionC();
        int optionD = checkOptionD();

        String f = String.format("Número sorteado mais vezes: %d%n"
                + "Número sorteado menos vezes: %d%n"
                + "Maior número: %d%n"
                + "Menor número: %d",
                optionA, optionB, optionC, optionD);

        JOptionPane.showMessageDialog(null, f);
    }

    public static boolean isInArray(int n) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                return true;
            }
        }

        return false;
    }

    public static void checkRandomCount(int quantity, int[] numberCount) {
        for (int i = 0; i < quantity; i++) {
            int r = (new Random()).nextInt(101);
            numberCount[r]++;
        }
    }

    public static int checkOptionA() {
        int m = 0, mS = 0;

        for (int i = 0; i < numberCount.length; i++) {

            if (numberCount[i] > m && isInArray(i + 1)) {
                m = numberCount[i];
                mS = i + 1;
            }
        }

        return mS;
    }

    public static int checkOptionB() {
        int m = 100, mS = 0;

        for (int i = 0; i < numberCount.length; i++) {
            if (numberCount[i] < m && isInArray(i + 1)) {
                m = numberCount[i];
                mS = i + 1;
            }
        }

        return mS;
    }

    public static int checkOptionC() {
        int m = 0;

        for (int i = 0; i < numbers.length; i++) {
            m = Math.max(m, numbers[i]);
        }
        return m;
    }

    public static int checkOptionD() {
        int m = 100;

        for (int i = 0; i < numbers.length; i++) {
            m = Math.min(m, numbers[i]);
        }
        return m;
    }

    private static void readNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            do {
                //array[i] = Integer.parseInt(JOptionPane.showInputDialog(String.format("Número %d:", i + 1), 0));
                array[i] = (new Random()).nextInt(101);
            } while (array[i] < 0 || array[i] > 100);
        }
    }

}
