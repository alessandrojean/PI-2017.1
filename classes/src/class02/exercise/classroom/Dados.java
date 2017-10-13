/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class02.exercise.classroom;

/**
 *
 * @author alessandro.jean
 */
public class Dados {

    public static void main(String[] args) {
        // variáveis inteiras
        byte meuByte = 1; //ocupa 1 byte de memória, de -128 (10000000) até 127 (01111111) em compl. de 2
        short meuShort = 1; //ocupa 2 bytes de memória, de -32.768 até 32.767
        int meuInt = 1; //ocupa 4 bytes de memória, de -2.147.483.648 até 2.147.483.647
        long meuLong = 1; //ocupa 8 bytes de memória
        // variáveis reais
        float meuPi = 3.14159f; //ocupa 4 bytes, underflow: 3,4e-38 overflow: 3,4e+38
        double PI = Math.PI; //usa um recurso do próprio Java para definir o valor de PI
        double g = 9.8; //ocupa 8 bytes, underflow: 1,7e-308 overflow: 1,7e+308

        //variáveis booleanas
        boolean meuCinema = true; //ocupa 1 byte
        boolean minhaPraia = true;
        boolean meuTrabalho = false;
        boolean condicao = (2 >= 5);
        //operações
        long primeiroResultado = (meuByte + meuShort + meuInt + meuLong) * 3; //se você retirar os parênteses, o que acontece ?
        double segundoResultado = (2 * meuPi * g) / 3; // se você retirar os parênteses, o que acontece ?
        boolean terceiroResultado = (meuCinema || minhaPraia) && (!meuTrabalho);
        //resultados
        System.out.printf("%s%d\n", "Resultado do tipo long: ", primeiroResultado);
        System.out.printf("%s%7.4f\n", "Resultado do tipo double: ", segundoResultado);
        System.out.printf("%s%9.4f\n", "Resultado do tipo double: ", segundoResultado);
        System.out.printf("%s%b\n", "Resultado do tipo boolean: ", terceiroResultado);
        System.out.printf("%s%b\n", "A condição é: ", condicao);
        System.out.printf("%s%f%n", "pi = : ", meuPi);
        System.out.printf("%s%f%n", "PI = : ", PI);
    }
}
