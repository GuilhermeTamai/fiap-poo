package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.SmartWatch;

public class SistemaPrincipal {
	public static void main(String[] args) {
		// Dentro do main...// Fabriquei a primeira (Instância 1)
		SmartWatch meuSmartWatch = new SmartWatch();
		meuSmartWatch.cor = "Preto";
		meuSmartWatch.marca = "Apple";
		meuSmartWatch.totalPassos = 10000;
		// Fabriquei a segunda (Instância 2)
		SmartWatch smartWatchDoProfessor = new SmartWatch();
		smartWatchDoProfessor.cor = "Branco";
		smartWatchDoProfessor.marca = "Samsung";
		smartWatchDoProfessor.totalPassos = 25000;
		System.out.println("Meu SmartWatch é: " + meuSmartWatch.cor);
		System.out.println("A do professor é: " + smartWatchDoProfessor.cor);
	}
}