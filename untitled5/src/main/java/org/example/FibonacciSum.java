package exemplo1;

public class FibonacciSum {
    public static int calculateFibonacciSum(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("O número de elementos da série deve ser maior que 0.");
        }

        int sum = 0;
        int a = 1, b = 2;

        for (int i = 1; i <= n; i++) {
            sum += a;
            int temp = a;
            a = b;
            b = temp + b;
        }

        return sum;
    }
}
