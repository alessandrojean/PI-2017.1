/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaexercicio01proj;

import javax.swing.JOptionPane;

/**
 *
 * @author alessandro.jean
 */
public class ProvaExercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao = JOptionPane.showOptionDialog(null, "Que tipo de números você deseja manipular?", "Tipo de números", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Inteiros", "Reais"}, "Inteiros");
        String f="";
        switch (opcao) {
            case JOptionPane.YES_OPTION:
                f = manipularInteiros();
                break;
            case JOptionPane.NO_OPTION:
                f = manipularReais();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
                System.exit(0);
                break;
        }
        
        JOptionPane.showMessageDialog(null, f);
    }
    
    private static String ordenaEntradas(int a, int b) {
        return String.format("Os dois números digitados são %d e %d, sendo que o menor deles é o %d", a, b, Math.min(a, b));
    }
    
    private static String ordenaEntradas(double a, double b) {
        return String.format("Os dois números digitados são %.1f e %.1f, sendo que o maior deles é o %.1f", a, b, Math.max(a, b));
    }
    
    private static String manipularInteiros() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Número A:", 3)),
                b = Integer.parseInt(JOptionPane.showInputDialog("Número B:", 4));
        
        return ordenaEntradas(a, b);
    }
    
    private static String manipularReais() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Número A:", 7.2)),
                b = Double.parseDouble(JOptionPane.showInputDialog("Número B:", 4.5));
        
        return ordenaEntradas(a, b);
    }
    
}
