package com.kodilla.good.patterns.challenges.flightCompany;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchProcessor {
    private RoutesDataBase routesDb;

    public SearchProcessor(RoutesDataBase routesDb) {
        this.routesDb = routesDb;
    }

    public List<Route> flightFrom(String departureAirport){
        List<Route> arrivalAirports = new ArrayList<>();
        arrivalAirports = routesDb.getFlights().stream()
                 .filter(x-> x.getDeparture().equals(departureAirport))
                 .collect(Collectors.toList());
        return arrivalAirports;

    }

    public List<Route> flightTo(String arrivalAirport){
        List<Route> departureAirports = new ArrayList<>();
        departureAirports = routesDb.getFlights().stream()
                .filter(x-> x.getArrival().equals(arrivalAirport))
                .collect(Collectors.toList());
        return departureAirports;

    }
    public void connectingFlight(String departureAirport, String arrivalAirport) {
        routesDb.getFlights().stream()
                .filter(x-> x.getDeparture().equals(departureAirport))
                .forEach(x->  {
                    routesDb.getFlights().stream()
                            .filter(y-> x.getArrival().equals(y.getDeparture()) && y.getArrival().equals(arrivalAirport))
                            .map(z-> "Flight from: "+departureAirport+" to: "+arrivalAirport+" is possible only through: "+ z.getDeparture())
                            .forEach(System.out::println);

                });

        }

}
