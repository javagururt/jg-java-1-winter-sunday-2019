package com.javaguru.lessons.lesson10;

import java.util.Random;

class CheckedExceptionsTest {

    public static void main(String[] args) {
        try {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            shouldThrowException();
            System.out.println("4");
            shouldThrowMyCheckedException();
            System.out.println("5");
        } catch (MyCheckedException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Finally");
        }
    }

    private static void shouldThrowException() throws Exception {
        Random random = new Random();
        int result = random.nextInt(2);
        System.out.println("Generated result: " + result);
        if (result == 1) {
            throw new Exception("Exception :)");
        }
    }

    private static void shouldThrowMyCheckedException() throws MyCheckedException {
        throw new MyCheckedException("My Checked Exception!");
    }

}
