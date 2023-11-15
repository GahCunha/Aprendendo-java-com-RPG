import Heroi.Heroi;
import Interface.*;

public class App {

    public static void main(String[] args) {
        Interface.cabecalho();
        Heroi luiz = CriarHeroi.iniciarUmHeroi();
        Interface.moldura();
        luiz.exibirHeroi();
        Interface.moldura();
        luiz.getArma().exibirArma();
    }
}