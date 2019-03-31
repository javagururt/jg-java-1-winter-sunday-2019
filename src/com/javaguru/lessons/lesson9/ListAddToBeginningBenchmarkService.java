package com.javaguru.lessons.lesson9;

import java.util.List;

class ListAddToBeginningBenchmarkService implements ListBenchmarkService {

    @Override
    public long listBenchmark(List<Integer> integers) {
        long start = System.currentTimeMillis();

        fillListToBeginningWithIntegers(100_000, integers);

        long finish = System.currentTimeMillis();
        return finish - start;
    }

    private void fillListToBeginningWithIntegers(int size, List<Integer> integers) {
        for(int i = 0; i < size; i++) {
            integers.add(0, i);
        }
    }
}
