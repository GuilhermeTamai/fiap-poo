package br.com.fiapride.model;

public class SmartWatch {

    private String cor;
    private String marca;
    private int totalPassos;
    private Bateria bateriaPrincipal; // Nome mais intencional

    public SmartWatch(String cor, String marca, Bateria bateriaPrincipal) {
        this.setCor(cor);
        this.setMarca(marca);
        this.setBateriaPrincipal(bateriaPrincipal);
        this.setTotalPassos(0);
    }

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

    private void setTotalPassos(int passos) {
        if (passos < 0) {
            System.out.println("Erro: total de passos não pode ser negativo.");
            return;
        }
        this.totalPassos = passos;
    }

    public Bateria getBateriaPrincipal() {
        return bateriaPrincipal;
    }

    public void setBateriaPrincipal(Bateria bateriaPrincipal) {
        if (bateriaPrincipal == null) {
            System.out.println("Erro: bateria não pode ser nula.");
            return;
        }
        this.bateriaPrincipal = bateriaPrincipal;
    }

    public void adicionarPassos(int passos) {
        if (passos <= 0) {
            System.out.println("Erro: não é permitido adicionar passos negativos ou zero.");
            return;
        }
        setTotalPassos(getTotalPassos() + passos);
        System.out.println("Passos adicionados. Total agora: " + getTotalPassos());
    }

    public void zerarPassos() {
        setTotalPassos(0);
        System.out.println("Total de passos zerado.");
    }
}