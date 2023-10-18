package ArCondicionado;
// Facade: Fornecer uma interface única para modificar as lâmpadas

public class ArCondicionadoFacade {
    private ArCondicionado[] arCondicionados;

    public ArCondicionadoFacade(int size) {
        this.arCondicionados = new ArCondicionado[size];

        for(int i = 0; i < size; i++) {
            String nome = "Ar-condicionado" + i;
            this.arCondicionados[i] = new ArCondicionado(nome);
        }
    }

    public void ligarArCondicionado(int qualAr, int temperatura) {
        ArCondicionado lamapada = escolherArCondicionado(qualAr - 1);

        lamapada.ligar();
        lamapada.alterarTemperatura(temperatura);
        
    }

    public void mostrarArCondicionado() {
        System.out.println("\nAr-Condicionado:");
        for (ArCondicionado lam : this.arCondicionados) {
            lam.mostrarStatus();
        }
        System.out.println("\n");
    }

    private ArCondicionado escolherArCondicionado(int qualAr) {
       if (qualAr > this.arCondicionados.length) {
            System.out.println("BURRO BURRO BURRO >:(");
            return null;
       } else {
           return this.arCondicionados[qualAr];

       }
    }
}