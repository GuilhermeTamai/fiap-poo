package br.com.fiapride.model;

public class SmartWatch {

    public String cor;
    public String marca;
    public int totalPassos; // Atributo que guarda o total de passos do usuário

    // Método para adicionar passos ao total
    public void adicionarPassos(int passos) {
        // Regra de negócio: Só aceita valores positivos
        if (passos <= 0) {
            System.out.println("Erro: não é permitido adicionar passos negativos ou zero.");
            return; 
        }
        this.totalPassos += passos;
        System.out.println("Passos adicionados. Total agora: " + this.totalPassos);
    }

    // Método para definir o total de passos (pode ser usado para zerar ou ajustar)
    public void definirTotalPassos(int novoTotal) {
        // Regra de negócio: total de passos não pode ser negativo
        if (novoTotal < 0) {
            System.out.println("Erro: total de passos não pode ser negativo.");
            return; 
        }
        this.totalPassos = novoTotal;
        System.out.println("Total de passos atualizado: " + this.totalPassos);
    }
}