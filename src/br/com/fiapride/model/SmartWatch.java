package br.com.fiapride.model;

public class SmartWatch {

    // Atributos privados
    private String cor;
    private String marca;
    private int totalPassos;

    // Construtor (atributos essenciais: cor e marca)
    public SmartWatch(String cor, String marca) {
        this.setCor(cor);
        this.setMarca(marca);
        this.setTotalPassos(0); // inicializa com zero
    }

    // Getters e Setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTotalPassos() {
        return totalPassos;
    }

    // Setter privado com validação
    private void setTotalPassos(int passos) {
        if (passos < 0) {
            System.out.println("Erro: total de passos não pode ser negativo.");
            return;
        }
        this.totalPassos = passos;
    }

    // Método para adicionar passos
    public void adicionarPassos(int passos) {
        if (passos <= 0) {
            System.out.println("Erro: não é permitido adicionar passos negativos ou zero.");
            return;
        }
        setTotalPassos(getTotalPassos() + passos);
        System.out.println("Passos adicionados. Total agora: " + getTotalPassos());
    }

    // Método para zerar os passos
    public void zerarPassos() {
        setTotalPassos(0);
        System.out.println("Total de passos zerado.");
    }
}