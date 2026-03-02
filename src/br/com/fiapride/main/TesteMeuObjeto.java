package br.com.fiapride.main;

import br.com.fiapride.model.SmartWatch;

public class TesteMeuObjeto {
    public static void main(String[] args) {

        // Instância 1
        SmartWatch meuSmartWatch = new SmartWatch("Preto", "Apple"); // Usando o construtor
        meuSmartWatch.adicionarPassos(10000);  // usando método com validação

        // Instância 2
        SmartWatch smartWatchDoProfessor = new SmartWatch("Branco", "Samsung"); // Usando o construtor
        smartWatchDoProfessor.adicionarPassos(25000);  // usando método com validação

        // Alterando o estado usando métodos
        meuSmartWatch.adicionarPassos(500);          // agora totalPassos = 10500
        smartWatchDoProfessor.zerarPassos();        // zera os passos

        // Exibindo resultados usando getters
        System.out.println("Meu SmartWatch é: " + meuSmartWatch.getCor());
        System.out.println("Marca: " + meuSmartWatch.getMarca());
        System.out.println("Total de passos: " + meuSmartWatch.getTotalPassos());

        System.out.println("----------------------");

        System.out.println("SmartWatch do professor é: " + smartWatchDoProfessor.getCor());
        System.out.println("Marca: " + smartWatchDoProfessor.getMarca());
        System.out.println("Total de passos: " + smartWatchDoProfessor.getTotalPassos());

        // Teste de validação: tentar adicionar passos negativos (deve dar erro)
        meuSmartWatch.adicionarPassos(-100); // mensagem de erro

        // Tentativa de burlar a proteção (não compila porque atributo e setter são privados)
        // meuSmartWatch.totalPassos = -5000;  // ERRO: atributo privado
        // meuSmartWatch.setTotalPassos(-5000); // ERRO: método privado

        // Mostrar que o valor não mudou
        System.out.println("Total de passos após tentativa de burlar: " + meuSmartWatch.getTotalPassos());
    }
}