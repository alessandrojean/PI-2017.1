/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class09.exercise.homework;

/**
 *
 * @author alessandro.jean
 */
public class Exercise03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print(kelvin(293));
    }

    private static String celsius(int t) {
        return String.format("%.2f ºC = %.2f ºF = %.2f K",
                (double) t, 1.8 * (double) t + 32, (double) t + 273.15);
    }
    
    private static String kelvin(int t) {
        return String.format("%.2f ºC = %.2f ºF = %.2f K",
                (double) t - 273.15, ((double) t*9)/5-459.67, (double) t);
    }
    
    private static String fahrenheit(int t) {
        return String.format("%.2f ºC = %.2f ºF = %.2f K",
                ((double) t - 32)/1.8, (double) t, (((double) t+459.67)*5)/9);
    }

}
