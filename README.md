# 📋 ToDo List - Gerenciador de Tarefas
### Um projeto simples de ToDo List desenvolvido com Java e Spring Boot para gerenciar tarefas diárias.
## 🚀 Tecnologias Utilizadas

* ### Java (versão recomendada: JDK 17 ou superior)

* ### Spring Boot (versão X.Y.Z - Substitua pela versão real)

* ### Spring Web: Para criar a API RESTful (ou controladores MVC).

* ### Spring Data JPA: Para a persistência de dados.

* ### Banco de Dados: (Ex: H2 Database - em memória, ou MySQL/PostgreSQL para produção)

* ### Maven (ou Gradle): Gerenciador de dependências.

## ✨ Funcionalidades
* ### O projeto permite que o usuário realize as seguintes operações básicas (CRUD) com as tarefas:

* ### Criar uma nova tarefa.

* ### Visualizar todas as tarefas.

* ### Atualizar o título, descrição ou status (Ex: Concluído/Pendente) de uma tarefa.

* ### Excluir uma tarefa.

## 🛠️ Pré-requisitos
* ### Para rodar o projeto localmente, você precisa ter instalado:

* ### Java Development Kit (JDK): Versão 17 ou superior.

* ### Maven (ou Gradle): Para construir o projeto.

* ### Um IDE (Integrated Development Environment) como IntelliJ IDEA, VS Code ou Eclipse.

* ### (Opcional, se usar um banco de dados externo) Uma instância do [Nome do Banco de Dados] rodando.

## ⚙️ Configuração

## 1. Clonar o Repositório

~~~ bash
git clone https://github.com/seu-usuario/seu-projeto-todolist.git
cd seu-projeto-todolist
~~~

## 2. Configuração do Banco de Dados
### Se estiver usando H2 (em memória): Nenhuma configuração adicional é necessária. O Spring Boot cuidará disso.

### Se estiver usando MySQL/PostgreSQL:

### Crie um banco de dados chamado todolist.

### Atualize o arquivo src/main/resources/application.properties (ou application.yml) com suas credenciais:

~~~ Properties
# Exemplo postgreSQL
spring.datasource.url=jdbc:postgresql://localhost:5432/todolist
spring.datasource.username=usermane
spring.datasource.password=password
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.hibernate.ddl-auto=update
~~~

## 3. Construção do Projeto
### Com o maven
~~~Bash
# Compila e empacota o projeto em um JAR
mvn clean install

# Roda a aplicação
java -jar target/seu-projeto-todolist-0.0.1-SNAPSHOT.jar 
# (Verifique o nome exato do JAR gerado)
~~~

### Com o gradle
~~~Bash
# Compila e empacota
./gradlew build

# Roda a aplicação
java -jar build/libs/seu-projeto-todolist-0.0.1-SNAPSHOT.jar 
~~~

### A aplicação estará acessível em http://localhost:8080 (a porta padrão do Spring Boot).

### 🌍 Endpoints da API 

| Método HTTP | Endpoint          | Descrição                   | Corpo da requisição                                               |
|-------------|-------------------|-----------------------------|-------------------------------------------------------------------|
| GET         | /api/tarefas      | Retorna todas as tarefas.   | N/A                                                               |
| GET         | /api/tarefas/{id} | Retorna uma tarefa pelo ID. | N/A                                                               |
| POST        | /api/tarefas      | Cria uma nova tarefa.       | { "titulo": "Comprar Leite", "descricao": "Ir ao supermercado." } |
| PUT         | /api/tarefas/{id} | Atualiza uma tarefa.        | { "titulo": "Comprar Leite (Urgente)", "concluido": false }       |
| DELETE      | /api/tarefas/{id} | Remove uma tarefa.          | N/A                                                               |

## 🤝 Contribuições
### Contribuições são bem-vindas! Se você tiver sugestões, melhorias ou encontrar algum bug, por favor:

### Faça um fork do projeto.

### Crie uma nova branch (git checkout -b feature/minha-feature).

### Faça suas alterações e commit-as (git commit -m 'feat: Adiciona nova feature X').

### Envie para o repositório (git push origin feature/minha-feature).

### Abra um Pull Request.
