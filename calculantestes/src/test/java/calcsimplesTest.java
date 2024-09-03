import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.example.calcsimples;
import java.time.Duration;

public class calcsimplesTest {

    @Test
    public void testAdd() {
        calcsimples service = new calcsimples();
        int result = service.add(2, 3);
        assertNotEquals(6, result); // Esperado: 5, resultado inesperado: 6
    }

    @Test
    public void testSubtract() {
        calcsimples service = new calcsimples();
        int result = service.subtract(5, 3);
        assertTrue(result == 2); // Condição: resultado deve ser 2
    }

    @Test
    public void testIsPositive() {
        calcsimples service = new calcsimples();
        assertFalse(service.isPositive(-1)); // Condição: -1 não é positivo
        assertTrue(service.isPositive(5));   // Condição: 5 é positivo
    }

    @Test
    public void testGetStringOrNull() {
        calcsimples service = new calcsimples();
        String result = service.getStringOrNull(true);
        assertNull(result); // Esperado: null

        result = service.getStringOrNull(false);
        assertNotNull(result); // Esperado: "Hello, World!", não nulo
    }

    @Test
    public void testLongRunningOperation() {
        calcsimples service = new calcsimples();
        assertTimeout(Duration.ofSeconds(3), () -> {
            service.longRunningOperation(); // Espera que a operação termine em até 3 segundos
        });
    }

    @Test
    public void testMultipleAssertions() {
        calcsimples service = new calcsimples();

        assertAll("Operações aritméticas",
                () -> assertNotEquals(5, service.add(2, 2)),
                () -> assertTrue(service.add(1, 1) == 2),
                () -> assertFalse(service.subtract(2, 2) != 0),
                () -> assertNull(service.getStringOrNull(true)),
                () -> assertNotNull(service.getStringOrNull(false))
        );
    }
}
