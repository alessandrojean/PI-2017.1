/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02proj;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alessandro.jean
 */
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        int[] numeros = new int[9];
        preencherVetor(numeros, "meuVetorDeInteiros.txt"); //Vetor sem elementos repetidos
        //preencherVetor(numeros, "outroVetorDeInteiros.txt"); //Vetor com elementos repetidos
        
        String r = verificarRepeticoes(numeros);
        JOptionPane.showMessageDialog(null, r.equals("")
                ? "O vetor não possui repetições"
                : String.format("O vetor possui os seguintes elementos repetidos:%n%s", r));
    }
    
    public static void preencherVetor(int[] vetor, String arquivo) throws FileNotFoundException{
        File a = new File(arquivo);
        Scanner sc = new Scanner(a);
        
        int i=0;
        while (sc.hasNextInt()) {
            vetor[i++] = sc.nextInt();
            //System.out.println(sc.nextInt());
        }
    }
    
    public static String verificarRepeticoes(int[] vetor){
        String rep = "";
        
        for(int i=0;i<vetor.length;i++){
            for(int j=i+1;j<vetor.length;j++){
                if(vetor[i]==vetor[j]){
                    rep+=String.format("%d ", vetor[i]);
                }
            }
        }
        
        return rep;
    }

}
