package Arma;

public class Escudo extends Arma{
    private float durabilidade;

    public Escudo(String nome, String material, float dano, float durabilidade) {
        super(nome, material, dano);
        this.durabilidade = durabilidade;
    }

    public float getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(float durabilidade) {
        this.durabilidade = durabilidade;
    }

    @Override
    public void exibirArma() {
        super.exibirArma();
        System.out.println("Durabilidade: " + this.durabilidade);
    }
}
