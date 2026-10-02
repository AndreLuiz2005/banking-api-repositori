Quero que você transforme o README abaixo em um README.md profissional, moderno e adequado para um projeto de portfólio de desenvolvedor Backend Java.

IMPORTANTE:
- Gere SOMENTE o README final em Markdown.
- Não explique o que você alterou.
- Não coloque o README dentro de outro bloco de código.
- Preserve todas as informações técnicas verdadeiras presentes no README original.
- Não invente funcionalidades, tecnologias, endpoints, testes, métricas, links, badges ou informações que não estejam no conteúdo fornecido.
- Pode reorganizar, melhorar a escrita e profissionalizar a apresentação.
- Corrija erros de português, gramática, capitalização e formatação.
- Use uma linguagem profissional, clara e objetiva, mas sem parecer artificial ou exageradamente corporativa.
- O README deve parecer feito por um desenvolvedor que está construindo seu portfólio profissional.
- Mantenha os exemplos de requisições e respostas da API.
- Mantenha os nomes reais das classes, entidades, endpoints e tecnologias.
- Não altere os nomes dos endpoints.
- Não altere os nomes das classes.
- Não altere os exemplos técnicos de forma que possam deixar de representar o projeto.
- Se alguma informação estiver incompleta, mantenha-a como está ou apresente de forma neutra. Não invente dados.

ESTRUTURA DESEJADA:

1. Título do projeto
   - Use um título profissional.
   - Inclua uma descrição curta logo abaixo.

2. Badges
   - Crie badges SOMENTE para tecnologias claramente confirmadas no README, como Java, Spring Boot, PostgreSQL, Maven e Git.
   - Não invente versão de ferramentas que não estejam informadas.
   - Os badges podem usar shields.io.

3. Sobre o projeto
   - Explique resumidamente o que é a Banking API.
   - Destaque que é uma API REST desenvolvida com Java e Spring Boot.
   - Cite autenticação JWT, PostgreSQL e operações bancárias.
   - Apresente o projeto como estudo prático/portfólio de desenvolvimento backend.

4. Funcionalidades
   - Organize as funcionalidades em uma lista visualmente agradável.
   - Separe, quando fizer sentido, autenticação, usuários, contas e operações financeiras.
   - Não adicione funcionalidades inexistentes.

5. Tecnologias utilizadas
   - Crie uma tabela organizada contendo tecnologia e finalidade.
   - Utilize as tecnologias presentes no README original:
     Java 21
     Spring Boot 4.1.0
     Spring Web
     Spring Data JPA
     Hibernate
     Spring Security
     JJWT
     BCrypt
     PostgreSQL
     Maven
     Git

6. Arquitetura
   - Explique a arquitetura em camadas.
   - Apresente visualmente:
     Controller → Service → Repository → PostgreSQL
   - Explique também Entity, DTO, Exception e Config.
   - Mantenha a explicação objetiva.

7. Estrutura do projeto
   - Preserve a árvore real de diretórios e arquivos apresentada no README original.
   - Formate a árvore de maneira profissional.
   - Não crie arquivos que não existem na estrutura fornecida.

8. Pré-requisitos
   - Java 21
   - PostgreSQL
   - Git
   - Maven Wrapper

9. Configuração do banco de dados
   - Mantenha o comando CREATE DATABASE banking_api.
   - Mantenha o exemplo de application.properties.
   - Destaque corretamente que senha e chave JWT reais não devem ser publicadas no repositório.
   - Não substitua o exemplo por credenciais reais.

10. Como executar o projeto
   - Clone
   - Entre na pasta
   - Dê permissão ao Maven Wrapper quando necessário
   - Execute com ./mvnw spring-boot:run
   - Informe localhost:8080
   - Organize isso como um passo a passo simples.

11. Autenticação e segurança
   - Explique o fluxo JWT:
     Login → AuthService → BCrypt → JwtService → JWT → Authorization Bearer → JwtAuthenticationFilter → Endpoint protegido
   - Explique quais endpoints são públicos e quais são protegidos.
   - Explique que as senhas são armazenadas utilizando BCrypt.
   - Não diga que a aplicação possui OAuth, refresh token, roles ou permissões se isso não estiver no README.

