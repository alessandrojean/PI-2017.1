# Estruturas sequenciais envolvendo diferentes tipos de dados, operadores e ordem de precedência

## Introdução
Nesta aula prática, aplicaremos alguns conceitos de **Estruturas Sequenciais** envolvendo diferentes tipos de dados, operadores e ordem de precedência. Vale a pena relembrar:
- **Estrutura Sequencial:** conjunto de instruções executadas sequencialmente, sem a necessidade de checar previamente se determinada condição lógica foi satisfeita.
- **Dados:** grandezas utilizadas em um programa que, após seu processamento, geram alguma informação. Podem ser classificados, de acordo com suas transformações ao longo do programa, como **variáveis** ou **constantes**. Ainda podem ser classificados de acordo com o tipo de dado,
como texto (`char`), inteiro (`byte`, `short`, `int` ou `long`), real (`float` ou `double`), lógico (`boolean`) e o **tipo definido pelo usuário** (que será visto posteriormente). Os oito primeiros tipos de dados são conhecidos no contexto do Java como **_tipos primitivos de dados_**.
- **Operadores:** representam expressões
    - **de cálculo** (aritméticos, tais como `+`, `-`, `*`, `/` e `%`, respectivamente **adição**, **subtração**, **multiplicação**, **divisão** e **resto**), 
    - **de comparação** (relacionais, tais como `==`, `!=`, `<`, `<=`, `>`, `>=`, respectivamente **igual**, **diferente**, **menor que**, **menor que ou igual a**, **maior que**, **maior que ou igual a**), 
    - **de condição** (lógicos, tais como `&&`, `||` ou `!`, respectivamente **AND**, **OR** e **NOT**) e
    - **de atribuição** (em Java, o sinal `=` é usado para atribuir um valor a uma variável ou a uma constante, por exemplo, `varX = 3;`).
- **Precedência:** quando uma expressão envolve mais de um operador, sua avaliação segue uma ordem, chamada **ordem de precedência**, que define a ordem de execução dos operadores. (Qual o valor da expressão `1+2*3=`? `9` ou `7`? E a expressão `3-2-2=`? `-1` ou `3`?) 

## Atividade 1 sobre Tipos de Dados
Inicie o IDE NetBeans, crie um novo projeto chamado `DadosProj`, coloque como nome da classe principal o substantivo `Dados` e modifique seu código digitando as seguintes linhas: 
```java
public class Dados {
    public static void main(String[] args) {
        // variáveis inteiras
        byte meuByte = 1; //ocupa 1 byte de memória, de -128 (10000000) até 127 (01111111) em compl. de 2
        short meuShort = 1 ; //ocupa 2 bytes de memória, de -32.768 até 32.767
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
        long primeiroResultado = (meuByte+meuShort+meuInt+meuLong)*3; //se você retirar os parênteses, o que acontece ?
        double segundoResultado = (2*meuPi*g)/3; // se você retirar os parênteses, o que acontece ?
        boolean terceiroResultado = (meuCinema || minhaPraia) && (!meuTrabalho);

        //resultados
        System.out.printf("%s%d\n","Resultado do tipo long: ", primeiroResultado);
        System.out.printf("%s%7.4f\n","Resultado do tipo double: ", segundoResultado);
        System.out.printf("%s%9.4f\n","Resultado do tipo double: ", segundoResultado);
        System.out.printf("%s%b\n","Resultado do tipo boolean: ", terceiroResultado);
        System.out.printf("%s%b\n","A condição é: ", condicao);
        System.out.printf("%s%f%n","pi = : ", meuPi);
        System.out.printf("%s%f%n","PI = : ", PI);
    }
}
```
Salve, compile e execute o seu projeto. Analise os resultados.

Agora modifique os valores dos dados, tentando ultrapassar os limites definidos. O que acontece? 

Explore os operadores aritméticos, relacionais e lógicos. 

## Atividade 2 - Criação da Segunda Aplicação usando o IDE NetBeans
A segunda aplicação está relacionada com o cálculo da área de um círculo. Crie um projeto chamado `AreaCirculoProj`, e para a classe principal coloque o nome `AreaCirculo` (sem acento tanto em "Área" quanto em "Círculo", pois nomes de classes no ambiente Java não devem receber acentos).

Neste projeto, vamos usar a classe `Scanner`, que apresenta vários métodos para ler o que o usuário está digitando no teclado. Por ex., o método `nextDouble()` permite ler o valor digitado pelo usuário e classificá-lo
como um `double`, ou seja, como um número real com 64 bits. Para poder usar os métodos da classe Scanner, vamos fazer uma cópia, ou instância, desta classe e nomear este objeto criado com um nome arbitrário, como por
ex. `sc` (abreviatura de Scanner!). 

Após apagar as partes do código que não serão necessárias, e inseridas as linhas de código úteis ao nosso propósito, a classe `AreaCirculo` deverá ficar como a seguir: 
```java
package areacirculoproj;
import java.util.Scanner;
public class AreaCirculo {
    public static void main(String[] args) {
        double raio;
        double area;
        final double PI= 3.14159;
 
        // Entrada de dados - raio via console (usa classe Scanner e método nextDouble())
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o raio do círculo: ");
        raio = sc.nextDouble();

        // Processamento - calcula da área
        area = PI * raio * raio;
        // Saída de dados - apresenta resultados na tela
        System.out.println("A área do círculo de raio " + raio + " é " + area);
    } // Fim do método main()
} // Fim da Classe AreaCirculo
```

Salve, compile e execute o seu projeto. Analise os resultados.

### Exercício

Altere o exercício realizado acima para que o resultado seja apresentado na tela com somente 2 casas decimais (utilize o método `printf()`).

## Exercícios para Casa
1. Utilizando o método `printf()`, escreva um programa denominado `Tabela` que imprima uma tabela de preços em duas colunas, sendo que a primeira coluna com vinte (20) caracteres de largura e a segunda com dez (10) caracteres de largura. Na primeira linha devem ser impressas as palavras "Item" e "Preço", alinhadas à direita nas suas respectivas colunas. Nas próximas cinco linhas escreva alguns itens de supermercado e os respectivos preços. Tanto o item quanto o preço deverão ser alinhados à direita na sua respectiva coluna. O preço deverá ter precisão de duas casas decimais.
1. Escreva um programa para calcular o cubo de um número "Inteiro". Utilize a classe `Scanner` (e o método `nextInt()`) para fazer a entrada de dados em tempo de execução. Adicionalmente, o programa deve apresentar na janela 'Output', a seguinte mensagem "O cubo do número X é Y" (sendo `X` o valor da variável de entrada definida no programa e `Y`, o resultado).
1. A nota final de um aluno é composta por: 2 provas com peso 3 (cada uma), 1 trabalho com peso 2 e 2 listas de exercícios com peso 1 (cada uma). Escreva um programa para calcular a média final do aluno. Faça a entrada de dados utilizando a classe `Scanner` do Java. Adicionalmente, o programa deve apresentar na janela 'Output', as notas parciais do aluno em linhas diferentes e na última linha a seguinte mensagem "A média do aluno é Y" (sendo `Y` o resultado). Imprima o valor da média utilizando saída formatada (`printf()`).
1. Escreva um programa, usando a classe `Scanner`, para calcular a área de um retângulo a partir da sua `base` e `altura` (necessário entrar 2 parâmetros). No resultado, o programa deve apresentar o título "Cálculo da Área de um Retângulo", e na linha de baixo apresentar o cálculo realizado e o resultado do valor calculado, utilizando saída formatada (`printf()`). 
