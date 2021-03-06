package com.kodilla.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder{

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }

    @Override
    public String getDescription() {
        return "Ordered a pizza with:";
    }
}
