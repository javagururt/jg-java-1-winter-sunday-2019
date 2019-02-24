package com.javaguru.lessons.lesson5;

public class CarTest {

    public static void main(String[] args) {
        Car firstCar = new Car("BMW");
        Car secondCar = firstCar;
        Car thirdCar = new Car("BMW");

        System.out.println(firstCar.equals(firstCar));
        System.out.println(firstCar.equals(secondCar));
        System.out.println(firstCar.equals(thirdCar));

        System.out.println(firstCar);
    }
}