12. Endpoints
   - Crie uma tabela geral com:
     Método
     Endpoint
     Autenticação
     Descrição
   - Depois detalhe os endpoints individualmente.

13. Usuários
   - POST /users
   - GET /users/{id}
   - Preserve os exemplos curl e JSON.

14. Autenticação
   - POST /auth/login
   - Preserve o exemplo de login.
   - Explique o retorno do JWT.
   - Mostre o uso do Authorization: Bearer SEU_TOKEN.

15. Conta bancária
   - GET /accounts/me
   - POST /accounts/deposit
   - POST /accounts/withdraw
   - POST /accounts/transfer
   - Preserve exemplos, regras de negócio e respostas.

16. Histórico de transações
   - GET /transactions/history
   - Preserve o exemplo de resposta.
   - Explique que as transações são retornadas da mais recente para a mais antiga.

17. Tipos de transação
   - DEPOSITO
   - SAQUE
   - TRANSFERENCIA_ENVIADA
   - TRANSFERENCIA_RECEBIDA

18. Validação e tratamento de erros
   - Explique o uso de Jakarta Validation.
   - Preserve os exemplos de erros.
   - Explique o papel do GlobalExceptionHandler.

19. Modelo de dados
   - Apresente:
     User 1:1 Account
     Account 1:N Transaction
   - Explique brevemente cada entidade e seus campos.

20. Regras de negócio
   - Preserve todas as regras existentes.
   - Organize de forma clara.

21. Testes manuais
   - Explique que os principais fluxos foram verificados manualmente utilizando curl.
   - Preserve os fluxos listados.
   - Não diga que existem testes automatizados, JUnit, Mockito ou integração caso isso não esteja informado.

22. Objetivos e aprendizados
   - Transforme a seção atual em uma seção mais profissional.
   - Destaque os conhecimentos praticados:
     Java
     Spring Boot
     Spring Security
     JWT
     BCrypt
     Spring Data JPA
     Hibernate
     PostgreSQL
     DTOs
     Validação
     Tratamento de exceções
     Transações
     Arquitetura em camadas
     APIs REST

23. Autor
   - André Luiz
   - Projeto desenvolvido para fins de estudo e portfólio em desenvolvimento backend.

24. Licença
   - Preserve a informação atual sobre uso educacional e portfólio.
   - Não invente uma licença MIT ou outra licença formal caso ela não esteja declarada.

ESTILO VISUAL:

- Use emojis com moderação apenas onde ajudarem na navegação.
- Use títulos hierárquicos consistentes.
- Utilize tabelas quando melhorarem a visualização.
- Utilize blocos de código para comandos, JSON, HTTP, Java e propriedades.
- Use `<details>` apenas quando realmente ajudar a reduzir a quantidade de conteúdo visual.
- Use links internos quando fizer sentido, por exemplo um pequeno índice no início.
- Evite excesso de emojis.
- Evite frases genéricas como "este projeto revolucionário".
- Evite marketing exagerado.
- O resultado deve transmitir organização, conhecimento técnico e profissionalismo.
- Priorize legibilidade para recrutadores e desenvolvedores que visitarem o GitHub.

IMPORTANTE SOBRE O CONTEÚDO:

O README original contém 802 linhas. Não simplesmente resuma o conteúdo. Reestruture e profissionalize o documento mantendo as informações técnicas relevantes, especialmente:
- funcionalidades;
- tecnologias;
- arquitetura;
- estrutura de pastas;
- configuração;
- execução;
- autenticação JWT;
- endpoints;
- exemplos curl;
- exemplos JSON;
- regras de negócio;
- modelo de dados;
- validações;
- tratamento de exceções;
- testes manuais;
- objetivo do projeto.

README ORIGINAL:

# Banking API

API REST de um sistema bancário desenvolvida com Java e Spring Boot, com autenticação baseada em JWT, persistência de dados em PostgreSQL e operações bancárias como depósito, saque e transferência.

O projeto foi desenvolvido com foco em práticas de desenvolvimento backend, organização em camadas, autenticação, validação de dados, tratamento de exceções e implementação de regras de negócio.

---

## Funcionalidades

