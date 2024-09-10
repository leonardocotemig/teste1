package org.example;

public class Salario {

    public double calcularINSS(double salarioBruto) {
        if (salarioBruto <= 1320.00) {
            return salarioBruto * 0.075;
        } else if (salarioBruto <= 2571.29) {
            return 1320.00 * 0.075 + (salarioBruto - 1320.00) * 0.09;
        } else if (salarioBruto <= 3856.94) {
            return 1320.00 * 0.075 + (2571.29 - 1320.00) * 0.09 + (salarioBruto - 2571.29) * 0.12;
        } else if (salarioBruto <= 7507.49) {
            return 1320.00 * 0.075 + (2571.29 - 1320.00) * 0.09 + (3856.94 - 2571.29) * 0.12 + (salarioBruto - 3856.94) * 0.14;
        } else {
            return 1320.00 * 0.075 + (2571.29 - 1320.00) * 0.09 + (3856.94 - 2571.29) * 0.12 + (7507.49 - 3856.94) * 0.14;
        }
    }

    public double calcularIR(double salarioBruto, double inss) {
        double baseCalculo = salarioBruto - inss;

        if (baseCalculo <= 1903.98) {
            return 0.0;
        } else if (baseCalculo <= 2826.65) {
            return (baseCalculo - 1903.98) * 0.075 - 142.80;
        } else if (baseCalculo <= 3751.05) {
            return (baseCalculo - 2826.65) * 0.15 - 354.80;
        } else if (baseCalculo <= 4664.68) {
            return (baseCalculo - 3751.05) * 0.225 - 636.13;
        } else {
            return (baseCalculo - 4664.68) * 0.275 - 869.36;
        }
    }

    public double calcularSalarioLiquido(double salarioBruto) {
        double inss = calcularINSS(salarioBruto);
        double ir = calcularIR(salarioBruto, inss);
        return salarioBruto - inss - ir;
    }
}