# Lista 02

1. Escreva um programa em **Java** usando um `while` e um `for`, aninhados na ordem que lhe parecer mais apropriada, que imprima o triângulo mostrado abaixo.

    ```
    t t t t t t t t t t t
    t t t t t t t t t t
    t t t t t t t t t
    t t t t t t t t
    t t t t t t t
    t t t t t t
    t t t t t
    t t t t
    t t t
    t t
    t
    ```
1. Escreva um programa em **Java** que convida o usuário a descobrir qual é o número randômico, entre 0 e 9, previamente gerado pelo programa. A seguir, o usuário digita um número e, se este número não for o número randômico previamente gerado, o programa informa que o número `x` digitado não é o número esperado. Quando o usuário finalmente digitar o número randômico previamente gerado, o programa termina parabenizando o usuário pelo acerto e informando quantas tentativas foram necessárias para descobrir o número randômico.

    Dica 1 - Em **Java**, para gerar um número randômico entre 0 e 9, você pode usar o seguinte recurso:
    
    ```java
    Random r = new Random();
    int numeroRandomico = r.nextInt(10);
    ```

    Dica 2 - Não se esqueça do `import java.util.Random;`.
