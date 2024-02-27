package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        // Modifiez la valeur attendue pour provoquer un échec du test
        assertEquals(6, Calculator.add(2, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, Calculator.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, Calculator.divide(6, 3));
    }
}
