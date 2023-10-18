package Lampadas;
// Facade: Fornecer uma interface única para modificar as lâmpadas

public class LampadaFacade {
    private Lampada[] lampadas;

    public LampadaFacade(int size) {
        this.lampadas = new Lampada[size];

        for(int i = 0; i < size; i++) {
            String nome = "Lampada" + i;
            this.lampadas[i] = new Lampada(nome, "Branca");
        }
    }

    public void ligarLampada(int qualLam, int intensidade, String cor) {
        Lampada lamapada = escolherLamapada(qualLam - 1);

        lamapada.ligar();
        lamapada.alterarCor(cor);
        lamapada.alterarIntensidade(intensidade);
    }

    public void mostrarLampadas() {
        System.out.println("\nLampadas:");
        for (Lampada lam : this.lampadas) {
            lam.mostrarStatus();
        }
        System.out.println("\n");
    }

    private Lampada escolherLamapada(int qualLam) {
       if (qualLam > this.lampadas.length) {
            System.out.println("BURRO BURRO BURRO >:(");
            return null;
       } else {
           return this.lampadas[qualLam];

       }
    }
}