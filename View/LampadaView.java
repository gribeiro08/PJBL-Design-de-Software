package View;

// Classe View - Padrão MVC.
public class LampadaView {
    public void mostrarEstadoLampada(String cor, boolean ligada) {
        String estado = ligada ? "ligada" : "desligada";
        System.out.println("A lâmpada " + cor + " está " + estado);
    }
}



