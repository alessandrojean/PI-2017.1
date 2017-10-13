package exercicio01proj;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = s.nextInt();

        if (n % 2 == 0) {
            System.out.printf("O número %d é par!", n);
        } else {
            System.out.printf("O número %d é ímpar!", n);
        }
    }

}
