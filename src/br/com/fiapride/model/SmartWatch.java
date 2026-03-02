package br.com.fiapride.model;

public class SmartWatch {

    public String cor;
    public String marca;
    public int totalPassos;

    // Método para adicionar passos
    public void adicionarPassos(int passos) {
        if (passos <= 0) {
            System.out.println("Erro: não é permitido adicionar passos negativos ou zero.");
            return;
        }
        totalPassos += passos;
        System.out.println("Passos adicionados. Total agora: " + totalPassos);
    }

    // Método para zerar os passos (corrigido)
    public void zerarPassos() {
        totalPassos = 0;
        System.out.println("Total de passos zerado.");
    }
}