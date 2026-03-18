# 📱 Projeto SmartWatch

## Descrição

Este projeto representa um **SmartWatch** (relógio inteligente) utilizando Programação Orientada a Objetos em Java.

A classe `SmartWatch` simula um relógio inteligente que pode:

- Armazenar a cor do relógio
- Armazenar a marca
- Controlar o total de passos do usuário
- Adicionar passos ao total
- Zerar os passos

O objetivo é aplicar conceitos básicos de orientação a objetos, como criação de classe, atributos, métodos e instâncias.

---

## O que o objeto representa no mundo real?

O objeto `SmartWatch` representa um relógio inteligente real, como:

- Apple Watch  
- Samsung Galaxy Watch

## Estrutura da Classe

A classe possui os seguintes atributos:

public String cor;

public String marca;

public int totalPassos;

## Métodos
1. adicionarPassos(int passos)

Adiciona passos ao total atual.

Só permite valores positivos.

Se for zero ou negativo, exibe mensagem de erro.

Exemplo:

meuSmartWatch.adicionarPassos(1000);

2. zerarPassos()

Zera completamente o total de passos.

Exemplo:

meuSmartWatch.zerarPassos();
