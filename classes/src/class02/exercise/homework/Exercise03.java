/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class02.exercise.homework;

import java.util.Scanner;

/**
 *
 * @author alessandro.jean
 */
public class Exercise03 {
    public static void main(String[] args)
    {
        double p1,p2,t,l1,l2;
        Scanner s = new Scanner(System.in);
        System.out.print("Nota P1: ");
        p1 = s.nextDouble();
        System.out.print("Nota P2: ");
        p2 = s.nextDouble();
        System.out.print("Nota Trabalho: ");
        t = s.nextDouble();
        System.out.print("Nota Lista 1: ");
        l1 = s.nextDouble();
        System.out.print("Nota Lista 2: ");
        l2 = s.nextDouble();
        
        System.out.printf("-----\nNota P1: %.2f\nNota P2: %.2f\nNota Trabalho: %.2f\nNota Lista 1: %.2f\nNota Lista 2: %.2f\n", p1, p2, t, l1, l2);
        double m = (p1*3+p2*3+t*2+l1+l1)/10;
        System.out.printf("\nA média do aluno é %.2f", m);
    }
}
