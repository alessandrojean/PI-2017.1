# Modularização de Código e Passagem de Parâmetros
*Notas de aula do Prof. José A. Quilici-Gonzalez, CMCC/UFABC.*

# Introdução
Em Java, como em outras linguagens de Programação Orientada a Objetos (POO), o código pode ser simplificado empregando-se **_métodos de classe_**, em princípio análogos às **_funções_** das linguagens funcionais. De fato, sem utilizar POO, em algoritmos sequenciais, como os estudados, não há diferenças notáveis entre **_métodos_** e **_funções_**.
Toda a classe **executável** em Java deve incluir um método `main()`, que é o método chamado automaticamente pela JVM quando a classe é executada. Como já visto, a declaração do método `main()` é feita da seguinte forma:

```java
public static void main(String[] args) { <código do usuário> }
```

De forma similar, outros métodos podem ser definidos para executar blocos de código do usuário. Como exemplo, uma **função fatorial** pode ser implementada em um método (recursivo), como se vê abaixo:

```java
// [1]    [2]  [3]      [4]  [5]
public static long fatorial(long n) {
    if (n <= 1)
       return 1; //[6]
    else
       return n*fatorial(n - 1); //[6]
}
```

**[1]** Métodos públicos podem ser acessados por outras classes. Em POO, métodos também podem ser **privados** e protegidos; por enquanto utilizaremos apenas métodos públicos.

**[2]** Métodos declarados como **estáticos** podem ser chamados sem a necessidade de criar um objeto da classe em que o método foi declarado. 

**[3]** O tipo da variável retornada pelo método deve ser declarado, ou identificado como `void` (vazio) no caso de o método não retornar nada.

**[4]** O nome do método segue as mesmas regras de nomenclatura das variáveis, como estudado anteriormente.

**[5]** Definimos os tipos de entrada aceitos pelo método ao declarar os tipos e nomes de variáveis locais entre parênteses (válidas somente no escopo do método), que receberão os **valores** passados como parâmetros pela chamada, separados por vírgula.

**[6]** Caso o valor de retorno não seja declarado `void` (vazio), o bloco deverá incluir a palavra reservada `return`, que indica o valor a ser retornado ao ponto de chamada, **finalizando** a execução do método.

Métodos podem ser copiados para novos programas e reutilizados. Métodos declarados públicos podem ser acessados externamente por qualquer classe, assim limpando/simplificando o código principal, o que é particularmente útil em projetos extensos. Para utilizar uma classe externa, basta importá-la no início de outra classe, caso não esteja no mesmo
projeto. Quando utilizamos o método `Math.pow(2,6)` para efetuar a operação `2^6`, estamos chamando o método `pow()` (exponenciação) da classe padrão `Math`, que oferece outras funções (ex. `sin()`, `cos()`, `random()` etc.) e constantes (`Math.PI` e `Math.E`) matemáticas. Classes padrões como `System` (chamadas do sistema) e `Math` são automaticamente incluídas. Outras classes cujos métodos públicos já utilizamos são `String`, `Integer`, `Double`, `java.util.Scanner` e `javax.swing.JOptionPane`.

## Atividade 1 - Modularizando o código
O código da página seguinte pode ser simplificado escrevendo-se métodos modulares com o objetivo de reduzir a repetição de blocos de código ao longo do programa. 

Por exemplo, o código:

```java
double valorInicial = Double.parseDouble(
    JOptionPane.showInputDialog("Valor inicial: ", "300"));
int meses = Integer.parseInt(
    JOptionPane.showInputDialog("Quantos meses? ", "1"));
```

É substituido por:

```java
double valorInicial = ask("Valor inicial: ", 300);
int meses = ask("Quantos meses? ", 1);
```

implementando-se o método `ask()` da seguinte forma:

```java
public static double ask(String m, double d) {
    try {
        return Double.parseDouble(
            JOptionPane.showInputDialog(m, d));
    } catch (Exception e) {
        e.printStackTrace();
        return d;
    }
}
```

O método `ask()` pode ser sobrecarregado para outros tipos de variável, como inteiros:

```java
public static int ask(String m, int i) {
    try {
        return Integer.parseInt(JOptionPane.showInputDialog(m, i));
    } catch (Exception e) {
        e.printStackTrace();
        return i;
    }
}
```

Note que o código substituído incorpora tratamento de erros, assumindo o valor padrão (`default`) no caso de entrada inválida, como String vazia, caracteres não numéricos ou com erro de formatação. Por motivos didáticos a mensagem de erro ainda é exibida no console (`e.printStackTrace()`), embora possa ser omitida.

Modifique o programa abaixo criando 2 métodos (`ask()` e `planejar()`) para reduzir ao máximo a repetição de código no método `main()`, passando por meio de parâmetros os valores que os novos métodos venham a utilizar. Tente deixar o código o **mais breve possível**.

