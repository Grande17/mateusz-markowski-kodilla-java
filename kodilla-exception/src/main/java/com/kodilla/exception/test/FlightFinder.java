package com.kodilla.exception.test;


import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public boolean findFlight(Flight flight) throws RouteNotFoundException{
        return findAirport(flight.getDepartureAirport()) && findAirport(flight.getArrivalAirport());
    }
    private Map<String, Boolean> mapOfAirports(){
        Map<String, Boolean> mapOfAirports = new HashMap<>();
        mapOfAirports.put("Warsaw", true);
        mapOfAirports.put("Sydney", false);
        mapOfAirports.put("London", true);

        return mapOfAirports;
    }

    private boolean findAirport(String airport) throws RouteNotFoundException{
        if(mapOfAirports().containsKey(airport)){
            return mapOfAirports().get(airport);
        }else{
            throw new RouteNotFoundException("Airport not found");
        }
    }



}
