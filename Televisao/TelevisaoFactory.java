package Televisao;

import General.State;

class TelevisaoFactory {
    private static final State LIGADA = new TvOnState();
    private static final State DESLIGADA = new TvOffState();

    public static State getLigadaState() {
        return LIGADA;
    }

    public static State getDesligadaState() {
        return DESLIGADA;
    }
}