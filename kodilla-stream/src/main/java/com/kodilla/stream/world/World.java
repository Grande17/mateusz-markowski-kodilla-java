package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class World {
    private final List<Continent>continents = new ArrayList<>();

    public boolean addContinent(Continent continent){
        return continents.add(continent);
    }
    public BigDecimal getPeopleQuantity(){
        BigDecimal quantity = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, curren)->sum = sum.add(curren));
        return quantity;
    }
}
