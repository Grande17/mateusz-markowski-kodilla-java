package com.kodilla.good.patterns.challenges.flightCompany;

public class Route {
    private String departure;
    private String arrival;

    public Route(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Route route = (Route) o;

        if (!departure.equals(route.departure)) return false;
        return arrival.equals(route.arrival);
    }

    @Override
    public int hashCode() {
        int result = departure.hashCode();
        result = 31 * result + arrival.hashCode();
        return result;
    }
    @Override
    public String toString() {
        return "Flight from " + departure + " to "+arrival;
    }
}
