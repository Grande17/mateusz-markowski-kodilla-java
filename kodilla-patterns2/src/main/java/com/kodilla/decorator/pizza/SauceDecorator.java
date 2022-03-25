package com.kodilla.decorator.pizza;

import com.kodilla.decorator.pizza.enums.Sauce;

import java.math.BigDecimal;

public class SauceDecorator extends AbstractPizzaOrderDecorator{
    private Sauce sauce;

    public SauceDecorator(PizzaOrder pizzaOrder, Sauce sauce) {
        super(pizzaOrder);
        this.sauce = sauce;
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(0.5));
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" "+sauce.toString();
    }
}
