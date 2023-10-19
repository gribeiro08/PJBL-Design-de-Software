package ArCondicionado;

import General.State;

class ArCondicionadoFactory {
    private static final State LIGADA = new ArOnState();
    private static final State DESLIGADA = new ArOffState();

    public static State getLigadaState() {
        return LIGADA;
    }

    public static State getDesligadaState() {
        return DESLIGADA;
    }
}