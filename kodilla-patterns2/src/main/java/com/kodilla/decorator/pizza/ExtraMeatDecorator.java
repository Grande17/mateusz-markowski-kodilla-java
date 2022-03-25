package com.kodilla.decorator.pizza;

import com.kodilla.decorator.pizza.enums.MeatIngredients;

import java.math.BigDecimal;

public class ExtraMeatDecorator extends AbstractPizzaOrderDecorator{
    private MeatIngredients ingredients;

    public ExtraMeatDecorator(PizzaOrder pizzaOrder, MeatIngredients ingredients) {
        super(pizzaOrder);
        this.ingredients = ingredients;
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" "+ingredients.toString();
    }
}
