# Estruturas de Decisão: Simples, Composta e Encadeada

## Introdução
Uma **estrutura** ou um **comando de decisão** define uma **condição em um programa** para que grupos de instruções sejam executados de maneira condicional, de acordo com o resultado da avaliação de um determinado teste (verdadeiro ou falso). Ou seja, programas utilizam comandos de decisão (ou de seleção) para escolher entre cursos alternativos de ações. As **estruturas de decisão** podem ser do tipo **simples**, **composto** ou **encadeado**.

A **estrutura de decisão simples** é utilizada para verificar se determinada condição é atendida. Se for, um conjunto de instruções deverá ser executado; se não for, o fluxo de execução do algoritmo seguirá para o fim do bloco de decisão. Sua representação em Java é:

```java
if (condição) {
    <conjunto de instruções>;
}
```

A **estrutura de decisão composta** prevê dois conjuntos de instruções, dos quais apenas um será executado de acordo com a condição: um conjunto que será realizado quando a condição resultar verdadeira e um conjunto de instruções quando o resultado falso. Como as condições que selecionam os conjuntos são excludentes, apenas um destes conjuntos será executado. Sua representação em Java é:

```java
if (condição) {
    <conjunto de intruções A>;
}
else {
    <conjunto de intruções B>;
}
```

Outra forma é a **estrutura de decisão encadeada**. Essa estrutura é uma sequência de testes de decisão, os quais serão executados ou não de acordo com o resultado das condições e com o encadeamento dos testes. Isto é, um teste de decisão pode ter dois conjuntos de instruções, conforme descrito em estruturas de decisão composta, um para o resultado verdadeiro e outro, para o falso. Porém, esses conjuntos de instruções podem conter outros testes de decisão, que, por sua vez, também podem conter outros. Sua representação em Java é:

```java
if (condição1) {
    if (condição2) {
        <conjunto de instruções A>;
    }
    else {
        <conjunto de instruções B>;
    }
}
else {
    <conjunto de instruções C>;
}
```

**Comandos de decisão** são **estruturas de controle** básicas de qualquer linguagem de programação de alto nível e devem, por isso, ser cuidadosamente estudadas e praticadas pelos alunos.

## Comandos de Decisão - Comparação com Operadores Lógicos
A comparação envolvendo variáveis do tipo `int`, `double` ou `float` pode ser feita utilizando a seguinte tabela de operadores muito parecidos com a linguagem matemática tradicional:

| Comparação         | Operador Java |
| :---               |     :---:     |
| Igual (=)          | `==`          |
| Diferente (≠)      | `!=`          |
| Maior (>)          | `>`           |
| Menor (<)          | `<`           |
| Maior ou igual (≥) | `>=`          |
| Menor ou igual (≤) | `<=`          |

Além de comparar duas variáveis (do mesmo tipo), nós podemos comparar também expressões matemáticas. Exemplo:

```java
if (variável1 * 10.0 - 2.4 >= (variável2 / 2.1 + 3.0))
    <conjunto de instruções A>;
else
    <conjunto de instruções B>;
```

## Atividade 1 - Calcular a contribuição de Imposto de Renda
O objetivo desta atividade prática é calcular a contribuição de Imposto de Renda de contribuinte. Vamos criar um programa que calcule a contribuição de IR baseada no salário do contribuinte. Uma das opções que será dada ao contribuinte é informar o seu salário mensal. Assim sendo será necessário fazer a conversão para o salário anual (multiplicando por 13). Finalmente, calcule o valor do Imposto de Renda a ser deduzido do salário anual. A alíquota (simplificada) de Imposto de Renda segue a tabela abaixo:

| Base de Cálculo em R$      | Alíquota % |
| :---                       |    :---:   |
| Até 20.529,36              | 0,0 %      |
| De 20.529,36 até 51.259,08 | 15,0 %     |
| Acima de 51.259,08         | 27,5 %     |

```java
import javax.swing.JOptionPane;
public class ImpostoRenda {
    public static void main(String[] args) {
        String nomeContribuinte;
        String CPFContribuinte;
        String salario;
        String pergunta;
        double salarioInput;
        String frase;
        double imposto;

        //Entrada de dados
        nomeContribuinte = JOptionPane.showInputDialog(
            "Introduza o nome do contribuinte", "nome");
        CPFContribuinte = JOptionPane.showInputDialog(
            "Introduza o CPF do contribuinte", "000.000.000-00");
        pergunta = JOptionPane.showInputDialog(
            "O valor do salário a ser informado é Anual ou Mensal?", "Anual");
        salario = JOptionPane.showInputDialog(
            "Introduza o valor do salário do contribuinte (em R$)", "0.00");

        //conversão de string para double
        salarioInput = Double.parseDouble(salario);

        if (pergunta.equals("Mensal")){
            salarioInput = salarioInput*13.00;
        }

        if (salarioInput <= 20529.36){
            imposto = 0.0;
        }
        else if (salarioInput > 51259.08){
            imposto = (salarioInput-51259.08)*0.275 + 4609.46;
        }
        else
            imposto = (salarioInput-20529.36)*0.15;
 
        frase = String.format("O total de imposto devido pelo contribuinte:\n %s\n CPF: %s\n R$ %.2f", nomeContribuinte, CPFContribuinte, imposto);
        JOptionPane.showMessageDialog(null,frase);
    }
}
```

