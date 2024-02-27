package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class DummyTest {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testMulti() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multi(2, 3));
    }

    @Test
    public void testDiv() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.div(6, 3));
    }

    @Test
    public void testDivByZero() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.div(6, 0));
    }
}
