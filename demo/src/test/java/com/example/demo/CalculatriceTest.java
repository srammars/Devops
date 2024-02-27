package com.example.demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatriceTest {
    private final Calculatrice calculatrice = new Calculatrice();

    @Test
    public void testAdd() {
        assertEquals(Integer.valueOf(5), calculatrice.add(2, 3));
    }

    @Test
    public void testMulti() {
        assertEquals(Integer.valueOf(6), calculatrice.multi(2, 3));
    }

    @Test
    public void testDiv() {
        assertEquals(Integer.valueOf(2), calculatrice.div(6, 3));
    }
}
