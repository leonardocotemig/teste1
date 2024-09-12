package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PessoaDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/sys"; // Substitua pelo seu banco
    private static final String USER = "root";
    private static final String PASSWORD = "mysql"; // Substitua pela sua senha

    public Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void inserirPessoa(Pessoa pessoa) {
        String sql = "INSERT INTO pessoa (nome, endereco, telefone) VALUES (?, ?, ?)";

        try (Connection conn = conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, pessoa.getNome());
            pstmt.setString(2, pessoa.getEndereco());
            pstmt.setString(3, pessoa.getTelefone());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao inserir pessoa: " + e.getMessage());
        }
    }
}
