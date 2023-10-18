package Controller;

import View.LampadaView;

public class LampadaController {
    private LampadaFacade facade;
    private LampadaView view;

    public LampadaController() {
        facade = new LampadaFacade();
        view = new LampadaView();
    }

    public void acenderLampada() {
        facade.acenderLampada();
    }

    public void apagarLampada() {
        facade.apagarLampada();
    }

    public void definirCorLampada(String cor) {
        facade.definirCorLampada(cor);
    }

    public void definirIntensidadeLampada(int intensidade) {
        facade.definirIntensidadeLampada(intensidade);
    }

    public void mostrarLampada() {
        view.mostrarLampada(facade.getLampada());
    }
}


