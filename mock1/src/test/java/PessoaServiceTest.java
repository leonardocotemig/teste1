import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import org.example.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaServiceTest {

    private Pessoa pessoaMock;
    private PessoaService pessoaService;

    @BeforeEach
    public void setUp() {
        // Mockando a classe Pessoa
        pessoaMock = Mockito.mock(Pessoa.class);
        pessoaService = new PessoaService();
    }

    @Test
    public void testGetInformacoes() {
        // Definindo o comportamento do mock
        Mockito.when(pessoaMock.getNome()).thenReturn("João");
        Mockito.when(pessoaMock.getEndereco()).thenReturn("Rua das Flores, 123");
        Mockito.when(pessoaMock.getTelefone()).thenReturn("123456789");

        // Chamando o método a ser testado
        String info = pessoaService.getInformacoes(pessoaMock);

        // Verificando o resultado esperado
        assertEquals("Nome: João, Endereço: Rua das Flores, 123, Telefone: 123456789", info);

        // Verificando se os métodos foram chamados corretamente
        Mockito.verify(pessoaMock).getNome();
        Mockito.verify(pessoaMock).getEndereco();
        Mockito.verify(pessoaMock).getTelefone();
    }
}
