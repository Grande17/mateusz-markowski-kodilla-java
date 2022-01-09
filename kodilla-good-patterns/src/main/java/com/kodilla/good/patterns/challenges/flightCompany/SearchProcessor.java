package com.kodilla.good.patterns.challenges.flightCompany;

import java.util.Set;
import java.util.stream.Collectors;

public class SearchProcessor {
    private RoutesDataBase routesDb;

    public SearchProcessor(RoutesDataBase routesDb) {
        this.routesDb = routesDb;
    }

    public void flightFrom(String departureAirport){
          routesDb.getFlights().stream()
                .filter(route -> route.getDeparture().equals(departureAirport))
                  .map(x-> "Departure from: "+ x.getDeparture() +" to "+x.getArrival())
                  .forEach(System.out::println);

    }

    public void flightTo(String arrivalAirport){
        routesDb.getFlights().stream()
                .filter(route -> route.getArrival().equals(arrivalAirport))
                .map(y-> "Flight to: "+y.getArrival()+" from: "+y.getDeparture())
                .forEach(System.out::println);
    }
    public void connectingFlight(String departureAirport, String arrivalAirport) {
        routesDb.getFlights().stream()
                .filter(route -> route.getArrival().equals(arrivalAirport))
                .map(x-> "Flight from: "+departureAirport+" to: "+arrivalAirport+" through: "+x.getDeparture())
                .forEach(System.out::println);

    }
}
