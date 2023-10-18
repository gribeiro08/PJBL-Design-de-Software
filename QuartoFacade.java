import Lampadas.LampadaFacade;

public class QuartoFacade {
    private LampadaFacade lampadas;

    public QuartoFacade(int quantLampadas) {
        this.lampadas = new LampadaFacade(quantLampadas);
    }

    public void ligarLampadas() {
        this.lampadas.mostrarLampadas();
        this.lampadas.ligarLampada(1, 10, "Azul");
        this.lampadas.ligarLampada(2, 10, "Azul");
        this.lampadas.mostrarLampadas();
    }
}
