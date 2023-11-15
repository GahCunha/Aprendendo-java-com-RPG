package Heroi;

import Arma.Arma;

public class Mago extends Heroi{
    private String capa;

    public Mago(String nome, int idade, Arma arma, String capa) {
        super(nome, idade, 80, 100, arma);
        this.capa = capa;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    @Override
    public void exibirHeroi(){
        super.exibirHeroi();
        System.out.println("Capa: " + this.capa);
    }
}
