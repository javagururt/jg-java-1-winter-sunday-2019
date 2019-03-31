package com.javaguru.lessons.lesson9.map;

import java.util.HashMap;
import java.util.Map;

class MapTest {

    public static void main(String[] args) {
        Map<String, Integer> countOfChar = new HashMap<>();
        String orange = "Orange";
        String apple = "apple";
        String melon = "melon";
        String watermelon = "watermelon";
        countOfChar.put(orange, orange.length());
        countOfChar.put(apple, apple.length());
        countOfChar.put(melon, melon.length());
        countOfChar.put(watermelon, watermelon.length());

        System.out.println(countOfChar);

        int orangeCountOfChar = countOfChar.get("Orange");
        System.out.println(orangeCountOfChar);

        Integer strawberryCountOfChar = countOfChar.get("strawberry");
        System.out.println(strawberryCountOfChar);
    }
}
