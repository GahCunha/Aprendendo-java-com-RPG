package joguinho;

public class Arqueiro extends Personagem {
    private float precisao;
    private int numFlechas;
    private Arma arma;

    public Arqueiro(String nome, float idade,float precisao,int numFlechas, Arma arma) {
        super(nome, idade, 80, 60, 60);
        this.precisao = precisao;
        this.numFlechas = numFlechas;
        this.arma = arma;
    }

    public float getPrecisao() {
        return precisao;
    }

    public void setPrecisao(float precisao) {
        this.precisao = precisao;
    }

    public int getNumFlechas() {
        return numFlechas;
    }

    public void setNumFlechas(int numFlechas) {
        this.numFlechas = numFlechas;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public void exibirPersonagem(){
        super.exibirPersonagem();
        System.out.println("Precisão: " + getPrecisao());
        System.out.println("Número de Flechas: " + getNumFlechas());
        System.out.println("Arma: " + getArma().getNome());
    }
}
