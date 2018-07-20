# Vetores Bidimensionais (Matrizes)
*Notas de aula do Prof. José A. Quilici-Gonzalez, CMCC/UFABC.*

## Introdução
Uma **matriz** é um **vetor com duas dimensões**, e costuma ser usada para representar tabelas de valores que consistem de informações dispostas em linhas e colunas. Para identificar um elemento de uma tabela particular devemos especificar dois índices. O primeiro índice se refere à linha do elemento e o segundo à sua coluna. Java não suporta vetores multidimensionais (matrizes) diretamente, mas permite que o programador especifique vetores unidimensionais cujos elementos também são vetores unidimensionais. Neste roteiro abordaremos a utilização de vetores bidimensionais, sendo seus conceitos estendidos para 
dimensões maiores

Vetor Unidimensional:

![Imgur](https://i.imgur.com/EQkW91o.png)

Vetor Bidimensional:

![Imgur](https://i.imgur.com/dzFnpLK.png)

A sintaxe para a definição de uma matriz é bem parecida com a definição de vetores. O que muda é que existe outra dimensão para a definição de linhas. Um exemplo para a definição de uma matriz com 5 linhas e 5 colunas:

`int matriz[][] = new int[5][5];` ou `int[][] matriz = new int[5][5];`

A primeira parte do comando, `int matriz[][]` corresponde à declaração da matriz, incluindo o tipo `int` e o nome da matriz `matriz[][]`. Como no caso de vetores, o operador `new` é necessário para criar a instância da matriz (e alocar memória), indicando o tipo de dados que está sendo instanciado `int` e o número de posições `[5][5]`. Esta matriz poderia ser inicializada com valores inteiros escolhidos arbitrariamente, como ilustrado abaixo:

```java
matriz [0][0] = 34;
matriz [0][1] = 56;
matriz [0][2] = 4;
...... ...... ....
matriz [1][0] = -7;
matriz [1][1] = 36;
...... ...... ....
matriz [4][3] = 8;
matriz [4][4] = 1;
```

(Note que embora a matriz seja 5x5, como seus índices começam em `[0][0]`, as últimas posições terão índices `[4][3]` e `[4][4]`).

Alternativamente, a definição desta matriz poderia ser feita da seguinte forma:

```java
int matriz[][] = { {34, 56, 4, 78, 89}, {-7, 36, 81, 32, -23},
    {2, 45, 53, 62, 25}, {12, 17, 28, 74, 33},
    {65, -34, 47, 8, 1} };
```

![Imgur](https://i.imgur.com/u92kFrA.png)

Da mesma forma que em vetores, a definição de uma matriz em Java pode assumir qualquer tipo previamente definido para a linguagem. Uma possibilidade de programa para imprimir uma matriz "formatada" é dada a seguir. Note que para percorrer as colunas fixou-se a linha zero da matriz. Esse código funcionará apenas para matrizes em que o número de colunas é sempre igual para todas as linhas.

```java
public class UsoDeMatrizJava {
    public static void main(String[] args) {
        int matriz[][] = { {34, 56, 4, 78, 89},
                           {-7, 36, 81, 32, -23},
                           {2, 45, 53, 62, 25},
                           {12, 17, 28, 74, 33},
                           {65, -34, 47, 8, 1} };
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.printf("%3d ",matriz[linha][coluna]);
            }
            System.out.println();
        }
    }
}
```

**Questão 1:** Faça um programa que leia valores para preencher uma matriz `double` com 5 linhas e 5 colunas. Em seguida o programa deve mostrar a matriz “formatada” em linhas e colunas.

**Questão 2:** Faça um programa que leia uma matriz de números reais 5x5 e em seguida calcule e mostre sua matriz transposta correspondente na forma "formatada" em linhas e colunas. 

**Questão 3:** Faça um programa que leia duas matrizes de números reais 4x4 e em seguida calcule e mostre a matriz resultante da multiplicação entre elas. 

**Questão 4:** Faça um programa que receba como entrada o número de alunos de uma turma e o número de provas que eles fizeram ao longo de um trimestre. Em seguida, o programa deve pedir as notas de todos os alunos em cada uma das provas e calcular a média de cada aluno e a média de cada prova. Ao final o programa deve mostrar as médias dos alunos, as médias de cada prova e a média geral da turma. 

## Particularidades do Java
Como já mencionado anteriormente, o Java não suporta matrizes diretamente, fazendo com que estas sejam vetores unidimensionais cujos elementos também são vetores unidimensionais. Essa particularidade permite que os elementos do vetor principal (que formariam as linhas de uma matriz) possam ser vetores de tamanhos diferentes. Em consequência disso, podemos ter uma estrutura de dados na forma de matriz, cujo número de colunas de cada linha pode ser diferente para cada uma delas.

O exemplo a seguir mostra um caso em que temos um vetor bidimensional `m` com número de colunas diferentes. Neste  mesmo  exemplo,  o  código  para  mostrar  este  vetor  bidimensional  é  modificado,  pois aquele anteriormente utilizado para mostrar uma matriz cujos números de colunas são iguais para todas as linhas não funcionaria.

```java
public class UsoDeMatrizJava2 {
    public static void main(String[] args) {
        int matriz[][] = { {4, 78, 89},
                           {-7, 36, 81, 32, -23},
                           {2, 45, 53,25},
                           {12, 17},
                           {65, -34, 47, 8, 1} };
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.printf("%3d ",matriz[linha][coluna]);
            }
            System.out.println();
        }
    }
}
```

**Questão 5:** Faça um programa que leia 5 vetores do tipo `double` com tamanhos 1, 2, 3, 4 e 5 e os guarde em um outro vetor (bidimensional). Em seguida o programa deve imprimir este vetor bidimensional "formatando-o" em linhas e colunas, calcular e mostrar a média entre seus elementos.

## A estrutura `for` aprimorada em Java para utilização com vetores multimensionais

Há uma estrutura `for` aprimorada para iterar com vetores em Java. Esta estrutura pode, inclusive, trabalhar com vetores multidimensionais e fará a iteração pelos elementos do vetor, independentemente de se conhecer o tamanho ou os índices do vetor. A sintaxe de uma instrução `for` aprimorada é:

```java
for (parametro : nomeDoVetor)
    <instrucao>;
```

O **parâmetro** tem duas partes: um **tipo** e um **identificador** (por exemplo, `int elemento`) e `nomeDoVetor` é o vetor a ser percorrido. O tipo do parâmetro deve corresponder ao tipo dos elementos do vetor. Um exemplo de utilização desta estrutura `for` aprimorada aplicada a vetores multidimensionais pode ser visto no código abaixo. Note que o número de elementos (colunas) em cada linha é diferente.

```java
public class UsoDeMatrizJava3 {
    public static void main(String[] args) {
        int matriz[][] = { {4, 78, 89},
                           {-7, 36, 81, 32, -23},
                           {2, 45, 53,25},
                           {12, 17},
                           {65, -34, 47, 8, 1} };

        for (int vetor[] : matriz) {
            for (int elemento : vetor) {
                System.out.printf("%3d ",elemento);
            }
            System.out.println();
        }
    }
}
```

**Questão 6:** Faça um programa, utilizando a estrutura `for` aprimorada, que leia 5 vetores do tipo `String` com tamanhos 1, 2, 3, 4 e 5 e os guarde em um outro vetor (bidimensional). Em seguida o programa deve imprimir este vetor bidimensional "formatando-o" em linhas e colunas. 


