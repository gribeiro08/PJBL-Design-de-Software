package ArCondicionado;

import General.State;

class LigadaState implements State {
    @Override
    public void ligar() {
        System.out.println("O ar-condicionado já está ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o ar-condicionado.");
    }
}