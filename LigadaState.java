class LigadaState implements EstadoLampada {
    @Override
    public void ligar() {
        System.out.println("A lâmpada já está ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando a lâmpada.");
    }
}