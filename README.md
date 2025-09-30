# Sistema de Pagamento de Funcionários em Java

Este projeto é um sistema desenvolvido em Java para gerenciamento de **pagamentos de funcionários**, incluindo funcionários terceirizados, utilizando **Programação Orientada a Objetos (POO)**. 
Ele permite cadastrar funcionários, calcular pagamentos com base nas horas trabalhadas e despesas adicionais e exibir os resultados no terminal.

---

## 📋 Funcionalidades

- Cadastro de funcionários internos e terceirizados.
- Registro de horas trabalhadas e valor por hora.
- Inclusão de despesas adicionais para funcionários terceirizados.
- Cálculo automático do pagamento total de cada funcionário.
- Exibição formatada dos pagamentos no terminal.

---

## 🔹 Classes Principais

| Classe / Pacote | Descrição |
|-----------------|-----------|
| `Funcionario` | Representa um funcionário comum com atributos `nome`, `horasTrabalhadas` e `valorPorHora`. Contém o método `pagamento()` que calcula o total a receber. |
| `FuncionarioTerceirizado` | Subclasse de `Funcionario` que adiciona o atributo `despesaAdicional`. O método `pagamento()` é sobrescrito para incluir 110% da despesa adicional no cálculo. |
| `ProgramaPrincipal` | Classe principal que realiza o cadastro dos funcionários, coleta dados do usuário e exibe o pagamento de cada funcionário. |

---

## ⚙️ Tecnologias e Conceitos Aplicados

- Java SE 24+
- Programação Orientada a Objetos (POO)
- Herança e polimorfismo
- Sobrescrita de métodos (`override`)
- Listas (`ArrayList`)
- Manipulação de entradas pelo terminal (`Scanner`)
- Cálculo e exibição de valores formatados

---

## 💡 Exemplo de Execução

**Entrada:**

Insira o número de funcionários: 3

Dados do #1 funcionário:

Funcionário é terceirizado (S/N)? N

Nome: João

Horas Trabalhadas: 40

Valor por hora: 25

---

Dados do #2 funcionário:

Funcionário é terceirizado (S/N)? S

Nome: Maria

Horas Trabalhadas: 35

Valor por hora: 30

Despesa adicional: 200

---

Dados do #3 funcionário:

Funcionário é terceirizado (S/N)? N

Nome: Pedro

Horas Trabalhadas: 45

Valor por hora: 20


**Saída no Terminal:**

PAGAMENTOS:

João - $ 1000.00

Maria - $ 1330.00

Pedro - $ 900.00


---

## 👨‍💻 Autor

João Neto  

neto31510@gmail.com  

(34) 99683-2626  

[LinkedIn](https://www.linkedin.com/in/joao-rodrigues-neto-855757293)


