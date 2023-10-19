package ArCondicionado;

import General.State;
import java.util.concurrent.TimeUnit;

class ArOffState implements State{
    @Override
    public void ligar() {
        System.out.println("Ligando o ar-condicionado.");
        try {
            TimeUnit.SECONDS.sleep(5);
            } catch (Exception e) {
                // TODO: handle exception
            }
    }

    @Override
    public void desligar() {
        System.out.println("O ar-condicionado já está desligada.");
        try {
            TimeUnit.SECONDS.sleep(5);
            } catch (Exception e) {
                // TODO: handle exception
            }
    }
}