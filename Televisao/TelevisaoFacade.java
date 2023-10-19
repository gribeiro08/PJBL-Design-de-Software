package Televisao;
// Facade: Fornecer uma interface única para modificar as lâmpadas

public class TelevisaoFacade {
    private Televisao[] televisoes;

    public TelevisaoFacade(int size) {
        this.televisoes = new Televisao[size];

        for(int i = 0; i < size; i++) {
            String nome = "Ar-condicionado" + i;
            this.televisoes[i] = new Televisao(nome);
        }
    }

    public void ligarTelevisao(int qualTV, int canal, int volume) {
        Televisao televisao = escolherTelevisao(qualTV - 1);

        televisao.ligar();
        televisao.criarTV();
        televisao.alterarCanal(canal);
        televisao.alterarVolume(volume);
        televisao.atualizarTV();
        
    }

    public void mostrarTelevisoes() {
        System.out.println("\nTelevisões:");
        for (Televisao lam : this.televisoes) {
            lam.mostrarStatus();
        }
        System.out.println("\n");
    }

    private Televisao escolherTelevisao(int qualTV) {
       if (qualTV > this.televisoes.length) {
            System.out.println("BURRO BURRO BURRO >:(");
            return null;
       } else {
           return this.televisoes[qualTV];

       }
    }
}