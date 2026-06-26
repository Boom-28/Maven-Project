package com.devops.calculator;

/**
 * Simple Calculator Application
 * DevOps CI/CD Pipeline Demo - Jenkins + GitHub + Maven
 * Author: Dheena (PES1UG22EC244)
 */
public class Calculator {

    /**
     * Adds two numbers.
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts b from a.
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides a by b.
     * @throws ArithmeticException if b is zero.
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Error: Division by zero is not allowed.");
        }
        return a / b;
    }

    /**
     * Returns the modulus of a divided by b.
     * @throws ArithmeticException if b is zero.
     */
    public double modulus(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Error: Modulus by zero is not allowed.");
        }
        return a % b;
    }

    /**
     * Returns the power of base raised to exponent.
     */
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    /**
     * Returns the square root of a number.
     * @throws ArithmeticException if number is negative.
     */
    public double squareRoot(double a) {
        if (a < 0) {
            throw new ArithmeticException("Error: Cannot compute square root of a negative number.");
        }
        return Math.sqrt(a);
    }
}
