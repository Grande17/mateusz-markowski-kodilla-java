package com.kodilla.good.patterns.challenges.flightCompany;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RoutesDataBase {
    private List<Route> flights;


    public List<Route> getFlights() {
        flights = newList();
        return flights;
    }
    public List<Route> newList(){
        List<Route> list = new ArrayList<>();

        list.add(new Route("LAX", "SAT"));
        list.add(new Route("SAT", "LAX"));
        list.add(new Route("SAT", "DEL"));
        list.add(new Route("DEL", "SAT"));
        return list;
    }
}
