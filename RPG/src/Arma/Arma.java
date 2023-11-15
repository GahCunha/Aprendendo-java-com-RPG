package Arma;

public class Arma {
    private String nome;
    private String material;
    private float dano;

    public Arma(String nome,String material, float dano) {
        this.nome = nome;
        this.material = material;
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public float getDano() {
        return dano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDano(float dano) {
        this.dano = dano;
    }

    public String getMaterial() {
        return material;
    }
    
    public void setMaterial(String material) {
        this.material = material;
    }

    public void exibirArma() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Material: " + this.material);
        System.out.println("Dano: " + this.dano);
    }
}
