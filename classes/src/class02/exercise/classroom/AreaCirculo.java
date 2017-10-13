/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class02.exercise.classroom;

import java.util.Scanner;

/**
 *
 * @author alessandro.jean
 */
public class AreaCirculo {

    public static void main(String[] args) {
        double raio;
        double area;
        final double PI = 3.14159;
        // Entrada de dados - raio via console (usa classe Scanner e método nextDouble())
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio do círculo: ");
        raio = sc.nextDouble();
        // Processamento - calcula da área
        area = PI * raio * raio;
        // Saída de dados - apresenta resultados na tela
        System.out.println("A área do círculo de raio " + raio + " é " + area);
    } // Fim do método main()
} // Fim da Classe AreaCirculo

