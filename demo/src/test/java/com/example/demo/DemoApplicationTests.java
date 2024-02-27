package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DemoApplicationTests {
    @Test
    public void testAddition() {
        Calculatrice calculatrice = new Calculatrice();
        assertThat(calculatrice.add(2, 3)).isEqualTo(5);
    }

    @Test
    public void testSubtraction() {
        Calculatrice calculatrice = new Calculatrice();
        assertThat(calculatrice.subtract(5, 3)).isEqualTo(2);
    }

    @Test
    public void testMultiplication() {
        Calculatrice calculatrice = new Calculatrice();
        assertThat(calculatrice.multiply(2, 3)).isEqualTo(6);
    }
}
