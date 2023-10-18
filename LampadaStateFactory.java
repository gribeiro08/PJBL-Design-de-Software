
// Flyweight: Classe compartilhada entre as instâncias de lâmpadas
class LampadaStateFactory {
    private static final EstadoLampada LIGADA = new LigadaState();
    private static final EstadoLampada DESLIGADA = new DesligadaState();

    public static EstadoLampada getLigadaState() {
        return LIGADA;
    }

    public static EstadoLampada getDesligadaState() {
        return DESLIGADA;
    }
}