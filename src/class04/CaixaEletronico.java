/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class04;

import java.util.Scanner;

/**
 *
 * @author alessandro.jean
 */
public class CaixaEletronico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o valor para saque: ");
        int v = s.nextInt(), vt = v, n50 = 0, n10 = 0, n5 = 0, n1 = 0, c = 0;

        n50 = vt / 50;
        vt = n50 == 0 ? vt : vt % 50;
        n10 = vt / 10;
        vt = n10 == 0 ? vt : vt % 10;
        n5 = vt / 5;
        vt = n5 == 0 ? vt : vt % 5;
        n1 = vt;

        System.out.printf("Valor sacado: R$%d\n\nNotas:\nR$50: %2d\nR$10: %2d\nR$5: %3d\nR$1: %3d", v, n50, n10, n5, n1);

    }

}
