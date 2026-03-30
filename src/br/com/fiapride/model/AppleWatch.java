package br.com.fiapride.model;

public class AppleWatch extends SmartWatch {

    private boolean temECG; // atributo exclusivo

    public AppleWatch(String cor, String marca, Bateria bateriaPrincipal, boolean temECG) {
        super(cor, marca, bateriaPrincipal); // 🔥 obrigatório
        this.temECG = temECG;
    }

    public boolean isTemECG() {
        return temECG;
    }

    public void setTemECG(boolean temECG) {
        this.temECG = temECG;
    }
}