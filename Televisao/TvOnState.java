package Televisao;

import java.util.concurrent.TimeUnit;

import General.State;

class TvOnState implements State {
    @Override
    public void ligar() {
        System.out.println("A televisão já está ligada.");
        try {
            TimeUnit.SECONDS.sleep(3);
            } catch (Exception e) {
                // TODO: handle exception
            }
    }

    @Override
    public void desligar() {
        System.out.println("Desligandoa televisão.");
        try {
            TimeUnit.SECONDS.sleep(3);
            } catch (Exception e) {
                // TODO: handle exception
            }
    }
}