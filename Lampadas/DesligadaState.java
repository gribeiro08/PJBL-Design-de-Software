package Lampadas;
class DesligadaState implements EstadoLampada {
    @Override
    public void ligar() {
        System.out.println("Ligando a lâmpada.");
    }

    @Override
    public void desligar() {
        System.out.println("A lâmpada já está desligada.");
    }
}