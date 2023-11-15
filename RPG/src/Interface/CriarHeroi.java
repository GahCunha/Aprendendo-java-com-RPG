package Interface;

import java.util.Scanner;
import Heroi.*;
import Arma.*;

public class CriarHeroi {

    public static Heroi iniciarUmHeroi() {
        Scanner scanner = new Scanner(System.in);
        Interface.Heroi();
        System.out.println("Olá, voce  esta em um mundo de fantasia medieval, onde voce pode criar seu proprio heroi e escolher sua classe.");
        System.out.println("Digite o nome do seu heroi: ");
        String nome = scanner.next();
        System.out.println("Digite a idade do seu heroi: ");
        int idade = scanner.nextInt();
        System.out.println("Escolha uma das classes abaixo:\n 1 - Guerreiro\n 2 - Mago\n 3 - Arqueiro");
        System.out.println("Digite o numero da classe que deseja: ");
        int classe = scanner.nextInt();
        Interface.moldura();

        if (classe == 1) {
            System.out.println("Voce escolheu a classe Guerreiro");
            // criar guerriro
            // perguntar os atributos
            System.out.println("Digite o nome da espada do seu heroi: ");
            String nomeEspada = scanner.next();
            System.out.println("Digite o dano da espada do seu heroi: ");
            float danoEspada = scanner.nextFloat();
            System.out.println("Digite a afiação da espada do seu heroi: ");
            float afiacaoEspada = scanner.nextFloat();
            System.out.println("Digite o material da espada do seu heroi: ");
            String materialEspada = scanner.next();
            System.out.println("Digite o nome do escudo do seu heroi: ");
            String nomeEscudo = scanner.next();
            System.out.println("Digite o dano do escudo do seu heroi: ");
            float danoEscudo = scanner.nextFloat();
            System.out.println("Digite a durabilidade do escudo do seu heroi: ");
            float durabilidadeEscudo = scanner.nextFloat();
            System.out.println("Digite o material do escudo do seu heroi: ");
            String materialEscudo = scanner.next();
            scanner.close();
            return new Guerreiro(nome, idade,
                    new Espada(nomeEspada, materialEspada, danoEspada, afiacaoEspada),
                    new Escudo(nomeEscudo, materialEscudo, danoEscudo, durabilidadeEscudo));
        } else if (classe == 2) {
            System.out.println("Voce escolheu a classe Mago");
            // criar mago
            // perguntar os atributos
            System.out.println("Digite o nome do cajado do seu mago: ");
            String nomeCajado = scanner.next();
            System.out.println("Digite o dano do cajado do seu mago: ");
            float danoCajado = scanner.nextFloat();
            System.out.println("Digite o material do cajado do seu mago: ");
            String materialCajado = scanner.next();
            System.out.println("Digite o alcance do cajado do seu mago: ");
            float alcanceCajado = scanner.nextFloat();
            System.out.println("Digite o nome da capa do seu mago: ");
            String nomeCapa = scanner.next();
            scanner.close();
            return new Mago((nome), idade,
                    new Cajado(nomeCajado, materialCajado, danoCajado, alcanceCajado), nomeCapa);
        } else if (classe == 3) {
            System.out.println("Voce escolheu a classe Arqueiro");
            // criar arqueiro
            // perguntar os atributos
            System.out.println("Digite o nome do arco do seu arqueiro: ");
            String nomeArco = scanner.next();
            System.out.println("Digite o dano do arco do seu arqueiro: ");
            float danoArco = scanner.nextFloat();
            System.out.println("Digite o material do arco do seu arqueiro: ");
            String materialArco = scanner.next();
            System.out.println("Digite o alcance do arco do seu arqueiro: ");
            float alcanceArco = scanner.nextFloat();
            scanner.close();
            return new Arqueiro(nome, idade,
                    new Arco(nomeArco, materialArco, danoArco, alcanceArco));
        } else {
            System.out.println("Classe inválida!");
        }
                scanner.close();
                return null;
    }
}