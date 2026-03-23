package br.com.fiapride.main;

import br.com.fiapride.model.SmartWatch;
import br.com.fiapride.model.Bateria;

public class TesteMeuObjeto {
    public static void main(String[] args) {

        // Criando baterias
        Bateria bateria1 = new Bateria(80);
        Bateria bateria2 = new Bateria(50);

        // Criando SmartWatches com associação
        SmartWatch meuSmartWatch = new SmartWatch("Preto", "Apple", bateria1);
        SmartWatch smartWatchDoProfessor = new SmartWatch("Branco", "Samsung", bateria2);

        // Adicionando passos
        meuSmartWatch.adicionarPassos(10000);
        smartWatchDoProfessor.adicionarPassos(25000);

        // Alterando estado
        meuSmartWatch.adicionarPassos(500);
        smartWatchDoProfessor.zerarPassos();

        // Exibindo dados do primeiro
        System.out.println("Meu SmartWatch:");
        System.out.println("Cor: " + meuSmartWatch.getCor());
        System.out.println("Marca: " + meuSmartWatch.getMarca());
        System.out.println("Passos: " + meuSmartWatch.getTotalPassos());
        System.out.println("Bateria: " + meuSmartWatch.getBateriaPrincipal().getNivel() + "%");

        System.out.println("----------------------");

        // Exibindo dados do segundo
        System.out.println("SmartWatch do Professor:");
        System.out.println("Cor: " + smartWatchDoProfessor.getCor());
        System.out.println("Marca: " + smartWatchDoProfessor.getMarca());
        System.out.println("Passos: " + smartWatchDoProfessor.getTotalPassos());
        System.out.println("Bateria: " + smartWatchDoProfessor.getBateriaPrincipal().getNivel() + "%");

        System.out.println("----------------------");

        // Teste de validação
        meuSmartWatch.adicionarPassos(-100);

        System.out.println("Passos após tentativa inválida: " + meuSmartWatch.getTotalPassos());
    }
}