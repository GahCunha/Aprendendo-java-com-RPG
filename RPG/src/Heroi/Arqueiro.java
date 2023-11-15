package Heroi;

import Arma.Arma;

/**
 * Arqueiro
 */
public class Arqueiro extends Heroi{
    
        private int flechas;
    
        public Arqueiro(String nome, int idade, Arma arma) {
            super(nome, idade, 80, 60, arma);
            this.flechas = 20;
        }
    
        public int getFlechas() {
            return flechas;
        }
    
        public void setFlechas(int flechas) {
            this.flechas = flechas;
        }
    
        @Override
        public void exibirHeroi(){
            super.exibirHeroi();
            System.out.println("Flechas: " + this.flechas);
        }
    
}