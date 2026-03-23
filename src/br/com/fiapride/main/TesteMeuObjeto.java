package br.com.fiapride.main;

import br.com.fiapride.model.SmartWatch;

public class TesteMeuObjeto {
    public static void main(String[] args) {

        // Instância 1 (agora usando construtor)
        SmartWatch meuSmartWatch = new SmartWatch("Preto", "Apple");
        meuSmartWatch.adicionarPassos(10000);

        // Instância 2
        SmartWatch smartWatchDoProfessor = new SmartWatch("Branco", "Samsung");
        smartWatchDoProfessor.adicionarPassos(25000);

        // Alterando o estado
        meuSmartWatch.adicionarPassos(500);
        smartWatchDoProfessor.zerarPassos();

        // Exibindo resultados
        System.out.println("Meu SmartWatch é: " + meuSmartWatch.getCor());
        System.out.println("Marca: " + meuSmartWatch.getMarca());
        System.out.println("Total de passos: " + meuSmartWatch.getTotalPassos());

        System.out.println("----------------------");

        System.out.println("SmartWatch do professor é: " + smartWatchDoProfessor.getCor());
        System.out.println("Marca: " + smartWatchDoProfessor.getMarca());
        System.out.println("Total de passos: " + smartWatchDoProfessor.getTotalPassos());

        // Teste de validação
        meuSmartWatch.adicionarPassos(-100);

        // Tentativa de burlar (não compila)
        // meuSmartWatch.totalPassos = -5000;
        // meuSmartWatch.setTotalPassos(-5000);

        System.out.println("Total de passos após tentativa de burlar: " + meuSmartWatch.getTotalPassos());
    }
}