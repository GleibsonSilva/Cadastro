package DAO;

import java.sql.*;

public class ConfigJDBC {
    public boolean carregarDrive () {
        try {
            Class.forName("org.sqlite.JDBC");
            return true;
        } catch (ClassNotFoundException exp) {
            return false;
        }
    }

    public Connection obterConexao (String arq) {
        try {
            String url = "jdbc:sqlite:" + arq;
            return DriverManager.getConnection(url);
        } catch (SQLException sql) {
            return null;
        }
    }

    public void fecharConexao (Connection connection) {
        try {
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
