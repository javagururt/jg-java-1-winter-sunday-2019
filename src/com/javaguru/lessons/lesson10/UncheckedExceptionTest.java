package com.javaguru.lessons.lesson10;

import java.util.Random;

class UncheckedExceptionTest {

    public static void main(String[] args) {
        try {
            shouldThrowRuntimeException();
            shouldThrowUserIllegalNameException();
        } catch (UserIllegalNameException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void shouldThrowRuntimeException() {
        Random random = new Random();
        int result = random.nextInt(2);
        System.out.println("Generated result: " + result);
        if (result == 1) {
            throw new RuntimeException("Random Runtime Exception");
        }
    }

    private static void shouldThrowUserIllegalNameException() {
        throw new UserIllegalNameException("Must be not null");
    }
}
