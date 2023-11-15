package Arma;

public class Cajado extends Arma {
    private float alcance;

    public Cajado(String nome, String material, float dano, float alcance) {
        super(nome, material, dano);
        this.alcance = alcance;
    }

    public float getAlcance() {
        return alcance;
    }

    public void setAlcance(float alcance) {
        this.alcance = alcance;
    }

    @Override
    public void exibirArma() {
        super.exibirArma();
        System.out.println("Alcance: " + this.alcance);
    }
}
