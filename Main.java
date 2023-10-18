import General.QuartoFacade;
import General.SalaFacade;

public class Main {
    public static void main(String[] args) {
        QuartoFacade facadeQuarto = new QuartoFacade(2, 1, 1);
        SalaFacade facadeSala = new SalaFacade(1, 1);
        
        facadeQuarto.prepararQuarto();
        facadeSala.prepararSala();
        
    }
}