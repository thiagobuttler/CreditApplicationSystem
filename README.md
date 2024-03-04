# **request-credit-system**
API Rest para um Sistema de Analise de Solicitação de Crédito

### **Tecnologias Utilizadas** 
![Kotlin](https://img.shields.io/badge/Kotlin-0095D5?&style=for-the-badge&logo=kotlin&logoColor=white) 
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) 
![Spring Boot](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white)
![H2](https://img.shields.io/badge/h2-%23316192.svg?style=for-the-badge&logo=h2&logoColor=white)
![Flyway](https://img.shields.io/badge/Flyway-F37440?style=for-the-badge&logo=Flyway&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)

### **Descrição do projeto** 📝
O objetivo desta API é proporcionar ***operações CRUD*** para persistência de dados em um sistema de análise de solicitação de crédito. A arquitetura da API segue o modelo ***REST*** e foi desenvolvida utilizando ***Spring Boot e Kotlin***.

### **Funcionalidades** ⚙️

- **Cliente (Customer):**
  - Cadastrar:
      1. Request: firstName, lastName, cpf, income, email, password, zipCode e street
      2. Response: String
  - Editar cadastro:
    1. Request: id, firstName, lastName, income, zipCode, street
    2. Response: firstName, lastName, income, cpf, email, income, zipCode, street
  - Visualizar perfil:
    1. Request: id
    2. Response: firstName, lastName, income, cpf, email, income, zipCode, street
  - Deletar cadastro:
    1. Request: id
    2. Response: sem retorno

- **Solicitação de Empréstimo (Credit):**
  - Cadastrar:
    1. Request: creditValue, dayFirstOfInstallment, numberOfInstallments e customerId
    2. Response: String
  - Listar todas as solicitações de emprestimo de um cliente:
    1. Request: customerId
    2. Response: creditCode, creditValue, numberOfInstallment
  - Visualizar um emprestimo:
    1. Request: customerId e creditCode
    2. Response: creditCode, creditValue, numberOfInstallment, status, emailCustomer e incomeCustomer

![diagramaUML](https://camo.githubusercontent.com/33acbb87760a5320ad4ad00fa6a49db79fc8c9142114d93c147e270b23236d48/68747470733a2f2f692e696d6775722e636f6d2f377068796131362e706e67)

### **Referências** 📖
Projeto desenvolvido durante o bootcamp "Desenvolvimento Backend com Kotlin" da plataforma DIO.
https://web.dio.me/track/desenvolvimento-backend-com-kotlin

