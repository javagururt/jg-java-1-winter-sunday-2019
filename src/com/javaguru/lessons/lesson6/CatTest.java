package com.javaguru.lessons.lesson6;

import com.javaguru.lessons.lesson5.Car;

class CatTest {

    public static void main(String[] args) {
        CatTest test = new CatTest();

        Cat cat = new Cat();
        cat.setName("Boris");

        System.out.println(cat);

        test.foo(cat);

        System.out.println(cat);
    }

    private void foo(Cat cat) {
        cat.setName("Vasya");
    }
}
