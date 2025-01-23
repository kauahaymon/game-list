# API Rest de Listagem de Jogos

Este projeto foi desenvolvido durante o intensivão de Java Spring da DevSuperior, ministrado pelo professor Nélio Alves. O objetivo é revisar conteúdos estudados e explorar os passos necessários para se tornar um desenvolvedor Back-End Java profissional.

A API segue uma arquitetura em camadas, separando responsabilidades entre acesso ao banco de dados, regras de negócio e endpoints de requisição.

## **💻** Tecnologias Usadas

- Java
- Spring Boot 3.4.x
- Maven
- JPA / Hibernate
- Postman
- H2 Databse

## Conteúdos Abordados

### Fundamentos

- Sistemas web, cliente/servidor, HTTP e JSON

### API RESTful

- Padrão REST
- Endpoints especiais com `List`
- Verbos HTTP e idempotência
- Configuração de CORS

## Projeto com Spring

- Estruturação REST
- Arquitetura em camadas (Controller, Service, Repository)
- Padrão DTO

### Banco de Dados

- ORM e entidades
- Relacionamentos N-N e `@EmbeddedId`
- Consultas com Spring Data JPA
- Projections e database seeding

### Perfis

- Perfis para `test`, `dev` e `prod`

### Infraestrutura

- Docker Compose
- Homologação local
- Deploy com CI/CD

## Modelo de Domínio

![Modelo de domínio](https://github.com/kauahaymon/game-list/blob/main/src/main/resources/images/dslist-model.png?raw=true)

## **📡** EndPoints

| Método | EndPoint | Descrição |
| --- | --- | --- |
| GET | /games | Obtem todos os jogos |
| GET | /games/{id} | Obtem um jogo por id |
| POST | /lists/{listId}/replacement | Troca a posição de um jogo na lista |

## **🚀** Vamos começar

### Como Rodar o Projeto

**Pré-requisitos**

Certifique-se de ter instalado:

- [JDK 21](https://www.oracle.com/br/java/technologies/downloads/#java21)
- [Maven](https://maven.apache.org/download.cgi)
1. Clone o repositório:

```
git clone https://github.com/kauahaymon/game-list.git
```

1. Instale as dependências e execute o projeto:

```bash
# Entrar na pasta 
cd /game-list

mvn clean install
mvn spring-boot:run
```

1. Acesse o projeto localmente no navegador: http://localhost/8080

### 🤝 Créditos

Projeto desenvolvido como parte do curso **Intensivão Java Spring** oferecido pela [DevSuperior](https://devsuperior.com.br/), ministrado pelo professor **Nélio Alves**.
