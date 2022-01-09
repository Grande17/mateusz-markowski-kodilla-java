package com.kodilla.good.patterns.challenges.flightCompany;

public class Main {
    public static void main(String[] args) {
        RoutesDataBase routesDataBase = new RoutesDataBase();
        SearchProcessor searchProcessor = new SearchProcessor(routesDataBase);

       searchProcessor.flightFrom("LAX");
       searchProcessor.flightFrom("SAT");
       searchProcessor.connectingFlightTo("LAX", "SAT");


    }


}
