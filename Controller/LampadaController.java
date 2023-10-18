package Controller;
import Model.LampadaModel;
import View.LampadaView;

// Classe Controller - Padrão MVC.
public class LampadaController {
    private LampadaModel model;
    private LampadaView view;

    public LampadaController(LampadaModel model, LampadaView view) {
        this.model = model;
        this.view = view;
    }

    public void ligarLampada() {
        model.ligar();
        view.mostrarEstadoLampada(model.getCor(), true);
    }

    public void desligarLampada() {
        model.desligar();
        view.mostrarEstadoLampada(model.getCor(), false);
    }
}


