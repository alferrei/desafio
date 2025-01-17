Desafio fora realizado para apresentação à NTT. 
A solução para o desafio proposto deveria trazer uma aplicação que provesse a capacidade de realizar as operações de busca de cep em uma api externa (com mock, neste caso foi usado o Wiremock);

Os logs das consultas precisavam ser gravados em base de dados, com o horário da consulta e os dados que retornaram da api.


Para solução, criei o arquivo docker-compose.yml para que subisse duas aplicações utilizadas nesta solução, o WireMock e o Postgres.
Ao abrir a aplicação, deve-se executar o comando em cmd:
  docker-compose up -d;

O mesmo baixa a imagem e levanta o container necessário para que o WireMock e Postgres passem a funcionar.
Uma vez aberto o Postgres, deve-se executar os seguintes comandos:

      -- Cria o banco de dados cepapp, se não existir
      CREATE DATABASE IF NOT EXISTS cepapp;

      -- Conecta ao banco de dados cepapp
      \c cepapp;

      -- Cria a tabela consulta_log
    CREATE TABLE consulta_log (
      id SERIAL PRIMARY KEY,
      cep VARCHAR(255),
      response TEXT,
      consulta_time TIMESTAMP NOT NULL
    );


Após executar os comandos, valide se há realmente a tabela e suba a aplicação via IDE. 
A partir deste momento, você está livre para testá-la ao tentar acessar a url mockada localhost:8080/api/cep/03333-000 ou localhost:8080/api/cep/01001-000 via postman, browser ou curl.
