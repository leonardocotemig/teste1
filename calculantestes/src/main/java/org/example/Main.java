package org.example;
import org.example.calcsimples;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número A: ");
        int a = scanner.nextInt();
        System.out.print("Informe o número B: ");
        int b = scanner.nextInt();
        calcsimples calculadora = new calcsimples();
        try {
           int result = calculadora.add(a,b);
            System.out.println("A soma de A e B" +" : " + result);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}