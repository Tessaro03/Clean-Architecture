# API de Cadastro de Usuários e Endereços

Este projeto é uma API desenvolvida em Java utilizando a **Clean Architecture** para o cadastro de usuários e endereços. A aplicação conta com um CRUD completo para ambos, com separação clara de responsabilidades, isolamento do domínio, e princípios sólidos de arquitetura.

## Tecnologias Utilizadas

- **Java** 
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL** 
- **Arquitetura Limpa**
- **JUnit**
  
## Funcionalidades

- **Cadastro de Usuário**: Adicionar, editar, visualizar e remover usuários.
- **Cadastro de Endereço**: Adicionar, editar, visualizar e remover endereços de usuários.
- **Relacionamento entre Usuário e Endereço**: Cada usuário pode ter um ou mais endereços associados.

## Arquitetura

Este projeto foi desenvolvido com base nos princípios de **Clean Architecture**, garantindo uma separação clara entre as camadas de domínio, aplicação, infraestrutura e interface.

### Camadas do Projeto

1. **Domínio**: Contém as entidades e objetos de valor que representam o núcleo do negócio.
2. **Aplicação**: Contém os casos de uso (lógica de aplicação) que orquestram as regras de negócio.
3. **Infraestrutura**: Implementações concretas de repositórios e acesso a dados.
4. **Interface**: Controladores responsáveis por receber as requisições HTTP e retornar as respostas.

### Padrões de Projeto Utilizados

- **Entidades**: Representam os objetos do domínio (Usuário, Endereço).
- **Casos de Uso**: Contêm a lógica específica para manipulação de usuários e endereços.
- **Repositórios**: Interfaces para abstração de persistência, com implementações específicas na camada de infraestrutura.
  
## Melhorias Implementadas

A partir do conteúdo aprendido no curso da Alura de **Clean Architecture**, o projeto foi aprimorado com as seguintes melhorias:

- Adição do **CRUD completo** para a entidade **Endereço**.
- Separação do cadastro de usuário e endereço, permitindo que o endereço seja gerenciado de forma independente.

