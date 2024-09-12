import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.example.Pessoa;
import org.example.*;


import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class PessoaDAOTest {

    private PessoaDAO pessoaDAO;

    @BeforeEach
    public void setUp() {
        pessoaDAO = new PessoaDAO();
    }

    @AfterEach
    public void tearDown() throws SQLException {
        try (Connection conn = pessoaDAO.conectar();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM pessoa")) {
            stmt.executeUpdate();
        }
    }

    @Test
    public void testInserirPessoa() {
        Pessoa pessoa = new Pessoa("Maria", "Rua XYZ, 456", "88888-8888");

        // Testa se o método de inserção não lança exceção
        assertDoesNotThrow(() -> pessoaDAO.inserirPessoa(pessoa));
    }
}
