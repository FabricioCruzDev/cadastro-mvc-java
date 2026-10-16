# Cadastro MVC Java

Projeto pessoal de treino desenvolvido com o objetivo de praticar a estruturação arquitetural **MVC (Model-View-Controller)** e o desenvolvimento de aplicações web robustas em Java.

## 🛠️ Tecnologias e Ferramentas

* **Linguagem:** Java 21 (JDK 21)
* **Gerenciador de Dependências:** Maven
* **Banco de Dados:** PostgreSQL
* **Persistência & Conexão:** JDBC (Drivers configurados via `pom.xml`)
* **Design Pattern:** Factory Method (para o gerenciamento de conexões com o banco)
* **Servidor Web:** Apache Tomcat 11

---

## 📂 Estrutura Atual do Projeto

```text
.
├── pom.xml
├── README.md
├── src
│   ├── main
│   │   ├── java
│   │   └── webapp
│   └── test
│       └── java
└── target
    ├── cadastro
    │   ├── index.html
    │   ├── META-INF
    │   └── WEB-INF
    ├── cadastro.war
    ├── classes
    │   ├── controller
    │   └── jdbc
    └── ...
```

---

## 🚀 Próximos Passos

- [ ] Implementação das classes da camada **Model**.
- [ ] Criação do padrão **DAO (Data Access Object)** para persistência e manipulação dos dados no banco.
