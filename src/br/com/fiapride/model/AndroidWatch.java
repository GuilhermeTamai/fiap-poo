package br.com.fiapride.model;

public class AndroidWatch extends SmartWatch {

    private String versaoAndroid; // atributo exclusivo

    public AndroidWatch(String cor, String marca, Bateria bateriaPrincipal, String versaoAndroid) {
        super(cor, marca, bateriaPrincipal); // 🔥 obrigatório
        this.versaoAndroid = versaoAndroid;
    }

    public String getVersaoAndroid() {
        return versaoAndroid;
    }

    public void setVersaoAndroid(String versaoAndroid) {
        this.versaoAndroid = versaoAndroid;
    }
}