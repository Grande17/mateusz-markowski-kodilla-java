package com.kodilla.decorator.pizza;

import com.kodilla.decorator.pizza.enums.OtherIngredients;

import java.math.BigDecimal;

public class OtherIngredientsDecorator extends AbstractPizzaOrderDecorator{
    private OtherIngredients otherIngredients;

    public OtherIngredientsDecorator(PizzaOrder pizzaOrder, OtherIngredients otherIngredients) {
        super(pizzaOrder);
        this.otherIngredients = otherIngredients;
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1));
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" "+otherIngredients.toString();
    }
}
