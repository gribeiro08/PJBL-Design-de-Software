package Lampadas;
// Classe Lampada

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import General.Database;
import General.State;

class Lampada {
    private String nome;
    private String cor;
    private int intensidade;
    private State estado;
    private Connection databaseConnection;

    public Lampada(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
        this.intensidade = 0;
        this.estado = LampadaStateFactory.getDesligadaState();
        this.databaseConnection = Database.getInstance().getConnection();
    }

    public void ligar() {
        estado.ligar();
        estado = LampadaStateFactory.getLigadaState();
    }

    public void desligar() {
        estado.desligar();
        estado = LampadaStateFactory.getDesligadaState();
    }

    public void alterarIntensidade(int intensidade) {
        this.intensidade = intensidade;
        System.out.println("Intensidade da lâmpada alterada para " + intensidade);
    }

    public void alterarCor(String cor) {
        this.cor = cor;
        System.out.println("Cor da lâmpada alterada para " + cor);
    }

    public void mostrarStatus() {
        System.out.println("Lâmpada " + nome + " de cor " + cor + ", intensidade " + intensidade + ", está " + estado.getClass().getSimpleName());
    }

    public void criarLampada() {
        try {
            String sql = "INSERT INTO lampada (nome, cor, intensidade, estado) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = databaseConnection.prepareStatement(sql);
            statement.setString(1, this.nome);
            statement.setString(2, this.cor);
            statement.setInt(3, this.intensidade);
            statement.setString(4, this.estado.getClass().getSimpleName());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarLampada() {
        try {
            String sql = "UPDATE lampada SET cor = ?, intensidade = ?, estado = ? WHERE nome = ?";
            PreparedStatement statement = databaseConnection.prepareStatement(sql);
            statement.setString(1, this.cor);
            statement.setInt(2, this.intensidade);
            statement.setString(3, this.estado.getClass().getSimpleName());
            statement.setString(4, this.nome);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}