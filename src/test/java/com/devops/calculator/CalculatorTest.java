package com.devops.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit Tests for Calculator class.
 * These tests are automatically run by Jenkins during mvn clean package.
 */
@DisplayName("Calculator Unit Tests")
public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    // ── Addition ──────────────────────────────────────────────
    @Test
    @DisplayName("Add two positive numbers")
    void testAddPositiveNumbers() {
        assertEquals(10.0, calc.add(4, 6), "4 + 6 should equal 10");
    }

    @Test
    @DisplayName("Add positive and negative number")
    void testAddNegativeNumber() {
        assertEquals(3.0, calc.add(5, -2), "5 + (-2) should equal 3");
    }

    // ── Subtraction ───────────────────────────────────────────
    @Test
    @DisplayName("Subtract two numbers")
    void testSubtract() {
        assertEquals(5.0, calc.subtract(10, 5), "10 - 5 should equal 5");
    }

    @Test
    @DisplayName("Subtract resulting in negative")
    void testSubtractNegativeResult() {
        assertEquals(-3.0, calc.subtract(2, 5), "2 - 5 should equal -3");
    }

    // ── Multiplication ────────────────────────────────────────
    @Test
    @DisplayName("Multiply two positive numbers")
    void testMultiply() {
        assertEquals(20.0, calc.multiply(4, 5), "4 * 5 should equal 20");
    }

    @Test
    @DisplayName("Multiply by zero")
    void testMultiplyByZero() {
        assertEquals(0.0, calc.multiply(99, 0), "Any number * 0 should equal 0");
    }

    // ── Division ──────────────────────────────────────────────
    @Test
    @DisplayName("Divide two numbers")
    void testDivide() {
        assertEquals(4.0, calc.divide(20, 5), "20 / 5 should equal 4");
    }

    @Test
    @DisplayName("Division by zero throws exception")
    void testDivideByZero() {
        ArithmeticException ex = assertThrows(ArithmeticException.class,
                () -> calc.divide(10, 0));
        assertTrue(ex.getMessage().contains("Division by zero"));
    }

    // ── Modulus ───────────────────────────────────────────────
    @Test
    @DisplayName("Modulus of two numbers")
    void testModulus() {
        assertEquals(1.0, calc.modulus(10, 3), "10 % 3 should equal 1");
    }

    @Test
    @DisplayName("Modulus by zero throws exception")
    void testModulusByZero() {
        assertThrows(ArithmeticException.class, () -> calc.modulus(10, 0));
    }

    // ── Power ─────────────────────────────────────────────────
    @Test
    @DisplayName("Power of a number")
    void testPower() {
        assertEquals(8.0, calc.power(2, 3), "2^3 should equal 8");
    }

    @Test
    @DisplayName("Power with exponent zero")
    void testPowerZeroExponent() {
        assertEquals(1.0, calc.power(5, 0), "Any number^0 should equal 1");
    }

    // ── Square Root ───────────────────────────────────────────
    @Test
    @DisplayName("Square root of a perfect square")
    void testSquareRoot() {
        assertEquals(5.0, calc.squareRoot(25), "sqrt(25) should equal 5");
    }

    @Test
    @DisplayName("Square root of negative throws exception")
    void testSquareRootNegative() {
        ArithmeticException ex = assertThrows(ArithmeticException.class,
                () -> calc.squareRoot(-9));
        assertTrue(ex.getMessage().contains("negative"));
    }
}
