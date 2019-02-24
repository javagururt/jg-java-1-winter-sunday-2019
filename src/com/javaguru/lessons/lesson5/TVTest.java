package com.javaguru.lessons.lesson5;

class TVTest {

    public static void main(String[] args) {
        TVTest testRunner = new TVTest();
        testRunner.shouldIncreaseChannel();
    }

    private void shouldIncreaseChannel() {
        TV tv = new TV();

        int expectedResult = 1;

        tv.nextChannel();

        int actualResult = tv.getCurrentChannel();

        if (expectedResult == actualResult) {
            System.out.println("shouldIncreaseChannel: SUCCESS");
        } else {
            System.out.println("shouldIncreaseChannel: FAIL");
        }
    }
}
