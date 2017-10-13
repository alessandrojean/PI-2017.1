/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class04.exercise.classroom;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alessandro.jean
 */
public class Exercise02Alternative {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, soma = 0, digito, numeroTmp;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite um número: ");
        numero = sc.nextInt();
        numeroTmp = numero;
        while (numeroTmp > 0) {
            digito = numeroTmp % 10;
            numeroTmp = numeroTmp / 10;
            System.out.printf("Dígito %d extraído.\n", digito);
            if(digito%2==0)
                soma+=digito;
        }
        
        System.out.printf("A soma dos dígitos pares do número %d é: %d", numero, soma);
    }

}
