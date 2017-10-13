# Vetores

## Introdução
Um **Vetor** também é conhecido como **variável composta homogênea unidimensional**, ou seja, corresponde a um conjunto de variáveis do mesmo tipo, que possuem o mesmo identificador e são alocadas sequencialmente na memória. Como as variáveis têm o mesmo nome, o que as distingue é um índice que referencia a sua localização dentro da estrutura.

Em Java, **Vetores** são definidos pela existência de colchetes vazios antes ou depois do nome da variável no momento da declaração. Veja os exemplos:

`int x[] = new int[10];` ou então `int[] x = new int[10];`

A primeira parte do comando, `int x[]`, corresponde à declaração do vetor (ou referência), incluindo o tipo `int` e o nome do vetor `x[]`, porém esta declaração apenas não aloca memória para o vetor. O operador `new` é necessário para criar uma instância do vetor (e alocar memória), indicando o tipo de dados que está sendo instanciado (`int`) e o número de posições (`[10]`).

O código acima declara um vetor de inteiros com 10 posições, numeradas de 0 a 9, na qual cada posição é uma variável do tipo inteiro. Veja um exemplo de valores atribuídos às posições 0 a 9 do vetor `x[]`:

![Imgur](https://i.imgur.com/i8p3Lh3.png)

A atribuição de um valor a uma posição da variável `x[]` é realizada da seguinte forma:

```java
x[0] = 10;
x[1] = 5;
x[2] = 4;
x[3] = 8;
x[4] = 3;
x[5] = 5;
x[6] = 2;
x[7] = 1;
x[8] = 9;
x[9] = -1000;
```

Este vetor `x[]` também poderia ter sido criado da seguinte forma:

```java
int x[] = {10, 5, 4, 8, 3, 5, 2, 1, 9, -1000};
```

Uma prática interessante é utilizar uma variável dentro dos colchetes `[]` para percorrer o vetor. Por exemplo, é possível imprimir as 10 primeiras posições do vetor da seguinte forma:

```java
for (int posicao = 0; posicao < 10; posicao ++)
    System.out.println(x[posicao]);
```

## Atividade 1
Faça um programa que leia valores para preencher um vetor de `float` com 10 posições. Em seguida, o programa deve imprimir a soma dos valores.

Utilize os métodos da classe `JOptionPane` para a leitura e a impressão dos valores.

## Atividade 2
Faça um programa que leia valores inteiros e preencha um vetor com oito posições denominado `valoresDeEntrada`. Em seguida, crie dois vetores de mesmo tipo e tamanho, denominados `valoresPositivos` e `valoresNegativos`. O vetor `valoresPositivos` deve conter os números maiores que ou igual a zero. O vetor `valoresNegativos` deve conter os números menores que zero.

Observe que cada vetor resultante deve ter o mesmo tamanho do vetor de leitura, entretanto, nem todas as posições terão valores. Utilize uma variável para manter a contagem dos valores inseridos em `valoresPositivos` e outra variável para `valoresNegativos`. Essas variáveis devem ser iniciadas com valor zero e, a cada valor inserido nos vetores, ela deve ser incrementada.

Ao final, imprima os vetores `valoresPositivos` e `valoresNegativos`.

## Atividade 3
Faça um programa que preencha um vetor com dez números inteiros, calcule e mostre o vetor resultante em ordem crescente de valores.

Exemplo de entrada:
![Imgur](https://i.imgur.com/mFAPy6c.png)

Saída:
![Imgur](https://i.imgur.com/5zTv4wP.png)

Para a ordenação, pode ser empregado o seguinte pseudocódigo:

```
para (i <- 0 até (tamanho do vetor - 1)) faça
    para (j <- (i + 1) até tamanho do vetor) faça
        se (vetor[i] > vetor[j]) então
            troque vetor[i] com vetor[j]
        fim-se
    fim-para
fim-para
```

