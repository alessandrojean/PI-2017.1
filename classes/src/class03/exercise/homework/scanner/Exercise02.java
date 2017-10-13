/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class03.exercise.homework.scanner;

import java.util.Scanner;

/**
 *
 * @author alessandro.jean
 */
public class Exercise02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a, b, c;

        System.out.print("Digite a: ");
        a = s.nextDouble();
        System.out.print("Digite b: ");
        b = s.nextDouble();
        System.out.print("Digite c: ");
        c = s.nextDouble();

        if (a == 0) {
            System.out.printf("\nRaiz única: %.2f", -c / b);
        } else {
            double d = Math.pow(b, 2) - 4 * a * c;
            if (d == 0) {
                System.out.printf("\nDelta=0 (x1=x2): %.2f", (-b + Math.sqrt(d)) / (2 * a));
            } else if (d > 0) {
                System.out.printf("\nX1: %.2f\nX2: %.2f", (-b + Math.sqrt(d)) / (2 * a), (-b - Math.sqrt(d)) / (2 * a));
            } else if (d < 0) {
                System.out.printf("\nX1: %.2f+%.2fi\nX2: %.2f-%.2fi", -b / 2, Math.sqrt(-d) / 2, -b / 2, Math.sqrt(-d) / 2);
            }
        }
    }
}
