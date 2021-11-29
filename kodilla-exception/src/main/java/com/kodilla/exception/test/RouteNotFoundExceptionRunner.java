package com.kodilla.exception.test;


public class RouteNotFoundExceptionRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("Warsaw", "London");
        Flight flight2 = new Flight("Sydney", "Warsaw");
        Flight flight3 = new Flight("Amsterdam", "Madrid");
        FlightFinder finder = new FlightFinder();

       try{
           boolean flight1 = finder.findFlight(flight);
           System.out.println("Flight from Warsaw to London: "+ flight1);
       }catch(RouteNotFoundException r){
           System.out.println("Flight not found");
       }

       try{
           boolean flight22 = finder.findFlight(flight2);
           System.out.println("Flight from Sydney to Warsaw: "+ flight22);
       }catch (RouteNotFoundException r){
           System.out.println("Flight not found");
       }
        try{
            boolean flight33 = finder.findFlight(flight3);
            System.out.println("Flight from Amsterdam to Madrid: "+ flight33);
        }catch (RouteNotFoundException r){
            System.out.println("Flight not found");
        }
    }
}
