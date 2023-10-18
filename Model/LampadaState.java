package Model;

public interface LampadaState {
    void acender(Lampada lampada);
    void apagar(Lampada lampada);
    void definirCor(Lampada lampada, String cor);
    void definirIntensidade(Lampada lampada, int intensidade);
}

class LampadaDesligada implements LampadaState {
    @Override
    public void acender(Lampada lampada) {
        System.out.println("Acendendo a lâmpada.");
        lampada.setEstado(new LampadaAcesa());
    }

    @Override
    public void apagar(Lampada lampada) {
        System.out.println("A lâmpada já está apagada.");
    }

    @Override
    public void definirCor(Lampada lampada, String cor) {
        System.out.println("A lâmpada está apagada. Não é possível definir a cor.");
    }

    @Override
    public void definirIntensidade(Lampada lampada, int intensidade) {
        System.out.println("A lâmpada está apagada. Não é possível definir a intensidade.");
    }
}

class LampadaAcesa implements LampadaState {
    @Override
    public void acender(Lampada lampada) {
        System.out.println("A lâmpada já está acesa.");
    }

    @Override
    public void apagar(Lampada lampada) {
        System.out.println("Apagando a lâmpada.");
        lampada.setEstado(new LampadaDesligada());
    }

    @Override
    public void definirCor(Lampada lampada, String cor) {
        lampada.setCor(cor);
        System.out.println("Cor definida como " + cor);
    }

    @Override
    public void definirIntensidade(Lampada lampada, int intensidade) {
        lampada.setIntensidade(intensidade);
        System.out.println("Intensidade definida como " + intensidade);
    }
}


