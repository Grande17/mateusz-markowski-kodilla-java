package com.kodilla.stream.world;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Continent {
    private final List<Country> countries = new ArrayList<>();
    private final String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getCountries() {
        return new ArrayList<>(countries);
    }
    public boolean addCountry(Country country){
        return countries.add(country);
    }
}
