# Estruturas de Repetição (Laços)

## Atividade 1 - Comando `while`: Extraindo os dígitos de um número
O comando `while` pode ser utilizado para programas em que é preciso repetir uma mesma ação diversas vezes. Um exemplo é a extração de dígitos de um número. O operador `%` devolve o resto da divisão de um número inteiro por outro. Este operador pode ser utilizado, por exemplo, para extrair os dígitos de um número. Veja o exemplo abaixo:

```java
import java.util.Scanner;
public class ManipuladorDeDigitos {
    public static void main(String[] args) {
        int numero, soma=0, digito, numeroTmp;
        Scanner sc = new Scanner (System.in);
        System.out.printf("Digite um número: ");
        numero = sc.nextInt();
        numeroTmp = numero;
        while (numeroTmp > 0) {
            digito = numeroTmp%10;
            numeroTmp = numeroTmp/10;
            System.out.printf("Dígito %d extraído.\n", digito);
        }
    }
}
```

1. Escreva um programa que extraia os dígitos de um número decimal fornecido como entrada pelo usuário e imprime a sua soma. Por exemplo, se o usuário fornecer o número 1524, o programa deve imprimir: "A
soma dos dígitos do número 1524 é 12.".
1. Modifique o programa acima para ele imprimir o número de dígitos e a soma dos dígitos pares. Por exemplo, para o número 1524 o número de dígitos seria 4 e a soma dos dígitos pares seria 2 + 4 = 6.

## Atividade 2 - Comando `for`: Cálculo de juros
Outro exemplo em que podemos utilizar uma estrutura de repetição, agora com o comando `for`, é no cálculo de juros obtidos com aplicações financeiras. Suponha que você colocou seu dinheiro em uma aplicação que renda 1% ao mês. Se você colocar R$10.000,00 reais nesta aplicação e mantiver o dinheiro nela, quanto você terá após 10 anos?

```java
public class GerenciadorDeAplicacao {
    public static void main(String[] args) {
        double valorFinal = 10000;
        double rendimento = 1.01; // Rendimento de 1% ao mês
        int numeroDeMeses = 120;
        for (int mes = 0; mes < numeroDeMeses; mes++){
            // valorFinal = valorFinal*rendimento;
            valorFinal *= rendimento;
        }
        System.out.printf("O valor final disponível é de %.2f.\n", valorFinal);
    }
}
```

1. Modifique o programa acima para simular uma aplicação na qual o cliente começa com um valor de R$300,00 e aplica outros R$300,00 por mês. O programa deverá imprimir quanto dinheiro o usuário terá após 10, 20 e 30 anos. Agora responda, é difícil virar um milionário? :-)
1. Para conseguir o rendimento de 1% ao mês, um banco possui um economista bastante eficiente, que cobra uma taxa anual de 2% sobre todo o valor aplicado como taxa de administração. Modifique a simulação acima para incluir a taxa de administração e imprima o dinheiro que o cliente terá após 10, 20 e 30 anos.

## Atividade 3 - Caixa Eletrônico
Você está desenvolvendo o sistema de um caixa eletrônico para um banco. O cliente do banco informa ao caixa quanto deseja retirar e o caixa deve liberar o valor utilizando as cédulas disponíveis. Por exemplo, no caso de um caixa que tenha apenas notas de 10, 20 e 50 reais, um usuário que solicita o saque de 180 reais deve receber 3 notas de 50, 1 nota de 20 e 1 nota de 10.

1. Escreva um programa que solicita ao usuário que ele entre com um valor a ser sacado e devolve o número de notas de cada valor. O caixa deve devolver o menor número possível de células que contemplem o valor solicitado. Suponha que o caixa tenha notas de 50, 10, 5 e 1.
    **Dica:** utilize os operadores `/` e `%`.

## Exercícios para Casa
1. Modifique o código do caixa eletrônico de modo a simular um caixa eletrônico de verdade. Neste caso, seu programa deve solicitar ao usuário o número de notas de cada valor que estão inicialmente disponíveis no caixa
eletrônico. Em seguida, o programa deve ter um laço que processa diferentes requisições de saque vindas de clientes de banco. Após cada saque, o programa determina o número de cédulas de cada tipo necessárias para o saque e subtrai do total de cédulas disponíveis. Após cada requisição de saque o programa deve imprimir: (1) o número de notas de cada tipo se houver cédulas suficientes ou (2) saque indisponível se não houver cédulas suficientes.
1. Um planeta hipotético é composto por 3 continentes: Eurásia, Estásia e Oceania. No ano 0 esses continentes possuem a população de 1000, 5000 e 10000 habitantes e a taxa de crescimento anual em cada continente é de 2%, 1% e 0.5%. Faça um programa que calcule e imprima, em intervalos de 10 anos, a evolução da população de cada continente. Faça o cálculo até o ano 1000.
Suponha agora que a cada 100 anos um desastre (peste, guerra nuclear, queda de meteoro etc.) reduz a população do planeta à metade do que era. Neste caso, qual a evolução da população mundial?

