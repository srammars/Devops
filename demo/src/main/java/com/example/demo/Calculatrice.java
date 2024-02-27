package com.example.demo;

public class Calculatrice {
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    public Integer multi(Integer a, Integer b) {
        return a * b;
    }

    public Integer div(Integer a, Integer b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division par zéro !");
        }
        return a / b;
    }
}
