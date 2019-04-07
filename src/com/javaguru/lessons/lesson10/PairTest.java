package com.javaguru.lessons.lesson10;

class PairTest {
    public static void main(String[] args) {
        Pair<String, Integer> stringIntegerPair = getSomething();
        System.out.println(stringIntegerPair.getLeft());
        System.out.println(stringIntegerPair.getRight());

    }

    private static Pair<String, Integer> getSomething() {
        Pair<String, Integer> stringIntegerPair = new Pair<>();
        stringIntegerPair.setLeft("Something");
        stringIntegerPair.setRight(123);
        return stringIntegerPair;
    }
}
