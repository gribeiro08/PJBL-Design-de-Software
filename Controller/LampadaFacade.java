package Controller;

import Model.Lampada;

public class LampadaFacade {
    private Lampada lampada;

    public LampadaFacade() {
        lampada = Lampada.getInstance();
        lampada.carregarDoBancoDeDados();
    }

    public void acenderLampada() {
        lampada.acenderLampada();
    }

    public void apagarLampada() {
        lampada.apagarLampada();
    }

    public void definirCorLampada(String cor) {
        lampada.definirCorLampada(cor);
    }

    public void definirIntensidadeLampada(int intensidade) {
        lampada.definirIntensidadeLampada(intensidade);
    }

    public Lampada getLampada() {
        return lampada;
    }
}

