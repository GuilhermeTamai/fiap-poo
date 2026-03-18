package br.com.fiapride.main;

import br.com.fiapride.model.SmartWatch;

public class SistemaPrincipal {
    public static void main(String[] args) {

        // Instância 1
        SmartWatch meuSmartWatch = new SmartWatch();
        meuSmartWatch.cor = "Preto";
        meuSmartWatch.marca = "Apple";
        meuSmartWatch.zerarPassos(10000);

        // Instância 2
        SmartWatch smartWatchDoProfessor = new SmartWatch();
        smartWatchDoProfessor.cor = "Branco";
        smartWatchDoProfessor.marca = "Samsung";
        smartWatchDoProfessor.zerarPassos(25000);

        // Alterando o estado usando métodos
        meuSmartWatch.adicionarPassos(500);          
        smartWatchDoProfessor.zerarPassos(0); // zera os passos

        // Exibindo resultados
        System.out.println("Meu SmartWatch é: " + meuSmartWatch.cor);
        System.out.println("Marca: " + meuSmartWatch.marca);
        System.out.println("Total de passos: " + meuSmartWatch.totalPassos);

        System.out.println("----------------------");

        System.out.println("SmartWatch do professor é: " + smartWatchDoProfessor.cor);
        System.out.println("Marca: " + smartWatchDoProfessor.marca);
        System.out.println("Total de passos: " + smartWatchDoProfessor.totalPassos);

        // Teste de validação
        meuSmartWatch.adicionarPassos(-100); 
        smartWatchDoProfessor.zerarPassos(-500);
    }
}
