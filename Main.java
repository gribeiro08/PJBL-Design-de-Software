import Controller.LampadaController;
import Model.LampadaFactory;
import Model.LampadaModel;
import View.LampadaView;

public class Main {
    public static void main(String[] args) {
        // Padrão Flyweight: Duas lâmpadas compartilhando o mesmo estado.
        LampadaModel l1 = LampadaFactory.getLampada("Branca");
        LampadaModel l2 = LampadaFactory.getLampada("Branca");

        // Configuração MVC para a primeira lâmpada
        LampadaModel model1 = new LampadaModel("Branca");
        LampadaView view1 = new LampadaView();
        LampadaController controller1 = new LampadaController(model1, view1);

        // Configuração MVC para a segunda lâmpada
        LampadaModel model2 = new LampadaModel("Branca");
        LampadaView view2 = new LampadaView();
        LampadaController controller2 = new LampadaController(model2, view2);

        // Interagindo com as lâmpadas
        controller1.ligarLampada();
        controller1.desligarLampada();

        controller2.ligarLampada();
        controller2.desligarLampada();
    }
}


