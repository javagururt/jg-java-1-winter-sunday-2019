package com.javaguru.lessons.lesson7;

class ArrayServiceTest {

    public static final int MAX_RANGE = 101;

    public static void main(String[] args) {
        int[] integerTestArray = new int[10];
        ArrayService.printArrayToConsole(integerTestArray);

        ArrayService arrayService = new ArrayService();
        arrayService.fillArrayWithRandomNumbers(integerTestArray, MAX_RANGE);

        ArrayService.printArrayToConsole(integerTestArray);
        ArrayServiceTest testRunner = new ArrayServiceTest();
        testRunner.shouldFindAverage();
    }

    public void shouldFindAverage() {
        int[] numbers = {1, 2, 3, 6, 9};
        double expectedResult = 4.2;
        ArrayService arrayService = new ArrayService();
        double actualResult = arrayService.findAverageNumber(numbers);

        if (expectedResult == actualResult) {
            System.out.println("Test, shouldFindAverage: OK");
        } else {
            System.out.println("Test, shouldFindAverage: FAIL, expected: " +
                    expectedResult + " but actual result: " + actualResult);
        }
    }
}
