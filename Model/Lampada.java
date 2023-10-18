package Model;

import java.sql.*;

public class Lampada {
    private static Lampada instance;

    private int id;
    private LampadaState estado;
    private String cor;
    private int intensidade;

    private Lampada() {
        // Inicialização do Singleton
        this.id = 1; // Exemplo de ID
        this.estado = new LampadaDesligada();
        this.cor = "Branca";
        this.intensidade = 0;
    }

    public static Lampada getInstance() {
        if (instance == null) {
            instance = new Lampada();
        }
        return instance;
    }

    public void acenderLampada() {
        estado.acender(this);
        salvarNoBancoDeDados();
    }

    public void apagarLampada() {
        estado.apagar(this);
        salvarNoBancoDeDados();
    }

    public void definirCorLampada(String cor) {
        estado.definirCor(this, cor);
        salvarNoBancoDeDados();
    }

    public void definirIntensidadeLampada(int intensidade) {
        estado.definirIntensidade(this, intensidade);
        salvarNoBancoDeDados();
    }

    public static Lampada criarNoBancoDeDados() {
        Lampada novaLampada = new Lampada(); // Crie uma nova lâmpada sem ID
        Connection connection = null;
    
        try {
            // Obtenha a instância compartilhada da conexão com o banco de dados
            connection = DataBaseConnection.getInstance().getConnection();
    
            // Criação de um novo registro para a lâmpada no banco de dados
            String insertQuery = "INSERT INTO lampada (estado, cor, intensidade) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, LampadaDesligada.class.getSimpleName()); // Inicializa como desligada
            preparedStatement.setString(2, "Branca"); // Cor inicial
            preparedStatement.setInt(3, 0); // Intensidade inicial
            preparedStatement.executeUpdate();
    
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                int newId = generatedKeys.getInt(1);
                novaLampada.setId(newId); // Defina o ID gerado no objeto
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    
        return novaLampada;
    }
    

    public void salvarNoBancoDeDados() {
        Connection connection = null;
    
        try {
            // Obtenha a instância compartilhada da conexão com o banco de dados
            connection = DataBaseConnection.getInstance().getConnection();
    
            // Atualiza o registro da lâmpada no banco de dados
            String updateQuery = "UPDATE lampada SET estado=?, cor=?, intensidade=? WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1, estado.getClass().getSimpleName());
            preparedStatement.setString(2, cor);
            preparedStatement.setInt(3, intensidade);
            preparedStatement.setInt(4, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void carregarDoBancoDeDados() {
        Connection connection = null;
    
        try {
            // Obtenha a instância compartilhada da conexão com o banco de dados
            connection = DataBaseConnection.getInstance().getConnection();
    
            // Carrega os dados da lâmpada do banco de dados
            String selectQuery = "SELECT * FROM lampada WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
    
            if (resultSet.next()) {
                String estadoClasse = resultSet.getString("estado");
                try {
                    estado = (LampadaState) Class.forName(estadoClasse).newInstance();
                } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
                cor = resultSet.getString("cor");
                intensidade = resultSet.getInt("intensidade");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public int getId() {
        return id;
    }

    public String getEstado() {
        return estado.getClass().getSimpleName();
    }

    public String getCor() {
        return cor;
    }

    public int getIntensidade() {
        return intensidade;
    }

    public void setEstado(LampadaDesligada lampadaDesligada) {
        estado = lampadaDesligada;
    }

    public void setEstado(LampadaAcesa lampadaAcesa) {
        estado = lampadaAcesa;
    }

    public static void setInstance(Lampada instance) {
        Lampada.instance = instance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEstado(LampadaState estado) {
        this.estado = estado;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setIntensidade(int intensidade) {
        this.intensidade = intensidade;
    }

    


}


