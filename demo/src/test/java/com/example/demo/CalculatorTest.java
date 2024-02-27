package com.example.demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, Calculator.multi(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, Calculator.div(6, 3));
    }
}
