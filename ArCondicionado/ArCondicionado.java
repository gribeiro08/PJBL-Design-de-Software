package ArCondicionado;
// Classe Lampada

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import General.Database;
import General.State;

class ArCondicionado {
    private String nome;
    private int temperatura;
    private State estado;
    private Connection databaseConnection;

    public ArCondicionado(String nome) {
        this.nome = nome;
        this.temperatura = 20;
        this.estado = ArCondicionadoFactory.getDesligadaState();
        this.databaseConnection = Database.getInstance().getConnection();
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

    public void criarArCondicionado() {
        try {
            String sql = "INSERT INTO ar_condicionado (nome, temperatura, estado) VALUES (?, ?, ?)";
            PreparedStatement statement = databaseConnection.prepareStatement(sql);
            statement.setString(1, this.nome);
            statement.setInt(2, this.temperatura);
            statement.setString(3, this.estado.getClass().getSimpleName());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarArCondicionado() {
        try {
            String sql = "UPDATE ar_condicionado SET temperatura = ?, estado = ? WHERE nome = ?";
            PreparedStatement statement = databaseConnection.prepareStatement(sql);
            statement.setInt(1, this.temperatura);
            statement.setString(2, this.estado.getClass().getSimpleName());
            statement.setString(3, this.nome);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}