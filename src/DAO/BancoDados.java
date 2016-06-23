package DAO;

import java.sql.*;

public class Banco {
    public void removerTabela(Connection connection, String sql) throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        System.out.println("Removido");
    }

    public void criarTabela(Connection connection, String sql) throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        System.out.println("Criado");
    }

    public void inserirDado (Connection connection, String sql) throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        System.out.println("Inserido");
    }

    public void exibirDado (Connection connection, String sql, String campo) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs.getString(campo));
        }
    }
}
