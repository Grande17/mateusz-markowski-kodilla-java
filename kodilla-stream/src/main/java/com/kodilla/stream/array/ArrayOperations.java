package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers){

        IntStream.range(0, numbers.length)
                .map(i->numbers[i])
                .forEach(i->System.out.println(i));
        return IntStream.range(0, numbers.length)
                .map(n->numbers[n])
                .average().getAsDouble();
    }
}
