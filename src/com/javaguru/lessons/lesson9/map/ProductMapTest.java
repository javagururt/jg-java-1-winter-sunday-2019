package com.javaguru.lessons.lesson9.map;

import java.util.HashMap;
import java.util.Map;

class ProductMapTest {

    public static void main(String[] args) {
        Map<ProductKey, String> map = new HashMap<>();
        map.put(new ProductKey(101, "1"), "Orange");
        map.put(new ProductKey(102, "2"), "Strawberry");
        map.put(new ProductKey(103, "3"), "Watermelon");

        System.out.println(map);

        String orange = map.get(new ProductKey(101, "1"));
        System.out.println(orange);
    }
}
