package ArCondicionado;
// Classe Lampada

import General.State;

class ArCondicionado {
    private String nome;
    private int temperatura;
    private State estado;

    public ArCondicionado(String nome) {
        this.nome = nome;
        this.temperatura = 20;
        this.estado = ArCondicionadoFactory.getDesligadaState();
    }

    public void ligar() {
        estado.ligar();
        estado = ArCondicionadoFactory.getLigadaState();
    }

    public void desligar() {
        estado.desligar();
        estado = ArCondicionadoFactory.getDesligadaState();
    }

    public void alterarTemperatura(int temperatura) {
        this.temperatura = temperatura;
        System.out.println("Temperatura do ar-condicionado alterada para " + temperatura);
    }


    public void mostrarStatus() {
        System.out.println("Ar-condicionado " + nome + " , temperatura " + temperatura + " C°, está " + estado.getClass().getSimpleName());
    }
}