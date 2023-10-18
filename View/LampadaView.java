package View;

import Model.Lampada;

public class LampadaView {
    public void mostrarLampada(Lampada lampada) {
        System.out.println("ID: " + lampada.getId());
        System.out.println("Estado: " + lampada.getEstado());
        System.out.println("Cor: " + lampada.getCor());
        System.out.println("Intensidade: " + lampada.getIntensidade());
    }
}


