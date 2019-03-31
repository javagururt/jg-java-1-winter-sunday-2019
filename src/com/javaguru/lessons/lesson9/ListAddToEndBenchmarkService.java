package com.javaguru.lessons.lesson9;

import java.util.List;

class ListAddToEndBenchmarkService implements ListBenchmarkService {

    public long listBenchmark(List<Integer> integers) {
        long start = System.currentTimeMillis();

        fillListToEndWithIntegers(100_000, integers);

        long finish = System.currentTimeMillis();
        return finish - start;
    }

    private void fillListToEndWithIntegers(int size, List<Integer> integers) {
        for(int i = 0; i < size; i++) {
            integers.add(i);
        }
    }

}
