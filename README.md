# Primeiro Exercício - Interfaces - Aula 4

## Criar uma interface chamada Voador. Nessa interface, definir o método voar, com a seguinte assinatura:

public void voar()

Em seguida, criar as seguintes classes e fazer com que cada uma implement a interface Voador. Definir também o comportamento do método voar em cada caso:

1) Pato: o pato tem uma energia. Ele começa com 100 pontos de energia, e cada vez que voa, o pato perde 5 pontos de energia, seu metodo deve imprimir na tela “Estou voando como um pato”, caso ainda tenha energia suficiente e “Não tenho energia suficiente para voar” caso não tenha mais energia.

2) Avião: o avião tem horas de voo. Cada vez que o avião voa, soma 13h de
voo e imprime na tela “Estou voando como um avião, e
tenho x horas de voo”, onde em x deve ser exibido a
quantidade total de horas que esse avião já esteve em
voo.

3) Super-homem: o super-homem tem experiência. Cada vez que o
super-homem voa, a experiência dele aumenta 3 unidades, e imprime na tela “Estou voando como um campeão.”

Criar uma classe TorreDeControle contendo uma lista de voadores. Em seguida, criar dois métodos na classe TorreDeControle:

● public void voemTodos(). Esse método será encarregado de percorrer a lista de voadores e fazer com que eles voem.
Além disso, a sua classe deve ter um array de Voador,
chamado voadores, que deve ser recebido no construtor.
Criar na classe Main:

● um pato
● um avião
● o super-homem
● uma torre de controle

- Adicionar o pato, o avião e o super-homem à torre de controle.
- Pedir para a torre de controle fazer todos os voadores voarem. Observar o comportamento.
- Chame algumas vezes e observe o resultado.

# Segundo Exercício - Banco Santander - Aula 3

## O Banco Santander solicita a modelagem de um novo sistema. Esse sistema será usado para registrar as contas e os clientes do banco.

Clientes: os clientes serão identificados por um número de cliente, um sobrenome, um número de RG e um CPF.

Contas: as contas do banco permitem fazer depósitos, sacar dinheiro e consultar o saldo. Cada conta está associada a um cliente.

## Extensão:

Conta poupança: além do saldo, as contas poupança têm uma taxa de juros.

Neste tipo de conta, é possível realizar três operações:

1) Depositar dinheiro: o cliente pode depositar a quantia de dinheiro que quiser.

2) Sacar dinheiro: o cliente pode sacar dinheiro desde que não supere seu saldo.

3) Recolher juros: o cliente pode recolher os juros mensais aplicados pela sua conta poupança.

Conta corrente: além do saldo, as contas correntes têm um limite autorizado de cheque especial. Neste tipo de conta, é possível realizar três operações:

1) Depositar dinheiro: o cliente pode depositar a quantia de dinheiro que quiser.

2) Depositar cheques: o cliente pode depositar cheques. Um cheque tem um valor, um banco emissor e uma data de pagamento.

3) Sacar dinheiro: o cliente pode sacar dinheiro e, caso não tenha saldo suficiente, usar seu cheque especial.

Implemente as classes e aplique os conceitos de Herança, Classe Abstrata e Orientação a Objetos em Java para a resolução do sistema.