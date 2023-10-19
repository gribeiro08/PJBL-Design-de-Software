package Televisao;
// Classe Lampada

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import General.Database;
import General.State;

class Televisao {
    private String nome;
    private int canal;
    private int volume;
    private State estado;
    private Connection databaseConnection;

    public Televisao(String nome) {
        this.nome = nome;
        this.canal = 12;
        this.volume = 13;
        this.estado = TelevisaoFactory.getDesligadaState();
        this.databaseConnection = Database.getInstance().getConnection();
    }

    public void ligar() {
        estado.ligar();
        estado = TelevisaoFactory.getLigadaState();
    }

    public void desligar() {
        estado.desligar();
        estado = TelevisaoFactory.getDesligadaState();
    }

    public void alterarCanal(int canal) {
        this.canal = canal;
        System.out.println("Canal da televisao alterado para " + canal);
    }

    public void alterarVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume da televisao alterado para " + volume);
    }


    public void mostrarStatus() {
        System.out.println("Televisão " + nome + " , canal " + canal + "volume " + volume + ", está " + estado.getClass().getSimpleName());
    }

    public void criarTV() {
        try {
            String sql = "INSERT INTO lampada (nome, canal, volume, estado) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = databaseConnection.prepareStatement(sql);
            statement.setString(1, this.nome);
            statement.setInt(2, this.canal);
            statement.setInt(3, this.volume);
            statement.setString(4, this.estado.getClass().getSimpleName());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarTV() {
        try {
            String sql = "UPDATE lampada SET canal = ?, volume = ?, estado = ? WHERE nome = ?";
            PreparedStatement statement = databaseConnection.prepareStatement(sql);
            statement.setInt(1, this.canal);
            statement.setInt(2, this.volume);
            statement.setString(3, this.estado.getClass().getSimpleName());
            statement.setString(4, this.nome);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}