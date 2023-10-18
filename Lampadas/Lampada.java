package Lampadas;
// Classe Lampada

import General.State;

class Lampada {
    private String nome;
    private String cor;
    private int intensidade;
    private State estado;

    public Lampada(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
        this.intensidade = 0;
        this.estado = LampadaStateFactory.getDesligadaState();
    }

    public void ligar() {
        estado.ligar();
        estado = LampadaStateFactory.getLigadaState();
    }

    public void desligar() {
        estado.desligar();
        estado = LampadaStateFactory.getDesligadaState();
    }

    public void alterarIntensidade(int intensidade) {
        this.intensidade = intensidade;
        System.out.println("Intensidade da lâmpada alterada para " + intensidade);
    }

    public void alterarCor(String cor) {
        this.cor = cor;
        System.out.println("Cor da lâmpada alterada para " + cor);
    }

    public void mostrarStatus() {
        System.out.println("Lâmpada " + nome + " de cor " + cor + ", intensidade " + intensidade + ", está " + estado.getClass().getSimpleName());
    }
}