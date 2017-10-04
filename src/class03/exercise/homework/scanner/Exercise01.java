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
public class Exercise01 {
    public static void main(String[] args)
    {
        double p,h,imc;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite o peso (kg): ");
        p = s.nextDouble();
        System.out.print("Digite a altura (m): ");
        h = s.nextDouble();
        
        imc = p/Math.pow(h,2);
        
        if(imc<18.5)
            System.out.println("Você está abaixo do peso ideal");
        else if(imc>=18.5 && imc<25)
            System.out.println("Parabéns -- você está em seu peso normal!");
        else if(imc>=25 && imc<30)
            System.out.println("Você está acima de seu peso (sobrepeso)");
        else if(imc>=30 && imc<35)
            System.out.println("Obesidade grau I");
        else if(imc>=35 && imc<40)
            System.out.println("Obesidade grau II)");
        else if(imc>=40)
            System.out.println("Obesidade grau III");
    }
}
