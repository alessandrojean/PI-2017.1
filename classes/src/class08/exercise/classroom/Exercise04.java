/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class08.exercise.classroom;

import javax.swing.JOptionPane;

/**
 *
 * @author alessandro.jean
 */
public class Exercise04 {

    private static double[][] m;
    private static int nAlunos, nProvas;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        nAlunos = Integer.parseInt(JOptionPane.showInputDialog(null,"Número de alunos:","3"));
        nProvas = Integer.parseInt(JOptionPane.showInputDialog(null,"Número de provas:","3"));
        m = new double[nAlunos][nProvas];
        
        fillMatrix(m);
      
        JOptionPane.showMessageDialog(null, generateOutput());
    }
    
    private static void fillMatrix(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = Double.parseDouble(JOptionPane.showInputDialog(null, String.format("<html>Nota A<sub>%d</sub>P<sub>%d</sub>:</html>", i, j)));
            }
        }
    }
    
    private static String generateOutput(){
        String f = "<html>";
        double[] mAlunos = new double[nAlunos], mProvas = new double[nAlunos];
        double mGeral = 0;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                mAlunos[i]+=m[i][j];
            }
            mAlunos[i]/=nProvas;
            mGeral+=mAlunos[i];
            f+=String.format("Média A<sub>%d</sub>: %.2f<br/>", i, mAlunos[i]);
        }
        f+="<br/>";
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                mProvas[i]+=m[j][i];
            }
            mProvas[i]/=nAlunos;
            f+=String.format("Média P<sub>%d</sub>: %.2f<br/>", i, mProvas[i]);
        }
        f+=String.format("<br/>Média geral da turma: %.2f", mGeral / nAlunos);
        f+="</html>";
        
        return f;
    }
    
}
