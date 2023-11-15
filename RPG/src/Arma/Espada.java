/*
 * 
 */
package Arma;

public class Espada extends Arma{
    private float afiacao;

    public Espada(String nome, String material, float dano, float afiacao) {
        super(nome, material, dano);
        this.afiacao = afiacao;
    }

    public float getAfiacao() {
        return afiacao;
    }

    public void setAfiacao(float afiacao) {
        this.afiacao = afiacao;
    }

    @Override
    public void exibirArma() {
        super.exibirArma();
        System.out.println("Afiacao: " + this.afiacao);
    }
}
