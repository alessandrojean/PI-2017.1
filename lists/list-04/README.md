# Lista 04

1. Escreva um programa que simule o conhecido **Problema de Monty Hall**
(https://pt.wikipedia.org/wiki/Problema_de_Monty_Hall) utilizando os conceitos de **Modularização/Módulos** e de **Vetores**.

    Por ex., em vez de colocar as linhas de código que geram um número randômico diretamente no método `main()`, escreva um método para este fim e dispare este método específico a partir do método `main()`, retornando um número no local da chamada. Com relação a vetores, por ex., em vez de criar três variáveis para as três portas, use um vetor com três posições.

    O programa deve escolher aleatoriamente uma porta com o carro e outra porta para o palpite inicial do participante do jogo (obviamente que em alguns casos estas duas portas coincidirão). Para cada rodada, o programa deve avaliar adequadamente o que aconteceria se o participante decidisse insistir em seu palpite inicial e se decidisse mudar de porta quando oferecido esta possibilidade.

    Simule o programa para 1000 rodadas. Como não há necessidade de qualquer interação com o usuário, este programa deve rodar em poucos segundos. Os resultados devem ser impressos na tela, tanto em números absolutos quanto percentuais.

    **Dica 1** - Em **Java**, para gerar um número randômico entre 0 e 9, você pode usar o seguinte recurso:

    ```java
    Random r = new Random();
    int numeroRandomico = r.nextInt(10);
    ```

    **Dica 2** - Não se esqueça do `import java.util.Random;`.

    **Dica 3** - Para incrementar um elemento de um vetor basta fazer `vetorDasPortas[i]++;`.
