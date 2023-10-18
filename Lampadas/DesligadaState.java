package Lampadas;

import General.State;

class DesligadaState implements State{
    @Override
    public void ligar() {
        System.out.println("Ligando a lâmpada.");
    }

    @Override
    public void desligar() {
        System.out.println("A lâmpada já está desligada.");
    }
}