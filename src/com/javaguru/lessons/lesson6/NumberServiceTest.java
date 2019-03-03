package com.javaguru.lessons.lesson6;

class NumberServiceTest {

    public static void main(String[] args) {
        NumberService service = new NumberService();
        int firstNumber = 1;
        int secondNumber = 10;

        service.printInRange(firstNumber, secondNumber);

        System.out.println();
        System.out.println(firstNumber);
        System.out.println(secondNumber);

        System.out.println();

        service.printEvenNumbersInRange(firstNumber, secondNumber);
    }
}
