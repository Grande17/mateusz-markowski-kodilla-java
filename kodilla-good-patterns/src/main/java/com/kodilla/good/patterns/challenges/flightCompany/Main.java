package com.kodilla.good.patterns.challenges.flightCompany;

public class Main {
    public static void main(String[] args) {
        RoutesDataBase routesDataBase = new RoutesDataBase();
        SearchProcessor searchProcessor = new SearchProcessor(routesDataBase);

        System.out.println(searchProcessor.flightFrom("LAX"));
        System.out.println(searchProcessor.flightTo("SAT"));
        searchProcessor.connectingFlight("LAX", "DEL");


    }


}
