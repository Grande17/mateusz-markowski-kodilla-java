package com.kodilla.good.patterns.challenges.flightCompany;

import java.util.HashSet;
import java.util.Set;

public class RoutesDataBase {
    private Set<Route> flights;


    public Set<Route> getFlights() {
        flights = newList();
        return flights;
    }
    public Set<Route> newList(){
        Set<Route> list = new HashSet<>();

        list.add(new Route("LAX", "SAT"));
        list.add(new Route("SAT", "LAX"));
        list.add(new Route("SAT", "DEL"));
        list.add(new Route("DEL", "SAT"));
        return list;
    }
}
