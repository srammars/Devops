package com.example;

public class Calculator {

    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    public Integer multi(Integer a, Integer b) {
        return a * b;
    }

    public Integer div(Integer a, Integer b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}

