package com.javaguru.lessons.lesson4;

class HumanAgeClassifierTest {

    public static void main(String[] args) {
        HumanAgeClassifierTest testRunner = new HumanAgeClassifierTest();
        testRunner.shouldClassifyTeenager();
//        testRunner.shouldClassifyWrongAge();
    }

    public void shouldClassifyTeenager() {
        HumanAgeClassifier victim = new HumanAgeClassifier();

        String expectedResult = "Teenager";

        String actualResult = victim.classify(15);

        if (expectedResult.equals(actualResult)) {
            System.out.println("shouldClassifyTeenager: SUCCESS");
        } else {
            System.out.println("shouldClassifyTeenager: FAIL");
        }
    }

    public void shouldClassifyWrongAge() {
        HumanAgeClassifier victim = new HumanAgeClassifier();

        String expectedResult = "Wrong age";

        String actualResult = victim.classify(-1);

        if (expectedResult.equals(actualResult)) {
            System.out.println("shouldClassifyWrongAge: SUCCESS");
        } else {
            System.out.println("shouldClassifyWrongAge: FAIL");
        }
    }
}
