package com.javaguru.lessons.lesson11;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Calculator {

    int sum(int a, int b) {
        return a + b;
    }

    BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b)
                .setScale(3, RoundingMode.HALF_EVEN);
    }

    BigDecimal divide(BigDecimal a, BigDecimal b) {
        return a.divide(b, 12, RoundingMode.HALF_EVEN);
    }
}
