package org.example;
import java.util.Scanner;
import org.example.Salario.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o Salário Bruto: ");
        double bruto = scanner.nextInt();
        Salario sal = new Salario();
        double salarioliquido  = sal.calcularSalarioLiquido(bruto);

    }
}