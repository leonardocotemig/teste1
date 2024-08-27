package exemplo1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
 import exemplo1.FibonacciSum;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de elementos da série de Fibonacci: ");
        int n = scanner.nextInt();

        try {
            int result = FibonacciSum.calculateFibonacciSum(n);
            System.out.println("A soma dos primeiros " + n + " elementos da série de Fibonacci é: " + result);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}