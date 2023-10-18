package Model;

import java.util.HashMap;
import java.util.Map;

// Padrão Flyweight: Classe de fábrica para criar lâmpadas compartilhadas.
public class LampadaFactory {
    private static Map<String, LampadaModel> lampadas = new HashMap<>();

    public static LampadaModel getLampada(String cor) {
        LampadaModel lampada = lampadas.get(cor);
        if (lampada == null) {
            lampada = new LampadaModel(cor);
            lampadas.put(cor, lampada);
        }
        return lampada;
    }
}
