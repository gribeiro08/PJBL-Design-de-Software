package General;

public class CasaFacade {
    private QuartoFacade quarto;
    private SalaFacade sala;

    public CasaFacade(){
        this.quarto = new QuartoFacade(2, 1, 1);
        this.sala = new SalaFacade(1, 1);
    }

    public void prepararCasa(){
        this.quarto.prepararQuarto();
        this.sala.prepararSala();
    }
}
