package Model;

// Padrão State: Estado da lâmpada.
interface EstadoLampada {
    void ligar();
    void desligar();
}

class LampadaDesligada implements EstadoLampada {
    @Override
    public void ligar() {
        System.out.println("Ligando a lâmpada.");
    }

    @Override
    public void desligar() {
        System.out.println("A lâmpada já está desligada.");
    }
}

class LampadaLigada implements EstadoLampada {
    @Override
    public void ligar() {
        System.out.println("A lâmpada já está ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando a lâmpada.");
    }
}