- Cadastro de usuários
- Criação automática de conta bancária após o cadastro
- Autenticação utilizando JWT
- Senhas armazenadas utilizando BCrypt
- Consulta de usuário
- Consulta da própria conta bancária
- Depósito
- Saque
- Transferência entre contas
- Histórico de transações
- Validação de dados
- Tratamento global de exceções
- Proteção dos endpoints com Spring Security
- Controle transacional das operações financeiras

---

## Tecnologias

| Tecnologia        | Utilização                       |
| ----------------- | -------------------------------- |
| Java 21           | Linguagem principal              |
| Spring Boot 4.1.0 | Framework da aplicação           |
| Spring Web        | Desenvolvimento da API REST      |
| Spring Data JPA   | Persistência de dados            |
| Hibernate         | ORM                              |
| Spring Security   | Autenticação e autorização       |
| JJWT              | Geração e validação de JWT       |
| BCrypt            | Criptografia das senhas          |
| PostgreSQL        | Banco de dados                   |
| Maven             | Gerenciamento do projeto e build |
| Git               | Controle de versão               |

---

## Arquitetura

O projeto utiliza uma arquitetura em camadas:

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

Responsável pelas regras de negócio da aplicação.

### Repository

Responsável pelo acesso ao banco de dados utilizando Spring Data JPA.

### Entity

Representa as entidades persistidas no banco de dados.

### DTO

Responsável pelos dados de entrada e saída da API.

### Exception

Centraliza o tratamento das exceções da aplicação.

### Config

Contém as configurações relacionadas à segurança e ao filtro de autenticação JWT.

---

## Estrutura do projeto

```text
src/
└── main/
    └── java/
        └── com/example/bankingapi/
            ├── config/
            │   ├── JwtAuthenticationFilter.java
            │   └── SecurityConfig.java
            │
            ├── controller/
            │   ├── AccountController.java
            │   ├── AuthController.java
            │   ├── TransactionController.java
            │   └── UserController.java
            │
            ├── dto/
            │   ├── AccountResponse.java
            │   ├── DepositRequest.java
            │   ├── LoginRequest.java
            │   ├── TransactionResponse.java
            │   ├── TransferRequest.java
            │   ├── UserRequest.java
            │   └── UserResponse.java
            │
            ├── entity/
            │   ├── Account.java
            │   ├── Transaction.java
            │   ├── TransactionType.java
            │   └── User.java
            │
            ├── exception/
            │   ├── AccountNotFoundException.java
            │   ├── EmailAlreadyExistsException.java
            │   ├── GlobalExceptionHandler.java
            │   ├── InsufficientBalanceException.java
            │   ├── InvalidCredentialsException.java
            │   └── UserNotFoundException.java
            │
            ├── repository/
            │   ├── AccountRepository.java
            │   ├── TransactionRepository.java
            │   └── UserRepository.java
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

# Configuração

## Pré-requisitos

- Java 21
- PostgreSQL
- Git
- Maven Wrapper incluído no projeto

---

## Banco de dados

Crie o banco PostgreSQL:

```sql
CREATE DATABASE banking_api;
```

Configure as credenciais no arquivo:

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

Não publique senhas ou chaves JWT reais no repositório.

---

# Executando o projeto

Clone o repositório:

```bash
git clone https://github.com/SEU_USUARIO/banking-api.git
```

Entre no projeto:

```bash
cd banking-api
```

Execute:

```bash
./mvnw spring-boot:run
```

Caso seja necessário:

```bash
chmod +x mvnw
```

A aplicação será executada em:

```text
http://localhost:8080
```

---

# Autenticação

A API utiliza JWT para autenticar os usuários.

O fluxo é:

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

O JWT possui tempo de expiração e sua assinatura é validada antes de autenticar o usuário.

---

# Endpoints

## Resumo

| Método | Endpoint                | Autenticação |
| ------ | ----------------------- | ------------ |
| POST   | `/users`                | Não          |
| GET    | `/users/{id}`           | Sim          |
| POST   | `/auth/login`           | Não          |
| GET    | `/accounts/me`          | Sim          |
| POST   | `/accounts/deposit`     | Sim          |
| POST   | `/accounts/withdraw`    | Sim          |
| POST   | `/accounts/transfer`    | Sim          |
| GET    | `/transactions/history` | Sim          |

---

# Usuários

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

# Autenticação

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

# Conta bancária

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

- O valor é obrigatório.
- O valor deve ser maior que zero.
- O depósito é registrado no histórico como `DEPOSITO`.

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

- O valor é obrigatório.
- O valor deve ser maior que zero.
- O saldo deve ser suficiente.
- O saque é registrado no histórico como `SAQUE`.

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

- A conta de destino é obrigatória.
- O valor é obrigatório.
- O valor deve ser maior que zero.
- A conta de destino deve existir.
- Não é possível transferir para a própria conta.
- A conta de origem deve possuir saldo suficiente.

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

# Histórico de transações

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

---

# Tipos de transação

A API utiliza os seguintes tipos:

```text
DEPOSITO
SAQUE
TRANSFERENCIA_ENVIADA
TRANSFERENCIA_RECEBIDA
```

---

# Validação e tratamento de erros

A aplicação utiliza Jakarta Validation para validar os dados recebidos.

Exemplo de senha inválida:

```json
{
  "senha": "A senha deve conter no minimo 6 caracteres"
}
```

Valor inválido:

```json
{
  "valor": "O valor deve ser maior que zero"
}
```

Saldo insuficiente:

```json
{
  "erro": "Saldo insuficiente"
}
```

Conta inexistente:

```json
{
  "erro": "Conta de destino não encontrada"
}
```

Transferência para a própria conta:

```json
{
  "erro": "Não é possível transferir para a própria conta"
}
```

O tratamento dessas exceções é centralizado no `GlobalExceptionHandler`.

---

# Segurança

A API utiliza Spring Security para proteger os endpoints.

Endpoints públicos:

```text
POST /users
POST /auth/login
```

Endpoints protegidos:

```text
GET  /users/{id}

