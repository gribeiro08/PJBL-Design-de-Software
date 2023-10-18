package Model;

// Classe Model - Padrão MVC.
public class LampadaModel {
    private String cor;
    private LampadaFacade facade;

    public LampadaModel(String cor) {
        this.cor = cor;
        this.facade = new LampadaFacade();
    }

    public void ligar() {
        facade.ligar();
    }

    public void desligar() {
        facade.desligar();
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public LampadaFacade getFacade() {
        return facade;
    }

    public void setFacade(LampadaFacade facade) {
        this.facade = facade;
    }

    
}


