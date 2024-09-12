import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.*;

public class PessoaTest {

    @Test
    public void testPessoa() {
        Pessoa pessoa = new Pessoa("João", "Rua ABC, 123", "99999-9999");

        assertEquals("João", pessoa.getNome());
        assertEquals("Rua ABC, 123", pessoa.getEndereco());
        assertEquals("99999-9999", pessoa.getTelefone());
    }
}
