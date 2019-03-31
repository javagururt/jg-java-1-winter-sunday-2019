package com.javaguru.lessons.lesson9.set;

import java.util.HashSet;
import java.util.Set;

class SetTest {
    public static void main(String[] args) {
        Set<String> alphabet = new HashSet<>();
        alphabet.add("A");
        alphabet.add("A");
        alphabet.add("A");
        alphabet.add("A");
        alphabet.add("C");
        alphabet.add("C");
        alphabet.add("C");
        alphabet.add("E");
        alphabet.add("E");
        alphabet.add("E");
        alphabet.add("E");
        alphabet.add("E");
        alphabet.add("B");
        alphabet.add("B");
        alphabet.add("B");
        alphabet.add("B");

        System.out.println(alphabet);
    }
}
