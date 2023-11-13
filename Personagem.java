package joguinho;

public class Personagem {
    private String nome;
    private float idade;
    private float vida;
    private float mana;
    private float defesa;

    public Personagem (String nome, float idade) {
        this.nome = nome;
        this.idade = idade;
        this.vida = 0;
        this.mana = 0;
        this.defesa = 0;
    }

    public Personagem(String nome, float idade, float vida, float mana, float defesa) {
        setNome(nome);
        setIdade(idade);
        setVida(vida);
        setMana(mana);
        setDefesa(defesa);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getIdade() {
        return idade;
    }

    public void setIdade(float idade) {
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

    public float getDefesa() {
        return defesa;
    }

    public void setDefesa(float defesa) {
        this.defesa = defesa;
    }

    public void exibirPersonagem(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Vida: " + getVida());
        System.out.println("Mana: " + getMana());
        System.out.println("Defesa: " + getDefesa());
    }
}
