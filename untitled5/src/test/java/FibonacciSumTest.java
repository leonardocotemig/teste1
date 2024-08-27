import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import exemplo1.FibonacciSum;


public class FibonacciSumTest {
    @Test
    void testCalculateFibonacciSumZero() {
        assertEquals(0, FibonacciSum.calculateFibonacciSum(0));
    }
    @Test
    void testCalculateFibonacciSumOne() {
        assertEquals(1, FibonacciSum.calculateFibonacciSum(1));
    }
    @Test
    void testCalculateFibonacciSumFive() {
        assertEquals(12, FibonacciSum.calculateFibonacciSum(5));
    }
    @Test
    void testCalculateFibonacciSumTen() {
        assertEquals(143, FibonacciSum.calculateFibonacciSum(10));
    }
}