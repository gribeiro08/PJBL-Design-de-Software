package Televisao;

import java.util.concurrent.TimeUnit;

import General.State;

class TvOffState implements State{
    @Override
    public void ligar() {
        System.out.println("Ligando a televisão.");
        try {
        TimeUnit.SECONDS.sleep(3);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public void desligar() {
        System.out.println("A televisão já está desligada.");
        try {
            TimeUnit.SECONDS.sleep(3);
            } catch (Exception e) {
                // TODO: handle exception
            }
    }
}