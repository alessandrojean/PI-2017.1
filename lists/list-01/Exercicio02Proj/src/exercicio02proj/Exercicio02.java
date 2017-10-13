package exercicio02proj;

import javax.swing.JOptionPane;

public class Exercicio02 {

    public static void main(String[] args) {
        String notaS = JOptionPane.showInputDialog(null, "Digite a nota:", "0,0");
        double nota = Double.parseDouble(notaS.replace(",", "."));

        String conceito = "";

        if (nota < 4.5) {
            conceito = "F - Reprovado";
        } else if (nota >= 4.5 && nota < 6.0) {
            conceito = "D - Aproveitamento mínimo";
        } else if (nota >= 6.0 && nota < 7.5) {
            conceito = "C - Desempenho adequado";
        } else if (nota >= 7.5 && nota < 9.0) {
            conceito = "B - Bom desempenho";
        } else if (nota >= 9.0) {
            conceito = "A - Desempenho excepcional";
        }
        
        String mensagem = String.format("A nota %.2f convertida em conceito é:\n%s", nota, conceito);
        JOptionPane.showMessageDialog(null, mensagem);
    }

}
