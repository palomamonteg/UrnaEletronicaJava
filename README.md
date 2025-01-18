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
O usuário pode votar digitando o número correspondente ao candidato.
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
nome (String): Nome do candidato.\
numero (int): Número do candidato.\
votos (int): Total de votos recebidos.

#### Métodos:
getNome(): Retorna o nome do candidato.\
getNumero(): Retorna o número do candidato.\
getVotos(): Retorna o total de votos recebidos.\
incrementarVotos(): Incrementa o total de votos do candidato.

## *UrnaEletronica
Gerencia o processo de votação e apuração dos resultados.

#### Atributos:
nomes (String[]): Lista com os nomes dos candidatos.\
numeros (int[]): Lista com os números dos candidatos.\
votos (int[]): Array para armazenar os votos de cada candidato.\
votosNulos (int): Contador de votos nulos.

#### Métodos:
receberVoto(int numero): Processa um voto e valida se é válido.\
exibirResultados(): Exibe os resultados da votação.

## Para Executar o código

#### Clone este repositório:

[git clone] (https://github.com/seu-usuario/UrnaEletronicaJava.git)

#### Abra o projeto no VS Code:
Certifique-se de que o Visual Studio Code está instalado.
**Navegue até o diretório do projeto clonado e abra-o no VS Code:**
(cd UrnaEletronicaJava
code .)

#### Configure o ambiente Java:
Certifique-se de que o Java JDK 17 está instalado.\
No VS Code, instale a extensão **"Extension Pack for Java"**.
Configure o ambiente para usar o JDK 17 em **"Settings"** caso não esteja configurado automaticamente.

#### Compile e execute o programa:
No terminal do VS Code, compile o programa com o seguinte comando:
**javac UrnaEletronicaJava.java**
Em seguida, execute o programa:\
**java UrnaEletronicaJava**

## Licença
**Este projeto está licenciado sob a Creative Commons.**
