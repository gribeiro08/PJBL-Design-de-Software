package ArCondicionado;

import java.util.concurrent.TimeUnit;

import General.State;

class ArOnState implements State {
    @Override
    public void ligar() {
        System.out.println("O ar-condicionado já está ligada.");
        try {
            TimeUnit.SECONDS.sleep(5);
            } catch (Exception e) {
                // TODO: handle exception
            }
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o ar-condicionado.");
        try {
            TimeUnit.SECONDS.sleep(5);
            } catch (Exception e) {
                // TODO: handle exception
            }
    }
}