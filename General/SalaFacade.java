package General;
import Lampadas.LampadaFacade;
import Televisao.TelevisaoFacade;

public class SalaFacade {
    private LampadaFacade lampadas;
    private TelevisaoFacade televisoes;

    public SalaFacade(int quantLampadas, int quantTelevisoes) {
        this.lampadas = new LampadaFacade(quantLampadas);
        this.televisoes = new TelevisaoFacade(quantTelevisoes);
    }

    public void ligarLampadas() {
        this.lampadas.mostrarLampadas();
        this.lampadas.ligarLampada(1, 10, "amarelo");
        this.lampadas.mostrarLampadas();
    }

    public void ligarTelevisoes(){
        this.televisoes.mostrarTelevisoes();
        this.televisoes.ligarTelevisao(1, 4, 15);
        this.televisoes.mostrarTelevisoes();
    }

    public void prepararSala(){
        ligarLampadas();
        ligarTelevisoes();     
    }


}
