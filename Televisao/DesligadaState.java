package Televisao;

import General.State;

class DesligadaState implements State{
    @Override
    public void ligar() {
        System.out.println("Ligando a televisão.");
    }

    @Override
    public void desligar() {
        System.out.println("A televisão já está desligada.");
    }
}