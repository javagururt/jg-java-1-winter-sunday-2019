package com.javaguru.lessons.lesson3;

public class SimpleCalculatorTest {

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        int sumResult = calculator.sum(5, 10);

        System.out.println("Sum result: " + sumResult);
    }
}
