package joguinho;

public class Arma {
    private String nome;
    private String material;
    private float dano;
    private float alcance;

    public Arma(String nome, float dano, float alcance, String material) {
        setNome(nome);
        setDano(dano);
        setAlcance(alcance);
        setMaterial(material);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getDano() {
        return dano;
    }
    public void setDano(float dano) {
        this.dano = dano;
    }
    public float getAlcance() {
        return alcance;
    }
    public void setAlcance(float alcance) {
        this.alcance = alcance;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public void exibirArma(){
        System.out.println("*******ARMA*******");
        System.out.println("Nome: " + getNome());
        System.out.println("Material: " + getMaterial());
        System.out.println("Dano: " + getDano());
        System.out.println("Alcance: " + getAlcance());
    }
}
