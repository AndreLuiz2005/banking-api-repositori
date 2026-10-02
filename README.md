# 🏦 Banking API

API REST de um sistema bancário desenvolvida com **Java 21 e Spring Boot**, utilizando **PostgreSQL**, **Spring Security** e autenticação baseada em **JWT**.

O projeto simula operações bancárias como **depósito, saque e transferência**, aplicando conceitos de desenvolvimento backend, arquitetura em camadas, validação de dados, tratamento de exceções e regras de negócio.

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1.0-6DB33F?style=for-the-badge&logo=springboot)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-16-336791?style=for-the-badge&logo=postgresql)
![Spring Security](https://img.shields.io/badge/Spring%20Security-6DB33F?style=for-the-badge&logo=springsecurity)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git)

---

## 📌 Sobre o projeto

O Banking API foi desenvolvido como um projeto prático para consolidar conhecimentos em desenvolvimento backend com Java e Spring Boot.

A aplicação possui autenticação de usuários, gerenciamento de contas bancárias e operações financeiras, utilizando PostgreSQL para persistência dos dados e JWT para autenticação das requisições protegidas.

---

## 🚀 Funcionalidades

- 👤 Cadastro de usuários
- 🏦 Criação automática de conta bancária após o cadastro
- 🔐 Autenticação utilizando JWT
- 🔒 Senhas armazenadas utilizando BCrypt
- 🔎 Consulta de usuário
- 💰 Consulta da própria conta bancária
- 💵 Depósito
- 💸 Saque
- 🔄 Transferência entre contas
- 📋 Histórico de transações
- ✅ Validação de dados
- ⚠️ Tratamento global de exceções
- 🛡️ Proteção dos endpoints com Spring Security
- 🔄 Controle transacional das operações financeiras

---

## 🛠️ Tecnologias

| Tecnologia | Utilização |
|---|---|
| **Java 21** | Linguagem principal |
| **Spring Boot 4.1.0** | Framework da aplicação |
| **Spring Web** | Desenvolvimento da API REST |
| **Spring Data JPA** | Persistência de dados |
| **Hibernate** | ORM |
| **Spring Security** | Autenticação e autorização |
| **JJWT** | Geração e validação de JWT |
| **BCrypt** | Hash das senhas |
| **PostgreSQL** | Banco de dados |
| **Maven** | Gerenciamento do projeto e build |
| **Git** | Controle de versão |

---

## 🏗️ Arquitetura

O projeto utiliza uma arquitetura organizada em camadas:

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
