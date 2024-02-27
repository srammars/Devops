package com.example.demo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DemoApplicationTests {

   
    static class DummyTest  {

        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }
    }

    @Test
    public void testAddition() {
        DummyTest  DummyTest  = new DummyTest ();
        assertThat(DummyTest .add(2, 3)).isEqualTo(5);
    }
    
    @Test
    public void testSubtraction() {
        DummyTest  DummyTest  = new DummyTest ();
        assertThat(DummyTest .subtract(5, 3)).isEqualTo(2);
    }

    
    @Test
    public void testMultiplication() {
        DummyTest  DummyTest  = new DummyTest ();
        assertThat(DummyTest .multiply(2, 3)).isEqualTo(6);
    }
}