GET  /accounts/me
POST /accounts/deposit
POST /accounts/withdraw
POST /accounts/transfer

GET  /transactions/history
```

As senhas não são armazenadas em texto puro. O projeto utiliza BCrypt para armazená-las de forma segura.

A autenticação das requisições protegidas é realizada através do header:

```text
Authorization: Bearer SEU_TOKEN
```

---

# Modelo de dados

O projeto possui três entidades principais:

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

Representa a conta bancária.

```text
id
numero
saldo
user
```

## Transaction

Representa uma movimentação financeira.

```text
id
tipo
valor
data
account
```

---

# Regras de negócio

As principais regras implementadas são:

- Um e-mail não pode ser cadastrado mais de uma vez.
- Todo usuário cadastrado recebe uma conta bancária.
- O número da conta é gerado automaticamente.
- O saldo inicial da conta é zero.
- Depósitos devem possuir valor maior que zero.
- Saques devem possuir valor maior que zero.
- Não é possível realizar saque sem saldo suficiente.
- Transferências devem possuir valor maior que zero.
- Não é possível transferir para a própria conta.
- A conta de destino precisa existir.
- O usuário autenticado opera sobre sua própria conta.
- As operações financeiras são executadas dentro de transações.
- Operações financeiras geram registros no histórico.

---

# Testes manuais

Os principais fluxos da API foram verificados manualmente utilizando `curl`:

- Cadastro de usuário
- Criação automática da conta
- Login
- Geração do JWT
- Acesso a endpoint sem autenticação
- Consulta da conta
- Depósito
- Saque
- Transferência
- Validação de valores
- Saldo insuficiente
- Transferência para a própria conta
- Conta de destino inexistente
- Histórico de transações
- Registro de transferência enviada
- Registro de transferência recebida

---

# Objetivo do projeto

Este projeto foi desenvolvido como estudo prático de desenvolvimento backend utilizando Java e Spring Boot.

O objetivo principal foi aplicar conceitos de desenvolvimento de APIs REST e trabalhar com:

- Java
- Spring Boot
- Spring Security
- JWT
- BCrypt
- Spring Data JPA
- Hibernate
- PostgreSQL
- DTOs
- Validação de dados
- Tratamento de exceções
- Transações
- Arquitetura em camadas
- Desenvolvimento e consumo de APIs REST

---

# Autor

**André Luiz**

Projeto desenvolvido para fins de estudo e portfólio em desenvolvimento backend.

---

## Licença

Este projeto está disponível para fins educacionais e de portfólio.

Agora gere o README.md profissional seguindo exatamente essas orientações.
