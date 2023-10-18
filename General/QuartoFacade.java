package General;
import ArCondicionado.ArCondicionadoFacade;
import Lampadas.LampadaFacade;
import Televisao.TelevisaoFacade;

public class QuartoFacade {
    private LampadaFacade lampadas;
    private ArCondicionadoFacade arCondicionados;
    private TelevisaoFacade televisoes;

    public QuartoFacade(int quantLampadas, int quantArCondicionados, int quantTelevisoes) {
        this.lampadas = new LampadaFacade(quantLampadas);
        this.arCondicionados = new ArCondicionadoFacade(quantArCondicionados);
        this.televisoes = new TelevisaoFacade(quantTelevisoes);
    }

    public void ligarLampadas() {
        this.lampadas.mostrarLampadas();
        this.lampadas.ligarLampada(1, 10, "Azul");
        this.lampadas.ligarLampada(2, 10, "Azul");
        this.lampadas.mostrarLampadas();
    }

    public void ligarArCondicionado(){
        this.arCondicionados.mostrarArCondicionado();
        this.arCondicionados.ligarArCondicionado(1,23);
        this.arCondicionados.mostrarArCondicionado();
    }

    public void ligarTelevisoes(){
        this.televisoes.mostrarTelevisoes();
        this.televisoes.ligarTelevisao(1, 4, 15);
        this.televisoes.mostrarTelevisoes();
    }

    public void prepararQuarto(){
        ligarLampadas();
        ligarArCondicionado();
        ligarTelevisoes();        
    }


}
