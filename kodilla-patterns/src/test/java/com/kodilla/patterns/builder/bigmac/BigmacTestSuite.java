package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {

    @Test
    void testBigmacBuilder(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bun.STANDARD)
                .sauce(Sauce.THOUSAND_ISLANDS)
                .burgers(2)
                .ingredients(Ingredients.BACON)
                .ingredients(Ingredients.CHEESE)
                .ingredients(Ingredients.LETTUCE)
                .ingredients(Ingredients.ONION)
                .build();
        System.out.println(bigmac);
        //When
        int numberOfIngredients = bigmac.getIngredients().size();
        //Then
        Assertions.assertEquals(4,numberOfIngredients);
    }
}
