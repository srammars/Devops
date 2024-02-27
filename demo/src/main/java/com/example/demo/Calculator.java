package com.example.demo;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
