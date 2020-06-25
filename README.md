# Cadastros de Empresa

![Language Badge](https://img.shields.io/badge/Language-Kotlin-orange)

> Api de CRUD para testes

Esta API tem como objetivo auxiliar no consumo de testes de front end e de consumo de API.

---

### Como Utilizar?

Existem as seguintes opções para utilização dessa aplicação

**Ambiente de Testes**

Clone o repositório.

Altere o arquivo **application.properties** com a linha de código 

> spring.profiles.active=test

Execute o seguinte comando na pasta do projeto

> gradle bootrun

**Ambiente de Desenvolvimento**

Execute os passos de Ambiente de Testes trocando somente a seguinte linha de código no arquivo application.properties

> spring.profiles.active=dev

---

### Entidade Funcionário

A entidade Funcionário está definida da seguinte forma

>ID (UUID)
>
>Nome (String)
>
>Idade (Int)
>
>Email (String)
>
>Cargo (String)


**Estrutura do Objeto Json**
```
{
    "nome": "xxxxxx",
    "idade": 0,
    "email": "xxxxx@empresa.com.br",
    "cargo": "xxxxxx"
}
```

---

### Lista de Endpoints

#### Endpoint de Funcionários

**/funcionarios** (GET) - Busca todos os funcionários
**/funcionarios/{id}** (GET) - Busca o funcionário por ID
**/funcionarios/{id}** (PUT) - Faz o upload do funcionário por ID
**/funcionarios/{id}** (DELETE) - Deleta o funcionário por ID

#### Endpoint de Database

**/refresh** (GET) - Executa um "reset" na base de dados, deixando 4 registros iniciais
