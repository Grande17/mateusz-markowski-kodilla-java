package com.kodilla.stream.world;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;


public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
       //Given
        World world = new World();
        Continent europe = new Continent("Europe");
        Continent nAmerica = new Continent("North America");

        Country poland = new Country("Poland",new BigDecimal("38000000"));
        Country netherlands = new Country("Netherlands",new BigDecimal("16000000"));
        Country usa = new Country("United States of America", new BigDecimal("320000000"));
        Country canada = new Country("Canada", new BigDecimal("90000000"));

        world.addContinent(europe);
        world.addContinent(nAmerica);
        europe.addCountry(poland);
        europe.addCountry(netherlands);
        nAmerica.addCountry(usa);
        nAmerica.addCountry(canada);
        //When
        BigDecimal quantityOfPeople = world.getPeopleQuantity();
        //Then
        BigDecimal expectedResult = new BigDecimal("464000000");
        Assertions.assertEquals(expectedResult, quantityOfPeople);



    }
}
