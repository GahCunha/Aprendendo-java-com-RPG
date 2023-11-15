/*
 * Classe Heroi
 */
package Heroi;

import Arma.Arma;

public class Heroi {
    private String nome;
    private int idade;
    private float vida;
    private float mana;
    private Arma arma;

    public Heroi(String nome, int idade, float vida,float mana,Arma arma) {
        this.nome = nome;
        this.idade = idade;
        this.vida = vida;
        this.arma = arma;
        this.mana = mana;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }

    public float getMana() {
        return mana;
    }

    public void setMana(float mana) {
        this.mana = mana;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void exibirHeroi() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Vida: " + this.vida);
        System.out.println("Mana: " + this.mana);
        System.out.println("Arma: " + this.arma.getNome());
    }

    public void atacar() {
        System.out.println("O heroi " + this.nome + " atacou com " + this.arma.getNome());
    }

    public void defender() {
        System.out.println("O heroi " + this.nome + " defendeu com " + this.arma.getNome());
    }
}
