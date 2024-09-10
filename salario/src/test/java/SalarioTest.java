
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.*;
public class SalarioTest {

    @Test
    public void testCalcularINSS() {
        Salario salario = new Salario();
        assertEquals(99.0, salario.calcularINSS(1321.00), 0.01);
        assertEquals(211.61, salario.calcularINSS(2572.29), 0.01);
        assertEquals(365.8941, salario.calcularINSS(3857.94), 0.01);
        assertEquals(876.9711, salario.calcularINSS(7508.49), 0.01);
        assertEquals(876.9711, salario.calcularINSS(9001.00), 0.01);  // teto máximo
    }

    @Test
    public void testCalcularIR() {
        Salario salario = new Salario();
        double inss = salario.calcularINSS(5000.00);
        assertEquals(121.57, salario.calcularIR(5000.00, inss), 0.01);
    }

    @Test
    public void testCalcularSalarioLiquido() {
        Salario salario = new Salario();
        assertEquals(4381.55, salario.calcularSalarioLiquido(5000.00), 0.01);
    }
}
