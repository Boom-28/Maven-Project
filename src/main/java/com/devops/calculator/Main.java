package com.devops.calculator;

import java.util.Scanner;

/**
 * Main entry point for the Calculator Application.
 * Demonstrates a simple interactive CLI calculator.
 */
public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("   DevOps Calculator - CI/CD Demo App  ");
        System.out.println("   Jenkins + GitHub + Maven Pipeline    ");
        System.out.println("========================================");
        System.out.println("Operations: +  -  *  /  %  pow  sqrt  exit");
        System.out.println();

        while (true) {
            System.out.print("Enter operation: ");
            String op = scanner.nextLine().trim().toLowerCase();

            if (op.equals("exit")) {
                System.out.println("Goodbye! Build successful.");
                break;
            }

            try {
                if (op.equals("sqrt")) {
                    System.out.print("Enter number: ");
                    double a = Double.parseDouble(scanner.nextLine().trim());
                    System.out.println("Result: " + calc.squareRoot(a));
                } else {
                    System.out.print("Enter first number: ");
                    double a = Double.parseDouble(scanner.nextLine().trim());
                    System.out.print("Enter second number: ");
                    double b = Double.parseDouble(scanner.nextLine().trim());

                    double result;
                    switch (op) {
                        case "+": result = calc.add(a, b); break;
                        case "-": result = calc.subtract(a, b); break;
                        case "*": result = calc.multiply(a, b); break;
                        case "/": result = calc.divide(a, b); break;
                        case "%": result = calc.modulus(a, b); break;
                        case "pow": result = calc.power(a, b); break;
                        default:
                            System.out.println("Unknown operation. Try: + - * / % pow sqrt exit");
                            continue;
                    }
                    System.out.println("Result: " + result);
                }
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number input. Please try again.");
            }
            System.out.println();
        }

        scanner.close();
    }
}
