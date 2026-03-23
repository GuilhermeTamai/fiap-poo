package br.com.fiapride.main;

import br.com.fiapride.model.SmartWatch;

public class TesteMeuObjeto {
    public static void main(String[] args) {

        // Instância 1 (sem construtor, usando setters)
        SmartWatch meuSmartWatch = new SmartWatch();
        meuSmartWatch.setCor("Preto");
        meuSmartWatch.setMarca("Apple");
        meuSmartWatch.adicionarPassos(10000);

        // Instância 2
        SmartWatch smartWatchDoProfessor = new SmartWatch();
        smartWatchDoProfessor.setCor("Branco");
        smartWatchDoProfessor.setMarca("Samsung");
        smartWatchDoProfessor.adicionarPassos(25000);

        // Alterando o estado usando métodos
        meuSmartWatch.adicionarPassos(500);
        smartWatchDoProfessor.zerarPassos();

        // Exibindo resultados usando getters
        System.out.println("Meu SmartWatch é: " + meuSmartWatch.getCor());
        System.out.println("Marca: " + meuSmartWatch.getMarca());
        System.out.println("Total de passos: " + meuSmartWatch.getTotalPassos());

        System.out.println("----------------------");

        System.out.println("SmartWatch do professor é: " + smartWatchDoProfessor.getCor());
        System.out.println("Marca: " + smartWatchDoProfessor.getMarca());
        System.out.println("Total de passos: " + smartWatchDoProfessor.getTotalPassos());

        // Teste de validação: tentar adicionar passos negativos
        meuSmartWatch.adicionarPassos(-100);

        // Tentativa de burlar a proteção (não compila porque atributo e setter são privados)
        // meuSmartWatch.totalPassos = -5000;  // ERRO
        // meuSmartWatch.setTotalPassos(-5000); // ERRO

        // Mostrar que o valor não mudou
        System.out.println("Total de passos após tentativa de burlar: " + meuSmartWatch.getTotalPassos());
    }
}