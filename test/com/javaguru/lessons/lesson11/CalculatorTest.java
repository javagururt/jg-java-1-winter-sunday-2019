package com.javaguru.lessons.lesson11;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator victim;

    @Before
    public void setUp() throws Exception {
        victim = new Calculator();
    }

    @Test
    public void shouldCalculateSum() {
        int result = victim.sum(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void shouldCalculateMultiply() {
        BigDecimal a = new BigDecimal("5.512");
        BigDecimal b = new BigDecimal("2.2123");

        BigDecimal result = victim.multiply(a, b);

        BigDecimal expected = new BigDecimal("12.194");

        assertEquals(expected, result);
    }

    @Test
    public void shouldCalculateDivide() {
        BigDecimal a = new BigDecimal("5.512");
        BigDecimal b = new BigDecimal("2.2123");

        BigDecimal result = victim.divide(a, b);

        BigDecimal expected = new BigDecimal("2.491524657596");
        assertEquals(expected, result);
    }
}