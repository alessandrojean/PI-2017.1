/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class09.exercise.classroom;

import javax.swing.JOptionPane;

/**
 *
 * @author alessandro.jean
 */
public class Exercise02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao;
        opcao = Integer.parseInt(
                JOptionPane.showInputDialog("Escolha a sua opção: \n"
                        + "1 – adição\n"
                        + "2 - multiplicação\n"
                        + "3 - divisão\n"
                        + "4 - subtração"));
        switch(opcao){
            case 1:
                modAdicao();
                break;
            case 2:
                modMultiplicacao();
                break;
            case 3:
                modDivisao();
                break;
            case 4:
                modSubtracao();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
                break;
        }
        JOptionPane.showMessageDialog(null, " Fim do Programa");
    }

    static void modAdicao() {
        double v1;
        double v2;
        double res;
        v1 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o primeiro valor: "));
        v2 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o segundo valor: "));
        res = v1 + v2;
        JOptionPane.showMessageDialog(null, "Soma = " + res);
    }
    
    static void modAdicao(double v1, double v2) {
        double res;
        res = v1 + v2;
        JOptionPane.showMessageDialog(null, "Soma = " + res);
    }
    
    static void modMultiplicacao() {
        double v1;
        double v2;
        double res;
        v1 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o primeiro valor: "));
        v2 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o segundo valor: "));
        res = v1 * v2;
        JOptionPane.showMessageDialog(null, "Multiplicação = " + res);
    }
    
    static void modDivisao() {
        double v1;
        double v2;
        double res;
        v1 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o primeiro valor: "));
        v2 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o segundo valor: "));
        res = v1 / v2;
        JOptionPane.showMessageDialog(null, "Divisão = " + res);
    }
    
    static void modSubtracao() {
        double v1;
        double v2;
        double res;
        v1 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o primeiro valor: "));
        v2 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o segundo valor: "));
        res = v1 - v2;
        JOptionPane.showMessageDialog(null, "Subtração = " + res);
    }

}
