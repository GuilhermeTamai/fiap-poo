package br.com.fiapride.main;

import br.com.fiapride.model.Bateria;
import br.com.fiapride.model.AndroidWatch;
import br.com.fiapride.model.AppleWatch;

public class TesteMeuObjeto {
    public static void main(String[] args) {

        // Criando baterias
        Bateria bateria1 = new Bateria(80);
        Bateria bateria2 = new Bateria(50);

        // Criando objetos das subclasses
        AndroidWatch android = new AndroidWatch("Preto", "Samsung", bateria1, "Wear OS");
        AppleWatch apple = new AppleWatch("Branco", "Apple", bateria2, true);

        // Adicionando passos
        android.adicionarPassos(5000);
        apple.adicionarPassos(8000);

        System.out.println("----------------------");

        // Exibindo dados Android
        System.out.println("Android Watch:");
        System.out.println("Cor: " + android.getCor());
        System.out.println("Marca: " + android.getMarca());
        System.out.println("Passos: " + android.getTotalPassos());
        System.out.println("Bateria: " + android.getBateriaPrincipal().getNivel() + "%");
        System.out.println("Versão Android: " + android.getVersaoAndroid());

        System.out.println("----------------------");

        // Exibindo dados Apple
        System.out.println("Apple Watch:");
        System.out.println("Cor: " + apple.getCor());
        System.out.println("Marca: " + apple.getMarca());
        System.out.println("Passos: " + apple.getTotalPassos());
        System.out.println("Bateria: " + apple.getBateriaPrincipal().getNivel() + "%");
        System.out.println("Tem ECG: " + apple.isTemECG());

        System.out.println("----------------------");

        // Teste de validação
        android.adicionarPassos(-100);

        System.out.println("Passos após tentativa inválida: " + android.getTotalPassos());
    }
}