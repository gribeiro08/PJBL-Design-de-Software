package Televisao;
// Classe Lampada

import General.State;

class Televisao {
    private String nome;
    private int canal;
    private int volume;
    private State estado;

    public Televisao(String nome) {
        this.nome = nome;
        this.canal = 12;
        this.volume = 13;
        this.estado = TelevisaoFactory.getDesligadaState();
    }

    public void ligar() {
        estado.ligar();
        estado = TelevisaoFactory.getLigadaState();
    }

    public void desligar() {
        estado.desligar();
        estado = TelevisaoFactory.getDesligadaState();
    }

    public void alterarCanal(int canal) {
        this.canal = canal;
        System.out.println("Canal da televisao alterado para " + canal);
    }

    public void alterarVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume da televisao alterado para " + volume);
    }


    public void mostrarStatus() {
        System.out.println("Televisão " + nome + " , canal " + canal + "volume " + volume + ", está " + estado.getClass().getSimpleName());
    }
}