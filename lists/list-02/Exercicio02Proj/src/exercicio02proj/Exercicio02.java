package exercicio02proj;

import java.util.Random;
import javax.swing.JOptionPane;

public class Exercicio02 {

    public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt(10), y = 10, c = 0;
        while(x!=y){
            y = Integer.parseInt(JOptionPane.showInputDialog(null, "Chute:", "0"));
            c++;
        }
        JOptionPane.showMessageDialog(null, String.format("Parabéns, você acertou!\nQuantidade de chutes: %d", c));
    }
    
}
