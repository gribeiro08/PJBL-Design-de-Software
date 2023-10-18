package ArCondicionado;

import General.State;

class ArCondicionadoFactory {
    private static final State LIGADA = new LigadaState();
    private static final State DESLIGADA = new DesligadaState();

    public static State getLigadaState() {
        return LIGADA;
    }

    public static State getDesligadaState() {
        return DESLIGADA;
    }
}