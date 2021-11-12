package com.kodilla.testing.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers){
        List<Integer> onlyEven = new ArrayList<>();

        for(Integer number: numbers){
            if(number %2 == 0){
                onlyEven.add(number);
            }
        }
        return onlyEven;

    }
}
