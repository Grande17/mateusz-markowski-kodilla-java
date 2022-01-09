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
    public void connectingFlightTo(String departureAirport, String arrivalAirport){
        routesDb.getFlights().stream()
                .filter(route -> (route.getDeparture().equalsIgnoreCase(departureAirport)) && (route.getArrival().equalsIgnoreCase(arrivalAirport)))
                .map(e-> "Flight from: "+e.getDeparture()+" to: "+e.getArrival())
                .forEach(System.out::println);
    }

}
