package joguinho;

public class Main {
    public static void main(String[] args) {
        Personagem personagem01 = new Arqueiro("Galego", 20, 100, 30, new Arma("Atiradora fofinha", 10, 100,"Madeira"));
        personagem01.exibirPersonagem();
        ((Arqueiro)personagem01).getArma().exibirArma();
    }
}
