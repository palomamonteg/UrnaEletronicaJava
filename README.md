# Urna Eletrônica em Java

Este repositório contém uma implementação de uma urna eletrônica simplificada baseada nos princípios de Programação Orientada a Objetos (POO) em Java. O objetivo deste projeto é simular uma votação com candidatos pré-definidos, registrar votos e exibir os resultados.

## Funcionalidades

#### Candidatos Pré-configurados:
- Ada Lovelace (01)
- Alan Turing (02)
- Marie Curie (03)
- Albert Einstein (04)
- Ludwig van Beethoven (05)

#### Entrada de Votos:
O usuário pode votar digitando o número correspondente ao candidato.\
Votos inválidos são contabilizados como "votos nulos".

#### Validação de Votos:
Apenas os números entre 1 e 5 são considerados válidos.

#### Resultados da Votação:
Exibição do total de votos para cada candidato.\
Percentual de votos de cada candidato em relação aos votos válidos.\
Total de votos nulos.\
Nome do vencedor ou informação sobre empate.

## Estrutura do Projeto

### O projeto é composto pelas seguintes classes:
## *Candidato
Representa um candidato na eleição.

#### Atributos:
- nome (String): Nome do candidato.
- numero (int): Número do candidato.
- votos (int): Total de votos recebidos.

#### Métodos:
- getNome(): Retorna o nome do candidato.
- getNumero(): Retorna o número do candidato.
- getVotos(): Retorna o total de votos recebidos.
- incrementarVotos(): Incrementa o total de votos do candidato.

## *UrnaEletronica
Gerencia o processo de votação e apuração dos resultados.

#### Atributos:
- nomes (String[]): Lista com os nomes dos candidatos.
- numeros (int[]): Lista com os números dos candidatos.
- votos (int[]): Array para armazenar os votos de cada candidato.
- votosNulos (int): Contador de votos nulos.

#### Métodos:
- receberVoto(int numero): Processa um voto e valida se é válido.
- exibirResultados(): Exibe os resultados da votação.

## Para Executar o código

#### 1.Clone este repositório:

[git clone] (https://github.com/seu-usuario/UrnaEletronicaJava.git)

#### 2.Abra o projeto no VS Code:
Certifique-se de que o Visual Studio Code está instalado.
**Navegue até o diretório do projeto clonado e abra-o no VS Code:**
(cd UrnaEletronicaJava
code .)

#### 3.Configure o ambiente Java:
Certifique-se de que o Java JDK 17 está instalado.\
No VS Code, instale a extensão **"Extension Pack for Java"**.
Configure o ambiente para usar o JDK 17 em **"Settings"** caso não esteja configurado automaticamente.

#### 4.Compile e execute o programa:
No terminal do VS Code, compile o programa com o seguinte comando:
**javac UrnaEletronicaJava.java**
Em seguida, execute o programa:\
**java UrnaEletronicaJava**

## Exemplo de Interação

Bem-vindo à Urna Eletrônica!\
Candidatos:\
01 - Ada Lovelace\
02 - Alan Turing\
03 - Marie Curie\
04 - Albert Einstein\
05 - Ludwig van Beethoven\

Digite o número do seu candidato (1/10): 02\
Digite o número do seu candidato (2/10): 03\
Digite o número do seu candidato (3/10): 06\
Entrada inválida! Voto computado como nulo.\
Digite o número do seu candidato (4/10): 03\
... (continua até 10 votos)\

Resultado da Votação:\
Ada Lovelace: 3 votos (30.0%)\
Alan Turing: 2 votos (20.0%)\
Marie Curie: 4 votos (40.0%)\
Albert Einstein: 0 votos (0.0%)\
Ludwig van Beethoven: 1 voto (10.0%)\
Votos Nulos: 0\
Vencedor: Marie Curie\

## Contribuições
Contribuições são sempre bem-vindas! 

## Licença
**Este projeto está licenciado sob a Creative Commons.**
