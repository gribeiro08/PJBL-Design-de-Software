// Facade: Fornecer uma interface única para modificar as lâmpadas
class LampadaFacade {
    private Lampada[] lampadas;

    public LampadaFacade() {
        this.lampadas = new Lampada[4];

        for(int i = 0; i < 4; i++) {
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
        for (Lampada lam : this.lampadas) {
            lam.mostrarStatus();
        }
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