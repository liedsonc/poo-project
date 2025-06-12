# POO - Trabalho Prático
## Descrição do Projeto

Este projeto e um sistemo de gestão de projetos feito para a disciplina de Programação Orientada a Objetos (POO) do curso de Informática de Gestão do Intituto Politécnico de Bragança. O objetivo é implementar um sistema que permita gerir projetos de investigação, incluindo a gestão de investigadores, membros investigadores e visitantes.


## Alunos
    - Liedson Correia - a61833
    - Deisylene Rocha - a53501

## Aviso
Alguns métodos no código não estão no lugar mais apropriado, mas foram criados conforme o enunciado do trabalho.
Estes estão assinalados com comentários no código.

## Estrutura do Projeto

Este projeto foi criado no IDE [IntelliJ IDEA](https://www.jetbrains.com/idea/).

A estrutura dos principais ficheiros é a seguinte:
```
POO-Trabalho-Prático/
├── src/
│   ├── AcoesMenu.java
│   ├── InvColaborador.java
│   ├── Investigador.java
│   ├── MembroInvestigador.java
│   ├── Projeto.java
│   ├── TesteUNIAG.java
│   ├── TesteUNIAGTerminal.java
│   ├── UNIAG.java
│   ├── Visitante.java
 ```
`AcoesMenu.java` contém os métodos que implementam as ações do menu principal do programa. 
As classes
   `InvColaborador.java`
   `Investigador.java` 
   `MembroInvestigador.java` 
   `Projeto.java`
   `UNIAG.java`
`Visitante.java` 
implementam as funcionalidades do sistema de gestão de projetos de investigação.

As classes `TesteUNIAG.java` e `TesteUNIAGTerminal.java` são utilizadas para testar o sistema de forma interativa e através do terminal, respetivamente.

## Requisitos
Para compilar e executar este projeto, é necessário ter o Java Development Kit (JDK) instalado na sua máquina. O projeto foi desenvolvido e testado com a versão 24.0.1 do JDK, mas deve funcionar com versões mais recentes.

## Compilação e Execução
Pode executar através do IntelliJ IDEA ou através do terminal.
Para compilar e executar o projeto no terminal, siga os seguintes passos:
1. Abra o terminal e navegue até a pasta do projeto.
2. Compile o projeto com o comando:
   ```bash
   javac src/*.java
   ```
3. Para testar o projeto de forma interativa execute o projeto com o comando:
   ```bash
    java -cp src TesteUNIAGTerminal
    ```
   ou para testar o TesteUNIAG.java execute o comando:
   ```bash
    java -cp src TesteUNIAG
    ```
