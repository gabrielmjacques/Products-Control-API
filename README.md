# Sistema de Controle de Produtos - API REST

Este é um projeto Java que utiliza Spring Boot, MySQL e Hibernate para criar uma API REST que permite o controle de produtos.

## Tecnologias Usadas

- [Java](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [MySQL](https://www.mysql.com/downloads/)
- [Hibernate](https://hibernate.org/)
- [Maven](https://maven.apache.org/)

## Configuração

1. Clone o repositório:
```git
git clone https://github.com/gabrielmjacques/Products-Control-API.git
```

2. Configure o banco de dados MySQL:

- Crie um banco de dados no MySQL para o projeto.
- Atualize as configurações do banco de dados no arquivo `application.properties` com as credenciais corretas.

3. Execute o aplicativo:

A API estará disponível em `http://localhost:8080`.

## Endpoints

A API oferece os seguintes endpoints:

- `GET    | /products       `: Obtém a lista de todos os produtos.
- `GET    | /products/{id}  `: Obtém os detalhes de um produto específico.
- `PUT    | /products/{id}  `: Atualiza os detalhes de um produto existente.
- `DELETE | /products/{id}  `: Exclui um produto.
- `POST   | /products       `: Cria um novo produto.

## Exemplo de Uso com Insomnia

[Insomnia](https://insomnia.rest/) é uma aplicação de ambiente de trabalho multiplataforma que ajuda você a testar APIs e compartilhar documentação.

1. Baixe e instale o Insomnia, caso ainda não o tenha feito.

2. Abra o Insomnia e siga as etapas a seguir:

    - Crie um novo ambiente (Workspace) ou use um existente.
    - Crie uma nova pasta (Folder) para organizar suas solicitações.
    - Crie uma nova solicitação (Request) para cada endpoint da API.

3. Aqui estão exemplos de solicitações para os principais endpoints:

### Criar um novo produto

Para criar um novo produto, use o método POST na URL `http://localhost:8080/products`. O corpo da solicitação deve ser um objeto JSON com os seguintes campos:

* `name`: Nome do produto
* `description`: Descrição do produto
* `value`: Valor do produto

Exemplo:

```json
{
  "name": "APhone S10",
  "description": "Celular incrível para fotografar, filmar e jogar!",
  "value": 2800
}
```

### Atualizar um produto existente

Para atualizar os detalhes de um produto existente, use o método PUT na URL `http://localhost:8080/products/{id}`, substituindo `{id}` pelo ID do produto. O corpo da solicitação deve ser um objeto JSON com os campos que deseja atualizar.

Exemplo:

```json
{
  "name": "Novo Nome",
  "description": "Nova Descrição",
  "value": 3000
}
```

**Observações:**

* Certifique-se de substituir `{id}` pelo ID real do produto que deseja atualizar.
* Certifique-se de que o servidor esteja em execução e a API seja acessível em `http://localhost:8080` para realizar essas solicitações.
