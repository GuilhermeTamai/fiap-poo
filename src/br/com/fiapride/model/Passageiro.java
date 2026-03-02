package br.com.fiapride.model;

public class Passageiro {
    
    // Agora ninguém fora desta classe consegue mexer nisso diretamente!
    private String nome;
    private String cpf;
    private double saldo;

    // CONSTRUTOR (Obrigatório no Nascimento)
    // Para criar um passageiro, é OBRIGATÓRIO informar nome e cpf.
    public Passageiro(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSaldo(0); // Todo mundo começa com zero!
    }

    // Método para PEGAR o saldo (Leitura)
    public double getSaldo() {
        return this.saldo; // Apenas devolve o valor
    }

    // Método para DEFINIR o saldo (Escrita com Regra de Negócio)
    private void setSaldo(double valor) {
        if (valor >= 0) {
            this.saldo = valor;
        } else {
            System.out.println("Erro de Segurança: Tentativa de definir saldo negativo bloqueada!");
        }
    }

    // Método público para adicionar saldo (recarga)
    public void adicionarSaldo(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor de recarga deve ser maior que zero.");
            return;
        }
        this.setSaldo(this.getSaldo() + valor);
        System.out.println("Recarga realizada. Novo saldo: " + this.getSaldo());
    }

    // Método público para pagar viagem
    public void pagarViagem(double custo) {
        if (custo <= 0) {
            System.out.println("Erro: O custo da viagem é inválido.");
            return;
        }
        if (this.getSaldo() < custo) {
            System.out.println("Erro: Saldo insuficiente para realizar a viagem.");
            return;
        }
        this.setSaldo(this.getSaldo() - custo);
        System.out.println("Viagem paga. Saldo restante: " + this.getSaldo());
    }

    // Getters e Setters privados para nome e cpf
    public String getNome() {
        return this.nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }
}