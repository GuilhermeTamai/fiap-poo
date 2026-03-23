package br.com.fiapride.model;

public class Bateria {

    private int nivel;

    // ✅ Construtor com int (ESSENCIAL)
    public Bateria(int nivel) {
        setNivel(nivel);
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel < 0 || nivel > 100) {
            System.out.println("Erro: nível deve estar entre 0 e 100.");
            return;
        }
        this.nivel = nivel;
    }

    public void carregar() {
        this.nivel = 100;
        System.out.println("Bateria carregada!");
    }
}