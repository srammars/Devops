package com.example;

public class Calculator {

    public static Integer add(Integer a, Integer b) {
        return a + b;
    }

    public static Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    public static Integer divide(Integer a, Integer b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
