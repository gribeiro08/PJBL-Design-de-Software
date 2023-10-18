public class Main {
    public static void main(String[] args) {
        LampadaFacade facade = new LampadaFacade();
        
        facade.mostrarLampadas();
        facade.ligarLampada(1, 10, "Azul");
        facade.ligarLampada(3, 10, "Azul");
        facade.mostrarLampadas();
    }
}