Salve, compile e execute o seu projeto. Alimente as variáveis e analise os resultados. Depure o código e acompanhe os valores das variáveis. Quais são as estruturas de decisão utilizadas nessa atividade?

### Aumentando a complexidade da expressão boleana (operadores `&&` e `||`)
Nesta seção será apresentado o uso de expressões booleanas mais complexas, usando os operadores `&&` (E lógico) e `||` (OU lógico).

Usando os operadores E e OU, é possível alterar parte do código para calcular o Imposto de Renda.

```java
if (salarioInput <= 20429.36)
    <conjunto de instruções A>;
else if (salarioInput > 20429.36 && salarioInput <= 51259.08)
    <conjunto de instruções B>;
else if (salarioInput > 51259.08)
    <conjunto de instruções C>;
```

1. Modifique o código do programa. Salve, compile e execute o seu projeto. Atribua valores às variáveis e analise os resultados.
1. Reescreva o programa de tal maneira que seja possível ler o número de dependentes. Antes do cálculo do imposto cobrado devemos calcular a nova base de cálculo do IR (subtraindo R$ 2.063,00 para cada dependente). Tanto a base de cálculo quanto os descontos devem ser armazenados em duas novas variáveis `baseDeCalculo` (`double`) e `descontos` (`double`). Estes dois valores devem ser impressos juntamente com o imposto total cobrado.

## Atividade 2 - Determine o Maior Valor
Faça um programa em Java que leia três números inteiros e imprima o maior deles. Nesse programa será utilizada a **estrutura de decisão encadeada** para encontrar o maior.

```java
package maiorvalorproj;
import javax.swing.JOptionPane;
public class MaiorValor {
    public static void main(String[] args) {
        int valor1, valor2, valor3, maiorValor = 0;
        String frase = "";

        valor1 = Integer.parseInt(JOptionPane.showInputDialog(
            "Entre com o primeiro valor:"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog(
            "Entre com o segundo valor:"));
        valor3 = Integer.parseInt(JOptionPane.showInputDialog(
            "Entre com o terceiro valor"));

        if (valor1 >= valor2 && valor1 >= valor3) {
            maiorValor = valor1;
        } else if (valor2 >= valor1 && valor2 >= valor3) {
            maiorValor = valor2;
        } else if (valor3 >= valor1 && valor3 >= valor2) {
            maiorValor = valor3;
        }
        frase = String.format("O maior valor entre %d %d %d é: %d",
            valor1, valor2, valor3, maiorValor);
        JOptionPane.showMessageDialog(null, frase);
    }
}
```

Salve, compile e execute o seu projeto. Analise os resultados. Modifique o código para detectar quando os três valores são iguais.

## Exercícios para Casa
- Faça um programa em Java que peça como entrada o peso (em kilogramas) e a altura (em metros) da pessoa, e calcule o seu IMC Índice de Massa Corpórea. Adicionalmente, o programa deve emitir as mensagens correspondentes conforme a tabela a seguir:

| Cálculo IMC       | Situação                                 |
| ----------------- | ---------------------------------------- |
| Abaixo de 18,5    | Você está abaixo do peso ideal           |
| Entre 18,5 e 24,9 | Parabéns - você está em seu peso normal! |
| Entre 25,0 e 29,9 | Você está acima de seu peso (sobrepeso)  |
| Entre 30,0 e 34,9 | Obesidade grau I                         |
| Entre 35,0 e 39,9 | Obesidade grau II                        |
| 40,0 e acima      | Obesidade grau III                       |

- Faça um programa em Java que peça como entrada os coeficientes `a`, `b` e `c` de uma equação de 2º grau e forneça como saída as suas raízes. Não se esqueça de prever os seguintes casos:
    1. `a = 0` : Equação de 1º grau, calcule a **única** raiz diretamente
    1. `Δ = 0` : Calcule a **única** raiz pela fórmula de Baskara
    1. `Δ < 0` : Calcule as 2 raízes **complexas** pela fórmula de Baskara
    1. `Δ > 0` : Calcule as 2 raízes **reais** pela fórmula de Baskara

- Faça um programa em Java que peça como entrada o conceito final de um aluno em uma disciplina cursada na UFABC e imprima a mensagem correta, conforme tabela abaixo:

| Conceito Final | Situação               |
|     :---:      | :---                   |
| A              | Desempenho excepcional |
| B              | Bom desempenho         |
| C              | Desempenho adequado    |
| D              | Aproveitamento mínimo  |
| F              | Reprovado              |
| O              | Reprovado por falta    |
| I              | Incompleto             |

- Uma livraria está fazendo uma promoção para pagamento à vista em que o comprador pode escolher entre dois critérios de desconto:
    - Critério A: R$ 0,25 por livro + R$ 7,50 fixo
    - Critério B: R$ 0,50 por livro + R$ 2,50 fixo

Faça um programa em Java em que o usuário digite a quantidade de livros que deseja comprar e o programa diga qual é a melhor opção de desconto.
