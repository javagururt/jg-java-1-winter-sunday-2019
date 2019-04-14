package com.javaguru.lessons.lesson11;

import java.math.BigDecimal;

class NumbersTest {

    public static void main(String[] args) {
        BigDecimal firstNumber = new BigDecimal("1000");
        BigDecimal secondNumber = new BigDecimal(1000);

        BigDecimal thirdNumber = new BigDecimal("1000.12341");
        BigDecimal fourthNumber = new BigDecimal(1000.1234);

        System.out.println(firstNumber);
        System.out.println(secondNumber);

        System.out.println(thirdNumber);
        System.out.println(fourthNumber);

        System.out.println(BigDecimal.ONE);
        System.out.println(BigDecimal.TEN);
        System.out.println(BigDecimal.ZERO);

        Double result = 1/0.0;

        System.out.println(result);
    }
}
