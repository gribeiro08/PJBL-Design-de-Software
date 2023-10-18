package Televisao;

import General.State;

class LigadaState implements State {
    @Override
    public void ligar() {
        System.out.println("A televisão já está ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("Desligandoa televisão.");
    }
}