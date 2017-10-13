# Lista 03

1. Faça um programa, utilizando a estrutura `for` aprimorada, que leia 5 vetores do tipo `String` com tamanhos 1, 2, 3, 4 e 5 e os guarde em um outro vetor (bidimensional). Em seguida o programa deve imprimir este vetor bidimensional "formatando-o" em linhas e colunas, como a ilustração abaixo.

    ![Imgur](https://i.imgur.com/T1wK6vz.png)
1. Escreva um programa em **Java** capaz de ler um arquivo tipo ".txt" com nove inteiros, e salve estes valores em um vetor (ou array) com nove elementos. A seguir, seu programa deve ler este vetor e detectar se há números repetidos nele.

    Por ex, o arquivo `meuVetorDeInteiros.txt` não possui números repetidos:

    ```
    8
    7
    6
    3
    1
    9
    2
    5
    4
    ```

    Por outro lado, o arquivo `outroVetorDeInteiros.txt` possui números repetidos:

    ```
    8
    7
    6
    3
    1
    9
    2
    5
    3
    ```

## Instruçoes para ler um arquivo do tipo ".txt"
Suponha que você queira ler o **arquivo de números inteiros** denominado `meuVetorDeInteiros.txt`. 

Uma forma simples de realizar esta tarefa é através dos métodos da classe `Scanner`.

Primeiramente é preciso criar um objeto (instância) do tipo `File` com o nome do arquivo, como na instrução abaixo.

```java
File arquivo = new File("meuVetordeInteiros.txt");
```

Depois criamos uma instância da classe `Scanner` e já podemos começar a ler os inteiros através dos métodos `hasNextInt()` e `nextInt()`, como ilustrados abaixo.

```java
Scanner sc = new Scanner(arquivo);

while (sc.hasNextInt()) {
    System.out.println(sc.nextInt());
}
```

Acrescentando alguns comandos de `import`, o código completo do programa ficaria assim.

```java
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ArquivoTxt {
    public static void main(String[] args) throws FileNotFoundException {
        File arquivo = new File("meuVetorDeInteiros.txt");
        Scanner sc = new Scanner(arquivo);

        while (sc.hasNextInt()) {
            System.out.println(sc.nextInt());
        }
    }
}
```

Note que depois do método `main()` foi acrescentado o comando `throws FileNotFoundException` para que esta classe que cuida de exceções de entrada e saída emita um sinal caso o arquivo buscado não seja encontrado ou não possa ser aberto.

Para mais informações sobre o tema, consulte, por exemplo, http://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html.
