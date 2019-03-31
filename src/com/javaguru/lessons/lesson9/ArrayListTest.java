package com.javaguru.lessons.lesson9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ArrayListTest {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<Integer> linkedListIntegers = new LinkedList<>();
        benchmark(linkedListIntegers);
        benchmark(integers);

    }

    private static void benchmark(List<Integer> integers) {
        ListBenchmarkService addToEndBenchmark = new ListAddToEndBenchmarkService();
        ListBenchmarkService addToBeginningBenchmark = new ListAddToBeginningBenchmarkService();

        List<ListBenchmarkService> services = new ArrayList<>();
        services.add(addToBeginningBenchmark);
        services.add(addToEndBenchmark);

        for (ListBenchmarkService service : services) {
            long result = service.listBenchmark(integers);
            System.out.println(result + " ms");
            integers.clear();
        }
    }


}
