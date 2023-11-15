package Heroi;

import Arma.Arma;

public class Guerreiro extends Heroi{
    
    private Arma escudo;

    public Guerreiro(String nome, int idade, Arma arma, Arma escudo) {
        super(nome, idade, 100, 20, arma);
        this.escudo = escudo;
    }

    public Arma getEscudo() {
        return escudo;
    }

    public void setEscudo(Arma escudo) {
        this.escudo = escudo;
    }

    @Override
    public void exibirHeroi(){
        super.exibirHeroi();
        System.out.println("Escudo: " + this.escudo.getNome());
    }
}
