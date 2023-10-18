package Model;

// Padrão Facade: Facade para ocultar complexidade.
class LampadaFacade {
    private EstadoLampada estado;

    public LampadaFacade() {
        estado = new LampadaDesligada();
    }

    public void ligar() {
        estado.ligar();
        estado = new LampadaLigada();
    }

    public void desligar() {
        estado.desligar();
        estado = new LampadaDesligada();
    }
}

