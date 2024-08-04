# Projetos de Design Patterns em Java

Este repositório contém implementações simples de design patterns em Java, baseadas em perguntas de uma ficha de estudos da disciplina de Padrões de Projeto. Em vários dos projetos utilizei Swing, e em outros o próprio console, a depender do enunciado.

## Projetos

### 1. Exibir Mensagem para Cada Dia da Semana (Strategy Pattern)
**Enunciado:**
Escreva um programa que exiba uma mensagem diferente para cada dia da semana usando o padrão Strategy.

**Descrição:**
Neste projeto, implementei o padrão Strategy para exibir mensagens diferentes para cada dia da semana. Cada dia tem uma estratégia específica para fornecer a mensagem correspondente.

### 2. Estrutura Multi-Níveis de Observadores e Observáveis (Observer Pattern)
**Enunciado:**
Monte uma estrutura multi-níveis de observadores e observáveis. Crie uma classe que representa um sistema de alarme que monitora diversos sensores. O sistema de alarme, por sua vez, é observado por uma classe que representa a delegacia de polícia e outra que representa a companhia de seguros. Quando um sensor detecta o movimento deve alertar o sistema que, em cadeia, alerta a delegacia e a companhia de seguros.

**Descrição:**
Este projeto utiliza o padrão Observer para criar um sistema de alarme que monitora sensores e notifica a delegacia de polícia e a companhia de seguros quando o alarme é acionado. A estrutura multi-níveis de observadores garante que todos os interessados sejam notificados corretamente.

### 3. Decoradores para Imprimir Número (Decorator Pattern)
**Enunciado:**
Crie uma classe NumeroUm que tem um método imprimir() que imprime o número “1” na tela. Implemente decoradores para colocar parênteses, colchetes e chaves ao redor do número (ex.: “1”). Combine-os de diversas formas.

**Descrição:**
Neste projeto, a classe `NumeroUm` imprime o número "1". Utilizei o padrão Decorator para adicionar parênteses, colchetes e chaves ao redor do número, permitindo combinações diversas de decoradores.

### 4. Construção de Nomes (Factory Method Pattern)
**Enunciado:**
Construa um programa que receba como parâmetro um ou mais nomes, cada um podendo estar em um dos seguintes formatos:
- “nome sobrenome”;
- “sobrenome, nome”.

Escreva duas aplicações de construção de nomes, uma para cada formato. Cada uma deve ser responsável por armazenar os nomes criados e imprimi-los quando requisitado. Implemente o padrão Factory Method de forma que somente a criação do nome seja delegada às aplicações concretas (subclasses). Seu programa deve criar as duas aplicações e construir objetos da classe Nome, que deve ter propriedades nome e sobrenome para armazenar as informações em separado. Os nomes não precisam ser impressos em ordem.

**Exemplo:**
```
$ java Nomes "McNealy, Scott" "James Gosling" "Naughton, Patrick"
James Gosling
Scott McNealy
Patrick Naughton
```

**Descrição:**
Este projeto usa o padrão Factory Method para criar instâncias de nomes em dois formatos diferentes: "nome sobrenome" e "sobrenome, nome". Cada formato tem sua própria classe concreta responsável por armazenar e imprimir os nomes corretamente.


## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.
