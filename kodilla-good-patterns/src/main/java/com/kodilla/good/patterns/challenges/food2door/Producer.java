package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public interface Producer {
    boolean process(Customer costumer, Map<Product, Integer> order);
}
