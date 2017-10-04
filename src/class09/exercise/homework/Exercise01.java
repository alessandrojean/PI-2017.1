/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class09.exercise.homework;

import javax.swing.JOptionPane;

/**
 *
 * @author alessandro.jean
 */
public class Exercise01 {

    static double juros_Poupanca = 1.0057; // ~0,57% ao mês na média
    static double juros_CDB = 1.0082; // ~0,82% ao mês
    static double juros_LTN = 1.012; // ~1,2% ao mês
    static double juros_Multimercado = 1.016; // ~1,6% ao mês
    static double taxaAnual_Multimercado = 0.01; // 1% ao ano

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, frase(), "Planejamento financeiro",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static String frase() {
        double investimento = ask("Qual o valor investido?", 15000f);
        double complemento = ask("Qual o complemento mensal?", 800f);
        double objetivo = ask("Qual o objetivo?", 300000f);

        String frase = String.format("Para um investimento de R$ %,.2f "
                + "com aplicações mensais de R$ %,.2f\n"
                + "O tempo para atingir R$ %,.2f seria:\n\n",
                investimento, complemento, objetivo);

        frase += planejar("Poupança", investimento, complemento, objetivo, juros_Poupanca);
        frase += planejar("CDB", investimento, complemento, objetivo, juros_CDB);
        frase += planejar("Letras do Tesouro Nacional", investimento, complemento, objetivo, juros_LTN);
        frase += planejar("Fundos Multimercado", investimento, complemento, objetivo, juros_Multimercado);

        return frase;
    }

    public static String planejar(String nome, double investimento, double complemento, double objetivo, double juros) {
        int meses = 0;
        double saldo = investimento;
        while (saldo < objetivo) {
            meses++;
            saldo = saldo * juros + complemento;
            if (juros == juros_Multimercado) {
                if (meses % 12 == 0 && meses > 1) {
                    saldo -= saldo * taxaAnual_Multimercado;
                }
            }
        }

        return String.format("%d meses (%d anos) na %s\n", meses, meses / 12, nome);
    }

    public static double ask(String m, double d) {
        try {
            return Double.parseDouble(
                    JOptionPane.showInputDialog(m, d));
        } catch (Exception e) {
            e.printStackTrace();
            return d;
        }
    }

    public static int ask(String m, int i) {
        try {
            return Integer.parseInt(JOptionPane.showInputDialog(m, i));
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        }
    }

}
