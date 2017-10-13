# Introdução ao IDE NetBeans

## Introdução
Os programas em geral são desenvolvidos com a ajuda dos chamados **_Ambientes Integrados de Desenvolvimento_**, ou simplesmente **_IDE_** (*Integrated Development Environment*). Estes ambientes fornecem **_recursos importantes_** para auxiliar e facilitar o trabalho do programador, como a identificação de **_palavras reservadas_** durante a escrita do código-fonte, identificação de **_erros de sintaxe_**, **_depuração_** e **_compilação_**.

O IDE adotado no curso é o **NetBeans** (https://netbeans.org/features/ide/index.html). No NetBeans, como em outros IDEs, todo o desenvolvimento de aplicativos (ou programas) é realizado
dentro de um projeto. Outra opção popular é o Eclipse (http://www.eclipse.org/).

Na sequência deste texto é apresentada uma introdução à utilização do IDE do software adotado no desenvolvimento dos programas (aplicativos) em Java.

### Programas Necessários
Para executar esta aula prática, é necessário ter instalado o NetBeans e o JDK:
- O IDE NetBeans pode ser obtido a partir de https://netbeans.org/downloads/. Para rodar o NetBeans é necessário ter instalado previamente o *Java Development Kit (JDK)*. Neste endereço http://www.oracle.com/technetwork/java/javase/downloads/index.html, é possível baixar o NetBeans e o JDK num único pacote.
- O *Java SE Development Kit* versão 8 (JDK 8), ou superior, pode ser obtido a partir de http://www.oracle.com/technetwork/java/index.html. É possível ter várias versões do JDK instaladas e configurar o NetBeans para utlizar a mais adequada a cada situação.

**Nota:** As telas capturadas e mostradas a seguir correspondem ao IDE NetBeans 8.0.

### Visão geral da criação da primeira aplicação usando o NetBeans
Esta primeira aplicação, chamada `BemVindoAoJava.java`, simplesmente mostrará a frase "Sejam bem-vindos ao Java!". Para criar este programa é necessário:
1. **Criar um projeto IDE**
Ao criar um projeto IDE, cria-se o ambiente necessário para construir e executar aplicações. O uso de projetos IDE elimina problemas normalmente associados com o compilador `javac` e demais ferramentas. Para construir e executar aplicações basta escolher um menu dentro do IDE. 

1. **Adicionar código para o arquivo-fonte gerado**
Um arquivo-fonte contém código escrito na linguagem de programação JAVA. Como parte da criação de um projeto IDE, é gerado automaticamente o esqueleto de um arquivo-fonte, que deverá ser completado adicionando-se a mensagem “Sejam bem-vindos ao Java!”.

1. **Compilar o arquivo-fonte gerando o arquivo com extensão 'class'**
O IDE inicia o compilador (`javac`), que traduz o arquivo-fonte em instruções que podem ser executadas pelo JVM ('_Java Virtual Machine_'). Estas instruções são conhecidas como '**_bytecodes_**'. 

1. **Executar o programa**
A aplicação poderá ser executada por meio do IDE.

### Criação da primeira aplicação usando o NetBeans
A primeira aplicação usando o NetBeans irá mostrar uma mensagem de boas-vindas ao Java na tela.

### Passos para a criação de um Projeto no NetBeans
1. Iniciar o NetBeans (clicar 2X no ícone NetBeans).
1. No IDE NetBeans, escolher **Arquivo | Novo Projeto** como mostrado na Figura.
![Imgur](https://i.imgur.com/475EWgQ.png)
1. Na janela 'Novo Projeto', expandir a categoria 'Java' e selecionar 'Aplicação Java', como mostrado na Figura.
![Imgur](https://i.imgur.com/JTCjCof.png)
1. Clicar no botão 'Próximo >'
1. Preencher os campos da janela 'Novo Aplicação Java', como mostrado na figura:
    - No campo 'Nome do Projeto', digitar 'BemVindoAoJavaProj'
    - No campo 'Criar Classe Principal', corte a palavra "Proj" para que o nome da classe principal seja apenas `bemvindoaojava.BemVindoAoJava`
**Nota:** O campo 'Localização do Projeto' deverá ser modificado com a localização preferida para a pasta contendo o projeto em desenvolvimento.
![Imgur](https://i.imgur.com/JWAxnKn.png)
6. Clicar no botão 'Finalizar'.

O projeto é criado automaticamente e aberto no IDE. Algumas das janelas abertas no IDE são apresentadas na Figura e detalhadas a seguir.
- A janela 'Projetos', que contém uma visualização em árvore dos componentes do projeto, incluindo arquivos-fonte, bibliotecas relacionas com o código em construção etc.
- A janela 'Código-Fonte' com um arquivo chamado `BemVindoAoJava.java` aberto.
- A janela 'Navegador', que pode ser usada para a navegação rápida entre elementos internos a uma classe selecionada.

![Imgur](https://i.imgur.com/HkK53OA.png)

### Adicionar código no arquivo-fonte gerado
1. Como a caixa de seleção 'Criar Classe Principal' permaneceu selecionada (passo 5) o IDE criou o esqueleto de uma classe. Portanto, pode-se adicionar a mensagem "Sejam bem-vindos ao Java!" a este esqueleto de código apenas substituindo a linha de código:
```java
// TODO code application logic here
```
pelas linhas:
```java
System.out.println("\n**********************");
System.out.println("Sejam bem-vindos ao Java!");
System.out.println("**********************\n");
```

**Notas:**
1. As linhas de código numeradas de 1 a 5, na parte superior da Fig. 4 (começando com `/*` e terminando com `*/`), são comentários e não afetam o modo como o programa será executado.
1. Outra possibilidade oferecida pelo Java para fazer comentários é o uso de duas barras `//`, como na linha 18 da Fig.4: `// TODO code logic application here`. Aliás, a palavra em inglês "TODO" é uma contração de "TO + DO" e significa "something to be done", ou seja, o que falta fazer.
1. O comando `\n` faz com que o cursor pule para a linha de baixo na hora de imprimir os resultados.
1. Cuidado ao digitar códigos, comandos e nomes de arquivos. A linguagem Java é "case sensitive", ou seja, sensível a letras maiúsculas (caixa alta ou "upper case") e a letras minúsculas (caixa baixa ou "lower case"). Assim:
BemVindos ≠ bemvindos ≠ bemVindos ≠ bemvindoS ...
1. Toda mudança feita no código é salva escolhendo **Arquivo | Salvar** do menu principal ou apenas teclando `Ctrl + S`. Salve o seu projeto.
1. O código apresentado na janela `BemVindo.Java` do IDE NetBeans deverá ser parecido com o código a seguir:
```java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bemvindoaojavaproj;

public class BemVindoAoJava {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n*************************");
        System.out.println("Sejam bem-vindos ao Java!");
        System.out.println("*************************\n");
    }
}
```
1. É possível também apagar partes do código que não serão aproveitadas nesta parte do curso de tal forma que o código final fique como mostrado a seguir.
```java
package bemvindoaojavaproj;
public class BemVindoAoJava {

    public static void main(String[] args) {
        System.out.println("\n*************************");
        System.out.println("Sejam bem-vindos ao Java!");
        System.out.println("*************************\n");
    }
}
```

### Compilar o arquivo-fonte gerando o arquivo com extensão 'class'
1. Para compilar o arquivo fonte, escolha **Executar | Construir Projeto** do menu principal do IDE, ou apenas tecle `F11`. A janela 'Saída' deve apresentar uma mensagem similar à mostrada na Figura.
![Imgur](https://i.imgur.com/aDPrfeM.png)
1. O programa terá sua compilação e execução bem sucedida se a saída terminar com a sentença CONSTRUÍDO COM SUCESSO. Porém, se ocorrer algum problema, como erro de sintaxe, a saída terminará com a sentença FALHA NA CONSTRUÇÃO.
1.  Ao construir o projeto, é gerado o arquivo `BemVindoAoJava.class`, formado por '*bytecodes*'. Para verificar a localização deste arquivo basta abrir a janela (aba) 'Arquivos' e expandi-la
(`BemVindoAoJavaProj/build/classes/bemvindoaojavaproj/BemVindoAoJava.class`), como mostrado na Figura.
![Imgur](https://i.imgur.com/Li4yF0t.png)
1. Após a construção do projeto, basta executar o programa como explicado a seguir.

### Executar o Programa
1. No menu principal do IDE escolher **Executar | Executar Projeto** ou teclar `F6`. A Figura mostra a saída do programa.
![Imgur](https://i.imgur.com/bKGWedf.png)

## Exercícios
1. Escrever um programa em Java que imprima a soma de alguns números inteiros. Faça com que o programa se pareça com o código a seguir:
```java
package soma;
public class Soma {

    public static void main(String[] args) {

        int numA = 3, numB = 8, numC = 5;
        System.out.println("numA = " + numA + "; numB = " + numB + "; numC = " + numC);

        numA = numB + numC;
        System.out.println("numA = " + numA + "; numB = " + numB + "; numC = " + numC);

        numB = numC;
        System.out.println("numA = " + numA + "; numB = " + numB + "; numC = " + numC);
    }
}
```
1. Altere o programa para que ele também calcule a subtração de `numC` menos `numA` e coloque o resultado em `numD`.

## Exercícios para casa
1. O programa a seguir tem um erro. Encontre o erro e corrija-o de tal forma que possa ser compilado e executado corretamente. Qual é o erro?
```java
// INTENTIONALLY UNCOMPILABLE!
/**
 * The HelloWorldApp class implements an application that
 * simply prints "Hello World!" to standard output.
 */
class HelloWorldApp2 {
    public static void main(String[] args) {
        System.out.println("Hello World!); // Display the string.
    }
}
```
1. Modifique o aplicativo `BemVindo.java` de tal forma que exiba cada palavra da mensagem 'Sejam bem vindos ao Java' numa linha diferente.
1. Quando você compila um programa escrito em Java, o compilador converte o código-fonte que pode ser entendido por um leitor humano em um código independente da plataforma, que a JVM pode entender. Como é chamado este código independente da plataforma?
1. Qual das seguintes alternativas contém um comentário não válido? Justifique.
    1. `/** comment */`
    1. `/* comment */`
    1. `/* comment`
    1. `// comment`
