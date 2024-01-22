# Padrão de Projeto Abstract Factory - Fabricação de Carros

## Visão Geral

Este projeto demonstra a implementação do padrão de projeto Abstract Factory em um sistema de fabricação de carros. O foco está em criar diferentes tipos de carros com base nas solicitações dos clientes e se o cliente possui um contrato corporativo.

## Padrão de Projeto Abstract Factory

O **Padrão de Projeto Abstract Factory** fornece uma interface para a criação de famílias de objetos relacionados ou dependentes sem especificar suas classes concretas. Ele pertence à categoria de padrões de projeto criacionais e tem como objetivo fornecer uma interface para a criação de instâncias de uma família de classes relacionadas ou dependentes, sem especificar suas classes concretas.

## Estrutura do Projeto

### Hierarquia de Carros

- **Carro**: A classe base que representa um carro genérico com atributos como potência, fonte de combustível e cor. Inclui métodos para iniciar o motor, limpar o carro, realizar uma verificação mecânica e abastecer o carro.

- **Audi, Tesla, Toyota, Volkswagen**: Classes concretas que representam modelos específicos de carros, estendendo a classe base Carro.

### Hierarquia de Fábricas

- **Fábrica**: Uma classe abstrata que define a interface para a criação de carros. Inclui um método `create` que orquestra a criação de um carro chamando `retrieveCar` e `prepareCar`.

- **CarFactory, CompanyCarFactory**: Classes de fábrica concretas que estendem a classe Fábrica. Elas implementam o método `retrieveCar` para criar modelos específicos de carros com base na solicitação do cliente.

### Classe Cliente

- **Cliente**: Representa um cliente com uma solicitação de grau e informações sobre se eles têm um contrato corporativo.

### Classe de Demonstração

- **Demo**: Contém o método `main`, simulando a solicitação de um carro por parte de um cliente. Utiliza o padrão Abstract Factory para criar um carro com base nas preferências do cliente.

## Como Executar

1. Clone o repositório.
2. Compile e execute a classe `Demo`.

```bash
javac edu/ebac/abstractfactory/Demo.java
java edu.ebac.abstractfactory.Demo
```

## Uso

1. Crie um objeto `Cliente` com uma solicitação de grau e informações sobre se eles têm um contrato corporativo.
2. Utilize o método `getCarFactory` para determinar a fábrica apropriada com base no status do contrato do cliente.
3. Chame o método `create` na fábrica selecionada para obter uma instância de carro.
4. Realize ações como iniciar o motor no carro criado.

