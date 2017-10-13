/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class07.exercise.classroom;

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
        int[] valoresDeEntrada = new int[8], valoresPositivos = new int[8], valoresNegativos = new int[8];
        int cPositivos=0, cNegativos=0;
        String vPositivos="", vNegativos="";
        for(int i=0;i<valoresDeEntrada.length;i++){
            valoresDeEntrada[i] = Integer.parseInt(JOptionPane.showInputDialog(null,String.format("Número da posição %d:",i), "0"));
            if(valoresDeEntrada[i]>=0){
                valoresPositivos[i] = valoresDeEntrada[i];
                cPositivos++;
                vPositivos+=String.format("%d ", valoresPositivos[i]);
            }
            else{
                valoresNegativos[i] = valoresDeEntrada[i];
                cNegativos++;
                vNegativos+=String.format("%d ", valoresNegativos[i]);
            }
        }
        
        JOptionPane.showMessageDialog(null, String.format("Contagem negativos: %d%nNegativos: %s%nContagem Positivos: %d%nPositivos: %s", cNegativos, vNegativos, cPositivos, vPositivos));
    }
    
}
