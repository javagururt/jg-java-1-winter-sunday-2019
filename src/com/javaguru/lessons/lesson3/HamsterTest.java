package com.javaguru.lessons.lesson3;

public class HamsterTest {

    public static void main(String[] args) {
        Hamster hamster = new Hamster();

        System.out.println("Name: " + hamster.getName());
        System.out.println("Age: " + hamster.getAge());
        System.out.println("Color: " + hamster.getColor());
        System.out.println("Hungry: " + hamster.isHungry());

        hamster.greeting();

        hamster.setName("Genadij");
        hamster.setAge(66);
        hamster.setColor("Black");
        hamster.setHungry(true);

        System.out.println("===========");
        System.out.println("Name: " + hamster.getName());
        System.out.println("Age: " + hamster.getAge());
        System.out.println("Color: " + hamster.getColor());
        System.out.println("Hungry: " + hamster.isHungry());

        hamster.greeting();
    }
}
