package DAO;

import java.sql.*;

public class Inicio {
    private static ConfigJDBC conf = new ConfigJDBC();
    private static Banco banco = new Banco();
    public static void main( String[] args ) throws SQLException {
        conf.carregarDrive();
        String arquivo = "";
        Connection conexao = conf.obterConexao(arquivo);

        String criaPessoa = "create table pessoa (nome String, nascimento Date)";
        String nome = "nome";
        String nascimento = "nascimento";
        String tipo = "tipo";
        String exibirPessoa = "select * from lista";
        String inserirPessoa = "insert into lista values ('Fulano')";

        String removeTabela = "drop table if exists pessoa";

        banco.criarTabela(conexao, criaPessoa);
        banco.inserirDado(conexao, inserirPessoa);
        banco.exibirDado(conexao, exibirPessoa, nome);
        banco.exibirDado(conexao, exibirPessoa, nascimento);
    }

}
