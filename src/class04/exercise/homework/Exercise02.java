/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class04.exercise.homework;

/**
 *
 * @author alessandro.jean
 */
public class Exercise02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double pEu=1000, pEs=5000, pOc=10000;
        System.out.printf("Ano 0\nPopulações:\nEurásia: %.2f\nEstácia: %.2f\nOceania: %.2f\n\n", pEu, pEs, pOc);
        
        for(int i=10; i<=1000; i+=10)
        {
            pEu=pEu*Math.pow(1.02, 10);
            pEs=pEs*Math.pow(1.01, 10);
            pOc=pOc*Math.pow(1.005, 10);
            
            if(i%100==0)
            {
                pEu/=2;
                pEs/=2;
                pOc/=2;
            }
            
            System.out.printf("Ano %d\nPopulações:\nEurásia: %.2f\nEstácia: %.2f\nOceania: %.2f\n\n", i, pEu, pEs, pOc);
        }
    }
    
}
