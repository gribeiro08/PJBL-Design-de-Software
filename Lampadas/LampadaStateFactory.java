package Lampadas;

import General.State;

class LampadaStateFactory {
    private static final State LIGADA = new LampOnState();
    private static final State DESLIGADA = new LampOffState();

    public static State getLigadaState() {
        return LIGADA;
    }

    public static State getDesligadaState() {
        return DESLIGADA;
    }
}