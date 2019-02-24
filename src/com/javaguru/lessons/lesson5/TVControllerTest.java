package com.javaguru.lessons.lesson5;

class TVControllerTest {

    public static void main(String[] args) {
        TV tv = new TV();
        System.out.println(tv);
        TVController tvController = new TVController();
        tvController.setTV(tv);
        tvController.increaseChannelButton();

        System.out.println(tv);
    }
}
