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
public class Exercise03 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o conceito: ");
        String n = s.nextLine();
        
        if(n.equalsIgnoreCase("a"))
            System.out.println("Desempenho excepcional");
        else if(n.equalsIgnoreCase("b"))
            System.out.println("Bom desempenho");
        else if(n.equalsIgnoreCase("c"))
            System.out.println("Desempenho adequado");
        else if(n.equalsIgnoreCase("d"))
            System.out.println("Aproveitamento mínimo");
        else if(n.equalsIgnoreCase("f"))
            System.out.println("Reprovado");
        else if(n.equalsIgnoreCase("o"))
            System.out.println("Reprovado por falta");
        else if(n.equalsIgnoreCase("i"))
            System.out.println("Incompleto");
    }
}