```java
import javax.swing.JOptionPane;
public class Aplicacao {
    public static void main(String[] args) {
        double investimento = ask("Qual o valor investido?", 15000f);
        double complemento = ask("Qual o complemento mensal?", 800f);
        double objetivo = ask("Qual o objetivo?", 300000f);
        double juros_Poupanca = 1.0057; // ~0,57% ao mês na média
        double juros_CDB = 1.0082; // ~0,82% ao mês
        double juros_LTN = 1.012; // ~1,2% ao mês
        double juros_Multimercado = 1.016; // ~1,6% ao mês
        double taxaAnual_Multimercado = 0.01; // 1% ao ano
        String frase = String.format("Para um investimento de R$ %,.2f " +
            "com aplicações mensais de R$ %,.2f\n" +
            "O tempo para atingir R$ %,.2f seria:\n\n",
            investimento, complemento, objetivo);
        int meses = 0; double saldo = investimento;
        while (saldo < objetivo) {
            meses++; saldo = saldo * juros_Poupanca + complemento;
        }
        frase += String.format("%d meses (%d anos) na Poupança\n", meses, meses/12);
        meses = 0; saldo = investimento;
        while (saldo < objetivo) {
            meses++; saldo = saldo * juros_CDB + complemento;
        }
        frase += String.format("%d meses (%d anos) no CDB\n", meses, meses/12);
        meses = 0; saldo = investimento;
        while (saldo < objetivo) {
            meses++; saldo = saldo * juros_LTN + complemento;
        }
        frase += String.format("%d meses (%d anos) em Letras do Tesouro Nacional\n",
                                meses, meses/12);
        meses = 0; saldo = investimento;
        while (saldo < objetivo) {
            meses++; saldo = saldo * juros_Multimercado + complemento;
            if (meses % 12 == 0 && meses > 1) {
                saldo -= saldo * taxaAnual_Multimercado;
            }
        }
        frase += String.format("%d meses (%d anos) em Fundos Multimercado\n",
                                meses, meses/12);
        JOptionPane.showMessageDialog(null, frase);
    }
}

```

## Atividade 2 - Operações aritméticas

```java
package calculo;
import javax.swing.JOptionPane;
public class Calculo {
    static void modAdicao() {
        double v1;
        double v2;
        double res;
        v1 = Double.parseDouble(
            JOptionPane.showInputDialog("Digite o primeiro valor: "));
        v2 = Double.parseDouble(
            JOptionPane.showInputDialog("Digite o segundo valor: "));
        res = v1 + v2;
        JOptionPane.showMessageDialog(null, "Soma = " + res);
    }

    public static void main(String[] args) {
        int opcao;
        opcao = Integer.parseInt(
                JOptionPane.showInputDialog("Escolha a sua opção: \n" + "1 – adição\n"));

        if (opcao == 1) {
            modAdicao();
        }
        JOptionPane.showMessageDialog(null, " Fim do Programa");
    }
}
```

1. Complete o programa construindo métodos para multiplicação, divisão e subtração. Vale ressaltar que o tipo suportado deverá ser `double`.
1. Os métodos podem ser sobrecarregados para lidar com tipos diferentes de entrada e saída. Construa um novo módulo/método `modAdição()` que tenha passagem dos parâmetros `double v1` e `double v2`. Faça o teste trabalhando com os módulos/métodos `modAdição()` (com e sem passagem de parâmetros). Depure o código e verifique o que ocorre na implementação em Java.

## Exercícios para Casa

1. Concatene o código da atividade 1 de forma que o método `main()` execute apenas o comando `JOptionPane.showMessageDialog(null, frase(), "Planejamento financeiro", JOptionPane.INFORMATION_MESSAGE);`

1. Faça um programa que leia 200 números através de uma estrutura de repetição e utilize um processo randômico para sorteio do valor. Os números devem estar entre 0 e 100. Verifique:
    1. Qual foi o número sorteado mais vezes;
    1. Qual foi o número sorteado menos vezes;
    1. Qual foi o maior número;
    1. Qual foi o menor número.

    Escreva uma função para cada opção. No final, imprima esses valores na tela para o usuário.

1. Crie métodos para exibição de temperaturas em graus Celsius, Fahrenheit e Kelvin. Os métodos `celsius(t)`, `kelvin(t)` e `fahrenheit(t)` (sobrecarregados) devem receber um número de qualquer tipo (`byte`, `int`, `long`, `float` ou `double`) e retornar uma `String` no formato `"%d ºC = %d ºF = %d K"`.

    Dados:

    ```
    (Fahrenheit) = 1.8 * (Celsius) + 32;
    (Kelvin) = (Celsius) + 273.15;
    ```
