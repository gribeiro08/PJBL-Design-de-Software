import Controller.LampadaController;

public class Main {
    public static void main(String[] args) {
        LampadaController controller = new LampadaController();
        controller.acenderLampada();
        controller.definirCorLampada("Azul");
        controller.definirIntensidadeLampada(50);
        controller.mostrarLampada();
    }
}


