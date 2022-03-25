package com.kodilla.decorator.pizza;

import com.kodilla.decorator.pizza.enums.MeatIngredients;
import com.kodilla.decorator.pizza.enums.OtherIngredients;
import com.kodilla.decorator.pizza.enums.Sauce;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    void testPizzaDecoratorWithAllIngredients(){
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new ExtraMeatDecorator(order, MeatIngredients.CHICKEN);
        order = new ExtraMeatDecorator(order,MeatIngredients.BEEF);
        order = new OtherIngredientsDecorator(order, OtherIngredients.CHILI);
        order = new OtherIngredientsDecorator(order, OtherIngredients.LETTUCE);
        order = new OtherIngredientsDecorator(order, OtherIngredients.MUSHROOMS);
        order = new OtherIngredientsDecorator(order, OtherIngredients.ONION);
        order = new OtherIngredientsDecorator(order, OtherIngredients.PAPRIKA);
        order = new SauceDecorator(order, Sauce.BBQ);
        order = new SauceDecorator(order,Sauce.MAYO);
        //When
        BigDecimal cost = order.getCost();
        System.out.println(cost);

        String comment = order.getDescription();
        System.out.println(comment);
        //Then
        assertEquals(BigDecimal.valueOf(25.0),cost);
        assertEquals("Ordered a pizza with: CHICKEN BEEF CHILI LETTUCE MUSHROOMS ONION PAPRIKA BBQ MAYO", comment);
    }
}
