package ArCondicionado;

import General.State;

class DesligadaState implements State{
    @Override
    public void ligar() {
        System.out.println("Ligando o ar-condicionado.");
    }

    @Override
    public void desligar() {
        System.out.println("O ar-condicionado já está desligada.");
    }
}