# Banking API

API REST de um sistema bancário desenvolvida com **Java 21** e **Spring Boot 4.1.0**, com autenticação baseada em **JWT**, persistência de dados em **PostgreSQL** e operações bancárias como depósito, saque e transferência.

Projeto desenvolvido como estudo prático e peça de portfólio, com foco em desenvolvimento backend, arquitetura em camadas, autenticação, validação de dados, tratamento de exceções e implementação de regras de negócio.

[![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1.0-6DB33F?logo=springboot)](https://spring.io/projects/spring-boot)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-4169E1?logo=postgresql)](https://www.postgresql.org/)
[![Maven](https://img.shields.io/badge/Maven-Build-C71A36?logo=apachemaven)](https://maven.apache.org/)
[![Git](https://img.shields.io/badge/Git-Version%20Control-F05032?logo=git)](https://git-scm.com/)

---

## 📑 Índice

* [Sobre o projeto](#-sobre-o-projeto)
* [Funcionalidades](#-funcionalidades)
* [Tecnologias utilizadas](#-tecnologias-utilizadas)
* [Arquitetura](#-arquitetura)
* [Estrutura do projeto](#-estrutura-do-projeto)
* [Pré-requisitos](#-pré-requisitos)
* [Configuração do banco de dados](#-configuração-do-banco-de-dados)
* [Como executar](#-como-executar)
* [Autenticação e segurança](#-autenticação-e-segurança)
* [Endpoints](#-endpoints)
* [Usuários](#-usuários)
* [Autenticação](#-autenticação)
* [Conta bancária](#-conta-bancária)
* [Histórico de transações](#-histórico-de-transações)
* [Tipos de transação](#-tipos-de-transação)
* [Validação e tratamento de erros](#-validação-e-tratamento-de-erros)
* [Modelo de dados](#-modelo-de-dados)
* [Regras de negócio](#-regras-de-negócio)
* [Testes manuais](#-testes-manuais)
* [Objetivos e aprendizados](#-objetivos-e-aprendizados)
* [Autor](#-autor)
* [Licença](#-licença)

---

## 💻 Sobre o projeto

A **Banking API** é uma API REST de um sistema bancário desenvolvida com **Java** e **Spring Boot**.

O projeto implementa funcionalidades relacionadas ao gerenciamento de usuários e contas bancárias, incluindo:

* Cadastro e consulta de usuários;
* Criação automática de conta bancária;
* Autenticação utilizando JWT;
* Depósitos;
* Saques;
* Transferências entre contas;
* Histórico de transações;
* Validação de dados;
* Tratamento global de exceções;
* Proteção de endpoints com Spring Security;
* Controle transacional das operações financeiras.

A aplicação utiliza **PostgreSQL** para persistência dos dados e **BCrypt** para armazenamento seguro das senhas.

O projeto foi desenvolvido como estudo prático e para composição de portfólio em **desenvolvimento backend Java**, permitindo aplicar conceitos de APIs REST, segurança, persistência, arquitetura em camadas e regras de negócio.

---

## ✨ Funcionalidades

### 🔐 Autenticação e segurança

* Autenticação utilizando JWT;
* Proteção de endpoints com Spring Security;
* Senhas armazenadas utilizando BCrypt;
* Validação do JWT nas requisições protegidas;
* Autenticação através do header `Authorization: Bearer`.

### 👤 Usuários

* Cadastro de usuários;
* Consulta de usuário;
* Criação automática de conta bancária após o cadastro;
* Validação de dados;
* Restrição de e-mail duplicado.

### 🏦 Contas bancárias

* Consulta da própria conta;
* Geração automática do número da conta;
* Saldo inicial igual a zero.

### 💰 Operações financeiras

* Depósito;
* Saque;
* Transferência entre contas;
* Validação de saldo;
* Histórico de transações;
* Registro das movimentações financeiras;
* Controle transacional das operações.

---

## 🛠️ Tecnologias utilizadas

| Tecnologia            | Finalidade                            |
| --------------------- | ------------------------------------- |
| **Java 21**           | Linguagem principal                   |
| **Spring Boot 4.1.0** | Framework da aplicação                |
| **Spring Web**        | Desenvolvimento da API REST           |
| **Spring Data JPA**   | Persistência de dados                 |
| **Hibernate**         | ORM                                   |
| **Spring Security**   | Autenticação e proteção dos endpoints |
| **JJWT**              | Geração e validação de JWT            |
| **BCrypt**            | Armazenamento seguro das senhas       |
| **PostgreSQL**        | Banco de dados                        |
| **Maven**             | Gerenciamento do projeto e build      |
| **Git**               | Controle de versão                    |

---

## 🏗️ Arquitetura

A aplicação utiliza uma **arquitetura em camadas**, separando responsabilidades entre os principais componentes:

```text
Controller
    |
    v
Service
    |
    v
Repository
    |
    v
PostgreSQL
```

### Controller

Responsável por receber as requisições HTTP e retornar as respostas da API.

### Service

Concentra as regras de negócio e a lógica da aplicação.

### Repository

Responsável pelo acesso e persistência dos dados utilizando **Spring Data JPA**.

### Entity

Representa as entidades persistidas no banco de dados.

### DTO

Responsável pela representação dos dados de entrada e saída da API.

### Exception

Centraliza o tratamento das exceções da aplicação.

### Config

Contém as configurações relacionadas à segurança e ao filtro de autenticação JWT.

---

## 📁 Estrutura do projeto

```text
src/
└── main/
    └── java/
        └── com/example/bankingapi/
            ├── config/
            │   ├── JwtAuthenticationFilter.java
            │   └── SecurityConfig.java
            │
            ├── controller/
            │   ├── AccountController.java
            │   ├── AuthController.java
            │   ├── TransactionController.java
            │   └── UserController.java
            │
            ├── dto/
            │   ├── AccountResponse.java
            │   ├── DepositRequest.java
            │   ├── LoginRequest.java
            │   ├── TransactionResponse.java
            │   ├── TransferRequest.java
            │   ├── UserRequest.java
            │   └── UserResponse.java
            │
            ├── entity/
            │   ├── Account.java
            │   ├── Transaction.java
            │   ├── TransactionType.java
            │   └── User.java
            │
            ├── exception/
            │   ├── AccountNotFoundException.java
            │   ├── EmailAlreadyExistsException.java
            │   ├── GlobalExceptionHandler.java
            │   ├── InsufficientBalanceException.java
            │   ├── InvalidCredentialsException.java
            │   └── UserNotFoundException.java
            │
            ├── repository/
            │   ├── AccountRepository.java
            │   ├── TransactionRepository.java
            │   └── UserRepository.java
            │
            └── service/
                ├── AccountService.java
                ├── AuthService.java
                ├── CustomUserDetailsService.java
                ├── JwtService.java
                ├── TransactionService.java
                └── UserService.java
```

---

# ⚙️ Configuração

## Pré-requisitos

Antes de executar o projeto, certifique-se de possuir:

* **Java 21**
* **PostgreSQL**
* **Git**
* **Maven Wrapper**, incluído no projeto

---

## 🗄️ Configuração do banco de dados

Crie o banco de dados no PostgreSQL:

```sql
CREATE DATABASE banking_api;
```

Em seguida, configure as credenciais no arquivo:

```text
src/main/resources/application.properties
```

Exemplo:

```properties
spring.application.name=banking-api

spring.datasource.url=jdbc:postgresql://localhost:5432/banking_api
spring.datasource.username=postgres
spring.datasource.password=SUA_SENHA

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

jwt.secret=SUA_CHAVE_SECRETA
```

> **Importante:** substitua `SUA_SENHA` e `SUA_CHAVE_SECRETA` pelos valores utilizados no seu ambiente local.

**Não publique senhas, chaves JWT ou outras credenciais reais no repositório.**

---

# ▶️ Como executar

### 1. Clone o repositório

```bash
git clone https://github.com/SEU_USUARIO/banking-api.git
```

### 2. Entre na pasta do projeto

```bash
cd banking-api
```

### 3. Dê permissão ao Maven Wrapper, caso necessário

```bash
chmod +x mvnw
```

### 4. Execute a aplicação

```bash
./mvnw spring-boot:run
```

A aplicação estará disponível em:

```text
http://localhost:8080
```

# 🔐 Autenticação e segurança

A API utiliza **Spring Security** e **JWT** para autenticar os usuários e proteger os endpoints.

O fluxo de autenticação é:

```text
Login
  |
  v
AuthService
  |
  v
Verificação da senha com BCrypt
  |
  v
JwtService
  |
  v
JWT
  |
  v
Authorization: Bearer <token>
  |
  v
JwtAuthenticationFilter
  |
  v
Endpoint protegido
```

O JWT possui tempo de expiração e sua assinatura é validada antes da autenticação do usuário.

As senhas não são armazenadas em texto puro. O projeto utiliza **BCrypt** para armazená-las de forma segura.

### Endpoints públicos

```text
POST /users
POST /auth/login
```

### Endpoints protegidos

```text
GET  /users/{id}

GET  /accounts/me
POST /accounts/deposit
POST /accounts/withdraw
POST /accounts/transfer

GET  /transactions/history
```

As requisições protegidas devem enviar o token através do header:

```text
Authorization: Bearer SEU_TOKEN
```

---

# 📡 Endpoints

## Resumo

| Método | Endpoint                | Autenticação | Descrição                                 |
| ------ | ----------------------- | ------------ | ----------------------------------------- |
| `POST` | `/users`                | Não          | Cadastra um novo usuário e cria sua conta |
| `GET`  | `/users/{id}`           | Sim          | Consulta um usuário                       |
| `POST` | `/auth/login`           | Não          | Autentica o usuário e retorna o JWT       |
| `GET`  | `/accounts/me`          | Sim          | Consulta a conta do usuário autenticado   |
| `POST` | `/accounts/deposit`     | Sim          | Realiza um depósito                       |
| `POST` | `/accounts/withdraw`    | Sim          | Realiza um saque                          |
| `POST` | `/accounts/transfer`    | Sim          | Realiza uma transferência                 |
| `GET`  | `/transactions/history` | Sim          | Consulta o histórico de transações        |

---

# 👤 Usuários

## Criar usuário

```http
POST /users
```

Endpoint público.

### Requisição

```bash
curl -X POST http://localhost:8080/users \
-H "Content-Type: application/json" \
-d '{
  "nome": "João",
  "email": "joao@email.com",
  "senha": "123456"
}'
```

### Resposta

```json
{
  "id": 1,
  "nome": "João",
  "email": "joao@email.com"
}
```

Ao cadastrar o usuário, uma conta bancária é criada automaticamente com saldo inicial igual a zero.

---

## Buscar usuário

```http
GET /users/{id}
```

Endpoint protegido.

### Requisição

```bash
curl http://localhost:8080/users/1 \
-H "Authorization: Bearer SEU_TOKEN"
```

### Resposta

```json
{
  "id": 1,
  "nome": "João",
  "email": "joao@email.com"
}
```

---

# 🔑 Autenticação

## Login

```http
POST /auth/login
```

Endpoint público.

### Requisição

```bash
curl -X POST http://localhost:8080/auth/login \
-H "Content-Type: application/json" \
-d '{
  "email": "joao@email.com",
  "senha": "123456"
}'
```

### Resposta

A API retorna o JWT:

```text
eyJhbGciOiJIUzM4NCJ9...
```

O token deve ser enviado nas requisições protegidas utilizando:

```text
Authorization: Bearer SEU_TOKEN
```

---

# 🏦 Conta bancária

Todos os endpoints desta seção exigem autenticação.

## Consultar minha conta

```http
GET /accounts/me
```

A conta é identificada através do usuário autenticado pelo JWT.

### Requisição

```bash
curl http://localhost:8080/accounts/me \
-H "Authorization: Bearer SEU_TOKEN"
```

### Resposta

```json
{
  "id": 1,
  "numero": "1234567890",
  "saldo": 100.00
}
```

---

## Realizar depósito

```http
POST /accounts/deposit
```

### Requisição

```bash
curl -X POST http://localhost:8080/accounts/deposit \
-H "Authorization: Bearer SEU_TOKEN" \
-H "Content-Type: application/json" \
-d '{
  "valor": 100.00
}'
```

### Regras

* O valor é obrigatório.
* O valor deve ser maior que zero.
* O depósito é registrado no histórico como `DEPOSITO`.

### Resposta

```json
{
  "id": 1,
  "numero": "1234567890",
  "saldo": 100.00
}
```

---

## Realizar saque

```http
POST /accounts/withdraw
```

### Requisição

```bash
curl -X POST http://localhost:8080/accounts/withdraw \
-H "Authorization: Bearer SEU_TOKEN" \
-H "Content-Type: application/json" \
-d '{
  "valor": 50.00
}'
```

### Regras

* O valor é obrigatório.
* O valor deve ser maior que zero.
* O saldo deve ser suficiente.
* O saque é registrado no histórico como `SAQUE`.

### Resposta

```json
{
  "id": 1,
  "numero": "1234567890",
  "saldo": 50.00
}
```

---

## Realizar transferência

```http
POST /accounts/transfer
```

### Requisição

```bash
curl -X POST http://localhost:8080/accounts/transfer \
-H "Authorization: Bearer SEU_TOKEN" \
-H "Content-Type: application/json" \
-d '{
  "contaDestino": 2,
  "valor": 25.00
}'
```

### Regras

* A conta de destino é obrigatória.
* O valor é obrigatório.
* O valor deve ser maior que zero.
* A conta de destino deve existir.
* Não é possível transferir para a própria conta.
* A conta de origem deve possuir saldo suficiente.

A operação é executada dentro de uma transação utilizando `@Transactional`.

A transferência gera duas movimentações:

```text
Conta de origem
    |
    +-- TRANSFERENCIA_ENVIADA

Conta de destino
    |
    +-- TRANSFERENCIA_RECEBIDA
```

### Resposta

A resposta representa a conta de origem após a transferência:

```json
{
  "id": 1,
  "numero": "1234567890",
  "saldo": 75.00
}
```

---

# 📜 Histórico de transações

## Consultar histórico

```http
GET /transactions/history
```

Endpoint protegido.

O histórico é obtido com base no usuário autenticado.

### Requisição

```bash
curl http://localhost:8080/transactions/history \
-H "Authorization: Bearer SEU_TOKEN"
```

### Resposta

```json
[
  {
    "id": 2,
    "tipo": "TRANSFERENCIA_ENVIADA",
    "valor": 20.00,
    "data": "2026-09-26T08:40:19.818743"
  },
  {
    "id": 1,
    "tipo": "DEPOSITO",
    "valor": 10.00,
    "data": "2026-09-25T21:24:34.524744"
  }
]
```

As transações são retornadas da mais recente para a mais antiga.

# 💳 Tipos de transação

A API utiliza os seguintes tipos de movimentação:

```text
DEPOSITO
SAQUE
TRANSFERENCIA_ENVIADA
TRANSFERENCIA_RECEBIDA
```

---

# ⚠️ Validação e tratamento de erros

A aplicação utiliza **Jakarta Validation** para validar os dados recebidos pela API.

### Senha inválida

```json
{
  "senha": "A senha deve conter no minimo 6 caracteres"
}
```

### Valor inválido

```json
{
  "valor": "O valor deve ser maior que zero"
}
```

### Saldo insuficiente

```json
{
  "erro": "Saldo insuficiente"
}
```

### Conta inexistente

```json
{
  "erro": "Conta de destino não encontrada"
}
```

### Transferência para a própria conta

```json
{
  "erro": "Não é possível transferir para a própria conta"
}
```

O tratamento dessas exceções é centralizado no `GlobalExceptionHandler`.

---

# 🗃️ Modelo de dados

O projeto possui três entidades principais relacionadas da seguinte forma:

```text
User
  |
  | 1:1
  v
Account
  |
  | 1:N
  v
Transaction
```

## User

Representa o usuário da aplicação.

```text
id
nome
email
senha
```

## Account

Representa a conta bancária associada ao usuário.

```text
id
numero
saldo
user
```

## Transaction

Representa uma movimentação financeira realizada na conta.

```text
id
tipo
valor
data
account
```

### Relacionamentos

* **User 1:1 Account** — cada usuário possui uma conta bancária.
* **Account 1:N Transaction** — uma conta pode possuir diversas transações.

---

# 📋 Regras de negócio

As principais regras implementadas na aplicação são:

* Um e-mail não pode ser cadastrado mais de uma vez.
* Todo usuário cadastrado recebe uma conta bancária.
* O número da conta é gerado automaticamente.
* O saldo inicial da conta é zero.
* Depósitos devem possuir valor maior que zero.
* Saques devem possuir valor maior que zero.
* Não é possível realizar saque sem saldo suficiente.
* Transferências devem possuir valor maior que zero.
* Não é possível transferir para a própria conta.
* A conta de destino precisa existir.
* O usuário autenticado opera sobre sua própria conta.
* As operações financeiras são executadas dentro de transações.
* Operações financeiras geram registros no histórico.

---

# 🧪 Testes manuais

Os principais fluxos da API foram verificados manualmente utilizando `curl`:

* Cadastro de usuário;
* Criação automática da conta;
* Login;
* Geração do JWT;
* Acesso a endpoint sem autenticação;
* Consulta da conta;
* Depósito;
* Saque;
* Transferência;
* Validação de valores;
* Saldo insuficiente;
* Transferência para a própria conta;
* Conta de destino inexistente;
* Histórico de transações;
* Registro de transferência enviada;
* Registro de transferência recebida.

> Os testes descritos nesta seção são **verificações manuais realizadas com `curl`**. Não são declarados testes automatizados com JUnit, Mockito ou testes de integração.

---

# 🎯 Objetivos e aprendizados

O projeto foi desenvolvido como um estudo prático de **desenvolvimento backend com Java e Spring Boot**, aplicando conceitos utilizados na construção de APIs REST.

Durante o desenvolvimento, foram praticados:

* **Java**
* **Spring Boot**
* **Spring Security**
* **JWT**
* **BCrypt**
* **Spring Data JPA**
* **Hibernate**
* **PostgreSQL**
* **DTOs**
* **Validação de dados**
* **Tratamento de exceções**
* **Transações**
* **Arquitetura em camadas**
* **APIs REST**

O projeto permitiu trabalhar com diferentes etapas do desenvolvimento de uma aplicação backend, desde o recebimento e validação das requisições HTTP até a aplicação das regras de negócio e persistência dos dados.

---

# 👨‍💻 Autor

**André Luiz**

Projeto desenvolvido para fins de estudo e portfólio em desenvolvimento backend.

---

# 📄 Licença

Este projeto está disponível para fins **educacionais e de portfólio**.
