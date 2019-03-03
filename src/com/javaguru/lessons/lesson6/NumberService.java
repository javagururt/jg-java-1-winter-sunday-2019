package com.javaguru.lessons.lesson6;

class NumberService {

    void printInRange(int from, int to) {
        while (from <= to) {
            System.out.println(from);
            from++;
        }

//        for (int i = from; i <= to; i++) {
//            System.out.println(i);
//        }
    }

    void printEvenNumbersInRange(int from, int to) {
        while (from <= to) {
            if (from % 2 == 0) {
                System.out.println(from);
            }
            from++;
        }
    }
}

